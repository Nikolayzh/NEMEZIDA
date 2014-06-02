/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fibbonachi;


import java.util.Scanner;



/**
 *
 * @author NIK
 */
public class Fibbonachi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
       int b, a;
       Scanner scan = new Scanner(System.in);
       System.out.println("Введите порядковое число фибоначчи: ");
       b = scan.nextInt();
        int first = 1, next = 1, last = 0;
    
     
     for(int i = 0; i < b - 3; i++){
       last=first+next;
       first=next;
       next=last;
       
     }
     System.out.print(last+" ");
     }
     
  
  }

              
        

    



