/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juliomoscol
 */
public class Puestos {
    
    String puesto;
    int sBruto;
    double impRenta;
    double sNeto;

    public Puestos(String puesto, int sBruto, double impRenta, double sNeto) {
        this.puesto = puesto;
        this.sBruto = sBruto;
        this.impRenta = impRenta;
        this.sNeto = sNeto;
    }
    
    
    
    public Double sueldoNetoxPuesto(){
    
        if(puesto == "Gerente de TI"){
            
            sBruto = 13000;
            impRenta = 0.04;
            sNeto = sBruto - (sBruto * impRenta);
            return sNeto;
            
        } else if(puesto == "Arquitecto Cloud"){
            
            sBruto = 11000;
            impRenta = 0.05;
            sNeto = sBruto - (sBruto * impRenta);
            return sNeto;
            
        } else if(puesto == "Desarrollador"){
            
            sBruto = 9000;
            impRenta = 0.06;
            sNeto = sBruto - (sBruto * impRenta);
            return sNeto;
            
        } else if(puesto == "Analista"){
            
            sBruto = 7000;
            impRenta = 0.07;
            sNeto = sBruto - (sBruto * impRenta);
            return sNeto;
            
        } else {
            sBruto = 5000;
            impRenta = 0.08;
            sNeto = sBruto - (sBruto * impRenta);
            return sNeto;
        }
    }

    boolean sueldoNetoxPuesto(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
