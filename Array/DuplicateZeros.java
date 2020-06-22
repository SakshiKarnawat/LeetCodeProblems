package Array;

import java.util.Arrays;

public class DuplicateZeros {
    public void duplicateZerosTwoPointer(int[] arr) {

        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] == 0){
                for(int j = arr.length -2 ; j >= i + 1 ; j--){
                    arr[j + 1] = arr[j];
                }
                i++;
                arr[i] = 0;
            }
        }

        for(int j = 0; j < arr.length; j++){
            System.out.println(arr[j]);
        }
    }

    public static int [] duplicateZeros(int[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                count++;
            }
        }
        int [] newArr = new int[arr.length + count];
        int index = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                newArr[index] = 0;
                newArr[index + 1] = 0;
                index+=2;
            }
            else{
                newArr[index] = arr[i];
                index++;
            }
        }
        arr = Arrays.copyOf(newArr, arr.length);

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        return arr;
    }


}
