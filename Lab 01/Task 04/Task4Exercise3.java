/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_01;

/**
 *
 * @author Bilal Raza
 */
public class Task4Exercise3 {
              public static void main(String[] args){
    int[] arr ={11, 22, 33, 44, 55};
    int searchvalue=33;
    int right=arr.length-1;
    int left=0;
    while(left<=right) {
       int mid=(left+right)/2;
       if(arr[mid]==searchvalue){
      System.out.print("Element "+searchvalue+ " found at index " + mid);    
     break;
       }else if(arr[mid]<searchvalue){
       left=mid+1;
       }else{
       right=mid-1;
       }

       } 

             }
}
