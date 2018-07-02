/**
 * Parrot.java
 */
package com.sample.assessment.service;

/**
 * 
 * @author Ramachandra
 *
 */;

public class Parrot extends Bird {

    private boolean isLivingWithDogs;
    private boolean isLivingWithCats;
    private boolean isLivingNearRooster;
    private boolean isLivingNearDuck;
    private boolean isLivingNearPhone;

    public Parrot(boolean isLivingWithDogs, boolean isLivingWithCats, boolean isLivingNearRooster) {
        this.isLivingWithDogs = isLivingWithDogs;
        this.isLivingWithCats = isLivingWithCats;
        this.isLivingNearRooster = isLivingNearRooster;
    }

    public Parrot(boolean isLivingWithDogs, boolean isLivingWithCats, boolean isLivingNearRooster,
            boolean isLivingNearDuck, boolean isLivingNearPhone) {
        this.isLivingWithDogs = isLivingWithDogs;
        this.isLivingWithCats = isLivingWithCats;
        this.isLivingNearRooster = isLivingNearRooster;
        this.isLivingNearDuck = isLivingNearDuck;
        this.isLivingNearPhone = isLivingNearPhone;
    }

    public Parrot() {
        // Default Constructor
    }

    public boolean isLivingWithDogs() {
        return isLivingWithDogs;
    }

    public void setLivingWithDogs(boolean isLivingWithDogs) {
        this.isLivingWithDogs = isLivingWithDogs;
    }

    public boolean isLivingWithCats() {
        return isLivingWithCats;
    }

    public void setLivingWithCats(boolean isLivingWithCats) {
        this.isLivingWithCats = isLivingWithCats;
    }

    public boolean isLivingNearRooster() {
        return isLivingNearRooster;
    }

    public void setLivingNearRooster(boolean isLivingNearRooster) {
        this.isLivingNearRooster = isLivingNearRooster;
    }

    public boolean isLivingNearDuck() {
        return isLivingNearDuck;
    }

    public void setLivingNearDuck(boolean isLivingNearDuck) {
        this.isLivingNearDuck = isLivingNearDuck;
    }

    public boolean isLivingNearPhone() {
        return isLivingNearPhone;
    }

    public void setLivingNearPhone(boolean isLivingNearPhone) {
        this.isLivingNearPhone = isLivingNearPhone;
    }

    @Override
    public boolean sing() {
    	Animal animal = null;
        if (isLivingWithDogs) {
            animal = AnimalyFactoryPattern.getAnimal(Dog.class.getSimpleName());
        } else if (isLivingWithCats) {
            animal = AnimalyFactoryPattern.getAnimal(Cat.class.getSimpleName());
        } else if (isLivingNearRooster) {
            animal = AnimalyFactoryPattern.getAnimal(Rooster.class.getSimpleName());
        } else if (isLivingNearDuck) {
            animal = AnimalyFactoryPattern.getAnimal(Duck.class.getSimpleName());
        } else if (isLivingNearPhone) {
            System.out.println(this.getClass().getSimpleName() + " Says Tring Tring");
            return true;
        }
        if (animal == null) {
            return super.sing();
        }
        return animal.sing();
    }
}
