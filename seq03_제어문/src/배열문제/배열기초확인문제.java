package 배열문제;

public class 배열기초확인문제 {

	public static void main(String[] args) {
		int [] name = new int[5];
		//arr, int[5], length ==> 7개
		 System.out.println(name.length);
		  
		  System.out.println(name);
		
		name[0] = 100; 
		  System.out.println(name[0]);
		
	    name[4] = 500;
	    System.out.println( name[4]);
	    
	    name[2] = 200;
	    System.out.println(name[2]);
	    
	    System.out.println("-----------");
	    
	    for (int x : name) {
			System.out.println(x);
		}
	    
	    
	}

}
