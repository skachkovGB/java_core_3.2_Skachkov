package lesson03_homework;

import java.util.ArrayList;

public class BoxList <T extends Fruit>{
    private ArrayList<T> arrayFruitList;

    public BoxList (ArrayList<T> arrayFruitList){
        this.arrayFruitList = arrayFruitList;
    }

    public double weightNotFullBoxList(){
        if(arrayFruitList.get(0)!=null){
        //if(arrayFruitList.toArray()[0]!=null){
            return arrayFruitList.get(0).getAFruitWeight()*arrayFruitList.size();
        } else return 0;
    }

    public void addFruitList(T fruit){
        arrayFruitList.add(fruit);
    }

    public void swapFruitList(BoxList<T> box){
        for (T iterator: box.arrayFruitList) {
            arrayFruitList.add(iterator);
            //box.arrayFruitList.remove(iterator);
        }
        box.arrayFruitList.clear();
        box.arrayFruitList.add(null);
    }

    public void notKostilSwap(BoxList<T> box){
        int firstVal = arrayFruitList.size();
        int secondVal = box.arrayFruitList.size();
        System.out.println(firstVal + "  " + secondVal);

        for (int i = 0; i < secondVal; i++) {
            arrayFruitList.add(i+firstVal, box.arrayFruitList.get(i));
        }
        box.arrayFruitList.clear();
        box.arrayFruitList.add(null);
    }

    public ArrayList<T> getArrayFruitList() {
        return arrayFruitList;
    }
}
