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
public class InsertionSort {
    
    public void insertionSort(T[] arr){
        
        for(int index = 1 ; index < arr.length(); index++){
            T key = arr[index];
            int pos = index;
            
            while(pos > 0 && arr[pos-1].compareTo(key) > 0){
                arr[pos] = arr[pos + 1];
                pos--;
            }
            data[pos] = key;
        }
    }
    
}
