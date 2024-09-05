/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_01;

/**
 *
 * @author Bilal Raza
 */
public class Task03 {
    
     public static void main(String args[]){
       int[] arr ={8, 16, 24, 32, 40};
    int indexTodelete=2;
       for(int i=indexTodelete;i<arr.length-1;i++){
   arr[i]=arr[i+1];    
     }
    arr[arr.length-1]=0;
    for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");    
     } 
}
    }
