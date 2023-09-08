package headfirst.designpatterns.strategy;

public class AkitaLnuDog extends Dog {
    AkitaLnuDog() {
        barkBehavior = new BarkSmall();
    }
}
