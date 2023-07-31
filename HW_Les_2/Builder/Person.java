package HW_Les_2.Builder;

import java.util.Set;

public class Person {
 
    private String name;
    private String surname;
    private int age;
    private int height;
    private int weight;
    private Set<Person> parents;

    public static class Builder { // Паттерн Builder (Строитель)
        private Person newPerson;
 
        public Builder() { // Конструктор
            newPerson = new Person();
        }
 
        public Builder withName(String name){ // Параметры
            newPerson.name = name;
            return this;
        }
 
        public Builder withSurname(String surname){ // Параметры
            newPerson.surname = surname;
            return this;
        }
 
        public Builder withAge(int age){ // Параметры
            newPerson.age = age;
            return this;
        }
 
        public Builder withHeight(int height){ // Параметры
            newPerson.height = height;
            return this;
        }
 
        public Builder withWeight(int weight){ // Параметры
            newPerson.weight = weight;
            return this;
        }
 
        public Builder withParents(Set<Person> parents){ // Параметры
            newPerson.parents = parents;
            return this;
        }
 
        public Person build(){ // Метод, который возвращает готовый объект
            return newPerson;
        }
    }
}
