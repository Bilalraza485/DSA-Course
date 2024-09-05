/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_01;

/**
 *
 * @author Bilal Raza
 */
public class Task4Exercise2 {
           public static void main(String[] args){
    int[] arr ={4, 6, 2, 8, 10};
    int searchvalue=8;
    int found=0;
        for(int i=0;i<arr.length;i++){
   if(arr[i]==searchvalue){
            found=i;
            break;    
   }  else{  found =-1;}}  
    System.out.print("Element "+searchvalue+ " found at index " + found);    


}}

