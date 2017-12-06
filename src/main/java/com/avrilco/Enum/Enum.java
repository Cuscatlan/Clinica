/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avrilco.Enum;

/**
 *
 * @author MCastro
 * @version 1.00
 * @description Esta clase tendra todos los enums que se usaran para la
 * definicion de tablas
 */
public class Enum {

    public Enum(){
        
    }
    public enum CriterioBusquedaAhorro {
        Código(0), 
        Nombre(1), 
        Fecha(2),
        MaxCol(3);
        
        private int value;

        private CriterioBusquedaAhorro(int value) {
            this.value = value;
        }
    }

    
}
