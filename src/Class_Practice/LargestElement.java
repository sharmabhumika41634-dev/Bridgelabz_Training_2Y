package Class_Practice;

public class LargestElement {
    public static int maxValue(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    static void main() {
        int arr[]={1,2,3,4,5,6,7};
        System.out.println(("This is the maximum element in an array:"+(maxValue(arr))));
    }

}



