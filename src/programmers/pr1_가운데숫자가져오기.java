package programmers;

public class pr1_가운데숫자가져오기 {
	public static String solution(String s) {
        String answer = "";
        
        int a = s.length()/2;
        
        if ( s.length() % 2 == 0){
            answer = s.substring(a-1,a+1);
        }else{
            answer = s.substring(a,a+1);
        }
        return answer;
    }
    
    public static void main (String[] args){
        String a = "abcde";
       System.out.println( solution(a));
        
        String b = "qwer";
        System.out.println( solution(b));
    }
}
