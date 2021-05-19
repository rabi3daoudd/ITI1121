public class Q3_ArrayInsertionDemo{

    public static int[] insertIntoArray(int[] beforeArray, int indexToInsert, int valueToInsert){
        // Your code here
        int[] AfterArray = new int[beforeArray.length + 1];

        for(int i = 0; i < indexToInsert; i++){
            AfterArray[i] = beforeArray[i];
        }

        AfterArray[indexToInsert] = valueToInsert;

        for(int i = indexToInsert + 1; i <= beforeArray.length; i++){
            AfterArray[i] = beforeArray[i-1];
        }


        return AfterArray;
    }

    public static void main(String[] args){
        // Your code here
        int[] beforeArray = new int[]{1,5,4,7,9,6};

        System.out.println("Array before insertion: ");
        for(int i = 0; i < beforeArray.length; i++){
            System.out.println(beforeArray[i]);
        }

        int[] AfterArray = insertIntoArray(beforeArray, 3, 15);
        System.out.println("Array after insertion");
        for(int i = 0; i < AfterArray.length; i++){
            System.out.println(AfterArray[i]);
        }

    }
}