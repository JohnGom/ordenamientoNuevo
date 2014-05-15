/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Order;

/**
 *
 * @author USUARIO
 */
public class MergeSort {
    
  public void mergesort (int arr[], int p, int q) 
{ 
    
    if (p < q) 
    { 
        int k = (p+q) / 2; 
        mergesort (arr,p,k); 
        mergesort (arr,k+1,q);  
        combinar(arr,p,k+1,q); 
    } 
 } 

    public void combinar(int arr[], int p, int m, int q) 
    { 
    int combinado[] = new int[q-p+1]; 

        int p1 = p; 
        int p2 = m; 
        int p3 = 0; 

    while (p1 < m && p2 <= q) 
    { 
        if (arr[p1] < arr[p2]) 
    { 
        combinado[p3] = arr[p1]; 
        p1 = p1+1; 
    }else 
    { 
        combinado[p3] = arr[p2]; 
        p2 = p2+1; 
    } 
        p3 = p3+1; 
    } 

    while (p1 < m) 
    { 
        combinado[p3] = arr[p1]; 
        p1 = p1+1; 
        p3 = p3+1; 
    } 

    while (p2 <= q) 
    { 
        combinado[p3] = arr[p2]; 
        p2 = p2+1; 
        p3 = p3+1; 
    } 

    for (int i=0; i < q-p+1; i++) 
    { 
        arr[p+i] = combinado[i]; 
    } 
    }
    }
