/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avrilco.Service;

/**
 *
 * @author Anthony Huezo
 */
import java.util.List;
 
import com.avrilco.Model.Usuario;
 
public interface DboUserService {
 
    Usuario findById(int id);
     
    void saveUser(Usuario dbouser);
     
    void updateEmployee(Usuario dbouser);
     
    void deleteDbouserByDui(String dui);
 
    List<Usuario> findAllUsers(); 
     
    Usuario findDbouserByDui(String dui);
 
    boolean isUserDuiUnique(String dui);
     
}
