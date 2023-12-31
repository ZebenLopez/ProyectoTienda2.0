package ejemploPersistencia.utils;

import ejemploPersistencia.models.Usuario;
import ejemploPersistencia.persistence.ControladorGralPersistencia;
import ejemploPersistencia.persistence.UsuarioJpaController;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

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
        if (!user.matches("^[A-Z]*$") || user.length() < 4 || user.length() > 12) {
            fallos.set("El nombre de usuario solo puede contener letras Mayúsculas y ha de tener aentre 4 y 12 caracteres");
        } else {
            comprobarExistenciaUsuariosRegistro(user);
        }

        // Comprueba si la contraseña solo contiene números
        if (!contrasegna.matches("^[0-9]*$") || contrasegna.length() < 5 || contrasegna.length() > 10) {
            fallos.set("La contraseña solo puede contener números y debe tener entre 5 y 10 caracteres");
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
            return null;
        }
    }

    //COMPROBAR si usuarios existen
    public void comprobarExistenciaUsuariosLogin(String userLogin, String contrasegnaLogin) {
        ControladorGralPersistencia controlador = new ControladorGralPersistencia();
        UsuarioJpaController jpaUsuarioLogin = controlador.getJpaUsuario();
        Usuario usuario = jpaUsuarioLogin.findUsuario(userLogin, contrasegnaLogin);

        if (usuario == null) {
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
