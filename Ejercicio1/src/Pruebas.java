/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juliomoscol
 */
public class Pruebas {
    
    private int horas;
    private String Prueba, Proyecto;
    
    public void costoHora(String Prueba){
        
        if (Prueba == "Unitaria") {
            horas = 100;
        }else if(Prueba == "Funcional"){
            horas = 60;
        }else if(Prueba == "Rendimiento"){
            horas = 110;
        }
        
        if(Proyecto == "Bajo"){
            Prueba == "Funcional";
        }
    }
}
