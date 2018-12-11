package top.wordcount.java.patterns.filter.impl;

import top.wordcount.java.patterns.filter.base.Person;
import top.wordcount.java.patterns.filter.inter.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 *过滤出女性
 */
public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}