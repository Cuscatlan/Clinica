/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.cuscatlan.clinica.dao;
/**
 *
 * @author DELL
 */
import java.util.List;
 
import net.cuscatlan.clinica.model.Usuario;
 
public interface UsuariosDao {
 
    Usuario findById(int id);
 
    void saveUsuario(Usuario usuario);
     
    void deleteUsuarioBySsn(String ssn);
     
    List<Usuario> findUsuarios();
 
    Usuario findUsuarioBySsn(String ssn);
 
}
