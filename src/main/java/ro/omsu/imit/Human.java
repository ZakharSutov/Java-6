package ro.omsu.imit;

import java.util.Objects;

public class Human {
    private String lastName;
    private String name;
    private String patronymic;
    private int age;

    public Human(String lastName, String name, String patronymic, int age) {
        if (age < 0) throw new IllegalArgumentException();
        this.lastName = lastName;
        this.name = name;
        this.patronymic = patronymic;
        this.age = age;
    }

    public Human(Human x) {
        this.lastName = x.getLastName();;
        this.name = x.getName();
        this.patronymic = x.getPatronymic();
        this.age = x.getAge();
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getAge() {
        return age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(lastName, human.lastName) && Objects.equals(name, human.name) && Objects.equals(patronymic, human.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, name, patronymic, age);
    }
}
