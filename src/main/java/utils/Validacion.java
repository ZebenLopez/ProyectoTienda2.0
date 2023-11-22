package utils;

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
 * @author Lorena
 * @version 1.0
 */
public class Validacion {

    static AtomicReference<String> fallos;

    public boolean validarLogin(String usuario, String contrasegna) {
        boolean validar = false;
        fallos = new AtomicReference<>("");

        // Comprueba si el nombre de usuario solo contiene letras y números
        if (!usuario.matches("^[A-Z]*$")) {
            fallos.set("El usuario y contraseña no coinciden!");
        } else {
            comprobarExistenciaUsuariosLogin(usuario, contrasegna);
        }

        // Comprueba si la contraseña solo contiene números
        if (!contrasegna.matches("^[0-9]*$")) {
            fallos.set("El usuario y contraseña no coinciden!");
        } else {
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
            System.out.println("El usuario y contraseña no coinciden!");
            return null;
        }
    }

    //COMPROBAR si usuarios existen
    public void comprobarExistenciaUsuariosLogin(String userLogin, String contrasegnaLogin) {
        ControladorGralPersistencia controlador = new ControladorGralPersistencia();
        UsuarioJpaController jpaUsuarioLogin = controlador.getJpaUsuario();
        Usuario usuario = jpaUsuarioLogin.findUsuario(userLogin, contrasegnaLogin);

        if (usuario != null) {
            userLogin = usuario.getNombre();
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

}
