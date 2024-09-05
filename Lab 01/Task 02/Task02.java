/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_01;

/**
 *
 * @author Bilal Raza
 */
public class Task02 {
  /*  Objective: Practice inserting elements at different positions in an array.
    */
    public static void main (String args[]){
        int[]nums =new int[5];
        nums[0]=12;
        nums[1]=24;
        nums[2]=36;
        nums[3]=48;
        nums[4]=60;
        
        for(int i=nums.length-1; i>0; i--){
            nums[i]=nums[i-1];
            
    }
        nums[0]=6;
        for(int i=0; i<=nums.length-1; i++){
        System.out.println(nums[i]);
    }
        
     /*   Exercise 2: Insert an element in the middle of the array.
       */
     
     int []num= new int[6];
     num[0]=100;
     num[1]=200;
     num[2]=300;
     num[3]=400;
     num[4]=500;
     
     for(int i=num.length-1; i>2; i--){
         num[i]=num[i-1];
         
     }
     num[2]=250;
     for(int i=0; i<=num.length-1; i++){
         System.out.println(num[i]);
     }
     
     /*Exercise 3: Insert an element at the end of the array.
     */
     int []nam=new int[6];
     nam[0]=3;
     nam[1]=6;
     nam[2]=9;
     nam[3]=12;
     nam[4]=15;
     nam[nam.length-1]=18;
     
     for(int i=0; i<=num.length-1; i++){
         System.out.println(nam[i]);
     }
     
     
     
    }
}
