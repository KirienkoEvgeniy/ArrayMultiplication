package edu.demo;

public class ArrayCreation {

    int height = 10;
    int width = 20;
    int[][] arrayTest = new int[height][width];


    public int[][] createArray() {

        for (int i = 0; i < arrayTest.length; i++) {
            for (int j = 0; j < arrayTest[i].length; j++) {
                arrayTest[i][j] = (int) Math.round((Math.random() * 100));
            }
        }

        return arrayTest;
    }
}
