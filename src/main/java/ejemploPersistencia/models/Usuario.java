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
 * @author Lorena
 * @version 1.0
 */
@Entity
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String nombre;

    @Basic
    private String contrasegna;
    private String rol;

    public String getRol() {
        return rol;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContrasegna() {
        return contrasegna;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Usuario(String nombreu, String clave, String rol) {
        this.nombre = nombreu;
        this.contrasegna = clave;
        this.rol = rol;
    }

    public Usuario() {
    }

}
