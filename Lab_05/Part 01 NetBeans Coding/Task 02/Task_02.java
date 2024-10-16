/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab06_bubblesort;

/**
 *
 * @author Bilal Raza
 */

//Lab Task 02: Implement Optimized Bubble Sort with Early Stopping

public class Task_02 {
    
      public static void EarlyStoping(int []arr){
          boolean swipped = false;
       for(int i=0; i<arr.length-1; i++){
           swipped = false;
           for(int j=0; j<arr.length-i-1; j++){
               swipped = true;
              if (arr[j]>arr[j+1]){
               int temp=arr[j];
               arr[j]=arr[j+1];
               arr[j+1]=temp;
           }
               if(!swipped)
            break;
       
           }
       }
      
       for(int i=0; i<arr.length-1; i++){
           System.out.print(arr[i] + " " );
       }
   }
      public static void main(String args[]){
           int [] num ={5,1,3,4,6,2};
          EarlyStoping(num);
       }
}