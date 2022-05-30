/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capanegocio;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class EscuelaProfesional {

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesores() {
        return profesores;
    }

    public void setProfesores(String profesores) {
        this.profesores = profesores;
    }

    public String getTitulos() {
        return titulos;
    }

    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }
    private String nombre;
    private String profesores;
    private String titulos;
public ArrayList<Alumno> perteneceEP = new ArrayList();
public Facultad tieneEP;

public EscuelaProfesional(String n, String p, String t){
nombre=n;
profesores=p;
titulos=t;
}
public void agregarAlumno(Alumno a){
perteneceEP.add(a);
}
public void asignarTieneEP(Facultad f){
tieneEP=f;
}
}
