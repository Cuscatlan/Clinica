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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author DELL
 */
@Controller
@RequestMapping("/Citas")
public class CitaController {
    
    @Autowired
    CitaService cservice;
    
    @RequestMapping(value = { "/new" }, method = RequestMethod.GET)
    public String newEmployee(ModelMap model) {
        Citas cita = new Citas();
        model.addAttribute("cita", cita);
        model.addAttribute("edit", false);
        model.addAttribute("tipo","Programada");
        return "registrar";
    }
    
    @RequestMapping(value = { "/newE" }, method = RequestMethod.GET)
    public String newEmergencia(ModelMap model) {
        Citas cita = new Citas();
        model.addAttribute("cita", cita);
        model.addAttribute("edit", false);
        model.addAttribute("tipo","noProgramada");
        return "registrar";
    }
    
    @RequestMapping(value = { "/editC" }, method = RequestMethod.GET)
    public String CancelarCita(ModelMap model) {
        Citas cita = new Citas();
        model.addAttribute("cita", cita);
        model.addAttribute("edit", true);
        model.addAttribute("tipo","Cancelar");
        return "registrar";
    }
    
     @RequestMapping(value = { "/new" }, method = RequestMethod.POST)
    public String saveEmployee(@Valid Citas cita, BindingResult result,ModelMap model) { 
        if (result.hasErrors()) {
            return "registrar";
        }
        /*
         * Preferred way to achieve uniqueness of field [ssn] should be implementing custom @Unique annotation 
         * and applying it on field [ssn] of Model class [Employee].
         * 
         * Below mentioned peace of code [if block] is to demonstrate that you can fill custom errors outside the validation
         * framework as well while still using internationalized messages.
         * 
         */
        /*
        if(!cservice.isCitaSsnUnique(cita.getIdcitas(), ssn)isEmployeeSsnUnique(employee.getId(), employee.getSsn())){
            FieldError ssnError =new FieldError("employee","ssn",messageSource.getMessage("non.unique.ssn", new String[]{employee.getSsn()}, Locale.getDefault()));
            result.addError(ssnError);
            return "registration";
        }
        */
        cservice.saveCita(cita);
        model.addAttribute("success", "citas" + cita.getNombredoctorcita() + " registered successfully");
        return "success";
    }
 
    @RequestMapping(value = { "/edit-{idcitas}-cita" }, method = RequestMethod.GET)
    public String editCitas(@PathVariable int idcitas, ModelMap model) {   
        Citas cita = cservice.findById(idcitas);
        model.addAttribute("cita",cita);
        model.addAttribute("edit",true);
        return "registrar"; 
    }
    @RequestMapping(value = { "/delete-{idcitas}-cita" }, method = RequestMethod.GET)
    public String cancelarCitas(@PathVariable int idcitas, ModelMap model) {   
        Citas cita = cservice.findById(idcitas);
        model.addAttribute("cita",cita);
        model.addAttribute("edit",true);
        return "cancelarCita"; 
    }
   
    
}
