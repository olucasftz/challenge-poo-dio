package br.com.dio.challenge.domain;

public class Courses extends Content{
    private int workLoad;

    public Courses() {

    }

    public int getWorkLoad() {
        return workLoad;
    }

    public void setWorkLoad(int workLoad) {
        this.workLoad = workLoad;
    }

    @Override
    public double xpCalculate() {
        return DEFAULT_XP * workLoad;
    }

    @Override
    public String toString() {
        return "Course [ "
                + "Title: "
                + getTitle()
                + "Description: "
                + getDescription()
                + "mentoringDate: "
                + workLoad +
                " ]";
    }
}