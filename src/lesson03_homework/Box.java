package lesson03_homework;

import java.lang.reflect.Array;

public class Box <T extends Fruit>{

    private T[] arrayFruit;

    public Box (T[] arrayFruit){
        setArrayFruit(arrayFruit);
    }

    public void setArrayFruit(T[] arrayFruit){
        this.arrayFruit=arrayFruit;
    }

    public double weightBox(){
        return arrayFruit[0].getAFruitWeight()*arrayFruit.length;
    }

    public double weightNotFullBox(){
        if(arrayFruit[0]!=null){
            return arrayFruit[0].getAFruitWeight()*this.getSize();
        } else return 0;
    }


    //подсмотрел у Преподавателя
    private int getSize(){
        int result = 0;
        for(T t: arrayFruit){
            if(t!=null)result++;
        }
        return result;
    }

    public boolean compareBox(Box box){
        return this.weightBox() == box.weightBox();
    }

    public void swapFruit(Box<T> box){
        int arrayFirstSize = box.getSize();
        int arraySecondSize = box.getSize();
        for (int i = arrayFirstSize; i < arrayFirstSize + arraySecondSize; i++) {
            arrayFruit[i] = box.arrayFruit[i-arraySecondSize];
            box.arrayFruit[i-arrayFirstSize]=null;
//        for (int i = this.arrayFruit.length; i < this.arrayFruit.length + box.arrayFruit.length; i++) {
//            this.newArrayFruit[i] = box.arrayFruit[i-this.arrayFruit.length];
        }
    }

    public void addFruit(T fruit){
        //Почему я не могу вот так сделать)))
        //T[] newArrayFruit = new T[arrayFruit.length + 1];
        arrayFruit[this.getSize()] = fruit;
    }

}
