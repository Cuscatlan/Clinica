/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.cuscatlan.clinica.controller;

import javax.validation.Valid;
import net.cuscatlan.clinica.model.Receta;
import net.cuscatlan.clinica.service.RecetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Administrador
 */
@Controller
@RequestMapping("/Receta")
public class RecetaController {
    
     @Autowired
    RecetaService cservice;
    
     @RequestMapping(value = {"/new"}, method = RequestMethod.POST)
    public String saveReceta(@Valid Receta receta, BindingResult result,ModelMap model) { 
        if (result.hasErrors()) {
            return "registrarReceta";
        }
        
        cservice.saveReceta(receta);
        model.addAttribute("success", "Receta" + receta.getIdreceta() + " registered successfully");
        return "success";
    }
    
}
