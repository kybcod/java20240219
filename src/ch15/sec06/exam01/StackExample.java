package ch15.sec06.exam01;

import ch08.sec10.exam01.C;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        var coinBox = new Stack<Coin>();
        coinBox.push(new Coin(100));
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(500));
        coinBox.push(new Coin(10));

        while (!coinBox.isEmpty()) {
            Coin coin = coinBox.pop();
            System.out.println("꺼 내온 동전 : " + coin.getValue() + "원");
        }
    }
}

class Coin {
    private int value;

    public Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}