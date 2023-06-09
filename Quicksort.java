public class Quicksort {
    public static void main(String[] args) {
        int a[] = {4,6,2,5,7,9,1,3};
        int l = 0;
        int h = a.length-1;
        quicksort(a, l, h);
        System.out.println(a);
    }
    static int Partition(int arr[],int l, int h){
        int pivot = arr[(l+h)/2] ;
        int  i = l;
        for(int j=l;j<=h-1;j++){

            if(arr[i]<pivot){
                i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] =  temp;
            }
        }
        int temp = arr[l];
        arr[l] = arr[h];
        arr[h] =  temp;

        return i+1;
    }

    static void quicksort(int arr[], int l, int h){
        if(l<h){
            int pivot = Partition(arr,l, h);
            quicksort(arr, l, pivot-1);
            quicksort(arr, pivot+1, h);
        }
    }
}
