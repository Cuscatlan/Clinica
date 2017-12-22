/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.cuscatlan.clinica.dao;

import java.util.List;
import net.cuscatlan.clinica.model.Receta;

/**
 *
 * @author Administrador
 */
public interface RecetaDao {
    Receta findById(int id);
 
    void saveReceta(Receta cita);
     
    void deleteRecetaId(int id);
     
    List<Receta> findReceta();
 
    Receta findRecetabyid(int id);
    
}
