package 상속;

public class FlyCar사용 extends FlyCar {

	public static void main(String[] args) {
		FlyCar fly = new FlyCar();
		fly.color = "red";
		fly.fly = true;
		
		fly.run();
		fly.fly();

	}

}
