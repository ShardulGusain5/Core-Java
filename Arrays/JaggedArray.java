package Arrays;

public class JaggedArray {
    public static void main(String[] args) {
        int arr[][]= new int[2][];//Jagged array
        arr[0]= new int[10];
        arr[0][5]=10;
        System.out.println(arr[0][5]);
    }
}
