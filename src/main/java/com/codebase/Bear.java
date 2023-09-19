package com.codebase;

public class Bear {
    private String name;
    private int age;
    private double weight;
    public Bear(String _name, int _age, double _weight){
        this.name = _name;
        this.age = _age;
        this.weight = _weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void eatPeacock(double weightOfPeacock){
        this.setWeight(this.getWeight() + weightOfPeacock);
    }
}
