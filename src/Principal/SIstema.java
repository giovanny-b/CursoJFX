/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author linux
 */
public class SIstema {
    
    public static String nombre, SO, fls, arch, ver;
    
    
    public static void main(String[] args) {
        nombre = System.getProperty("user.name");
        SO = System.getProperty("os.name");
        fls = System.getProperty("file.separator");
        arch = System.getProperty("os.arch");
        ver = System.getProperty("os.version");
        System.out.println("El nombre es: " + nombre + " Tu sistema operativo es: " + SO);
        System.out.println("La Version es: " + ver);
        System.out.println("El separador que usa es: " + fls);
        System.out.println("La arquitectura es: " + arch);
        
    }
    
}
