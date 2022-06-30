package lesson03_homework;

public class SwapArray<T> {
    private T[] array;
    private int firstSwapElement;
    private int secondSwapElement;
    private T swapElement;

    SwapArray(T[] array)
    {
        this.array = array;
        this.firstSwapElement = firstSwapElement;
        this.secondSwapElement = secondSwapElement;
    }

    public void swapElement(int firstSwapElement, int secondSwapElement){
        if (firstSwapElement > (this.array.length - 1) || secondSwapElement > (this.array.length - 1)){
            System.out.println("Wrong numbers Elements");
        }else {
            this.firstSwapElement = firstSwapElement;
            this.secondSwapElement = secondSwapElement;
            // first to swap
            this.swapElement = this.array[firstSwapElement];
            // second to first
            this.array[firstSwapElement] = this.array[secondSwapElement];
            // swap to second
            this.array[secondSwapElement] = this.swapElement;
        }
    }

    public void printArray(){
        for (T iterationArray: this.array){
            System.out.print(iterationArray + "|");
        }
        System.out.println();
    }
}
