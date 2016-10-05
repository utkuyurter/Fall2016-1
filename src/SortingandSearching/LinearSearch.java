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
public class LinearSearch {
    
    public linearSearch( T[] arr , int min , int max , T lookFor){
        bool found = false;
        int index = min;
        
        while(!found){
            if(arr[index] == lookFor)
                found = true;
            else
                index++;
        }
        return found;
    }
}
