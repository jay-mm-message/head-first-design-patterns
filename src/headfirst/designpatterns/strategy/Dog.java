package headfirst.designpatterns.strategy;

public abstract class Dog {
    BarkBehavior barkBehavior;

    public void performBark() {
        barkBehavior.bark();
    }
}
