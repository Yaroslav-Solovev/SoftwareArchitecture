package HW_Les_2.Builder;

public class Program {
    
    
    public static void main(String[] args) {
        Person myPerson = new Person.Builder() // Вызов паттерна Builder (Строитель)
                .withName("Duke")
                .withSurname("Nukem")
                .withAge(45)
                .withHeight(185)
                .withWeight(86)
                .build();
    }
}
