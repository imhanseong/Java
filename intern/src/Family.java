public class Family extends Person {
    private final String relation; // 가족 관계

    // 생성자
    public Family(String name, int age, String occupation, String relation) {
        super(name, age, occupation); // Person 클래스의 생성자 호출
        this.relation = relation; // 가족 관계 초기화
    }

    // 가족 정보 출력 메서드
    public void aboutFamily() {
        System.out.println("가족 관계: " + relation);
        System.out.println("이름: " + getName());
        System.out.println("나이: " + getAge());
        System.out.println("직업: " + getOccupation());
        System.out.println("\n");
    }
}
