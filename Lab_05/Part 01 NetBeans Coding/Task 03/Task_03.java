/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab06_bubblesort;

/**
 *
 * @author Bilal Raza
 */

/**Lab Task 03: Sort a List of Strings by Length
● Modify the Bubble Sort algorithm to sort a list of strings by their lengths in ascending
order.
Input: ["apple", "pie", "banana", "cat"]
Output: ["pie", "cat", "apple", "banana"]
public class Task_03 {
 **/   

public class Task_03{
    
    public static void BubbleSortBylength(String []arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<=arr.length-i-1; i++){
                if(arr[j].length()>arr[j+1].length()){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(String str:arr){
            System.out.print(str +" ");
        }
    }
    
    public static void main(String []args){
        String []num={"apple", "pie", "banana", "cat"};
        BubbleSortBylength(num);
                
    }
}
