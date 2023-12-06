package 선형구조_큐;

import java.util.LinkedList;

public class 큐카드문제 {

	public static void main(String[] args) {
		int x = 6;
		LinkedList<Integer> queue = new LinkedList<>();
		for (int i = 1; i <= x; i++) {
			queue.add(i);
		}
		System.out.println(queue);
		for (int i = 0; i <= queue.size(); i++) {
			System.out.println(queue.remove()); //버리고		
			queue.add(queue.remove()); //하나 뒤로 붙이고
			System.out.println(queue);
		}
		System.out.println(queue.remove());
		System.out.println(queue);
	}

}
