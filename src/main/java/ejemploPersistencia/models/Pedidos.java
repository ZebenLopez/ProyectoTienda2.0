/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
    private int numeroPedido;
    private int codigoProducto;
    @Basic
    private String snack;
    private int cantidad;

    public Pedidos(int numeroPedido, int codigoProducto, String snack, int cantidad) {
        this.numeroPedido = numeroPedido;
        this.codigoProducto = codigoProducto;
        this.snack = snack;
        this.cantidad = cantidad;
    }

    public Pedidos() {
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public String getSnack() {
        return snack;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public void setSnack(String snack) {
        this.snack = snack;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Pedidos{" + "numeroPedido=" + numeroPedido + ", codigoProducto=" + codigoProducto + ", snack=" + snack + ", cantidad=" + cantidad + '}';
    }

}
