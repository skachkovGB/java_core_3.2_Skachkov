package lesson02_homework;

import lesson01_homework.Team;

public class SecondHomework {
    private String[][] correctArray = {{"1","1","1","1"}, {"1","1","1","1"}, {"1","1","1","1"}, {"1","1","1","1"}};
    private String[][] wrongSizeArray = {{"1","1","1","1"}, {"1","1","1","1"}, {"1","1","1","1"}};
    private String[][] wrongContentArray = {{"1","1","O","1"}, {"1","1","1","1"}, {"1","1","1","1"}, {"1","1","1","1"}};

    //===========================================
    // lesson02
    public SecondHomework(){
    }

    public void doSomething(){


        System.out.println("1.Correct; 2.WrongSize; 3.WrongContent");
        System.out.println();

        System.out.print("1. ");
        try {
            System.out.println("Array Summ: "+ changeToIntAndSumm(correctArray) + ".");
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        System.out.print("2. ");
        try {
            System.out.println("Array Summ: "+ changeToIntAndSumm(wrongSizeArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        System.out.print("3. ");
        try {
            System.out.println("Array Summ: "+ changeToIntAndSumm(wrongContentArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

    }

    //===========================================
    // lesson02
    public static Integer changeToIntAndSumm(String[][] array) throws MyArrayDataException,MyArraySizeException{

        int summ = 0;
        int failCoordI=0;
        int failCoordJ=0;

        checkSize(array);

        try {
            for (int i=0; i < array.length; i++) {
                for (int j=0; j < array[i].length; j++) {
                    failCoordI = i;
                    failCoordJ = j;
                    summ = summ + Integer.parseInt(array[i][j]);
                }
            }
        } catch (NumberFormatException e){
            throw new  MyArrayDataException(array[failCoordI][failCoordJ] + ". Wrong coordinate: " + failCoordI + "," + failCoordJ + ".");
        }

        return summ;
    }

    public static void checkSize(String[][] array) throws MyArraySizeException{
        for (int i = 0; i < 4; i++) {
            if(array.length != 4 || array[i].length != 4) throw new MyArraySizeException();
        }
    }
}