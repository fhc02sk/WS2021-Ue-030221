package org.campus02.oop;

import java.util.ArrayList;

public abstract class PersonAnalyzer {
    protected ArrayList<Person> persons;

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    public abstract void analyze();
}
