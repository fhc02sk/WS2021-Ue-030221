package org.campus02.oop;

public class MaxSalaryAnalyzer extends PersonAnalyzer{
    @Override
    public void analyze() {

        int maxSalary = 0;

        for (Person p : persons){
            if (maxSalary < p.getSalary()){
                maxSalary = p.getSalary();
            }
        }

        System.out.println("Maximalgehalt ist: " + maxSalary);
        for (Person p : persons){
            if (p.getSalary() == maxSalary){
                System.out.println(p);
            }
        }

    }
}
