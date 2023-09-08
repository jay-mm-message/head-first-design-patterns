package headfirst.designpatterns.strategy;

public class MiniDuckSimulator {
 
	public static void main(String[] args) {
 
		MallardDuck	mallard = new MallardDuck();
		FlyBehavior cantFly = () -> System.out.println("I can't fly");
		QuackBehavior squeak = () -> System.out.println("Squeak");
		RubberDuck	rubberDuckie = new RubberDuck(cantFly, squeak);
		DecoyDuck	decoy = new DecoyDuck();
 
		Duck	 model = new ModelDuck();

		mallard.performQuack();
		rubberDuckie.performQuack();
		decoy.performQuack();
   
		model.performFly();	
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();

		LabradorDog labradorDog = new LabradorDog();
		System.out.print("LabradorDog( bark ): ");
		labradorDog.performBark();

		AkitaLnuDog akitaLnuDog = new AkitaLnuDog();
		System.out.print("AkitaLnuDog( bark ): ");
		akitaLnuDog.performBark();
	}
}
