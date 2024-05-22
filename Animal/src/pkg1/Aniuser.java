package pkg1;

public class Aniuser {
	public static void main(String[] args) {
		Animal elephant = new Elephant();
		Animal tiger = new Tiger();
		Animal dog = new Dog();
		
		elephant.eat();
		elephant.sleep();
		
		tiger.eat();
		tiger.sleep();
		
		dog.eat();
		dog.sleep();
	}
}
