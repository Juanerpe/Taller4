/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package order;

import java.util.Scanner;

/**
 *
 * @author juane
 */
public class ThirdProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Order o = new Order();
        Scanner lecture = new Scanner (System.in);
        int option;
        System.out.println("elige metodo de ordenamiento 1: quick sort, 2 bubble");
        option = lecture.nextInt();
        
        if(option==1){
            o.quickSort(o.getRealNumbers(), 0,o.getRealNumbers().length-1);
             for (int i = 0; i < o.getRealNumbers().length; i++) {
            System.out.println(o.getRealNumbers()[i]);
           }
        }else if(option==2){
        o.buildArray();
        o.bubbleMethod(o.realNumbers);
        int bubbleOrder[] = o.bubbleMethod(o.realNumbers);
 
      
      for(int i = 0; i < o.realNumbers.length;i++)
        System.out.println(o.realNumbers[i]);
        
        }else{
        System.out.println("opcion no valida");
        }
        
    }
    
}
