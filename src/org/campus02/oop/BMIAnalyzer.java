package org.campus02.oop;

import java.util.ArrayList;

public class BMIAnalyzer extends PersonAnalyzer{
    private ArrayList<Pair<Person, Double>> result;

    @Override
    public void analyze() {
        result = new ArrayList<>();
        for (Person p : persons){
            result.add(new Pair<>(p, calcBMI(p)));
        }
    }

    public ArrayList<Pair<Person, Double>> getResult() {
        return result;
    }

    private double calcBMI(Person p){
        double bmi = p.getWeight() /
                ((p.getSize() / (double) 100) * (p.getSize() / 100.0));

        return bmi;
    }
}
