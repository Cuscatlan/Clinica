/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avrilco.CommonFunctions;

import javax.swing.JTable;
import javax.swing.table.TableColumn;

/**
 *
 * @author MCastro
 */
public class CommonFunctions {

    /**
     *
     * @author MCastro
     * @param table nombre de la tabla que se desea definir el ancho de las columnas
     * @param tablePreferredWidth ancho de la tabla en la vista design
     * @param percentages porcentaje deseado para cada columna
     * @description Este metodo se encarga de definir en porcentajes el ancho de las columnas de los JTable     
     */
    public static void setJTableColumnsWidth(JTable table, int tablePreferredWidth, double... percentages) {
        //Este metodo sirve para definir un porcentaje para las columnas de las tablas
        double total = 0;
        for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
            total += percentages[i];
        }

        for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
            TableColumn column = table.getColumnModel().getColumn(i);
            column.setPreferredWidth((int) (tablePreferredWidth * (percentages[i] / total)));
            //Hacemos que la columna no se pueda cambiar de tamano
            column.setResizable(false);
        }
    }
}
