/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juliomoscol
 */
public class CursoTest {
    
    Alumno alumno1, alumno2, alumno3;
    
    Curso curso = new Curso();
   
    public CursoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        alumno1 = new Alumno(1, "Julio", "Computacion e Informatica", 10, 13, 20, 17);
        alumno2 = new Alumno(2, "Alfredo", "Gastronomia", 11, 20, 14, 13);
        alumno3 = new Alumno(3, "Angelo", "Administracion", 12, 20, 13, 15);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcularPromedioNotas method, of class Curso.
     */
    @Test
    public void testCalcularPromedioNotas() {
        
        curso.agregarAlumno(alumno1);
        curso.agregarAlumno(alumno2);
        assertEquals(15, curso.calcularPromedioNotas(), 0.00);
        assertTrue(curso.calcularPromedioNotas() == 15);
        assertFalse(curso.calcularPromedioNotas() < 10);
    }

    /**
     * Test of alumnoConNotaMaxima method, of class Curso.
     */
    @Test
    public void testAlumnoConNotaMaxima() {
        Alumno alumnoMax = alumno1;
        curso.agregarAlumno(alumnoMax);
        curso.agregarAlumno(alumno2);
        assertEquals(alumnoMax, curso.alumnoConNotaMaxima());
        assertTrue(curso.alumnoConNotaMaxima().getNota1() == 10);
        assertFalse(curso.alumnoConNotaMaxima().getNota1() >= 20);
    }

    /**
     * Test of alumnoConNotaMinima method, of class Curso.
     */
    @Test
    public void testAlumnoConNotaMinima() {
        Alumno alumnoMin = alumno1;
        curso.agregarAlumno(alumnoMin);
        curso.agregarAlumno(alumno2);   
        assertEquals(alumnoMin, curso.alumnoConNotaMinima());
        assertTrue(curso.alumnoConNotaMinima().getNota1() == 10);
        assertFalse(curso.alumnoConNotaMinima().getNota1() >= 20);
    }

    /**
     * Test of contarAlumnos method, of class Curso.
     */
    @Test
    public void testContarAlumnos() {
        curso.agregarAlumno(alumno1);
        curso.agregarAlumno(alumno2);
        curso.agregarAlumno(alumno3);
        assertEquals(3, curso.contarAlumnos());
        assertTrue(curso.contarAlumnos() == 3);
        assertFalse(curso.contarAlumnos() > 10);
    }

    /**
     * Test of calcularPromedioEdad method, of class Curso.
     */
    @Test
    public void testCalcularPromedioEdad() {
        curso.agregarAlumno(alumno1);
        curso.agregarAlumno(alumno2);
        assertEquals(15, curso.calcularPromedioEdad(), 0.00);
        assertTrue(curso.calcularPromedioEdad() == 15);
        assertFalse(curso.calcularPromedioEdad() > 16);
    }
    
}
