package lesson03_homework;


public class ThirdHomework {
    public static void main(String[] args) {

        System.out.println("===============================");
        Apple[] applesArray = new Apple[10];
        for (int i = 0; i < 10; i++) {
            applesArray[i]= new Apple();
        }

        Orange[] orangeArray = new Orange[10];
        for (int i = 0; i < 10; i++) {
            orangeArray[i]= new Orange();
        }

        System.out.println("Weight applesArray is " + new Box<>(applesArray).weightBox());
        System.out.println("Weight orangeArray is " + new Box<>(orangeArray).weightBox());
        System.out.println("===============================");


        Apple[] applesArray2 = new Apple[15];
        for (int i = 0; i < 10; i++) {
            applesArray2[i]= new Apple();
        }
        Box<Apple> thirdBox = new Box<>(applesArray2);
        System.out.println("Weight applesArray2 is " + thirdBox.weightBox());

        Orange[] orangeArray2 = new Orange[20];
        for (int i = 0; i < 10; i++) {
            orangeArray2[i]= new Orange();
        }
        Box<Orange> fourthBox = new Box<>(orangeArray2);
        System.out.println("Weight orangeArray2 is " + fourthBox.weightBox());

        System.out.println("===============================");
        System.out.println("Compare thirdBox(Apple) and fourthBox(Orange), result: " + thirdBox.compareBox(fourthBox));

        Box<Apple> firstBox = new Box<>(applesArray);
        Box<Orange> secondBox = new Box<>(orangeArray);
        System.out.println("Compare thirdBox(Apple) and secondBox(Orange), result: " + thirdBox.compareBox(secondBox));
        System.out.println("Compare firstBox(Apple) and thirdBox(Apple), result: " + firstBox.compareBox(thirdBox));

        System.out.println("===============================");
        firstBox.swapFruit(thirdBox);


    }
}
