package ejemploPersistencia;

import ejemploPersistencia.persistence.UsuarioJpaController;
import ejemploPersistencia.models.Usuario;
import ejemploPersistencia.persistence.ControladorGralPersistencia;
import ejemploPersistencia.exceptions.NonexistentEntityException;
import ejemploPersistencia.vistas.PantallaPrincipal;
import java.util.List;

public class EjemploPersistencia {

    public static void main(String[] args) throws NonexistentEntityException {
        EjemploPersistencia appMain = new EjemploPersistencia();
        appMain.run();
    }

    private void run() throws NonexistentEntityException {
        PantallaPrincipal pantallaPrincipal = new PantallaPrincipal();
        pantallaPrincipal.setVisible(true);

        //CREAR TABLA
        //ControladorGralPersistencia inicioControlador = new ControladorGralPersistencia();

        
        //Extraer info de Usuarios
        ControladorGralPersistencia controlador = new ControladorGralPersistencia();
        UsuarioJpaController jpaUsuario = controlador.getJpaUsuario();
        List<Usuario> usuarios = jpaUsuario.findUsuarioEntities();

        for (Usuario usuario : usuarios) {
            System.out.println("Nombre: " + usuario.getNombre());
            System.out.println("Contraseña: " + usuario.getContrasegna());
            System.out.println("Rol: " + usuario.getRol());
        }
        //RELLENAR TABLA
        //ControladorGralModelo registro = new ControladorGralModelo();
        //Usuario usuario = new Usuario();
        //registro.crearUsuario(usuario);

        //BORRAR TABLA
        //ControladorGralModelo borrado = new ControladorGralModelo();
        //borrado.borrarUsuario(2);
    }
}
