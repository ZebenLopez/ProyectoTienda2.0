package ejemploPersistencia.models;

import ejemploPersistencia.persistence.ControladorGralPersistencia;
import ejemploPersistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author Zeben
 * @author Lorena
 * @version 1.0
 */
public class ControladorGralModelo {
    ControladorGralPersistencia enlaceModeloPersistencia = new ControladorGralPersistencia();
    
    public void crearUsuario(Usuario usuario){
        enlaceModeloPersistencia.crearUsuario(usuario);
    }
    
    public void crearPedido(Pedidos pedido){
        enlaceModeloPersistencia.crearPedido(pedido);
    }

    public void borrarPedido(int i) throws NonexistentEntityException {
        enlaceModeloPersistencia.borrarPedido(i);
    }
}
