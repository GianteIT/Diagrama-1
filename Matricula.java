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
public class Matricula {

    public String getCertificadoNotas() {
        return certificadoNotas;
    }

    public void setCertificadoNotas(String certificadoNotas) {
        this.certificadoNotas = certificadoNotas;
    }

    public String getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(String fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCodigoMatricula() {
        return codigoMatricula;
    }

    public void setCodigoMatricula(String codigoMatricula) {
        this.codigoMatricula = codigoMatricula;
    }
    private String certificadoNotas;
    private String fechaMatricula;
    private String dni;
    private String codigoMatricula;
public Semestre tieneM;
public ArrayList<Asignaturas> incluidoM = new ArrayList();
public ArrayList<Alumno> realizarM = new ArrayList();

public Matricula(String cN, String fM, String d, String cM, Semestre t){
certificadoNotas=cN;
fechaMatricula=fM;
dni=d;
codigoMatricula=cM;
tieneM=t;
}
public void agregarAsignaturas(Asignaturas i) {
incluidoM.add(i);
}

public void agregarAlumno(Alumno alumno){
realizarM.add(alumno);
}

}
