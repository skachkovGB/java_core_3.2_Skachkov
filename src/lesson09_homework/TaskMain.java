package lesson09_homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TaskMain {

    public static void main(String[] args) {


        List<Course> courses = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            courses.add(i, new Course(String.valueOf("course_"+i)));
        }

        List<Student> students = new ArrayList<>();
        students.add(new Student("Ivan", Arrays.asList(courses.get(1), courses.get(4))));
        students.add(new Student("Sidor", Arrays.asList(courses.get(0), courses.get(1), courses.get(2), courses.get(3))));
        students.add(new Student("Mydak", Arrays.asList(courses.get(0))));
        students.add(new Student("Otlichnica", Arrays.asList(courses.get(0),courses.get(1),courses.get(2),courses.get(3),courses.get(4),courses.get(5))));

        System.out.println("=======================================1==========================================");

        System.out.println(students.stream().flatMap(s -> s.getCourses().stream()).distinct().collect(Collectors.toList()));
        List<Course> coursesTask1 = students.stream().flatMap(s -> s.getCourses().stream()).distinct().collect(Collectors.toList());

        System.out.print("Unikalnie kyrsi:");
        for (Course iterCourse: coursesTask1) {
            System.out.print(" "+ iterCourse.getName());
        }
        System.out.println();

        System.out.println("=======================================2==========================================");
        System.out.println(students.stream().sorted((s1, s2) -> s1.getCourses().size() - s2.getCourses().size()).limit(3).collect(Collectors.toList()));

        List<Student> studentsTask2 = students
                .stream()
                .sorted((s1, s2) -> s2.getCourses().size() - s1.getCourses().size())
                .limit(3)
                .collect(Collectors.toList());

        for (Student iterStudent: studentsTask2) {
            System.out.println("samie zanudi: " + iterStudent.getName());
        }

        System.out.println("=======================================3==========================================");
        Course searchCourse = courses.get(5);
        System.out.println(students.stream().filter(s -> s.getCourses().contains(searchCourse)).collect(Collectors.toList()));

        List<Student> studentsTask3 = students
                .stream()
                .filter(s -> s.getCourses().contains(searchCourse))
                .collect(Collectors.toList());

        System.out.println(studentsTask3.get(0).getName());
        System.out.println("==================================================================================");



        /*List<Student> result = getListOfStudent(3,3);
        //1 задание
        result.stream().flatMap(student -> student.getCourses().stream()).distinct().collect(Collectors.toList());
        result.stream().flatMap(student -> student.getCourses().stream()).collect(Collectors.toSet());

        //2 задание
        result.stream().sorted((student1,student2) -> student1.getCourses().size() - student2.getCourses().size()).limit(3).collect(Collectors.toList());

        //3 задание
        Course paramCourse = new Course("course1");
        result.stream().filter(student -> student.getCourses().contains(paramCourse)).collect(Collectors.toList());

        System.out.println();*/

    }
    /*
    private static List<Student> getListOfStudent(int j, int m){
        ArrayList<Student> result = new ArrayList<>();
        for (int i=0; i<j ;i++){
            ArrayList<Course> courses = new ArrayList<>();
            for (int s=0; s<m ;s++){
                courses.add(new Course("course"+s));
            }
            result.add(new Student("student"+i, courses));
        }
        return result;
    }*/

}




