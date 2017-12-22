/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.cuscatlan.clinica.service;

import java.util.List;
import net.cuscatlan.clinica.model.Receta;

/**
 *
 * @author Administrador
 */
public interface RecetaService {
     Receta findById(int id);
     
    void saveReceta(Receta cita);
     
    void updateReceta(Receta cita);
     
    void deleteRecetaByid(int id);
 
    List<Receta> findAllReceta(); 
     
    //Receta findCitaBySsn(String ssn);
 
   // boolean isRecetaidUnique(Integer id, String ssn); 
}
