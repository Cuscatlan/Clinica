/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.cuscatlan.clinica.dao;

/**
 *
 * @author DELL
 */
import java.util.List;
import net.cuscatlan.clinica.model.Usuario;
 
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
 
//import com.websystique.springmvc.model.Employee;
 
@Repository("UsuariosDao")
public class UsuarioDaoImpl extends AbstractDao<Integer, Usuario> implements UsuariosDao{
    
    
    public Usuario findById(int id) {
        return getByKey(id);
    }
 
    public void saveUsuario(Usuario employee) {
        persist(employee);
    }
 
    public void deleteUsuarioBySsn(String ssn) {
        Query query = getSession().createSQLQuery("delete from Employee where ssn = :ssn");
        query.setString("ssn", ssn);
        query.executeUpdate();
    }
 
    @SuppressWarnings("unchecked")
    public List<Usuario> findUsuarios() {
        Criteria criteria = createEntityCriteria();
        return (List<Usuario>) criteria.list();
    }
 
    public Usuario findUsuarioBySsn(String ssn) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("ssn", ssn));
        return (Usuario) criteria.uniqueResult();
    }

    

   
}
