/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juliomoscol
 */
public class Alumno {
    
    private String nomAlumno, carrAlumno;
    private double nota1, nota2, nota3;
    private int edad, codAlumno;

    public Alumno(int codAlumno, String nomAlumno, String carrAlumno, double nota1, double nota2, double nota3, int edad) {
        this.codAlumno = codAlumno;
        this.nomAlumno = nomAlumno;
        this.carrAlumno = carrAlumno;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.edad = edad;
    }

    public int getCodAlumno() {
        return codAlumno;
    }

    public void setCodAlumno(int codAlumno) {
        this.codAlumno = codAlumno;
    }

    public String getNomAlumno() {
        return nomAlumno;
    }

    public void setNomAlumno(String nomAlumno) {
        this.nomAlumno = nomAlumno;
    }

    public String getCarrAlumno() {
        return carrAlumno;
    }

    public void setCarrAlumno(String carrAlumno) {
        this.carrAlumno = carrAlumno;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
