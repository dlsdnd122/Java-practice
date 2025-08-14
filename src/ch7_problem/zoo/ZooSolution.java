package ch7_problem.zoo;

public class ZooSolution {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Monkey monkey = new Monkey();
        ZooKeeper zooKeeper = new ZooKeeper();

        System.out.println("-- 점심 시간 --");
        zooKeeper.feed(1);
        zooKeeper.feed(2);

        System.out.println("-- 저녁 시간 --");
        String[] animalName = {tiger.getName(),monkey.getName()};
        String[] animalFood = {tiger.getFood(),monkey.getFood()};
        for (int i = 0; i < 2; i++) {
            System.out.println(animalName[i] + "에게 " + animalFood[i] + " 를 주었습니다.");
        }

    }
}
