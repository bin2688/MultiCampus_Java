package 스태틱;

public class Day {
	public String doing;
	public int time;
	public String location;
	public static int count;
	public static int sum;
	
	//객체 생성시 초기값을 자동으로 넣어주고 싶을 때
	//생성자 메서드
	public Day(String doing, int time, String location) {
		this.doing = doing;
		this.time = time;
		this.location = location;
		count++;
		sum = sum + time;
	}

	//객체 생성 후 값들을 출력하고 싶을 때
	//toString()
	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
	
	
	
	
	
	
	
	
}
