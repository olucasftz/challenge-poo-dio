
package br.com.dio.challenge.domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

    public class Mentorships extends Content{


        private LocalDate mentoringDate;
        private final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        public Mentorships() {

        }

        public void setMentoringDate(LocalDate mentoringDate) {
            this.mentoringDate = mentoringDate;
        }

        public String getDateFormatted() {
            return dtf.format(mentoringDate);
        }

        @Override
        public double xpCalculate() {
            return DEFAULT_XP + 20d;
        }

        @Override
        public String toString() {
            return "Mentorship [ "
                    + "Title: "
                    + getTitle()
                    + "Description: "
                    + getDescription()
                    + "mentoringDate: "
                    + getDateFormatted() +
                    " ]";
        }
    }

