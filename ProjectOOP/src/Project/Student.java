package Project;

public class Student {
    private String name;
    private int facultyNumber;
    private int currentCourse;
    private String specialty;
    private String group;
    private String status;
    private double averageGrade;


    public Student(String name, int facultyNumber, int currentCourse, String specialty, String group, String status, double averageGrade) {
        this.name = name;
        this.facultyNumber = facultyNumber;
        this.currentCourse = currentCourse;
        this.specialty = specialty;
        this.group = group;
        this.status = status;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public int getFacultyNumber() {
        return facultyNumber;
    }

    public int getCurrentCourse() {
        return currentCourse;
    }

    public String getSpecialty() {
        return specialty;
    }

    public String getGroup() {
        return group;
    }

    public String getStatus() {
        return status;
    }

    public double getAverageGrade() {
        return averageGrade;
    }


    public void setStatus(String status) {
        this.status = status;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }


    public void printInfo() {
        System.out.println("Име: " + name);
        System.out.println("Факултетен номер: " + facultyNumber);
        System.out.println("Курс: " + currentCourse);
        System.out.println("Специалност: " + specialty);
        System.out.println("Група: " + group);
        System.out.println("Статус: " + status);
        System.out.println("Среден успех: " + averageGrade);
    }
}

