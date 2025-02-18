abstract class Bharatvanshi {
    public abstract void fight();
}

abstract class Pandav extends Bharatvanshi {
    public abstract void obey();
    public abstract boolean isKind();
}

abstract class Kaurav extends Bharatvanshi {
    public abstract void disobey();
    public abstract boolean isCruel();
}

class Arjun extends Pandav {
    @Override
    public void fight() {
        System.out.println("Arjun fights skillfully.");
    }

    @Override
    public void obey() {
        System.out.println("Arjun is obedient.");
    }

    @Override
    public boolean isKind() {
        return true;
    }
}

class Bheem extends Pandav {
    @Override
    public void fight() {
        System.out.println("Bheem fights powerfully.");
    }

    @Override
    public void obey() {
        System.out.println("Bheem is obedient.");
    }

    @Override
    public boolean isKind() {
        return false;
    }
}

class Duryodhan extends Kaurav {
    @Override
    public void fight() {
        System.out.println("Duryodhan fights ruthlessly.");
    }

    @Override
    public void disobey() {
        System.out.println("Duryodhan is disobedient.");
    }

    @Override
    public boolean isCruel() {
        return true;
    }
}

class Vikarn extends Kaurav {
    @Override
    public void fight() {
        System.out.println("Vikarn fights nobly.");
    }

    @Override
    public void disobey() {
        System.out.println("Vikarn is obedient.");
    }

    @Override
    public boolean isCruel() {
        return false;
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Bharatvanshi arjun = new Arjun();
        arjun.fight();

        Pandav bheem = new Bheem();
        System.out.println("Bheem is kind: " + bheem.isKind());
        bheem.obey();

        Kaurav duryodhan = new Duryodhan();
        duryodhan.fight();

        Vikarn vikarn = new Vikarn();
        vikarn.disobey();
        System.out.println("Vikarn is cruel: " + vikarn.isCruel());
    }
}
