package dev.lpa;

public class Horse extends mammal {

    public Horse(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitType()+" sheds in the spring");
    }

    @Override
    public void makeNoise() {

    }
}
