package mm;

public class m23 {
	int x, y, a, b, c;

	m23() {
		this.x = 10;
		this.y = 20;
		a = 100;
		b = 200;
		c = 300;
		this.display();
	}

	m23(int x) {
		this();
		this.x = x;
		this.display();
		
	}

	m23(int x, int y) {
		this(x);
		this.y = y;
		
	}

	public void display() {
		System.out.println("x = " + this.x);
		System.out.println("y = " + this.y);
	}

}
