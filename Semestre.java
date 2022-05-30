/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capanegocio;

public class Semestre {

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getCatalogoAsig() {
        return catalogoAsig;
    }

    public void setCatalogoAsig(String catalogoAsig) {
        this.catalogoAsig = catalogoAsig;
    }

    public String getCreditosTotal() {
        return creditosTotal;
    }

    public void setCreditosTotal(String creditosTotal) {
        this.creditosTotal = creditosTotal;
    }

private String fechaInicio;
private String fechaFinal;
private String catalogoAsig;
private String creditosTotal;
    public Matricula perteneceS;

public Semestre(String fI,String fF, String cA, String cT){
fechaInicio=fI;
fechaFinal=fF;
catalogoAsig=cA;
creditosTotal=cT;
}

public void agregarMatricula(Matricula p){
perteneceS=p;
}

}
