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
public class Facultad {
     private String ubicacion;
    private String nroPisos;
    private String area;
    private String aforo;

public ArrayList<EscuelaProfesional> perteneceF = new ArrayList();

public Facultad(String u, String nP, String ar, String af) {
ubicacion=u;
nroPisos=nP;
area=ar;
aforo=af;
}

public void agregarPerteneceF(EscuelaProfesional ep){
perteneceF.add(ep);
}

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNroPisos() {
        return nroPisos;
    }

    public void setNroPisos(String nroPisos) {
        this.nroPisos = nroPisos;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAforo() {
        return aforo;
    }

    public void setAforo(String aforo) {
        this.aforo = aforo;
    }
    
}
