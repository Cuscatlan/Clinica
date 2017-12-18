/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.cuscatlan.clinica.service;

import java.util.List;
import net.cuscatlan.clinica.model.Usuario;
import net.cuscatlan.clinica.dao.UsuariosDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author DELL
 */
@Service("employeeService")
@Transactional
public class UsuarioServiceImpl implements UsuarioService {
    
    @Autowired
    private UsuariosDao dao;
     

    @Override
    public Usuario findById(int id) {
         return dao.findById(id);
    }

    @Override
    public void saveUsuario(Usuario usuario) {
        dao.saveUsuario(usuario);
    }

    @Override
    public void updateUsuario(Usuario usuario) {
         Usuario entity = dao.findById(Integer.parseInt(""+usuario.getIdusuario()));
        if(entity!=null){
            entity.setNombreusuario(usuario.getNombreusuario());
            entity.setCorreousuario(usuario.getCorreousuario());
            entity.setClaveusuario(usuario.getClaveusuario());
            //.setSsn(usuario));
        }
    }

    @Override
    public void deleteUsuarioBySsn(String ssn) {
                dao.deleteUsuarioBySsn(ssn);
    }

    @Override
    public List<Usuario> findAllIUsuario() {
        return dao.findUsuarios();

    }

    @Override
    public Usuario findUsuarioBySsn(String ssn) {
                return dao.findUsuarioBySsn(ssn);

    }

    @Override
    public boolean isUsuarioSsnUnique(Integer id, String ssn) {
        Usuario usuario = findUsuarioBySsn(ssn);
        return ( usuario == null || ((id != null) && (usuario.getIdusuario() == id)));

    }
    
}
