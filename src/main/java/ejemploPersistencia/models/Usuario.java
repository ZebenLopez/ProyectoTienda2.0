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
    private int codigo;
    @Basic
    private String nombreu;
    private String clave;

    public int getCodigo() {
        return codigo;
    }

    public String getNombreu() {
        return nombreu;
    }

    public String getClave() {
        return clave;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombreu(String nombreu) {
        this.nombreu = nombreu;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Usuario(int codigo, String nombreu, String clave) {
        this.codigo = codigo;
        this.nombreu = nombreu;
        this.clave = clave;
    }

    public Usuario() {
    }
    
    
    
}
