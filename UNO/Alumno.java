/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UNO;

/**
 *
 * @author
 */
public class Alumno{

    String nombreA, apellidoA;
    Docente docente_programacion;
    Docente docente_base_datos;

    public Alumno(String nombreA, String apellidoA, String nombreP, String apellidoP, String tituloP, String nombreB, String apellidoB, String tituloB) {
        this.nombreA = nombreA;
        this.apellidoA = apellidoA;
        this.docente_programacion = new Docente(nombreP, apellidoP, tituloP);
        this.docente_base_datos = new Docente(nombreB, apellidoB, tituloB);
    }

    @Override
    public String toString() {
        String texto = "Nombre del Estudiante "+getNombreA()+"\n"
                + "Apellido del Estudiante "+getApellidoA()+"\n"
                + "Nombre docente de Programacion "+getDocente_programacion().getNombre()+"\n"
                + "Apellido docente de Programacion "+getDocente_programacion().getApellido()+"\n"
                + "Titulo docente de Programacion "+getDocente_programacion().getTitulo()+"\n"
                + "Nombre docente de Base de datos "+getDocente_base_datos().getNombre()+"\n"
                + "Apellido docente de Base de datos "+getDocente_base_datos().getApellido()+"\n"
                + "Titulo docente de Base de datos "+getDocente_base_datos().getTitulo()+"\n"
                + "";
        return texto; //To change body of generated methods, choose Tools | Templates.
    }


    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public String getApellidoA() {
        return apellidoA;
    }

    public void setApellidoA(String apellidoA) {
        this.apellidoA = apellidoA;
    }

    public Docente getDocente_programacion() {
        return docente_programacion;
    }

    public void setDocente_programacion(Docente docente_programacion) {
        this.docente_programacion = docente_programacion;
    }

    public Docente getDocente_base_datos() {
        return docente_base_datos;
    }

    public void setDocente_base_datos(Docente docente_base_datos) {
        this.docente_base_datos = docente_base_datos;
    }

    
}