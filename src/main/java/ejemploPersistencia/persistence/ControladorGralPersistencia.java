package ejemploPersistencia.persistence;

import ejemploPersistencia.models.Usuario;
import ejemploPersistencia.exceptions.NonexistentEntityException;
import ejemploPersistencia.models.Pedidos;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zeben
 */
public class ControladorGralPersistencia {
    UsuarioJpaController jpaUsuario = new UsuarioJpaController();

    public void crearUsuario(Usuario usuario) {
        jpaUsuario.create(usuario);
    }
    
    public void borrarUsuario(int codigo) {
      try{
          jpaUsuario.destroy(codigo);
      } catch(NonexistentEntityException e){
          Logger.getLogger(ControladorGralPersistencia.class.getName()).log(Level.SEVERE, null, e);
      }
    }
    
    public void crearPedido(Pedidos pedidos){
        PedidosJpaController jpaPedidos = new PedidosJpaController();
    }
}
