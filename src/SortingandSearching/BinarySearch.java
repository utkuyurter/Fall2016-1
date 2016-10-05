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
public class BinarySearch {
    
    public bool binarySearch(T[] arr , int min , int max , T lookFor){
        found = false;
        int mid = (min + max) / 2;
        while(!found){
            if(arr[mid] == lookFor)
                found = true;
            else if(arr[mid] > lookFor){
                min = mid + 1;
                mid = (min + max) / 2;
            }
            else{
                max = mid - 1;
                mid = (min + max) / 2;
            }
        }
        return found;
    }
    
    
}
