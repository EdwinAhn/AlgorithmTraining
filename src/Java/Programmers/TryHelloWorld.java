package Java.Programmers;

class TryHelloWorld {
    String[] weeks = {
            "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
    int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public String solution(int a, int b) {
        String answer = "";
        int day = 0;
        for (int i = 0; i < (a - 1); i++) {
            day += month[i];
        }
        day += (b - 1);
        day %= 7;
        answer = weeks[day];

        return answer;
    }

    public static void main(String[] args) {
        TryHelloWorld test = new TryHelloWorld();
        int a = 5, b = 24;
        System.out.println(test.solution(a, b));
    }
}
