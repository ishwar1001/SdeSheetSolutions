import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        //Write your code here
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp = arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                low++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }else if(arr[mid]==2){
                int temp = arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
    }
}
