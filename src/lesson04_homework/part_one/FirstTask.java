package lesson04_homework.part_one;
import java.util.HashMap;

public class FirstTask {


    public static void main(String[] args) {

        String[] stringsWithRepeats = {"000","111","222","222","444","555","444","777","444","999"};

        printArray(stringsWithRepeats);

        HashMap<String, Integer> hashMapUniq = transformArraytoHashMap(stringsWithRepeats);
        System.out.println("Unique list: " + hashMapUniq);

        HashMap<String, Integer> hashWithRepeats = setNumberRepeats(stringsWithRepeats,hashMapUniq);
        System.out.println("Unique list with Reapeats: " + hashWithRepeats);

    }

    public static HashMap<String, Integer> transformArraytoHashMap(String[] strArray){
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String str: strArray) {
            int repeats = 1;
            hashMap.put(str, repeats);
        }
        return hashMap;
    }

    public static HashMap<String, Integer> setNumberRepeats (String[] strArray, HashMap<String, Integer> hashMap){
         for (int i = 0; i < strArray.length; i++) {
            int repeats = 0;
            for (int j = 0; j < strArray.length; j++) {
                if (strArray[i] == strArray[j]){
                    repeats++;
                }
                hashMap.put(strArray[i], repeats);
            }
        }
        return hashMap;
    }

    public static void printArray(String[] strArray){
        System.out.print("Original list: ");
        for (String iterationArray: strArray){
            System.out.print(iterationArray + "|");
        }
        System.out.println();
    }

}
