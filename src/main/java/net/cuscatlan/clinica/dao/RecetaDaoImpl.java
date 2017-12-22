/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.cuscatlan.clinica.dao;

import java.util.List;
import net.cuscatlan.clinica.model.Receta;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Administrador
 */
@Repository("RecetaDao")
public class RecetaDaoImpl extends AbstractDao<Integer, Receta> implements RecetaDao  {

    @Override
    public Receta findById(int id) {
        return getByKey(id);
    }

    @Override
    public void saveReceta(Receta receta) {
 persist(receta);
    }

    @Override
    public void deleteRecetaId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Receta> findReceta() {
        Criteria criteria = createEntityCriteria();
        return (List<Receta>) criteria.list(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Receta findRecetabyid(int ssn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
