package top.wordcount.java.patterns.filter.util;

import top.wordcount.java.patterns.filter.base.Person;
import top.wordcount.java.patterns.filter.inter.Criteria;

import java.util.List;

/**
 * And operation
 * and操作，可将两类标准做交集操作
 */
public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}