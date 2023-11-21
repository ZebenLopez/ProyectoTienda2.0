package ejemploPersistencia.controladorDatos;

import ejemploPersistencia.models.Pedidos;
import ejemploPersistencia.persistence.PedidosJpaController;

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
}
