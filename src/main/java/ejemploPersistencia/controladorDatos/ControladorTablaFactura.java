package ejemploPersistencia.controladorDatos;

import ejemploPersistencia.models.Pedidos;
import ejemploPersistencia.models.Usuario;
import ejemploPersistencia.vistas.PantallaPrincipal;

import static ejemploPersistencia.vistas.InterfazPrincipalCamarero.tableModel;

import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author loren
 */
public class ControladorTablaFactura {
    ArrayList<Pedidos> pedido = new ArrayList();

    public ArrayList<Pedidos> recorrerTabla() throws NoSuchAlgorithmException {
        int numPedido = numeroAleatorio();

        try {
            while (tableModel.getRowCount() != 0) {
                String nombreProducto = (String) tableModel.getValueAt(0, 0);
                int cantidadProducto = (int)  tableModel.getValueAt(0, 1);
                double precioProducto = (double) tableModel.getValueAt(0, 2);
                Pedidos nuevoPedido = new Pedidos(numeroAleatorio(),numPedido, precioProducto,nombreProducto,cantidadProducto);
                pedido.add(nuevoPedido);
                tableModel.removeRow(0);
            }
        } catch (Exception e) {
            System.out.println("Error al recorrer la tabla");
        }
        return pedido;
    }

    public int numeroAleatorio() throws NoSuchAlgorithmException {
        int numero = SecureRandom.getInstanceStrong().nextInt(100000);
        return numero;
    }

    public String generarFactura(ArrayList<Pedidos> pedidos) {
        PantallaPrincipal pantallaPrincipal = new PantallaPrincipal();
        StringBuilder factura = new StringBuilder();
        double precioFinal = 0;
        factura.append(String.format("NUMERO PEDIDO: %d%n", pedidos.get(0).getNumeroPedido()));
        factura.append("---------------------------------------------\n");

        for (Pedidos pedido : pedidos) {
            double subtotal = pedido.getCantidad() * pedido.getPrecioProducto();
            factura.append(String.format("PRODUCTO: %-10s CANTIDAD: %-3d PRECIO INDIVIDUAL: %-7.2f€ PRECIO TOTAL: %-5.2f€%n",
                    pedido.getSnack(), pedido.getCantidad(), pedido.getPrecioProducto(), subtotal));
            factura.append("---------------------------------------------\n");
            precioFinal += subtotal;
        }
        factura.append(String.format("PRECIO FINAL: %.2f€%n", precioFinal));
        factura.append(String.format("IGIC: %.2f€%n", precioFinal * 0.07));
        factura.append(String.format("Le ha atendido %s%n", PantallaPrincipal.getUsuario()));
        return factura.toString();
    }

    public void guardarFactura(){
        //Generar facturas
        Map<Integer, ArrayList<Pedidos>> pedidosPorPedido = new HashMap<>();
        for (Pedidos pedidoActual : pedido) {
            int numeroPedido = pedidoActual.getNumeroPedido();
            if (!pedidosPorPedido.containsKey(numeroPedido)) {
                pedidosPorPedido.put(numeroPedido, new ArrayList<>());
            }
            pedidosPorPedido.get(numeroPedido).add(pedidoActual);
        }

        for (Map.Entry<Integer, ArrayList<Pedidos>> entry : pedidosPorPedido.entrySet()) {
            String factura = generarFactura(new ArrayList<>(entry.getValue()));
            String nombreArchivo = "factura" + entry.getKey() + ".txt";
            try {
                FileWriter writer = new FileWriter(nombreArchivo);
                writer.write(factura);
                writer.flush();
                writer.close();
                // Abrir el archivo
                if (Desktop.isDesktopSupported()) {
                    try {
                        File myFile = new File(nombreArchivo);
                        Desktop.getDesktop().open(myFile);
                    } catch (IOException ex) {
                        // no application registered for PDFs
                    }
                }
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }
}
