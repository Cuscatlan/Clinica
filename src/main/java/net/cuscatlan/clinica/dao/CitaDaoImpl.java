/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.cuscatlan.clinica.dao;

import java.util.List;
import net.cuscatlan.clinica.model.Citas;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 *
 * @author DELL
 */
@Repository("CitaDao")
public class CitaDaoImpl extends AbstractDao<Integer, Citas> implements CitaDao{

    @Override
    public Citas findById(int id) {
        return getByKey(id);
    }

    @Override
    public void saveCita(Citas cita) {
        persist(cita);
    }

    @Override
    public void deleteCitaBySsn(String ssn) {
        Query query = getSession().createSQLQuery("delete from cita where id = :ssn");
        query.setString("ssn", ssn);
        query.executeUpdate();
    }
    @SuppressWarnings("unchecked")
    public List<Citas> findCita() {
        Criteria criteria = createEntityCriteria();
        return (List<Citas>) criteria.list();
    }

    @Override
    public Citas findCitaBySsn(String ssn) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("ssn", ssn));
        return (Citas)criteria.uniqueResult();
    }
    
}
