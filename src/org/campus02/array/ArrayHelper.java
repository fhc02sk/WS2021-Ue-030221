package org.campus02.array;

public class ArrayHelper {

    public static void main(String[] args) {

        int arr[] = {8,5,1,9,0,4};
        arrangeOrder(arr);

        for (int element : arr){
            System.out.print(element + ", ");
        }

    }

    public static void arrangeOrder(int[] numbers){
        boolean hasChange = true;

        while (hasChange) {
            hasChange = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int tmp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = tmp;
                    hasChange = true;
                }
            }
        }
    }

    public static void arrangeOrder2(int[] numbers){
        boolean hasChange = false;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                int tmp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = tmp;
                hasChange = true;
            }
        }
        if (hasChange)
            arrangeOrder2(numbers);
    }
}
