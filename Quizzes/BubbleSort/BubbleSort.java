
public class BubbleSort {
    int array[] = {9,1,8,2,7,3,6,4,5};
    
    for(int i; i < array.length; i++) {
        for(int j; j < array.length; j++) {
            if(array[j] > array[j+1]) {
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
    



