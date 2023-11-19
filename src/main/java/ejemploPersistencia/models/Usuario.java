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
 */
@Entity
public class Usuario implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int codigoUsuario;
    @Basic
    private String nombre;
    private String contraseña;
    private String rol;

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getRol() {
        return rol;
    }

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Usuario(int codigo, String nombreu, String clave) {
        this.codigoUsuario = codigo;
        this.nombre = nombreu;
        this.contraseña = clave;
        this.rol = rol;
    }

    public Usuario() {
    }
    
    
    
}
