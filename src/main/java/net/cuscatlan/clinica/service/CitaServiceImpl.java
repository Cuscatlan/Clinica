/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.cuscatlan.clinica.service;

import java.util.List;
import net.cuscatlan.clinica.dao.CitaDao;
import net.cuscatlan.clinica.model.Citas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author DELL
 */
@Service("CitaService")
@Transactional
public class CitaServiceImpl implements CitaService {

    @Autowired
    private CitaDao dao;

    @Override
    public Citas findById(int id) {
        return dao.findById(id);
    }

    @Override
    public void saveCita(Citas cita) {
        dao.saveCita(cita);
    }

    @Override
    public void updateCita(Citas cita) {
        Citas entity = dao.findById(cita.getIdcitas());
        if (entity != null) {
            entity.setDescripcioncita(cita.getDescripcioncita());
            entity.setEstadocita(cita.getEstadocita());
            entity.setFechacita(cita.getFechacita());
            entity.setNombredoctorcita(cita.getNombredoctorcita());
            //entity.set
        }
    }

    @Override
    public void deleteCitaBySsn(String ssn) {
        dao.deleteCitaBySsn(ssn);
    }

    @Override
    public List<Citas> findAllCita() {
        return dao.findCita();
    }

    @Override
    public Citas findCitaBySsn(String ssn) {
        return dao.findCitaBySsn(ssn);
    }

    @Override
    public boolean isCitaSsnUnique(Integer id, String ssn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
