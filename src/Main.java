import lesson01_homework.Team;
import lesson01_homework.ObstacleCourse;
import lesson02_homework.MyArrayDataException;
import lesson02_homework.MyArraySizeException;



public class Main {

    //===========================================
    // lesson02
    public static Integer changeToIntAndSumm(String[][] array) throws MyArrayDataException,MyArraySizeException{

        int summ = 0;
        int failCoordI=0;
        int failCoordJ=0;

        checkSize(array);

        try {
            for (int i=0; i < array.length; i++) {
                for (int j=0; j < array.length; j++) {
                    failCoordI = i;
                    failCoordJ = j;
                    summ = summ + Integer.parseInt(array[i][j]);
                }
            }
        } catch (NumberFormatException e){
            throw new  MyArrayDataException(array[failCoordI][failCoordJ] + ". Wrong coordinate: " + failCoordI + "," + failCoordJ + ".");
        }

        return summ;
    }

    public static void checkSize(String[][] array) throws MyArraySizeException{
        if(array.length != 4 || array[0].length != 4) throw new MyArraySizeException();
    }
    public static void main(String[] args) {

        //===========================================
        // lesson02

        String[][] correctArray = {{"1","1","1","1"}, {"1","1","1","1"}, {"1","1","1","1"}, {"1","1","1","1"}};
        String[][] wrongSizeArray = {{"1","1","1","1"}, {"1","1","1","1"}, {"1","1","1","1"}};
        String[][] wrongContentArray = {{"1","1","O","1"}, {"1","1","1","1"}, {"1","1","1","1"}, {"1","1","1","1"}};

        System.out.println("1.Correct; 2.WrongSize; 3.WrongContent");
        System.out.println();

        System.out.print("1. ");
        try {
            System.out.println("Array Summ: "+ changeToIntAndSumm(correctArray) + ".");
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        System.out.print("2. ");
        try {
            System.out.println("Array Summ: "+ changeToIntAndSumm(wrongSizeArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        System.out.print("3. ");
        try {
            System.out.println("Array Summ: "+ changeToIntAndSumm(wrongContentArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }





        //===========================================
        // lesson01

//        Team team = new Team("New Team");      // Создаем команду
//        team.allTeamInfo();                         // Информация о всех членах команды
//        //Информация о прошедших дистанцию
//
//        ObstacleCourse course = new ObstacleCourse();   // Создаем полосу препятствий
//        course.doIt(team);                              // Просим команду пройти полосу
//
//        System.out.println("=================================");
//        System.out.println("In "+ team.getTeamName() +" all trial compete: "+ course.getResult());
//        team.showResults(); // Показываем результаты
   }
}

