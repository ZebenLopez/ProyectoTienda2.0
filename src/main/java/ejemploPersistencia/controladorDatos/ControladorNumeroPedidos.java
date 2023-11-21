package ejemploPersistencia.controladorDatos;

import ejemploPersistencia.models.Pedidos;
import ejemploPersistencia.persistence.PedidosJpaController;

import java.util.List;

public class ControladorNumeroPedidos {
    PedidosJpaController jpaPedidos = new PedidosJpaController();
    List<Pedidos> pedidos = jpaPedidos.findPedidosEntities();

    public int numeroPedidos() {

//        for (Pedidos pedido : pedidos) {
//            int numero = pedido.getNumeroPedido();
//            InterfazCocinero.listPedidos.setModel(new javax.swing.AbstractListModel<String>() {
//                String[] strings = {"Pedido Nº " + numero};
//
//                public int getSize() {
//                    return strings.length;
//                }
//
//                public String getElementAt(int i) {
//                    return strings[i];
//                }
//            });
//
//        }
//        return numeroPedidos();
        int numero = 0;
        for (Pedidos pedido : pedidos) {
            numero = pedido.getNumeroPedido();
        }
        return numero;
    }
}
