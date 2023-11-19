/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import ejemploPersistencia.models.Usuario;
import ejemploPersistencia.persistence.ControladorGralPersistencia;
import ejemploPersistencia.persistence.UsuarioJpaController;
import ejemploPersistencia.vistas.PantallaMenus;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Zeben
 */
public class Validacion {

    static AtomicReference<String> fallos = new AtomicReference<String>("");

    public boolean validarLogin( String usuario, String contrasegna) {
        boolean validar = false;
        fallos = new AtomicReference<>("");
        comprobarExistenciaUsuarios(usuario, contrasegna);

        if (!fallos.get().isEmpty()) {
            ValidacionUtils.createJOptionPanel(String.valueOf(fallos), "Error", 0);
        } else {
            ValidacionUtils.createJOptionPanel("inisión de sesión correcto para el usuario " + usuario, "Accediendo", 1);
            validar = true;
        }
        return validar;

    }

    //COMPROBAR si usuarios existen
    public void comprobarExistenciaUsuarios(String user, String contrasegna) {
        ControladorGralPersistencia controlador = new ControladorGralPersistencia();
        UsuarioJpaController jpaUsuario = controlador.getJpaUsuario();
        List<Usuario> usuarios = jpaUsuario.findUsuarioEntities();
        boolean comprobar = false;

        for (Usuario usuario : usuarios) {
            if (!usuario.getNombre().equals(user)
                    && !usuario.getContraseña().equals(contrasegna)) {
                fallos.set("Usuario y contraseña no coinciden");
            }
        }

    }
}
