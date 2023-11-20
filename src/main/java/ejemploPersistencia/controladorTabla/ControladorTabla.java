package ejemploPersistencia.controladorTabla;

import ejemploPersistencia.models.Pedidos;
import ejemploPersistencia.vistas.InterfazPrincipalCamarero;
import static ejemploPersistencia.vistas.InterfazPrincipalCamarero.tableModel;
import ejemploPersistencia.vistas.PantallaPrincipal;
import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author loren
 */
public class ControladorTabla {
    PantallaPrincipal principal = new PantallaPrincipal();          
    InterfazPrincipalCamarero camarero = new InterfazPrincipalCamarero(principal,true);
    Pedidos pedidos = new Pedidos();
            
    //int numeroPedido, int codigoProducto, String snack, int cantidad
    public ArrayList<Pedidos> recorrerTabla(ArrayList<Pedidos> pedid) {
        
        while (tableModel.getRowCount() != 0) {
            String nombreProducto = (String) tableModel.getValueAt(0, 0);
            int cantidadProducto = (int)  tableModel.getValueAt(0, 1);
            
            Pedidos nuevoPedido = new Pedidos( 2, 3,nombreProducto,cantidadProducto);
            pedid.add(nuevoPedido);
            tableModel.removeRow(0);
        }
        
        return pedid;
        
    }
}
