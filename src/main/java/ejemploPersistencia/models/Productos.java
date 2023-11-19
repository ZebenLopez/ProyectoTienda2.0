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
public class Productos implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int codigoProducto;
    @Basic
    private String nombre;
    private String tipo;
    private double precio;

    public Productos(int codigo, String nombre, String tipo, double precio) {
        this.codigoProducto = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public Productos() {
    }
    
    @Override
    public String toString() {
        return "Productos{" + "codigo=" + codigoProducto + ", nombre=" + nombre + ", tipo=" + tipo + ", precio=" + precio + '}';
    }
    
}
