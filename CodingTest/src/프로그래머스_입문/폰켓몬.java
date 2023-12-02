package 프로그래머스_입문;

import java.util.HashSet;

public class 폰켓몬 {

	public static void main(String[] args) {
		Solution3 s = new Solution3();
		int[] nums = {3,1,2,3};
		int result = s.solution(nums);
		System.out.println(result);
	}
}

class Solution3 {
		 public int solution(int[] nums) {
		        HashSet<Integer> set = new HashSet<Integer>();
		        for(int i = 0; i < nums.length; i++) {
		            if(!set.contains(nums[i])) set.add(nums[i]);
		        }
		        if (set.size() > nums.length/2) {
		        	return nums.length/2;
				}
		        	return set.size();
		    }
}
