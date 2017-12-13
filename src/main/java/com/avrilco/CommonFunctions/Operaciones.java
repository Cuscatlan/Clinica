/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avrilco.CommonFunctions;

import com.avrilco.Entidades.Dboclientes;
import java.io.InputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/*import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;*/
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Conjunction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author cuscatlan.net
 */
public class Operaciones {

    private Session session;

    private void iniciarOperacion() {
        SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
        session = sf.openSession();
        session.getTransaction().begin();

    }

    private void terminarOperacion() {
        session.getTransaction().commit();
        session.close();

    }

    //aqui estan las funciones de a tabla consulta
    public String guardarCliente(Dboclientes cliente) {
        String id = "";
        iniciarOperacion();
        id = (String) session.save(cliente);
        terminarOperacion();
        return id;
    }

    public void actualizarCliente(Dboclientes cliente) {
        iniciarOperacion();
        session.update(cliente);
        terminarOperacion();
    }

    public void eliminarConsulta(Dboclientes consulta) {
        iniciarOperacion();
        session.delete(consulta);
        terminarOperacion();
    }

    public Dboclientes obtenerConsulta(int idconsulta) {
        Dboclientes consulta = null;
        iniciarOperacion();
        consulta = (Dboclientes) session.get(Dboclientes.class, idconsulta);
        terminarOperacion();
        return consulta;
    }

