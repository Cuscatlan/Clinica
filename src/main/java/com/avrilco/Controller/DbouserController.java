/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avrilco.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.avrilco.Model.Usuario;
import com.avrilco.Seguridad.Login;
import com.avrilco.Service.DboUserService;
import com.avrilco.siac.Menu;
import com.avrilco.siac.atencionCliente;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 *
 * @author Anthony Huezo
 */
@Controller
@RequestMapping("/")
public class DbouserController extends AppController implements ActionListener {
    
    public void verificarUsuario(JTextField txtUsername, JTextField txtPassword, Login frmLogin) {
        SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = sf.openSession();
                
        try {
            String username = txtUsername.getText().trim();
            String password = txtPassword.getText().trim();
            
            if(username.length() > 0 && password.length() > 0) {
                Criteria criteria = session.createCriteria(Usuario.class)
                        .add(Restrictions.eq("usuario", username))
                        .add(Restrictions.eq("pass", password));
                
                Object result = criteria.uniqueResult();
                Usuario dbouser = (Usuario) result;
                
                /*JOptionPane.showMessageDialog(null,
	                    dbouser, "MSJ",
	                    JOptionPane.INFORMATION_MESSAGE);*/
                if(dbouser != null) {
                    frmLogin.setVisible(false);
                    new atencionCliente().setVisible(true);     
                } else {
                    txtPassword.setText("");
                }                
            }                                                         
        } catch (HibernateException he) {
            he.printStackTrace();
        } finally {
            session.close(); 
        } 
    }
    
    @Bean
    public PasswordEncoder passwordEncoder(){
        PasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
