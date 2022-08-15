package Controller;

import domain.Course;
import domain.Student;
import service.CourseService;
import service.StudentService;

public class HomeController {

    public static StudentService studentService = new StudentService();

    public static CourseService courseService = new CourseService();

    public static void main(String[] args) {
//        Student student = new Student();
//        student.setId(5);
//        student.setName("Shahriar");

//        Course course = new Course();
//        course.setId(5);
//        course.setCode(340);
//        course.setCourseTitle("Algorithm");

        System.out.println(courseService.findById(5));
    }
}
