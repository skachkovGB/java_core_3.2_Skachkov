package lesson05_homework;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FiveMain {

    public static ArrayList<DataCsv> dataCsvArrayList = new ArrayList<>();
    public static String pathToFileCsv = "src/lesson05_homework/data.csv";
    public static Integer sizeForRandom = 5;
    public static int min = 100;
    public static int max = 900;

    public static final String title = "Value 1"+ ";" + "Value 2" + ";" + "Value 3" + ";"+ System.getProperty("line.separator");

    public static void main(String[] args) throws IOException {

        fileCheck();

        createValueForFile();
        writeValueToFile();

        printValueFromFile(readValueFromFile());
    }

    public static void fileCheck(){
        File fileCsv = new File(pathToFileCsv);
        System.out.println();
        System.out.println("Nalichie faila: " + fileCsv.exists());
        System.out.println();
    }

    public static void createValueForFile(){
        //Random rndValue = new Random();
        for (int i = 0; i < sizeForRandom; i++ ) {
            int rndValue = (int) (Math.random() * max) + min;
            //dataCsvArrayList.add(new DataCsv(i, rndValue.nextInt(100), rndValue.nextInt(100)));
            dataCsvArrayList.add(new DataCsv(rndValue, rndValue, rndValue));
        }
    }
    public static void writeValueToFile() throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(pathToFileCsv)) {
            for (byte b : title.getBytes(StandardCharsets.UTF_8)) {
                fileOutputStream.write(b);
            }
            for (DataCsv dataCsv : dataCsvArrayList) {
                String raw = dataCsv.getValueOne() + ";" + dataCsv.getValueTwo() + ";" +
                        dataCsv.getValueThree() + ";" + System.getProperty("line.separator");
                for (byte b : raw.getBytes(StandardCharsets.UTF_8)) {
                    fileOutputStream.write(b);
                }
            }
        }
    }

    public static AppData readValueFromFile() throws IOException{
        AppData appData = new AppData();
        List<List<String>> records = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(pathToFileCsv))){
            String line = bufferedReader.readLine();
            appData.setHeader(line.split(";"));

            while ((line = bufferedReader.readLine()) != null) {
                String[] values = line.split(";");
                records.add(Arrays.asList(values));
            }
        }

        int[][] resultArr = new int [records.size()][3];
        for (int i = 0; i < records.size(); i++) {
            for (int j = 0; j < records.get(i).size(); j++) {
                resultArr[i][j] = Integer.valueOf(records.get(i).get(j));
            }
        }
        appData.setData(resultArr);

        return appData;
    }

    public static void printValueFromFile(AppData appData){
        for ( int i = 0; i < appData.getHeader().length; i++) {
            System.out.print(appData.getHeader()[i] + " / ");
        }
        System.out.println(" ");

        for ( int i = 0; i < appData.getData().length; i++) {
            for ( int j = 0; j < appData.getData()[i].length; j++) {
                System.out.print("  " + appData.getData()[i][j] + "     ");
            }
            System.out.println(" ");
        }
    }

}
