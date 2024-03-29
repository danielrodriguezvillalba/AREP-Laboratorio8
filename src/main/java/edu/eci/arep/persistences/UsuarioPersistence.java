/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arep.persistences;

import edu.application.Persistence.Persistences;
import edu.application.model.Usuario;
import edu.application.Persistence.impl.RouletteDB;
import edu.application.Exceptions.RoulettePersistenceException;
import org.springframework.stereotype.Service;

/**
 *
 * @author 2115253
 */
@Service
public class UsuarioPersistence {
    
    RouletteDB rb = new RouletteDB(); 


    @Override
    public void realizaConexion() throws RoulettePersistenceException {
        rb.realizaConexion();
        
    }

    public void insertarUsuario(Usuario user) {
        rb.insertarUsuario(user);
    }

    
    public Usuario getUsuario(String user) throws RoulettePersistenceException {
        return rb.getUsuario(user);
    }

    public void updateUsuario(Usuario us){
        rb.updateUsuario(us);
    }
    
}
