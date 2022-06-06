import lesson01_homework.Team;
import lesson01_homework.ObstacleCourse;

public class Main {
    public static void main(String[] args) {

        //===========================================
        // lesson01


        Team team = new Team("New Team");      // Создаем команду
        team.allTeamInfo();                         // Информация о всех членах команды
        //Информация о прошедших дистанцию

        ObstacleCourse course = new ObstacleCourse();   // Создаем полосу препятствий
        course.doIt(team);                              // Просим команду пройти полосу

        System.out.println("=================================");
        System.out.println("In "+ team.getTeamName() +" all trial compete: "+ course.getResult());


//        team.showResults(); // Показываем результаты

    }
}