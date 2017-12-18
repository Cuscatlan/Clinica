/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.cuscatlan.clinica.dao;

import java.util.List;
import net.cuscatlan.clinica.model.Paciente;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 *
 * @author DELL
 */
@Repository("PacienteDao")
public class PacienteDaoImpl extends AbstractDao<Integer, Paciente> implements PacienteDao{

    @Override
    public Paciente findById(long id) {
           return getByKey(id);
    }

    @Override
    public void savePaciente(Paciente paciente) {
        persist(paciente);
    }

    @Override
    public void deletePacienteBySsn(String ssn) {
        Query query = getSession().createSQLQuery("delete from Employee where ssn = :ssn");
        query.setString("ssn", ssn);
        query.executeUpdate();
    }

    @SuppressWarnings("unchecked")
    public List<Paciente> findPacientes() {
        Criteria criteria = createEntityCriteria();
        return (List<Paciente>) criteria.list();
    
    }

    @Override
    public Paciente findPacienteBySsn(String ssn) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("ssn", ssn));
        return (Paciente) criteria.uniqueResult();
    
    }

    

    
    
}
