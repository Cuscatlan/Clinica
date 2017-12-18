/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.cuscatlan.clinica.dao;

import java.util.List;
import net.cuscatlan.clinica.model.Paciente;

/**
 *
 * @author DELL
 */
public interface PacienteDao { 
    
    Paciente findById(long id);
 
    void savePaciente(Paciente paciente);
     
    void deletePacienteBySsn(String ssn);
     
    List<Paciente> findPacientes();
 
    Paciente findPacienteBySsn(String ssn);
 
}
