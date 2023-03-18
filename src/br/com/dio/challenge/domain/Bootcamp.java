package br.com.dio.challenge.domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private String name;
    private String description;
    private final LocalDate initialDate = LocalDate.parse(LocalDate.now().format(dtf),dtf);
    private final LocalDate finalDate = LocalDate.parse(initialDate.plusDays(45).format(dtf),dtf);
    private Set<Dev> devsRegistered = new HashSet<>();
    private Set<Content> contents = new LinkedHashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getFinalDate() {
        return finalDate;
    }

    public Set<Dev> getDevsRegistered() {
        return devsRegistered;
    }

    public void setDevsRegistered(Set<Dev> devsRegistered) {
        this.devsRegistered = devsRegistered;
    }

    public Set<Content> getContents() {
        return contents;
    }

    public void setContents(Set<Content> contents) {
        this.contents = contents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) && Objects.equals(description,
                bootcamp.description) && Objects.equals(initialDate,
                bootcamp.initialDate) && Objects.equals(finalDate,
                bootcamp.finalDate) && Objects.equals(devsRegistered,
                bootcamp.devsRegistered) && Objects.equals(contents, bootcamp.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, initialDate, finalDate, devsRegistered, contents);
    }
}