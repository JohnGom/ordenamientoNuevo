/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Order.*;
/**
 *
 * @author USUARIO
 */
public class Junit {
    
    public Junit() {
    }
    
      MergeSort objeto;
      QuickSort objeto2;
   
   int vector [] = {5,3,6,8,7,9,2,1,10,4};
    int vector2 [] = {1,2,3,4,5,6,7,8,9,10};
    
    int p=0;
    int q=9;
           
    
    @Before
    public void setUp() {
      objeto = new MergeSort();
      objeto2 = new QuickSort();
      
    }
    
    
    
    @After
    public void tearDown() {
        objeto = null;
        objeto2 = null;
        
        
        
    }

    
     @Test
     public void mergesort() 
     {
         
      objeto.mergesort(vector, p, q);
      for(int i=0; i<vector.length; i++){
          assertEquals( vector2[i], vector[i]);
      }
     }
     
      @Test
     public void Quicksort() 
     {
       objeto2.Quicksort(vector, p, q);
       for(int i=0; i<vector.length; i++){
          assertEquals( vector2[i], vector[i]);
      }

     }
     
     
      
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}