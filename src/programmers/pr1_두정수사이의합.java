package programmers;

public class pr1_두정수사이의합 {
	    public static long solution(int a, int b) {
	        long answer = 0;
	       
	        if (a>b) {
	        	int c = a;
	        	a = b;
	        	b = c;
	        }
	        
	        for(int i = a; i<=b; i++) {
	        	answer += i;
	        }
	        
	        return answer;
	        
	    }
	    public static void main(String[] args) {
			System.out.println(solution(5,3));
			System.out.println(solution(3,3));
			System.out.println(solution(3,5));
		}

}
