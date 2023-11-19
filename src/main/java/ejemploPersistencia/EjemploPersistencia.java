package ejemploPersistencia;

import ejemploPersistencia.models.ControladorGralModelo;
import ejemploPersistencia.models.Usuario;
import ejemploPersistencia.persistence.ControladorGralPersistencia;
import ejemploPersistencia.exceptions.NonexistentEntityException;
import ejemploPersistencia.vistas.PantallaPrincipal;

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
        
      //RELLENAR TABLA
        //ControladorGralModelo registro = new ControladorGralModelo();
        //Usuario usuario = new Usuario();
        //registro.crearUsuario(usuario);
        
        
        //BORRAR TABLA
        //ControladorGralModelo borrado = new ControladorGralModelo();
        //borrado.borrarUsuario(2);
    }
}
