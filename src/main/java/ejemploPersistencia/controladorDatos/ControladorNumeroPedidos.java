package ejemploPersistencia.controladorDatos;

import ejemploPersistencia.models.Pedidos;
import ejemploPersistencia.persistence.PedidosJpaController;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Zeben
 * @author Lorena
 * @version 1.0
 */
public class ControladorNumeroPedidos {
    PedidosJpaController jpaPedidos = new PedidosJpaController();
    List<Pedidos> pedidos = jpaPedidos.findPedidosEntities();

    public List<String> numeroPedidos() {
        pedidos = jpaPedidos.findPedidosEntities();
        Set<String> numeros = new HashSet<>();
        for (Pedidos pedido : pedidos) {
            numeros.add(String.valueOf(pedido.getNumeroPedido()));
        }
        // Si el set está vacío, añade "No hay pedidos"
        if (numeros.isEmpty()) {
            numeros.add("No hay pedidos");
        }
        // Convierte el set a una lista antes de devolverlo
        return new ArrayList<>(numeros);
    }

    public List<Pedidos> listaPedidos(int codigoPedido) {
        System.out.println("Buscando pedidos con codigoProducto: " + codigoPedido);
        System.out.println("Número de pedidos disponibles: " + pedidos.size());

        List<Pedidos> listaPedidos = new ArrayList<>();
        for (Pedidos pedido : pedidos) {
            if (pedido.getNumeroPedido() == codigoPedido) {
                listaPedidos.add(pedido);
            }
        }

        return listaPedidos;
    }
}
