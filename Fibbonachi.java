/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fibbonachi;



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
       
        int n0 = 1, n1 = 1, n2;
     System.out.print("0 "+n0+" "+n1+" ");
     for(int i = 0; i < 10; i++){
       n2=n0+n1;
       System.out.print(n2+" ");
       n0=n1;
       n1=n2;
     }
  System.out.println();
  }
}
              
        

    



