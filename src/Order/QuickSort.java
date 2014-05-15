/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Order;

/**
 *
 * @author USUARIO
 */
public class QuickSort {
    
   public  void Quicksort(int Arr[], int p, int q) {

        int pivote=Arr[p]; 
        int i=p; 
        int j=q; 
        int aux;
 
  while(i<j){            
         while(Arr[i]<=pivote && i<j) i++; 
        while(Arr[j]>pivote) j--;         
            if (i<j) {                                            
            aux= Arr[i];                  
            Arr[i]=Arr[j];
            Arr[j]=aux;
     }
   }
            Arr[p]=Arr[j]; 
            Arr[j]=pivote; 
        if(p<j-1)
            Quicksort(Arr,p,j-1); 
        if(j+1 <q)
            Quicksort(Arr,j+1,q); 
}
}
