package org.campus02.oop;

public class GenderAnalyzer extends  PersonAnalyzer {

    @Override
    public void analyze() {

        int countM = 0, countF = 0, sizeM = 0, sizeF = 0;

        for (Person person : persons) {
            if (person.getGender() == 'M'){
                countM++;
                sizeM += person.getSize();
            }
            else {
                countF++;
                sizeF += person.getSize();
            }
        }

        System.out.println("In der Liste existieren " + countM
                + " Männer mit einer durchschnittlichen Körpergröße von " + (sizeM / countM) + " cm.");
        System.out.println("In der Liste existieren " + countF
                + " Frauen mit einer durchschnittlichen Körpergröße von " + (sizeF / countM) + " cm.");
    }
}
