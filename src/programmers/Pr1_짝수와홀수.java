package programmers;

public class Pr1_짝수와홀수 {
	//20.08.25
	class Solution {
	    public String solution(int num) {
	        String answer = "";
	        if (num%2==0) {
	            answer ="Even";
	        } else{
	            answer = "Odd";
	        }
	        return answer;
	    }
	}
}
