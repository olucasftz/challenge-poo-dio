import br.com.dio.challenge.domain.Courses;
import br.com.dio.challenge.domain.Mentorships;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Courses course1 = new Courses();
        course1.setTitle("Course Java");
        course1.setDescription("Description course of Java");
        course1.setWorkLoad(8);

        Courses course2 = new Courses();
        course2.setTitle("Course SQL Server");
        course2.setDescription("Description basic course of SQL");
        course2.setWorkLoad(5);

        Mentorships mentorship1 = new Mentorships();
        mentorship1.setTitle("Tests and TDD");
        mentorship1.setDescription("Description junit and TDD mentoring ");
        mentorship1.setMentoringDate(LocalDate.now());
        System.out.println(mentorship1);

    }
}