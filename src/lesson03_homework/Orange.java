package lesson03_homework;

public class Orange extends Fruit {

    private final double orangeWeight = 1.5;

    public Orange(){
    }

    @Override
    public double getAFruitWeight(){
        return orangeWeight;
    }
}
