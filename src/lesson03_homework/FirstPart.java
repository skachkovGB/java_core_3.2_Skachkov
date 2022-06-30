package lesson03_homework;

public class FirstPart {
    public static void main(String[] args) {
        String[] strArray = {"a","b","c","d","f","g"};
        Integer[] intArray = {1,2,3,4,5,6,7,8,9,10};
        Double[] doubleArray = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};

        SwapArray<String> swapString = new SwapArray<>(strArray);
        swapString.printArray();
        swapString.swapElement(0,3);
        swapString.printArray();
        swapString.swapElement(0,10);

        System.out.println("===================");
        SwapArray<Integer> swapInt = new SwapArray<>(intArray);
        swapInt.printArray();
        swapInt.swapElement(1,100);
        swapInt.swapElement(2,9);
        swapInt.printArray();

        System.out.println("===================");
        SwapArray<Double> swapDouble = new SwapArray<>(doubleArray);
        swapDouble.printArray();
        swapDouble.swapElement(10,1);
        swapDouble.swapElement(1,7);
        swapDouble.printArray();
    }
}
