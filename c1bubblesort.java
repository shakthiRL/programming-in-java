import java.util.Arrays;

public class c1bubblesort {
    public static void main(String[] args){
        int[] arr={0,2,1,2,0,1};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
        
                }
            }
        }
     System.out.println(Arrays.toString(arr));
    }
}
