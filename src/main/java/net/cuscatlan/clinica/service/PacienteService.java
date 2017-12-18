/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.cuscatlan.clinica.service;

import java.util.List;
import net.cuscatlan.clinica.model.Paciente;


public interface PacienteService {
    
    Paciente findById(long id);
     
    void savePaciente(Paciente paciente);
     
    void updatePaciente(Paciente paciente);
     
    void deletePacienteBySsn(String ssn);
 
    List<Paciente> findAllPacientes(); 
     
    Paciente findPacienteBySsn(String ssn);
 
    boolean isPacienteSsnUnique(Integer id, String ssn);
     
}
