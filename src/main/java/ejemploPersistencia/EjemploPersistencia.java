package ejemploPersistencia;

import ejemploPersistencia.exceptions.NonexistentEntityException;
import ejemploPersistencia.vistas.PantallaPrincipal;

/**
 *
 * @author Zeben
 * @author Lorena
 * @version 1.0
 */

public class EjemploPersistencia {

    public static void main(String[] args) throws NonexistentEntityException {
        EjemploPersistencia appMain = new EjemploPersistencia();
        appMain.run();
    }

    private void run() throws NonexistentEntityException {
        PantallaPrincipal pantallaPrincipal = new PantallaPrincipal();
        pantallaPrincipal.setVisible(true);
    }
}
