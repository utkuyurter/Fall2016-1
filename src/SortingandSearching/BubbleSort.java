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
public class BubbleSort {
    
    public void bubbleSort(T[] arr){
        
        T temp;
        int pos, check;
        
        for(pos = arr.length() - 1 ; pos >= 0 ; pos--)
            for(check = 0 ; check <= pos - 1 ; check++)
                if(arr[check].compareTo(arr[check + 1]) > 0){
                    temp = arr[check];
                    arr[check] = arr[check + 1];
                    arr[check + 1] = temp;
                }    
    }
}
