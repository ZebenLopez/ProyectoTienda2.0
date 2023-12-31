package ejemploPersistencia.persistence;

import ejemploPersistencia.models.Usuario;
import ejemploPersistencia.exceptions.NonexistentEntityException;
import ejemploPersistencia.models.Pedidos;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zeben
 * @author Lorena
 * @version 1.0
 */
public class ControladorGralPersistencia {
    UsuarioJpaController jpaUsuario = new UsuarioJpaController();
    PedidosJpaController jpaPedidos = new PedidosJpaController();

    public void crearUsuario(Usuario usuario) {
        jpaUsuario.create(usuario);
    }
    public UsuarioJpaController getJpaUsuario() {
       return jpaUsuario;
   }
    
    public void crearPedido(Pedidos pedidos){
        jpaPedidos.create(pedidos);
    }

    public void borrarPedido(int numeroPedido) {
        try{
            jpaPedidos.destroy(numeroPedido);
        } catch(NonexistentEntityException e){
            Logger.getLogger(ControladorGralPersistencia.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
