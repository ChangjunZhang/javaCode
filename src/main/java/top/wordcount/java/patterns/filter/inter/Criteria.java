package top.wordcount.java.patterns.filter.inter;

import top.wordcount.java.patterns.filter.base.Person;

import java.util.List;

/**
 * 为标准（Criteria）创建一个接口。
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
