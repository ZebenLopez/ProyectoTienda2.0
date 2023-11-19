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

        if (!fallos.get().isEmpty()) {
            ValidacionUtils.createJOptionPanel(String.valueOf(fallos), "Error", 0);
        } else {
            ValidacionUtils.createJOptionPanel("Inicio de sesión correcto para el usuario " + usuario, "Accediendo", 1);
            validar = true;
        }
        return validar;
    }

    public boolean validarRegistro(String user, String contrasegna, String contrasegnaRepetida) {
        boolean validar = false;
        fallos = new AtomicReference<>("");
        comprobarExistenciaUsuariosRegistro(user);
        comprobarIgualdadContraseña(contrasegna, contrasegnaRepetida);

        if (!fallos.get().isEmpty()) {
            ValidacionUtils.createJOptionPanel(String.valueOf(fallos), "Error", 0);
        } else {
            ValidacionUtils.createJOptionPanel("Usuario " + user + " registrado con contraseña " + contrasegna, "Registrado", 1);
            validar = true;
        }
        return validar;
    }

    //COMPROBAR si usuarios existen
    public void comprobarExistenciaUsuariosLogin(String userLogin, String contrasegnaLogin) {
        ControladorGralPersistencia controlador = new ControladorGralPersistencia();
        UsuarioJpaController jpaUsuarioLogin = controlador.getJpaUsuario();
        List<Usuario> usuarios = jpaUsuarioLogin.findUsuarioEntities();

//        for (Usuario usuario : usuarios) {
//            if (!usuario.getNombre().equals(user) && !usuario.getContraseña().equals(contrasegna)) {
//                fallos.set("Usuario y contraseña no coinciden");
//            }
//        }
        for (Usuario usuario : usuarios){
            if (!usuario.getNombre().equals(userLogin) 
                    && !usuario.getContrasegna().equals(contrasegnaLogin)){
                fallos.set("Usuario y contraseña no coinciden!");
                System.out.println(usuario);
            }
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

    public void comprobarIgualdadContraseña(String contrasegna, String contrasegnaRepetida) {
        if (!contrasegna.equals(contrasegnaRepetida)) {
            fallos.set(fallos + "\nLas contraseñas no coinciden");
        }
    }
}
