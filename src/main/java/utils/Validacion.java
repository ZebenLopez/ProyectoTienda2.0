/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import ejemploPersistencia.models.Usuario;
import ejemploPersistencia.persistence.ControladorGralPersistencia;
import ejemploPersistencia.persistence.UsuarioJpaController;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/**
 *
 * @author Zeben
 */
public class Validacion {

    static AtomicReference<String> fallos;

    public boolean validarLogin(String usuario, String contrasegna) {
        boolean validar = false;
        fallos = new AtomicReference<>("");
        comprobarExistenciaUsuariosLogin(usuario, contrasegna);
//        comprobarRol();

        if (!fallos.get().isEmpty()) {
            ValidacionUtils.createJOptionPanel(String.valueOf(fallos), "Error", 0);
        }
        return validar;
    }

    public boolean validarRegistro(String user, String contrasegna, String contrasegnaRepetida) {
        boolean validar = false;
        fallos = new AtomicReference<>("");
        comprobarExistenciaUsuariosRegistro(user);
        comprobarIgualdadContrasegna(contrasegna, contrasegnaRepetida);

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
}
