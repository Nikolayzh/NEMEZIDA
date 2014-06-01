/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factorial;

import java.util.Scanner;

/**
 *
 * @author NIK
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */  
    public static void main(String[] args) {
        // TODO code application logic here
      int n;
        do {
            Scanner scan = new Scanner(System.in);
             System.out.print("Введите факториал натурально числа n : ");
              n = scan.nextInt();
               int result = 1;
                for (int i = 2; i <= n; i++)
                  result *= i;
                  System.out.println(result);
                if (n == 0 || n == 1)
                 System.out.println(result);
             if(n < 0)
             System.out.println("Вы ввели отрицательный факториал!");
        } while (n < 0);{System.out.println("Конец");}
    }
}
    

