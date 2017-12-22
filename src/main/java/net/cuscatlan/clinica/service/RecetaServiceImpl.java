/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.cuscatlan.clinica.service;

import java.util.List;
import net.cuscatlan.clinica.dao.RecetaDao;
import net.cuscatlan.clinica.model.Receta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Administrador
 */
@Service("RecetaService")
@Transactional
public class RecetaServiceImpl implements RecetaService{

    @Autowired
    private RecetaDao dao;

    
    @Override
    public Receta findById(int id) {
        return dao.findById(id);
    }

    @Override
    public void saveReceta(Receta receta) {
        dao.saveReceta(receta);
    }

    @Override
    public void updateReceta(Receta receta) {
         Receta entity = dao.findById(receta.getIdreceta());
        if (entity != null) {
            entity.setDescripcionreceta(receta.getDescripcionreceta());
 
        }
    }

    @Override
    public void deleteRecetaByid(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Receta> findAllReceta() {
        return dao.findReceta();
    }
    
}
