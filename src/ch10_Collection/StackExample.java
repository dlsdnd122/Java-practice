package ch10_Collection;

import java.util.Stack;

class Coin {
    private int value;

    public Coin(int value) {
    this.value = value;
    }

    public int getValue() {
        return value;
    }

}

public class StackExample {
    public static void main(String[] args) {
        Stack<Coin> coinStack = new Stack<>();

        coinStack.push(new Coin(500));
        coinStack.push(new Coin(100));
        coinStack.push(new Coin(50));
        coinStack.push(new Coin(10));


        while (!coinStack.isEmpty()) {
            Coin coin1 = coinStack.peek();
            System.out.println("맨 위에 있는 동전 : " + coin1.getValue());

            Coin coin2 = coinStack.pop();
            System.out.println("꺼내온 동전 : " + coin2.getValue() + "원");
        }

    }
}
