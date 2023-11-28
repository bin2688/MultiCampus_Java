package 선형구조_큐;

import java.util.LinkedList;

public class 큐확인문제 {

	public static void main(String[] args) {
		String[] wait = {"홍길동","김길동","송길동","정길동","박길동","이길동"};
		LinkedList<String> queue = new LinkedList<String>();
		for (int i = 0; i < wait.length; i++) {
			queue.add(wait[i]);
		}	
		System.out.println("전체 대기인원 >>" + queue);
		System.out.println("햄버거 먹은사람 >> " + queue.remove());
		System.out.println("햄버거 먹은사람 >> " + queue.remove());
		System.out.println("남은인원 >> " + queue);
		queue.add(queue.remove());
		System.out.println("웨이팅 밀림 >> " + queue);
		System.out.println("햄버거 먹은사람 >> " +queue.remove());
		queue.add(queue.remove());
		System.out.println("웨이팅 밀림 >> " + queue);
		System.out.println("대기인원" + queue.size() + "명");

	}

}
