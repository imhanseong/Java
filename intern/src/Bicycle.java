// 자전거 클래스 정의
public class Bicycle {
    // 필드(상태)
    private int speed;  // 속도
    private int gear;   // 기어
    private static final int DEFAULT_GEAR = 1; // 기본 기어
    private static final int MAX_SPEED = 100; // 최대 속도

    // 생성자
    public Bicycle(int startSpeed, int startGear) {
        speed = startSpeed;
        gear = startGear;
    }

    // 메서드(행동)
    public void speedUp(int increment) {
        speed += increment;
        if (speed > MAX_SPEED) {
            speed = MAX_SPEED;
            System.out.println("최대 속도에 도달했습니다.");
        } else {
            System.out.println("속도가 " + increment + "만큼 증가하여 현재 속도는 " + speed + "입니다.");
        }
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
        if (speed < 0) {
            speed = 0;
            System.out.println("속도가 0 이하로 내려갔습니다.");
        } else {
            System.out.println("속도가 " + decrement + "만큼 감소하여 현재 속도는 " + speed + "입니다.");
        }
    }

    public void changeGear(int newGear) {
        gear = newGear;
        System.out.println("기어가 " + gear + "로 변경되었습니다.");
    }

    // 오버로딩된 changeGear 메서드
    public void changeGear() {
        gear = DEFAULT_GEAR; // 기본 기어로 설정
        System.out.println("기어가 기본값으로 변경되었습니다.");
    }

    // 오버라이딩된 toString 메서드
    @Override
    public String toString() {
        return "현재 속도: " + speed + ", 현재 기어: " + gear;
    }

    public static void main(String[] args) {
        // 자전거 인스턴스 생성
        Bicycle myBike = new Bicycle(0, 1);

        // 일부 동작 수행
        myBike.speedUp(20);
        myBike.changeGear(2);
        myBike.speedUp(30);
        myBike.applyBrake(10);

        // 현재 상태 출력
        System.out.println(myBike);

        // 오버로딩된 changeGear 메서드 호출
        myBike.changeGear();
        System.out.println(myBike);
    }
}

