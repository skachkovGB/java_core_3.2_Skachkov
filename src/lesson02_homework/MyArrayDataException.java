package lesson02_homework;

public class MyArrayDataException extends Exception{
    public MyArrayDataException(String str){
        super("Alarm, wrong simbol is: " + str);
    }
}
