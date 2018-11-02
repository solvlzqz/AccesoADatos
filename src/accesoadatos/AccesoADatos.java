/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoadatos;

import accesoadatos.modelo.Alumno;
import accesoadatos.modelo.AlumnoData;
import accesoadatos.modelo.Conexion;

import java.time.LocalDate;
import java.time.Month;




public class AccesoADatos {
    
    //Acá comienza
    //Cambios

        public static void main(String[] args) {
            
            Alumno alumno1 = new Alumno("Juan Lopez", LocalDate.of(2010, Month.DECEMBER, 12), true);
            
            Conexion con = new Conexion();
            
            AlumnoData alumnoData = new AlumnoData(con);
        
        alumnoData.guardarAlumno(alumno1);
        
        for(Alumno it:alumnoData.obtenerAlumnos()) {
          System.out.println("ID: "+it.getId());
          System.out.println("Nombre: "+it.getNombre());
          
        }
        
        alumnoData.borrarAlumno(alumno1.getId());
        
        for(Alumno it:alumnoData.obtenerAlumnos()) {
          System.out.println("ID: "+it.getId());
          System.out.println("Nombre: "+it.getNombre());
          
        }
        System.out.println("Nuevo Alumno id:" + alumno1.getId());

    }
    
        
}
