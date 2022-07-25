package Java.Programmers;

public class 핸드폰번호가리기 {
    public String solution(String phone_number) {
        String answer = "";

        String open = "";

        for (int i = 0; i < phone_number.length() - 4; i++) {
            answer += "*";
        }

        open = phone_number.substring(phone_number.length() - 4);
        answer += open;
        return answer;
    }
}
