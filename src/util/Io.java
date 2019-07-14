/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Scanner;

/**
 *
 * @author Jheron Chacon
 */
public abstract class Io {
    public static void write(String mensaje){
        System.out.println(mensaje);
    }
    
    public static int readInteger(){
        Scanner userInput = new Scanner(System.in);
        int input = userInput.nextInt();
        return input;
    }
    
    public static String readString(){
        Scanner userInput = new Scanner(System.in);
        String input = userInput.nextLine();
        return input;
    }
    
    public static double readDouble(){
        Scanner userInput = new Scanner(System.in);
        double input = userInput.nextDouble();
        return input;
    }
    
    public static int askInteger(String pregunta){
        write(pregunta);
        return readInteger();
    }
    
    public static double preguntarDouble(String pregunta){
        write(pregunta);
        return readDouble();
    }
    
    public static String preguntarString(String pregunta){
        write(pregunta);
        return readString();
    }
}
