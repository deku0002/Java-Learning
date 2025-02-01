public class QuickSort {

    public static void main(String[] args) {
        int[] ar = {8,2,5,3,9,4,7,6,1};

        quicksort(ar,0,ar.length-1);

        for(int i : ar){
            System.out.print(i+", ");
        }
    }

    private static void quicksort(int[] ar, int start, int end) {

        if(end<=start)
            return;

        int pivot = partition(ar,start,end);
        quicksort(ar,start,pivot-1);
        quicksort(ar,pivot+1,end);
    }

    private static int partition(int[] ar, int start, int end) {

        int pivot = ar[end];
        int i = start-1;

        for(int j = start; j<=end-1 ;j++){
            if (ar[j]<pivot){
                i++;
                int temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
            }
        }
        i++;
        int temp = ar[i];
        ar[i] = ar[end];
        ar[end] = temp;

        return i;
    }

}
