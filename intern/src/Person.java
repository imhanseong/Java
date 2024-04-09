public class Person {
    // 속성(멤버 변수)
    private final String name; // 이름을 final로 지정해서 수정불가
    private int age; // 나이
    private final String occupation; // 직업

    // 생성자
    public Person(String name, int age, String occupation) {
        this.name = name; // 이름 초기화
        this.age = age; // 나이 초기화
        this.occupation = occupation; // 직업 초기화
    }

    // Getter -> private로 선언하였을때 반환하기 위해 사용하는 메서드(주로 속성값을 읽을때)
    public String getName() { return name; }

    public int getAge() {
        return age;
    }

    public String getOccupation() {
        return occupation;
    }

    // Setter -> private로 선언하였을때 설정하기 위해 사용하는 메서드(주로 속성값을 변환할때)
    public void setAge(int age) { this.age = age; }

    // 자기 소개
    public void info() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("직업: " + occupation);
        System.out.println("\n");
    }
}
