import edu.demo.ArrayCreation;

public class ArrayMultiplication {
    public static void main(String[] args) {
        int height = 10;
        int width = 20;
        int[][] arrayMultiplication = new int[height][width];

        int[][] arrayTestOne = new ArrayCreation().createArray();
        int[][] arrayTestTwo = new ArrayCreation().createArray();
        for (int i = 0; i < arrayTestOne.length; i++) {
            for (int j = 0; j < arrayTestTwo[i].length; j++) {
                System.out.print((arrayMultiplication[i][j] = arrayTestOne[i][j] * arrayTestTwo[i][j]) + " ");
            }
            System.out.println();
        }
    }
}





