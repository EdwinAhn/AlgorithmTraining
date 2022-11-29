package Java.Programmers;

import java.util.Arrays;
import java.util.HashSet;

public class 폰켓몬 {
    public int solution(int[] nums) {

        int answer = nums.length / 2;

        int[] distArr = Arrays.stream(nums).distinct().toArray();
        if (distArr.length < nums.length / 2)
            answer = distArr.length;
        return answer;


//        HashSet<Integer> hs = new HashSet<>();
//
//            for(int i =0; i<nums.length;i++) {
//                hs.add(nums[i]);
//            }
//
//            if(hs.size()>nums.length/2)
//                return nums.length/2;
//
//            return hs.size();
    }
}
