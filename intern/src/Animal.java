// Animal.java
public class Animal {
    // 속성(멤버 변수)
    private final String name; // 동물의 이름을 나타내는 변수
    private final String species; // 동물의 종을 나타내는 변수
    private int age; // 동물의 나이를 나타내는 변수

    // 생성자
    public Animal(String name, String species, int age) throws InvalidAgeException {
        this.name = name; // 이름 초기화
        this.species = species; // 종 초기화
        setAge(age); // 나이 설정
    }

    // Getter 및 Setter 메서드 생략

    // 나이 설정 메서드 (예외 처리 포함)
    // throws로 예외 전달을 선언
    public void setAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("나이는 음수일 수 없습니다.");
        }
        this.age = age; // 나이 설정
    }

    // 동물 정보 출력 메서드
    public static void aboutAnimal(Animal animal) {
        System.out.println("이 동물은 " + animal.species + "종이며, 이름은 " + animal.name + "이고, " + animal.age + "살입니다."); // 종, 이름, 나이 출력
        System.out.println("\n");
    }

    // 오버로딩된 동물 정보 출력 메서드
    public static void aboutAnimal(Animal animal, String additionalInfo) {
        aboutAnimal(animal); // 기본 동물 정보 출력
        System.out.println(additionalInfo); // 추가 정보 출력
    }
}
