/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import ejemploPersistencia.models.Pedidos;
import ejemploPersistencia.models.Usuario;
import ejemploPersistencia.persistence.ControladorGralPersistencia;
import ejemploPersistencia.persistence.UsuarioJpaController;

import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

import static org.eclipse.persistence.jaxb.javamodel.Helper.URL;

/**
 *
 * @author Zeben
 */
public class Validacion {

    static AtomicReference<String> fallos;

    public boolean validarLogin(String usuario, String contrasegna) {
        boolean validar = false;
        fallos = new AtomicReference<>("");

        // Comprueba si el nombre de usuario solo contiene letras y números
        if (!usuario.matches("^[A-Z]*$")) {
            fallos.set("El nombre de usuario solo puede contener letras Mayúsculas");
        } else {
            comprobarExistenciaUsuariosLogin(usuario, contrasegna);
        }

        // Comprueba si la contraseña solo contiene números
        if (!contrasegna.matches("^[0-9]*$")) {
            fallos.set("La contraseña solo puede contener números");
        } else {
            // Aquí puedes agregar más validaciones si es necesario
        }

        if (!fallos.get().isEmpty()) {
            ValidacionUtils.createJOptionPanel(String.valueOf(fallos), "Error", 0);
        } else {
            validar = true;
        }
        return validar;
    }

    public boolean validarRegistro(String user, String contrasegna, String contrasegnaRepetida) {
        boolean validar = false;
        fallos = new AtomicReference<>("");

        // Comprueba si el nombre de usuario solo contiene letras y números
        if (!user.matches("^[A-Z]*$")) {
            fallos.set("El nombre de usuario solo puede contener letras Mayúsculas");
        } else {
            comprobarExistenciaUsuariosRegistro(user);
        }

        // Comprueba si la contraseña solo contiene números
        if (!contrasegna.matches("^[0-9]*$")) {
            fallos.set("La contraseña solo puede contener números");
        } else {
            comprobarIgualdadContrasegna(contrasegna, contrasegnaRepetida);
        }

        if (!fallos.get().isEmpty()) {
            ValidacionUtils.createJOptionPanel(String.valueOf(fallos), "Error", 0);
        } else {
            ValidacionUtils.createJOptionPanel("Usuario " + user + " registrado con contraseña " + contrasegna, "Registrado", 1);
            validar = true;
        }
        return validar;
    }

    public String obtenerRol(String userLogin, String contrasegnaLogin) {
        ControladorGralPersistencia controlador = new ControladorGralPersistencia();
        UsuarioJpaController jpaUsuario = controlador.getJpaUsuario();
        Usuario usuario = jpaUsuario.findUsuario(userLogin, contrasegnaLogin);

        if (usuario != null) {
            return usuario.getRol();
        } else {
            System.out.println("Usuario y contraseña no coinciden!");
            return null;
        }
    }

    //COMPROBAR si usuarios existen
    public void comprobarExistenciaUsuariosLogin(String userLogin, String contrasegnaLogin) {
        ControladorGralPersistencia controlador = new ControladorGralPersistencia();
        UsuarioJpaController jpaUsuarioLogin = controlador.getJpaUsuario();
        Usuario usuario = jpaUsuarioLogin.findUsuario(userLogin, contrasegnaLogin);

        if (usuario != null) {
            System.out.println("Usuario encontrado: " + usuario.getNombre());
        } else {
            fallos.set("Usuario y contraseña no coinciden!");
        }
    }

    public void comprobarExistenciaUsuariosRegistro(String user) {
        ControladorGralPersistencia controlador = new ControladorGralPersistencia();
        UsuarioJpaController jpaUsuario = controlador.getJpaUsuario();
        List<Usuario> usuarios = jpaUsuario.findUsuarioEntities();

        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equals(user)) {
                fallos.set("El usuario ya existe");
            }
        }
    }

    public void comprobarIgualdadContrasegna(String contrasegna, String contrasegnaRepetida) {
        if (!contrasegna.equals(contrasegnaRepetida)) {
            fallos.set(fallos + "\nLas contraseñas no coinciden");
        }
    }

    public void factura(ArrayList pedido) {
        try (Connection connection = DriverManager.getConnection(URL)) {
            // Consulta para obtener toda la información de la tabla "cesta"
            pedido.forEach((producto) -> {
                String consulta = "SELECT * FROM productos WHERE nombre = '" + producto + "'";
                try (PreparedStatement statement = connection.prepareStatement(consulta); ResultSet resultSet = statement.executeQuery()) {
                    // Obtener la ruta completa del archivo
                    String filePath = "factura.txt";
                    Path path = Paths.get(filePath).toAbsolutePath();
                    // Crear un PrintWriter para escribir en un archivo de texto
                    try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
                        double total = 0.0;  // Variable para almacenar el resultado total
                        // Iterar sobre los resultados y escribir en el archivo

                        writer.println("* MULTITIENDA HANAYAMA *");
                        writer.println("-------------------------------");
                        while (resultSet.next()) {
                            String producto1 = resultSet.getString("nombre");
                            int cantidad = resultSet.getInt("cantidad");
                            double precio = resultSet.getDouble("precio");

                            // Calcular el subtotal para cada producto
                            double subtotal = cantidad * precio;

                            // Imprimir en el archivo
                            writer.println("Producto: " + producto1);
                            writer.println("Cantidad: " + cantidad);
                            writer.println("Precio: " + precio);
                            writer.println("Subtotal: " + subtotal);
                            writer.println();  // Salto de línea adicional para separar productos

                            // Sumar al resultado total
                            total += subtotal;
                        }
                        // Imprimir el resultado total al final del archivo
                        writer.println("------------------------------");
                        writer.println("--> Total: " + total);

                        JOptionPane.showMessageDialog(null, "El ticket ha sido generado y guardado en " + path,
                                "Generación Exitosa", JOptionPane.INFORMATION_MESSAGE);

                        // Abrir el archivo con la aplicación predeterminada
                        Desktop.getDesktop().open(path.toFile());

                    } catch (IOException e) {
                        e.printStackTrace();
                        fallos.set("Error al escribir en el archivo.");
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                    fallos.set("Error al acceder a la base de datos.");
                }
            });
        } catch (SQLException e) {
            e.printStackTrace();
            fallos.set("Error al conectar con la base de datos.");
        }
    }
}
