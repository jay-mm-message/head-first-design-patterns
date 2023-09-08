package headfirst.designpatterns.strategy;

public class LabradorDog extends Dog {
    LabradorDog() {
        barkBehavior = new BarkLarge();
    }
}
