/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.agómezj.t01.p3;
import java.util.Scanner;
/**
 *
 * @author Alberto
 */
public class SPPAGómezJT01P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Calculadora entre dos distancias
        int x1, x2, y1, y2, restax, restay;
        double distancia;
        //Introducción de coordenadas
        System.out.println("Ingresar coordenada x1");
        Scanner entradaX1 = new Scanner(System.in);
        x1= entradaX1.nextInt();
        System.out.println("Ingresar coordenada y1");
        Scanner entradaY1 = new Scanner (System.in);
        y1= entradaY1.nextInt();
        System.out.println("Ingresar coordenada x2");
        Scanner entradaX2 = new Scanner(System.in);
        x2= entradaX2.nextInt();
        System.out.println("Ingresae coordenada y2");
        Scanner entradaY2 = new Scanner (System.in);
        y2= entradaY2.nextInt();
        //Resta de coordenadas
        restax = (x2-x1);
        restay = (y2-y1);
        //Cslcular distancia
        distancia = Math.sqrt(Math.pow(restax, 2) + Math.pow(restay, 2));
        System.out.println("La distancia entre cada punto=" + "(" + x1 + "," + y1 + ")" + "(" + x2 + "," + y2 + ")");
        System.out.println("Distancia=" + distancia);
                
    }
    
}
