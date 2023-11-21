package ejemploPersistencia.controladorTabla;

import ejemploPersistencia.models.Pedidos;
import ejemploPersistencia.vistas.InterfazPrincipalCamarero;
import static ejemploPersistencia.vistas.InterfazPrincipalCamarero.tableModel;
import ejemploPersistencia.vistas.PantallaPrincipal;
import java.awt.List;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;

/**
 *
 * @author loren
 */
public class ControladorTabla {
    ArrayList pedido = new ArrayList();
    //int numeroPedido, int codigoProducto, String snack, int cantidad
    public ArrayList<Pedidos> recorrerTabla() throws NoSuchAlgorithmException {
        int numPedido = numeroAleatorio();

        while (tableModel.getRowCount() != 0) {
            String nombreProducto = (String) tableModel.getValueAt(0, 0);
            int cantidadProducto = (int)  tableModel.getValueAt(0, 1);
            Pedidos nuevoPedido = new Pedidos(numPedido, numeroAleatorio(),nombreProducto,cantidadProducto);
            pedido.add(nuevoPedido);
            tableModel.removeRow(0);
        }
        return pedido;
    }

    public int numeroAleatorio() throws NoSuchAlgorithmException {
        int numero = SecureRandom.getInstanceStrong().nextInt(1000);
        return numero;
    }
}
