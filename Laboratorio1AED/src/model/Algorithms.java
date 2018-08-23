package model;

import java.io.*;
import java.util.*;

public class Algorithms {

	
	
	// ALGORITMOS DE ORDENAMIENTO
	
		// ALGORITMO RADIX ( CASILLEROS) 
	// Este algoritmo ha sido sacado de internet, los comentarios con la explicación
	// del código, están en inglés como se puede notar.
	// Este código ha sido elaborado con 3 algoritmos que se ayudan
	// para facilitar la codificación.
		
		// A utility function to get maximum value in arr[]
	    static int getMax(int arr[], int n)
	    {
	        int mx = arr[0];
	        for (int i = 1; i < n; i++)
	            if (arr[i] > mx)
	                mx = arr[i];
	        return mx;
	    }
	 
	    // A function to do counting sort of arr[] according to
	    // the digit represented by exp.
	     static void countSort(int arr[], int n, int exp)
	    {
	        int output[] = new int[n]; // output array
	        int i;
	        int count[] = new int[10];
	       
	        Arrays.fill(count,0);
	 
	        // Store count of occurrences in count[]
	        for (i = 0; i < n; i++)
	            count[ (arr[i]/exp)%10 ]++;
	 
	        // Change count[i] so that count[i] now contains
	        // actual position of this digit in output[]
	        for (i = 1; i < 10; i++)
	            count[i] += count[i - 1];
	        // Build the output array
	        for (i = n - 1; i >= 0; i--)
	        {
	            output[count[ (arr[i]/exp)%10 ] - 1] = arr[i];
	            count[ (arr[i]/exp)%10 ]--;
	        }
	        // Copy the output array to arr[], so that arr[] now
	        // contains sorted numbers according to curent digit
	        for (i = 0; i < n; i++)
	            arr[i] = output[i];
	    }
	    
	    // The main function to that sorts arr[] of size n using
	    // Radix Sort
	    public static void radixsort(int arr[], int n)
	    {
	        // Find the maximum number to know number of digits
	        int m = getMax(arr, n);
	 
	        // Do counting sort for every digit. Note that instead
	        // of passing digit number, exp is passed. exp is 10^i
	        // where i is current digit number
	        for (int exp = 1; m/exp > 0; exp *= 10)
	            countSort(arr, n, exp);
	    }
	    
	    // ALGORITMO QUICKSORT
	    
	    public static void quicksort(int A[], int izq, int der) {
	    	  int pivote=A[izq]; 
	    	int i=izq;
	    	  int j=der; 
	    	  int aux;
	    	  while(i<j){            
	    	     while(A[i]<=pivote && i<j) i++; 
	    	     while(A[j]>pivote) j--;        
	    	if (i<j) {                                            
	    	        aux= A[i];                  
	    	         A[i]=A[j];
	    	         A[j]=aux;
	    	     }
	    	   }
	    	   A[izq]=A[j]; 
	    	   A[j]=pivote; 
	    	   if(izq<j-1)
	    	quicksort(A,izq,j-1); 
	    	   if(j+1 <der)
	    	quicksort(A,j+1,der); 
	    	}


	    // ALGORITMO SELECTION SORT
	    
	    void sort(int arr[])
	    {
	        int n = arr.length;

	        // One by one move boundary of unsorted subarray
	        for (int i = 0; i < n-1; i++)
	        {
	            // Find the minimum element in unsorted array
	            int min_idx = i;
	            for (int j = i+1; j < n; j++)
	                if (arr[j] < arr[min_idx])
	                    min_idx = j;

	            // Swap the found minimum element with the first
	            // element
	            int temp = arr[min_idx];
	            arr[min_idx] = arr[i];
	            arr[i] = temp;
	        }
	    }
	    
	    
}
