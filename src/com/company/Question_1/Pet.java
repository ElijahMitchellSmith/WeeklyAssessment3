package com.company.Question_1;

public class Pet {

    private char gender;
    private int petAge;
    private String name;

    public Pet() {

    }

    public Pet(char gender, int petAge, String name) {
        this.gender = gender;
        this.petAge = petAge;
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getPetAge() {
        return petAge;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
