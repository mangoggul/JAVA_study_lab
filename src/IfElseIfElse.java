public class IfElseIfElse {

    public static void main(String[] args) {
        // 조건문 예제
        int score = 85;

        if (score >= 90) {
            System.out.println("A학점");
        } else if (score >= 80) {
            System.out.println("B학점");
        } else {
            System.out.println("C학점");
        }

        // 반복문 예제 (for문)
        for (int i = 0; i < 5; i++) {
            System.out.println("for문 실행: " + i); //자바는 문자열과 숫자를 자동으로 형변환하여 연결해 줍니다
        }

        // 반복문 예제 (while문)
        int i = 0;
        while (i < 5) {
            System.out.println("while문 실행: " + i);
            i++;
        }
    }
}
