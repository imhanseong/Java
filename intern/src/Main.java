// Main.java
public class Main {
    public static void main(String[] args) {
        try {
            // Person 객체 생성
            Person person = new Person("임한성", 17, "개발자");
            person.info();

            // House 객체 생성
            House house = new House("대마고 5층", 1);
            house.aboutHouse();

            // Animal 객체 생성
            Animal animal = new Animal("누룽지", "고양이", -2);
            Animal.aboutAnimal(animal, "색깔: 검정");

            // Family 객체 생성
            Family family = new Family("빌게이츠", 45, "개발자", "아버지");
            family.aboutFamily();
        } catch (InvalidAgeException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }
    }
}

