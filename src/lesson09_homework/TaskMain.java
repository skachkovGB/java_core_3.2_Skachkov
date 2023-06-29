package lesson09_homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TaskMain {

    public static void main(String[] args) {

        List<Student> students = studentsSettings();

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
        Course searchCourse = new Course("course_5");
        System.out.println(students.stream().filter(s -> s.getCourses().contains(searchCourse)).collect(Collectors.toList()));

        List<Student> studentsTask3 = students
                .stream()
                .filter(s -> s.getCourses().contains(searchCourse))
                .collect(Collectors.toList());

        System.out.println(studentsTask3.get(0).getName());
        System.out.println("==================================================================================");

}


    private static List<Student> studentsSettings(){

        List<Course> courses = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            courses.add(i, new Course("course_"+i));
        }

        List<Student> students = new ArrayList<>();

        ArrayList<Course> ivanCourses = new ArrayList<>();
        ivanCourses.add(courses.get(1));
        ivanCourses.add(courses.get(4));
        students.add(new Student("Ivan", ivanCourses));

        ArrayList<Course> sidorCourses = new ArrayList<>();
        sidorCourses.add(courses.get(0));
        sidorCourses.add(courses.get(1));
        sidorCourses.add(courses.get(2));
        sidorCourses.add(courses.get(3));
        students.add(new Student("Sidor", sidorCourses));

        ArrayList<Course> mCourses = new ArrayList<>();
        mCourses.add(courses.get(0));
        students.add(new Student("Mydak", mCourses));


        ArrayList<Course> otlCourses = new ArrayList<>();
        otlCourses.add(courses.get(0));
        otlCourses.add(courses.get(1));
        otlCourses.add(courses.get(2));
        otlCourses.add(courses.get(3));
        otlCourses.add(courses.get(4));
        otlCourses.add(courses.get(5));
        students.add(new Student("Otlichnica", otlCourses));
        return students;
    }

}




