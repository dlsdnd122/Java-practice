package ch7_problem.zoo;

public class ZooKeeper {

    public void feed(Animal animal){

        System.out.println(animal.getName() +"에게 " + animal.getFood() +  " 를 주었습니다.");
    }
}
