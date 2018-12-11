package top.wordcount.java.patterns.filter.impl;
import top.wordcount.java.patterns.filter.base.Person;
import top.wordcount.java.patterns.filter.inter.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤出单身的人
 */
public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}