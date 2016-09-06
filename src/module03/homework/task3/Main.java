package module03.homework.task3;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Course objectCourse1 = new Course(new Date(), "Java course");
        Course objectCourse2 = new Course("Piton course", 92, "John");
        Course objectCourse3 = new Course("C++ course", 152, "Antony");
        Course objectCourse4 = new Course("Android course", 67, "Bobby");
        Course objectCourse5 = new Course("iOS course", 54, "Bobby");

        Student objStudent1 = new Student("Oleg", "Popov", 1);
        Student objStudent2 = new Student("Foltsman", new Course[]{objectCourse2, objectCourse3, objectCourse5});

        CollegeStudent objCollegeStudent1 = new CollegeStudent("Bobby", "Padington", 3);
        CollegeStudent objCollegeStudent2 = new CollegeStudent("Pareto", new Course[]{objectCourse1, objectCourse2, objectCourse4});
        CollegeStudent objCollegeStudent3 = new CollegeStudent("Andrew", "Lowe", 2, "GoIt", 53, 35554);

        SpecialStudent objSpecialStudent1 = new SpecialStudent("Whitnie", "Manto", 2, "KPI", 87, 33455);
        SpecialStudent objSpecialStudent2 = new SpecialStudent("Geert", "Forester", 1);
        SpecialStudent objSpecialStudent3 = new SpecialStudent("Geert", "Forester", 1, 7777777);
    }

}