    public List<Dboclientes> listaDeClientes(String campos) {

        List<Dboclientes> listaclientes = null;
        iniciarOperacion();
        listaclientes = session.createQuery("from Dboclientes").list();
        
        terminarOperacion();
        return listaclientes;

    }
/*
    public JasperViewer buscarPorCampo(Consultas consulta1, Consultas consulta2) throws ParseException {

        List<Consultas> listaconsultas = null;
        JasperViewer jviewer = null;
        iniciarOperacion();
        Criteria crit = session.createCriteria(Consultas.class);
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-YYYY");
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        ListIterator lit = null;
        if (consulta2.getFecha() == null) {

            cal1.setTime(consulta1.getFecha());
            cal1.set(Calendar.HOUR, 0);
            cal1.set(Calendar.MINUTE, 0);
            cal1.set(Calendar.SECOND, 0);

            String myDate = "02-10-2017";
            // Create date 17-04-2011 - 00h00 

            Date minDate = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            //cal1.setTime(sdf.format(minDate));

            minDate = cal1.getTime();
            // consulta1.getFecha().setTime(minDate.getTime());

            // Create date 18-04-2011 - 00h00 
            // -> We take the 1st date and add it 1 day in millisecond thanks to a useful and not so known class 
            cal1.set(Calendar.HOUR, 23);
            cal1.set(Calendar.MINUTE, 59);
            cal1.set(Calendar.SECOND, 59);

            Date maxDate = cal1.getTime();
            Conjunction and = Restrictions.conjunction();
            // The order date must be >= 17-04-2011 - 00h00 
            and.add(Restrictions.ge("fecha", minDate));
            // And the order date must be < 18-04-2011 - 00h00 
            and.add(Restrictions.lt("fecha", maxDate));

            crit.add(and);
            listaconsultas = crit.list();
            if (listaconsultas.size() > 0) {
                lit = listaconsultas.listIterator(1);
            }

            JasperReport reporte = null;
            try {
                Map fechas = new HashMap();
                fechas.put("dia", minDate);
                // fechas.put("fechamax", maxDate);

                reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/ConsultasDia.jasper"));
                JasperPrint jasperPrint;
                ConsultasDataSource lista = new ConsultasDataSource();
                /*  while (lit.hasNext()) {
                    Consultas c = (Consultas) lit.next();
                    lista.addParticipante(c);
                }
 /*
                jasperPrint = JasperFillManager.fillReport(reporte, null, lista);

                JRExporter exporter = new JRPdfExporter();
                exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
                exporter.setParameter(JRExporterParameter.OUTPUT_FILE, new java.io.File("reporte2PDF.pdf"));
                exporter.exportReport();
                 
                ConeccionReportes cr = new ConeccionReportes();
                cr.abrir_cnn();
                JasperPrint PrintConsultas = JasperFillManager.fillReport(reporte, fechas, cr.getCon());
                jviewer = new JasperViewer(PrintConsultas, false);

            } catch (JRException ex) {
                System.out.println("error cargando el reporte Resumen");
            }

            terminarOperacion();

            return jviewer;
        } else {
            cal1.setTime(consulta1.getFecha());
            cal1.set(Calendar.HOUR, 0);
            cal1.set(Calendar.MINUTE, 0);
            cal1.set(Calendar.SECOND, 0);
            //fecha minima para el valor del primer Combo
            Date minDate = new Date();
            minDate = cal1.getTime();
            //para la fecha maxima usaremos el segundo Caledario
            cal2.setTime(consulta2.getFecha());
            cal2.set(Calendar.HOUR, 24);
            cal2.set(Calendar.MINUTE, 60);
            cal2.set(Calendar.SECOND, 60);
            Date maxDate = cal2.getTime();
            Conjunction and = Restrictions.conjunction();

            and.add(Restrictions.ge("fecha", minDate));
            and.add(Restrictions.lt("fecha", maxDate));

            crit.add(and);
            listaconsultas = crit.list();
            //lit = listaconsultas.listIterator(1);
            JasperReport reporte = null;
            try {
                Map fechas = new HashMap();
                fechas.put("fechamin", minDate);
                fechas.put("fechamax", maxDate);

                reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/ConsultasRango.jasper"));
                JasperPrint jasperPrint;
                ConsultasDataSource lista = new ConsultasDataSource();
                /* while (lit.hasNext()) {
                    Consultas c = (Consultas) lit.next();
                    lista.addParticipante(c);
                }*/
 /*
                jasperPrint = JasperFillManager.fillReport(reporte, null, lista);

                JRExporter exporter = new JRPdfExporter();
                exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
                exporter.setParameter(JRExporterParameter.OUTPUT_FILE, new java.io.File("reporte2PDF.pdf"));
                exporter.exportReport();
                 
                ConeccionReportes cr = new ConeccionReportes();
                cr.abrir_cnn();
                JasperPrint PrintConsultas = JasperFillManager.fillReport(reporte, fechas, cr.getCon());
                jviewer = new JasperViewer(PrintConsultas, false);
                cr.cerrar_cnn();

            } catch (JRException ex) {
                System.out.println("error cargando el reporte Resumen");
            }

            terminarOperacion();

            return jviewer;
        }
    }
*/
    public List<Dboclientes> ConsultasPaciente(Dboclientes c) {

        List Historial = null;
        iniciarOperacion();
        Criteria crit = session.createCriteria(Dboclientes.class);
        if (c.getId() != "") {
            crit.add(Restrictions.eq("idpaciente", c.getId()));
        } else {
            return null;
        }
        Historial = crit.list();
        return Historial;
    }
/*
    public JasperViewer reportedeConsultasPaciente(Pacientes pacienteHistorial) {

        JasperViewer Historial = null;
        JasperReport reporte = null;
        iniciarOperacion();
        Criteria crit = session.createCriteria(Consultas.class);
        try {
            Map parametros = new HashMap();
            parametros.put("nombre", pacienteHistorial.getNombres());
            parametros.put("apellidos", pacienteHistorial.getPrimerapellido() + " " + pacienteHistorial.getSegundoapellido());
            parametros.put("edad", pacienteHistorial.getEdadCaracter());
            parametros.put("Ciudad", pacienteHistorial.getCiudad());
            parametros.put("Ocupacion", pacienteHistorial.getOcupacion());
            parametros.put("referido", pacienteHistorial.getReferidopor());
            parametros.put("sexo", pacienteHistorial.getSexo().toString());
            parametros.put("codigo", pacienteHistorial.getCodigo());
            parametros.put("idcliente", pacienteHistorial.getIdpaciente());
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/HistorialPaciente.jasper"));
            JasperPrint jasperPrint;
            ConsultasDataSource lista = new ConsultasDataSource();
            ConeccionReportes cr = new ConeccionReportes();
            cr.abrir_cnn();
            JasperPrint PrintConsultas = JasperFillManager.fillReport(reporte, parametros, cr.getCon());
            Historial = new JasperViewer(PrintConsultas, false);
            cr.cerrar_cnn();
        } catch (JRException jre) {
            System.out.println("error cargando el reporte Resumen" + jre.getMessage());
        }
        //Historial = crit.list();
        terminarOperacion();
        return Historial;
    }

    //fin de las funciones sobre la tabla consulta
    public void ejecutarProceso(String Nombre, String Ruta) {
        Session session;
        Connection c;

        ConeccionReportes cr = new ConeccionReportes();
        try {
            cr.abrir_cnn();
            c = cr.getCon();

            CallableStatement call = c.prepareCall("{CALL [dbo].[Respaldo-DRJFLB](?,?)}");
            //call.registerOutParameter( 1, Types.INTEGER ); // parametro de salida
            call.setString("NombreDeArchivo", Nombre + ".back");
            call.setString("UbicacionDestino", Ruta);
            call.execute();
            //Integer result = call.getInt(1); 
            System.out.print("exito");
        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }
    }
*/
}
