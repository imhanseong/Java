public class House {
    // 속성(멤버 변수)
    private final String address; // 주소
    private int numberOfRooms; // 방

    // 생성자
    public House(String address, int numberOfRooms) {
        this.address = address; // 주소 초기화
        this.numberOfRooms = numberOfRooms; // 방의 개수 초기화
    }

    // 집 정보 출력 메서드
    public void aboutHouse() {
        System.out.println("이 집은 " + address + "에 위치하고 있습니다.");
        if (numberOfRooms > 0) {
            System.out.println("방의 개수는 " + numberOfRooms + "개 입니다.");
            System.out.println("\n");
        } else {
            System.out.println("방의 개수는 알 수 없습니다.");
            System.out.println("\n");
        }
    }
}
