package com.company.Question_1;

public class Dog extends Pet  {

    private String breed;
    private String furType;


    public Dog() {

    }

    public Dog(char gender, int petAge, String name, String breed, String furType) {
        super(gender, petAge, name);
        this.breed = breed;
        this.furType = furType;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getFurType() {
        return furType;
    }

    public void setFurType(String furType) {
        this.furType = furType;
    }
}
