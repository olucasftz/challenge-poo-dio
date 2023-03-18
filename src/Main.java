import br.com.dio.challenge.domain.Bootcamp;
import br.com.dio.challenge.domain.Courses;
import br.com.dio.challenge.domain.Dev;
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
        course2.setDescription("Description: basic course of SQL");
        course2.setWorkLoad(5);

        Mentorships mentorship1 = new Mentorships();
        mentorship1.setTitle("Tests and TDD");
        mentorship1.setDescription("Description: junit and TDD mentoring ");
        mentorship1.setMentoringDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("FULL DEVELOPER");
        bootcamp.setDescription("Description: Java and SQL from basics to advanced");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentorship1);

        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("Developers in their respective bootcamps:");
        System.out.println("-----------------------------------------");
        System.out.println();

        Dev devOne = new Dev();
        devOne.setName("Lucas");
        devOne.enterBootcamp(bootcamp);
        System.out.println("Contents entered by " + devOne.getName() + " " + devOne.getEnteredContents());
        devOne.progress();
        devOne.progress();
        System.out.println();
        System.out.println("Completed Contents " + devOne.getName() + " " + devOne.getCompletedContents());
        System.out.println("Experiences gained: " + devOne.xpTotalCalculate());

        System.out.println();
        System.out.println("------------------------------------------------");
        System.out.println();
        Dev devTwo = new Dev();
        devTwo.setName("Isac");
        devTwo.enterBootcamp(bootcamp);
        System.out.println("Contents entered by " + devTwo.getName() + " " + devTwo.getEnteredContents());
        devTwo.progress();
        devTwo.progress();
        devTwo.progress();
        System.out.println();
        System.out.println("Completed Contents " + devTwo.getName() + " " + devTwo.getCompletedContents());
        System.out.println("Experiences gained: " + devTwo.xpTotalCalculate());
    }
}