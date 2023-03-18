package br.com.dio.challenge.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String name;
    private Set<Content> enteredContents = new LinkedHashSet<>();
    private Set<Content> completedContents = new LinkedHashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getEnteredContents() {
        return enteredContents;
    }

    public void setEnteredContents(Set<Content> enteredContents) {
        this.enteredContents = enteredContents;
    }

    public Set<Content> getCompletedContents() {
        return completedContents;
    }

    public void setCompletedContents(Set<Content> completedContents) {
        this.completedContents = completedContents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(enteredContents, dev.enteredContents) && Objects.equals(completedContents, dev.completedContents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, enteredContents, completedContents);
    }

    public void enterBootcamp(Bootcamp bootcamp) {
        this.getEnteredContents().addAll(bootcamp.getContents());
        bootcamp.getDevsRegistered().add(this);
    }

    public void progress() {
        Optional<Content> content = this.enteredContents.stream().findFirst();
        if (content.isPresent()) {
            this.completedContents.add(content.get());
            this.enteredContents.remove(content.get());
        } else {
            System.err.println("You are not registered in any content!");
        }
    }

    public double xpTotalCalculate() {
        return this.completedContents.stream()
                .mapToDouble(Content::xpCalculate)
                .sum();
    }
}