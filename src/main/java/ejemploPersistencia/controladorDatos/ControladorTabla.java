package ejemploPersistencia.controladorDatos;

import ejemploPersistencia.exceptions.NonexistentEntityException;
import ejemploPersistencia.models.ControladorGralModelo;
import ejemploPersistencia.models.Pedidos;
import ejemploPersistencia.persistence.PedidosJpaController;

import static ejemploPersistencia.vistas.InterfazPrincipalCamarero.tableModel;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author loren
 */
public class ControladorTabla {
    PedidosJpaController jpaPedidos = new PedidosJpaController();
    ArrayList pedido = new ArrayList();

    public ArrayList<Pedidos> recorrerTabla() throws NoSuchAlgorithmException {
        int numPedido = numeroAleatorio();

        try {
            while (tableModel.getRowCount() != 0) {
                String nombreProducto = (String) tableModel.getValueAt(0, 0);
                int cantidadProducto = (int)  tableModel.getValueAt(0, 1);
                Pedidos nuevoPedido = new Pedidos(numeroAleatorio(),numPedido, numeroAleatorio(),nombreProducto,cantidadProducto);
                pedido.add(nuevoPedido);
                tableModel.removeRow(0);
            }
        } catch (Exception e) {
            System.out.println("Error al recorrer la tabla");
        }
        return pedido;
    }

    public int numeroAleatorio() throws NoSuchAlgorithmException {
        int numero = SecureRandom.getInstanceStrong().nextInt(1000);
        return numero;
    }

    public void eliminarPedido(int numeroPedido) throws NonexistentEntityException {

//        ControladorGralModelo borrarPedido = new ControladorGralModelo();
//        try {
//            borrarPedido.borrarPedido(numeroPedido);
//        } catch (NonexistentEntityException ex) {
//            Logger.getLogger(ControladorTabla.class.getName()).log(Level.SEVERE, null, ex);
//        }
        Pedidos pedido = jpaPedidos.findPedidos(numeroPedido);

        // Si el pedido se encuentra en la base de datos, intenta eliminarlo
        if (pedido != null) {
            try {
                jpaPedidos.destroy(726);
            } catch (NonexistentEntityException e) {
                System.out.println("El pedido con el número " + numeroPedido + " ya no existe en la base de datos.");
            }
        } else {
            System.out.println("El pedido con el número " + numeroPedido + " no se encontró en la base de datos.");
        }
    }
}
