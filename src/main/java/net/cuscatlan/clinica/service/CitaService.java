/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.cuscatlan.clinica.service;

import java.util.List;
import net.cuscatlan.clinica.model.Citas;

/**
 *
 * @author DELL
 */
public interface CitaService {
   Citas findById(int id);
     
    void saveCita(Citas cita);
     
    void updateCita(Citas cita);
     
    void deleteCitaBySsn(String ssn);
 
    List<Citas> findAllCita(); 
     
    Citas findCitaBySsn(String ssn);
 
    boolean isCitaSsnUnique(Integer id, String ssn); 
}
