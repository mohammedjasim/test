package mm;



class Animal {
	public void say() {
		System.out.println("How are you?");
	}
}
class Dog extends Animal {
	public void say() {
		super.say();
		System.out.println("I am Dog");
		System.out.println("========");
	}
}
class Cat extends Animal {
	public void say() {
		super.say();
		System.out.println("I am Cat");
		System.out.println("========");
	}
}
public class Exam_08 {
	public static void main(String[] ar) {
		Animal a[] = new Animal[3];
		a[0] = new Cat();
		a[1] = new Cat();
		a[2] = new Dog();

		for (Animal animal : a) {
			animal.say();
		}
		
//		Animal c1 = new Cat();
//		Animal c2 = new Cat();
//		Animal d1 = new Dog();
//		Cat c1 = new Cat();
//		Cat c2 = new Cat();
//		Dog d1 = new Dog();
		
////		JJ jp = new JJ();
//		Animal gp = new Dog();
////		jp.aaa();
//		gp.Say();
	}
}
