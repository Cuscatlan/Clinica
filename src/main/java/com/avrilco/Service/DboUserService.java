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
 
import com.avrilco.Entidades.Dbouser;
 
public interface DboUserService {
 
    Dbouser findById(int id);
     
    void saveUser(Dbouser dbouser);
     
    void updateEmployee(Dbouser dbouser);
     
    void deleteDbouserByDui(String dui);
 
    List<Dbouser> findAllUsers(); 
     
    Dbouser findDbouserByDui(String dui);
 
    boolean isUserDuiUnique(String dui);
     
}
