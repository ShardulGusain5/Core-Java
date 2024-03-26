package Arrays;

public class MultiDarray {
    public static void main(String[] args) {
        int arr[][] = new int [2][3];//2 dimensional array/matrix with size 2x3
        arr[0][1]= 5;
        System.out.println(arr[0][1]);

        System.out.println(arr);//that will fetch the address as the array name is decoded as the address of first memory block
    }
}
