package pl.mentoring.devs.secondspringproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pl.mentoring.devs.secondspringproject.model.Course;

@SpringBootApplication
public class SecondSpringProjectApplication {

	public static void main(String[] args) {
		 ApplicationContext context = SpringApplication.run(SecondSpringProjectApplication.class, args);

		 Course graphicDesignCourse = (Course) context.getBean("graphicDesignCourse", Course.class);
		 graphicDesignCourse.displayLessons();

		 System.out.println("----------------------------");
		 Course chessCourse = (Course) context.getBean("chessCourse", Course.class);
		 chessCourse.displayLessons();
	}

}
