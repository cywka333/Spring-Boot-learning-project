package pl.mentoring.devs.secondspringproject.course.model;

import java.util.List;

public class Course {

    private final List<String> lessons;

    public Course(List<String> lessons) {
        this.lessons = lessons;
    }

    public void displayLessons(){
        System.out.println("Lessons in this course:");
        for (String lesson : lessons) {
            System.out.println(lesson);
        }
    }
}
