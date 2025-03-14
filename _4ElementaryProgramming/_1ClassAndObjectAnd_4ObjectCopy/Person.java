package _4ElementaryProgramming._1ClassAndObjectAnd_4ObjectCopy;

public class Person {
    public String name;
    public int age = 32;
    public String job;

    public void copyPersonOne(Person person) {
        this.name = person.name;
        this.age = person.age;
        this.job = person.job;
    }//第一种引用copy

    public Person copyPersonTwo(Person p1) {
        Person p2 = new Person();
        p2.name = p1.name;
        p2.age = p1.age;
        p2.job = p1.job;
        return p2;
    }//第二种引用copy
}
