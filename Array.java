import java.util.Random;

public class Array {

    public static void main(String[] args) {
        int[] randomArray = new int[100000];
        int[] reverseArray = new int[100000];
        int[] sortedArray = new int[100000];

        int counter = reverseArray.length;
        Random randomNumber = new Random();
        int randomValue;

        for (int i = 0; i < sortedArray.length; i++) {
            sortedArray[i] = i + 1;
        }

        for (int i = 0; i < reverseArray.length; i++) {
            reverseArray[i] = counter;
            counter--;
        }

        for (int i = 0; i<randomArray.length; i++){
            randomValue = randomNumber.nextInt(100000);
            randomArray[i] = randomValue;
        }

        ListFunctions array = new ListFunctions();
        array.bubbleSort(randomArray);
        array.bubbleSort(sortedArray);
        array.bubbleSort(reverseArray);

        array.selectionSort(randomArray);
        array.selectionSort(sortedArray);
        array.selectionSort(reverseArray);

        array.insertionSort(randomArray);
        array.insertionSort(sortedArray);
        array.insertionSort(reverseArray);

        array.modifiedBS(randomArray);
        array.modifiedBS(sortedArray);
        array.modifiedBS(reverseArray);

        long startTime = System.nanoTime();

        long endTime = System.nanoTime();

        long duration = (endTime - startTime)/1000000;

        System.out.printf("%n%d is time", duration);
    }
}

