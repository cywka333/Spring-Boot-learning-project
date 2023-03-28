package pl.mentoring.devs.secondspringproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.mentoring.devs.secondspringproject.model.Course;

import java.util.List;

@Configuration
public class CourseConfig {

    @Bean
    public Course graphicDesignCourse() {
        List<String> lessons = List.of("Introduction to graphic design", "Fundamentals of color theory", "Layout design", "Typography");
        return new Course(lessons);
    }

    @Bean
    public Course chessCourse() {
        List<String> lessons = List.of("Basic chess rules", "Tactics and strategies", "Endgame techniques", "Famous chess games analysis");
        return new Course(lessons);
    }
}
