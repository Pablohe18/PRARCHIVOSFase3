/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomeia;

import java.util.Comparator;

/**
 *
 * @author luisc
 */
public class DonacionReporte implements Comparable<DonacionReporte> {
    public String Material;
    public String Donador;
    public String FechaDonacion;
    public int Peso;   
    public String Descripcion;

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    public void setDonador(String Donador) {
        this.Donador = Donador;
    }

    public void setFechaDonacion(String FechaDonacion) {
        this.FechaDonacion = FechaDonacion;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    public String getMaterial() {
        return Material;
    }

    public String getDonador() {
        return Donador;
    }

    public String getFechaDonacion() {
        return FechaDonacion;
    }

    public int getPeso() {
        return Peso;
    }

    public String getDescripcion() {
        return Descripcion;
    }  

    @Override
    public int compareTo(DonacionReporte o) {
        String K1 = this.Donador+this.Material+this.FechaDonacion;
        String K2 = o.Donador + o.Material + o.FechaDonacion;        
         if (K1.equals(K2)) {
            return 0;
        }
         else if(K1.compareTo(K2)>0)
         {
             return 1;
         }
         else
         {
             return -1;
         }
    }
       

    
    
}


