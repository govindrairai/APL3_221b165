interface FlyBehavior {
    void fly();
}

interface QuackBehavior {
    void quack();
}

class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Can't fly.");
    }
}

class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Flying with wings.");
    }
}

class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeaking.");
    }
}

class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Silent.");
    }
}

class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quacking.");
    }
}

abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void swim() {
        System.out.println("Swimming.");
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}

class RubberDuck extends Duck {
    public RubberDuck() {
        super(new FlyNoWay(), new Squeak());
    }
}

class WoodenDuck extends Duck {
    public WoodenDuck() {
        super(new FlyNoWay(), new MuteQuack());
    }
}

class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        super(new FlyWithWings(), new Quack());
    }
}

class LakeDuck extends Duck {
    public LakeDuck() {
        super(new FlyWithWings(), new Quack());
    }
}
public class Problem3 {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        rubberDuck.performFly();
        rubberDuck.performQuack();

        Duck redHeadDuck = new RedHeadDuck();
        redHeadDuck.performFly();
        redHeadDuck.performQuack();
    }
}
