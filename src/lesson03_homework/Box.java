package lesson03_homework;

import java.lang.reflect.Array;

public class Box <T extends Fruit>{

    private T[] arrayFruit;
    private T[] newArrayFruit;
    public Box (T[] arrayFruit){
        setArrayFruit(arrayFruit);
    }

    public void setArrayFruit(T[] arrayFruit){
        this.arrayFruit=arrayFruit;
    }

    public double weightBox(){
        return arrayFruit[0].getAFruitWeight()*arrayFruit.length;
    }

    public boolean compareBox(Box box){
        return weightBox() == box.weightBox();
    }

    public void swapFruit(Box<T> box){
        for (int i = this.arrayFruit.length; i < this.arrayFruit.length + box.arrayFruit.length; i++) {
            this.newArrayFruit[i] = box.arrayFruit[i-this.arrayFruit.length];
        }
    }

    public void addFruit(T fruit){
        //Почему я не могу вот так сделать)))
        T[] newArrayFruit = new T[arrayFruit.length + 1];

        for (int i = 0; i < arrayFruit.length; i++) {
            newArrayFruit[i] = arrayFruit[i];
        }
        newArrayFruit[arrayFruit.length] = fruit;
    }

}
