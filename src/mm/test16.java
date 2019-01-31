package mm;

public class test16 {
	public static void main(String[] args) {
		int x = 5;
		x = 23;
		test16 t = new test16();// OBJECT
		t.method1();// CALL Method1
	}

	static void sideeffect() {
		int a = 0;
		++a;
	}

	void method1() {
		int x = 10, y = 10, z = 10;
		System.out.println(x);
	}

}
