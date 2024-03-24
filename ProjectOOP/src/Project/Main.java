package Project;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Course math = new Course("Математика", "задължителен");
        Course physics = new Course("Физика", "задължителен");
        Course programming = new Course("Програмиране", "избираем");


        Specialty computerScience = new Specialty("Информатика");
        Specialty physicsMajor = new Specialty("Физика");


        computerScience.addCourse(1, math);
        computerScience.addCourse(1, programming);
        computerScience.addCourse(2, physics);
        physicsMajor.addCourse(1, math);
        physicsMajor.addCourse(1, physics);


        List<Course> computerScienceCoursesFirstYear = computerScience.getCoursesForYear(1);
        List<Course> physicsMajorCoursesFirstYear = physicsMajor.getCoursesForYear(1);


        System.out.println("Дисциплини за първи курс по Информатика:");
        for (Course course : computerScienceCoursesFirstYear) {
            System.out.println(course.getName() + " - " + course.getType());
        }

        System.out.println("\nДисциплини за първи курс по Физика:");
        for (Course course : physicsMajorCoursesFirstYear) {
            System.out.println(course.getName() + " - " + course.getType());
        }
    }
}
