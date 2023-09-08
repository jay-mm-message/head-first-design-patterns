package headfirst.designpatterns.strategy;

public abstract class Dog {
    BarkBehavior barkBehavior;

    public void performBark() {
        barkBehavior.bark();
    }
    public void setBarkBehavior(BarkBehavior bk) {
        barkBehavior = bk;
    }
}
