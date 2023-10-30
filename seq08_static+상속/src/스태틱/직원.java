package 스태틱;

public class 직원 {
	public String name;
	public int age;
	public String sex;
	public static int count;
	public static int sum;

	
	public 직원(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		count++;
		sum = sum + age;
	}

	@Override
	public String toString() {
		return "직원 [이름=" + name + ", 나이=" + age + ", 성 =" + sex + "]";
	}
	
	
	
	
	
	
	
}




