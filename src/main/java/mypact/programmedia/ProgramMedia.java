/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package mypact.programmedia;

import java.util.Scanner;

/**
 *
 * @author Pessoal
 */
public class ProgramMedia {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("primeira nota");
        float n1 = teclado.nextFloat();
        System.out.println("segunda nota");
        float n2 =teclado.nextFloat();
        
        float m =(n1+n2)/2;
        System.out.println("Sua media é "+m);
        if(m > 9){
            System.out.println("parabens");
        }
    }
}
