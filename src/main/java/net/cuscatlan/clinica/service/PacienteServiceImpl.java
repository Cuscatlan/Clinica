/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.cuscatlan.clinica.service;

import java.util.List;
import net.cuscatlan.clinica.model.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import net.cuscatlan.clinica.dao.PacienteDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author DELL
 */
@Service("PacienteService")
@Transactional
public class PacienteServiceImpl implements PacienteService {

    @Autowired
    private PacienteDao dao;

    @Override
    public Paciente findById(long id) {
        return dao.findById(id);

    }

    @Override
    public void savePaciente(Paciente paciente) {
        dao.savePaciente(paciente);
    }

    @Override
    public void updatePaciente(Paciente paciente) {
        Paciente entity = dao.findById(paciente.getIdpaciente());
        if(entity!=null){
          entity.setApellidopaciente(paciente.getApellidopaciente());
        //  entity.setCitas(paciente.getCitas());
          entity.setFechanacimientopaciente(paciente.getFechanacimientopaciente());
          entity.setFotopefilpaciente(paciente.getFotopefilpaciente());
          entity.setLugatrabajopaciente(paciente.getLugatrabajopaciente());
          entity.setMorapaciente(paciente.getMorapaciente());
          entity.setNombrepaciente(paciente.getNombrepaciente());
          entity.setProfesionpaciente(paciente.getApellidopaciente());
          entity.setSaldopaciente(paciente.getSaldopaciente());
          entity.setSeguropaciente(paciente.getSeguropaciente());
          //entity.setTelefonos(paciente.getTelefonos());
        }
    }

    @Override
    public void deletePacienteBySsn(String ssn) {
        dao.deletePacienteBySsn(ssn);
    }

    @Override
    public List<Paciente> findAllPacientes() {
                return dao.findPacientes();
    }

    @Override
    public Paciente findPacienteBySsn(String ssn) {
          return dao.findPacienteBySsn(ssn);
    }

    @Override
    public boolean isPacienteSsnUnique(Integer id, String ssn) {
        Paciente paciente = findPacienteBySsn(ssn);
        return ( paciente == null || ((id != null) && (paciente.getIdpaciente() == id)));

    }

}
