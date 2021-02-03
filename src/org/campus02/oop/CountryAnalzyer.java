package org.campus02.oop;

import java.util.HashMap;

public class CountryAnalzyer extends PersonAnalyzer{

    private HashMap<String, Integer> result = new HashMap<>();

    public CountryAnalzyer(HashMap<String, Integer> result) {
        this.result = result;
    }

    public CountryAnalzyer() {
  //      this.result = new HashMap<>();
    }

    public HashMap<String, Integer> getResult() {
        return result;
    }

    @Override
    public void analyze() {
        result = new HashMap<>();

        for(Person p : persons){
            // 1. Kontrollieren, ob Element schon enthalten
            if (result.containsKey(p.getCountry())){
                // 2. Wenn ja, herausholen und ändern, ablegen
                Integer value = result.get(p.getCountry());
                value++;
                result.put(p.getCountry(), value);

//                result.put(p.getCountry(), result.get(p.getCountry()) + 1);
            }
            else {
                // 3. Wenn nein, mit Initialwert ablegen
                result.put(p.getCountry(), 1);
            }
        }
    }
}
