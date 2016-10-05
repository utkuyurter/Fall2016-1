/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortingandSearching;

/**
 *
 * @author zulfikar
 */
public class SelectionSort {
    public void selectionSort(T[] arr){
        int min ;
        T temp;
        
        for(int index = 0; index < arr.length() - 1  ; index++){
            min = index;
            for(int scan = index+1 ; scan < arr.length; scan++){
                if(arr[scan].compareTo(arr[min]) < 0)
                    min = scan;
                temp = arr[min];
                arr[min] = arr[index];
                arr[index] = temp;
            }            
        }
    }
}
