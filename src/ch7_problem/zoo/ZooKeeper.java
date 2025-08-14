package ch7_problem.zoo;

public class ZooKeeper {

    public void feed(int num){
        Tiger tiger = new Tiger();
        Monkey monkey = new Monkey();

        if (num == 1) {
            System.out.println(tiger.getName() +"에게 " + tiger.getFood() +  " 를 주었습니다.");
        } else if (num == 2) {
            System.out.println(monkey.getName() +"에게 " + monkey.getFood() +  " 를 주었습니다.");
        }
    }
}
