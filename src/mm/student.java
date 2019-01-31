package mm;

public class student {
	int ModelYear;
	String ModelName;
	public student(int i ,String n) {
		ModelYear=i;
		ModelName= n;
	}
	void display() {
		System.out.println(ModelYear+"   "+ModelName);
	}
}
