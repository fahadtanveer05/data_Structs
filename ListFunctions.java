public class ListFunctions implements List {

    public ListFunctions()
    {

    }

    @Override
    public int bubbleSort(int[] array) {
        System.out.printf("Bubble Sorting; %n");

        for (int i=0; i<array.length; i++){
            for (int j=0; j<array.length-1; j++){
                    if(array[j]>array[j+1])
                    {
                        int temp = array[j];
                        array[j]=array[j+1];
                        array[j+1]= temp;
                    }
            }
        }

        for (int i=0; i<array.length; i++){
            System.out.printf("%d ", array[i]);
        }

        return 1;
    }

    @Override
    public int insertionSort(int[] array) {
        for (int i=0; i<array.length; i++){
            int temp = array[i];
            int j=i-1;

            while(j>=0 && array[j]>temp){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }

        return 1;
    }

    @Override
    public int selectionSort(int[] array) {
        System.out.printf("Selection Sorting: %n");
        for(int i=0; i<array.length; i++) {
            int minIndex = i;
            for(int j=i; j<array.length;j++) {
                if(array[j]<array[minIndex]) {
                    minIndex=j;
                }

                int cons=array[minIndex];
                array[minIndex]=array[i];
                array[i]= cons;
            }
        }

        for (int i=0;i<array.length;i++) {
            System.out.printf("%d ",array[i]);
        }

        return 1;
    }

    @Override
    public int modifiedBS(int[] array) {
        int temp;
        int flag = 0;

        System.out.printf("Modified Bubble Sorting: ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag=1;
                }
            }
            if (flag == 0) {
                System.out.printf("Array already sorted %n");
                break;
            }

        }

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
        return 1;
    }
}
