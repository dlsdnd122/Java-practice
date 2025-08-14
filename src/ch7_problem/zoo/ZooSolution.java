package ch7_problem.zoo;

public class ZooSolution {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Monkey monkey = new Monkey();
        ZooKeeper zooKeeper = new ZooKeeper();

        System.out.println("-- 점심 시간 --");
        zooKeeper.feed(tiger);
        zooKeeper.feed(monkey);

        System.out.println("-- 저녁 시간 --");
        Animal[] animalName = {tiger, monkey};
        for (int i = 0; i < 2; i++) {
            zooKeeper.feed(animalName[i]);
        }

    }
}
