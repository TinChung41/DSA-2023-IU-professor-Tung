class Quiz2SelctionSort{
    public static void main(String[] args){
        int[] arr = {5, 4, 3, 2, 1};
        int[] arr2 = selectionSortDescending(arr);
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
    }
    //selection sort in decending order
    public static int[] selectionSortDescending(int[] arr){
        int[] arr2 = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            int max = arr[0];
            int index = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[j] > max){
                    max = arr[j];
                    index = j;
                }
            }
            arr2[i] = max;
            arr[index] = Integer.MIN_VALUE;
        }
        return arr2;
    }

}
