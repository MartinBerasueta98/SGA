package Model;

public class Person {
    private String name;
    private Integer age;
    private Integer Passaport;

    public Person(String name, Integer age, Integer passaport) {
        this.name = name;
        this.age = age;
        Passaport = passaport;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getPassaport() {
        return Passaport;
    }
}
