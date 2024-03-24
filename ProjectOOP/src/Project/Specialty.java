package Project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Specialty {
    private String name;
    private Map<Integer, List<Course>> coursesByYear;

    public Specialty(String name) {
        this.name = name;
        coursesByYear = new HashMap<>();
    }

    public void addCourse(int year, Course course) {
        coursesByYear.computeIfAbsent(year, k -> new ArrayList<>()).add(course);
    }


    public List<Course> getCoursesForYear(int year) {
        return coursesByYear.getOrDefault(year, new ArrayList<>());
    }
}