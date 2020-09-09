package programmers;
//20.09.07
public class pr1_평균값구하기 {
    public double solution(int[] arr) {
        double answer = 0;
        double sum =0; // 굳이 sum을 만들 필요는 없음. answer에 바로 하기.
        
        for(int i =0; i<arr.length; i++)
            sum += arr[i];
        
        answer = sum/arr.length ;
        
        return answer;
    }
}
