/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quicksort;

import java.util.Random;

/**
 *
 * @author NIK
 */
public class QuickSort {

    /**
     * @param args the command line arguments
     */
    
    public static int ARRAY_LENGTH = 50;
 	 	private static int [] array = new int [ARRAY_LENGTH];
 	 	private static Random generator = new Random ();
 
 	public static void init () {
 	 	for (int i=0; i<ARRAY_LENGTH; i++) {
 	 	 	array [i] = generator.nextInt (1000);
 	 	}
 	}
 	public static void printArray () {
 	 	for ( int i=0; i<ARRAY_LENGTH-1; i++ ) {
 	 	System.out.println(array[i] + "?");
                }
 	 	System.out.println ( array [ARRAY_LENGTH-1] );
 	}
 	public static void Sort () {
 	 	int first = 0;
 	 	int last = ARRAY_LENGTH - 1;
 	 	QuickSorting ( first, last );
 	}
 	private static void Swap ( int i, int j ) {
 	 	int temp = array[i];
 	 	array[i] = array[j];
 	 	array[j] = temp;
 	}
 	 private static void QuickSorting ( int start, int end ) {
 	 	if (start >= end)
 	 	 	return;
 	 	int i = start, j = end;
 	 	int mid = (i + j) / 2;
 	 	while (i < j) {
 	 	 	while (( i < mid ) && ( array [i] <= array [mid] )) i++;
 	 	 	while (( j > mid ) && ( array [mid] <= array [j] )) j--;
 	 	 	if ( i < j ) {
 	 	 	 	Swap ( i, j );
 	 	 	 	if ( i == mid )
 	 	 	 	 	mid = j;
 	 	 	 	else if ( j == mid )
 	 	 	 	 	mid = i;
 	 	 	}
 	 	}
 	 	QuickSorting ( start, mid );
 	 	QuickSorting ( mid+1, end );
 	}
         
    public static void main(String[] args) {
        // TODO code application logic here
        init ();
 	 	
 	 	Sort ();
 	 	printArray ();
 	}
    }
    

