package Java.Programmers;

public class x만큼간격이있는n개의숫자 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        // 해당 배열에 인덱스마다 x+(x*인덱스)을 해준다.
        for(long i = 0; i < n; i++){
            answer[(int) i] = x + (x * i);
        }
        return answer;
    }
}
