package lesson03_homework;

public class Apple extends Fruit {

    private final double appleWeight = 1.0;

    public Apple(){
    }

    @Override
    public double getAFruitWeight(){
        return appleWeight;
    }
}

