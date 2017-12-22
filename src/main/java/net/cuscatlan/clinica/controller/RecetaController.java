/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.cuscatlan.clinica.controller;

import javax.validation.Valid;
import net.cuscatlan.clinica.model.Citas;
import net.cuscatlan.clinica.model.Receta;
import net.cuscatlan.clinica.service.CitaService;
import net.cuscatlan.clinica.service.RecetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
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
    RecetaService rservice;
     
     @Autowired
    CitaService cservice;
     
    
      @RequestMapping(value = { "/Recetar-{idcitas}-cita" }, method = RequestMethod.GET)
    public String Recetar(@PathVariable int idcitas, ModelMap model) {   
        Receta receta=new Receta();
        Citas cita = cservice.findById(idcitas);
        model.addAttribute("cita",cita);
        model.addAttribute("receta",receta);
        model.addAttribute("edit",false);
        return "registrarReceta"; 
    }
     
     
     @RequestMapping(value = {"/new"}, method = RequestMethod.POST)
    public String saveReceta(@Valid Receta receta, BindingResult result,ModelMap model) { 
        if (result.hasErrors()) {
            return "registrarReceta";
        }
        
        rservice.saveReceta(receta);
        model.addAttribute("success", "Receta" + receta.getIdreceta() + " registered successfully");
        return "success";
    }
    
}
