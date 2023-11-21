package ejemploPersistencia.controladorDatos;

import ejemploPersistencia.models.Pedidos;
import ejemploPersistencia.persistence.ControladorGralPersistencia;
import ejemploPersistencia.persistence.PedidosJpaController;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ControladorNumeroPedidos {
    PedidosJpaController jpaPedidos = new PedidosJpaController();
    List<Pedidos> pedidos = jpaPedidos.findPedidosEntities();

    public List<String> numeroPedidos() {
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

    public List<Pedidos> listaPedidos(int codigoProducto) {
        System.out.println("Buscando pedidos con codigoProducto: " + codigoProducto);
        System.out.println("Número de pedidos disponibles: " + pedidos.size());

        List<Pedidos> listaPedidos = new ArrayList<>();
        for (Pedidos pedido : pedidos) {
            if (pedido.getNumeroPedido() == codigoProducto) {
                listaPedidos.add(pedido);
            }
        }

        System.out.println("Número de pedidos encontrados: " + listaPedidos.size());
        return listaPedidos;
    }
}
