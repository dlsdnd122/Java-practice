public class Sonata {

    private int speed;
    private boolean stop;

    // 속도 설정 메서드
    void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = 0;
            return;
        } else {
            this.speed = speed;
        }
    }

    // 현재 속도 반환 메서드
    public int getSpeed() {
        return speed;
    }

    // 현재 멈췄는지 안멈췄는지 반환하는 메서드
    public boolean isStop() {
        return stop;
    }
    // 자동차의 멈춤 상태를 설정하는 메서드
    public void setStop(boolean stop) {
        this.stop = stop;

        if (stop) {
            this.speed = 0;
        }
    }

    public static void main(String[] args) {
        Sonata sonata = new Sonata();

        // 잘못된 속도 변경
        sonata.setSpeed(-50);
        System.out.println("현재 속도 : " + sonata.getSpeed());

        // 올바른 속도 변경
        sonata.setSpeed(60);
        System.out.println("변경 후 속도 : " + sonata.getSpeed());

        // 멈추지 않음
        if (sonata.isStop()) {
            sonata.setStop(false);
        }
        System.out.println("멈춤 전 속도 : " + sonata.getSpeed());

        // 멈춤
        if (!sonata.isStop()) {
            sonata.setStop(true);
        }

        System.out.println("멈춤 후 속도 : " + sonata.getSpeed());
    }
}
