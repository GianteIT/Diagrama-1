/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capanegocio;

/**
 *
 * @author user
 */
public class Asignaturas {

    public String getCodigoAsig() {
        return codigoAsig;
    }

    public void setCodigoAsig(String codigoAsig) {
        this.codigoAsig = codigoAsig;
    }

    public String getNombreAsig() {
        return nombreAsig;
    }

    public void setNombreAsig(String nombreAsig) {
        this.nombreAsig = nombreAsig;
    }

    public String getCantidadCreditos() {
        return cantidadCreditos;
    }

    public void setCantidadCreditos(String cantidadCreditos) {
        this.cantidadCreditos = cantidadCreditos;
    }
    private String codigoAsig;
    private String nombreAsig;
    private String cantidadCreditos;
    public Matricula incluyeA;

public Asignaturas(String cA, String nA, String cC){
codigoAsig=cA;
nombreAsig=nA;
cantidadCreditos=cC;
}

public void asignarMatricula(Matricula i) {
incluyeA=i;
}
}