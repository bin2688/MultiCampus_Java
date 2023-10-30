package 스태틱;

public class 딸 {
	public String name;
	public char gender;
	public static int wallet = 10000;
	public static int count;
	
	
	public void tv보다() {
		System.out.println("티비를 본다.");
	}

	public 딸(String name, char gender) {
		this.name = name;
		this.gender = gender;
		count++;
		wallet = wallet - 1000;
		
	}

	@Override
	public String toString() {
		return "딸 [이름=" + name + ", 성별=" + gender + "]";
	}
	
	
}
