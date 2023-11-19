/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploPersistencia.models;

import ejemploPersistencia.persistence.ControladorGralPersistencia;
import ejemploPersistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author Zeben
 */
public class ControladorGralModelo {
    ControladorGralPersistencia enlaceModeloPersistencia = new ControladorGralPersistencia();
    
    public void crearUsuario(Usuario usuario){
        enlaceModeloPersistencia.crearUsuario(usuario);
    }
    
    public void borrarUsuario(String nombre) throws NonexistentEntityException {
        enlaceModeloPersistencia.borrarUsuario(nombre);
    }
}
