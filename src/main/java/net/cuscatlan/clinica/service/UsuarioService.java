/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.cuscatlan.clinica.service;
/**
 *
 * @author DELL
 */
import java.util.List;
import net.cuscatlan.clinica.model.Usuario;
 

 
public interface UsuarioService {
    
    Usuario findById(int id);
     
    void saveUsuario(Usuario usuario);
     
    void updateUsuario(Usuario usuario);
     
    void deleteUsuarioBySsn(String ssn);
 
    List<Usuario> findAllIUsuario(); 
     
    Usuario findUsuarioBySsn(String ssn);
 
    boolean isUsuarioSsnUnique(Integer id, String ssn);
     
}
