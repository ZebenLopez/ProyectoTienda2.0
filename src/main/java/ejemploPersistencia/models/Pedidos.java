package ejemploPersistencia.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Zeben
 * @authora Lorena
 */
@Entity
public class Pedidos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigo;
    @Basic
    private int numeroPedido;
    private double precioProducto;
    private String snack;
    private int cantidad;

    public Pedidos(int codigo, int numeroPedido, double codigoProducto, String snack, int cantidad) {
        this.codigo = codigo;
        this.numeroPedido = numeroPedido;
        this.precioProducto = codigoProducto;
        this.snack = snack;
        this.cantidad = cantidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public Pedidos() {
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public String getSnack() {
        return snack;
    }

    public int getCantidad() {
        return cantidad;
    }


    @Override
    public String toString() {
        return "Pedidos{" + "numeroPedido=" + numeroPedido + ", codigoProducto=" + precioProducto + ", snack=" + snack + ", cantidad=" + cantidad + '}';
    }

}
