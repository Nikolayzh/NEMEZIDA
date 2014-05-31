/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package first;

/**
 *
 * @author NIK
 */
public class First {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     


      int []a=new int [] {34,67,32,76,32,8,5,21,69,43};
      System.out.println("заданный массив : ");
        for (int i=0 ; i<a.length; i++)  {            
            System.out.print(a[i] + " ");
        }
       for (int i=0; i<a.length; i++){
           for (int j=0; j<a.length-1; j++){
               if(a[j]>a[j+1]){
                   int d =a[j];
                       a[j]=a[j+1];
                       a[j+1]=d;
               }
           }
       }
        System.out.println ( "отсортированный массив : ");
      for (int i=0; i<a.length; i++){
          System.out.printf(a[i] + " ");
      }
    }

}
   
                
                
    
    

