package SortingTechniques;

public class InsertionSortIterative {
    public static void main(String[] args) {
        int arr [] = {4,2,7,6,9,1};
        for(int i =1;i<arr.length;i++)
        {
            int key = arr[i];
            int j = i-1;
            int count = 0;
            while(j>=0 && arr[j]>key)
            {
                int temp = arr[j];
                arr[j+1]=temp;
                --j;
                count++;
            }
            if(count >0)
            {
                arr[j+1]=key;
            }
            
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
