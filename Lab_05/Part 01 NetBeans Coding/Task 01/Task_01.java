/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab06_bubblesort;

/**
 *
 * @author Bilal Raza
 */


/**Lab Task 01:
● Write a Java program to implement the Bubble Sort algorithm. Your task is to sort an
array of integers in ascending order using Bubble Sort.
● Define a method bubbleSort(int[] arr) that takes an array as input and sorts it using the
Bubble Sort algorithm.

Input: 513462
Output: 123456
**/

public class Task_01 {
    
   public static void BubbleSort(int []arr){
       for(int i=0; i<arr.length-1; i++){
           for(int j=0; j<arr.length-i-1; j++){
              if (arr[j]>arr[j+1]){
               int temp=arr[j];
               arr[j]=arr[j+1];
               arr[j+1]=temp;
           }
           }
       }
       for(int i=0; i<arr.length-1; i++){
           System.out.print(arr[i] + " " );
       }
   }
      public static void main(String args[]){
           int [] num ={5,1,3,4,6,2};
           BubbleSort(num);
       }
}

