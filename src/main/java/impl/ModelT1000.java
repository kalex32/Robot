package impl;

import interfaces.Hand;
import interfaces.Head;
import interfaces.Leg;
import interfaces.Robot;

public class ModelT1000 implements Robot {
    private Hand hand;
    private Head head;
    private Leg leg;

    public ModelT1000() {
    }

    ModelT1000(Hand hand, Head head, Leg leg) {
        super();
        this.hand = hand;
        this.head = head;
        this.leg = leg;
    }


    public void action() {
        head.calc();
        hand.catchSomething();
        leg.go();
    }


    Hand getHand() {
        return hand;
    }

    void setHand(Hand hand) {
        this.hand = hand;
    }

    Head getHead() {
        return head;
    }

    void setHead(Head head) {
        this.head = head;
    }

    Leg getLeg() {
        return leg;
    }

    void setLeg(Leg leg) {
        this.leg = leg;
    }

    public void dance() {
        System.out.println("ModelT1000 is dancing");
    }
}
