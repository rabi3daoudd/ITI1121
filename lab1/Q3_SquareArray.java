public class Q3_SquareArray{

    public static int[] createArray(int size) {
        // Your code here
        int[] anArray = new int[size];
        for (int i = 0; i < anArray.length; i++){
            anArray[i] = i * i;
        }
        return anArray;
    }

    public static void main(String[] args){
        // Your code here
        System.out.println(createArray(12));
    }
}