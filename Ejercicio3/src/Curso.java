
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juliomoscol
 */
public class Curso {
    
    private List<Alumno> alumno;
    
    public Curso(){
        this.alumno = new ArrayList<>();
    }
    
    public void agregarAlumno(Alumno alumnos){
        alumno.add(alumnos);
    }
    
    public double calcularPromedioNotas(){
        double sumaNotas = 0;
        for(Alumno alumnos : alumno){
            sumaNotas += (alumnos.getNota1() + alumnos.getNota2() + alumnos.getNota3()) / 3;
        }
        return Math.round(sumaNotas / (alumno.size()));
    }
    
    public Alumno alumnoConNotaMaxima(){
        Alumno alumnoMax = alumno.get(0);
        for(Alumno alumnos : alumno){
            double notaMaxima = Math.max(alumnos.getNota1(), Math.max(alumnos.getNota2(), alumnos.getNota3()));
            if(notaMaxima > Math.max(alumnoMax.getNota1(), Math.max(alumnoMax.getNota2(), alumnoMax.getNota3()))){
                alumnoMax = alumnos;
            }
        }
        return alumnoMax;
    }
    
    public Alumno alumnoConNotaMinima(){
        Alumno alumnoMin = alumno.get(0);
        for(Alumno alumnos : alumno){
            double notaMinima = Math.min(alumnos.getNota1(), Math.min(alumnos.getNota2(), alumnos.getNota3()));
            if(notaMinima < Math.min(alumnoMin.getNota1(), Math.min(alumnoMin.getNota2(),alumnoMin.getNota3()))){
                alumnoMin = alumnos;
            }
        }
        return alumnoMin;
    }
    
    public int contarAlumnos(){
        return alumno.size();
    }
    
    public double calcularPromedioEdad(){
        double sumaEdades = 0;
        for(Alumno alumnos : alumno){
            sumaEdades += alumnos.getEdad();
        }
        return sumaEdades / alumno.size();
    }
    
}
