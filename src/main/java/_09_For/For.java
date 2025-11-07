package _09_For;

public class For {
    public static void main(String[] args) {
        /*
        반복문 - for
        for(변수선언(초기식); 조건식; 증감식) {
            반복될 코드작성
        }
        초기식 -> (조건식 -> 코드실행 -> 증감식) * n -> 조건식 결과가 false면 for문 탈출
         */
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World!");
            System.out.println(i); // 0 ~ 9까지
        }

        int a = 0; // 외부변수를 반복문에서 사용할 경우
        for (; a < 5; a++) {
            System.out.println(a); // 0 ~ 4까지
        }
        System.out.println(a); // a = 5(증감식 -> 조건검사하고 탈출)

        // i는 1 ~ 10범위를 가진다, 짝수만 출력
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) { // 짝수 조건일때만
                System.out.println(i);
            }
        }

        // 1~100까지 덧셈
        int sum = 0; // 누적합
        for (int i = 1; i <= 100; i++) {
            sum += i; // sum = sum + i;
        }
        System.out.println(sum);

        // 1~100 숫자들 중 짝수합, 홀수합
        int evenSum = 0; // 짝수합
        int oddSum = 0; // 홀수합

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) { // 짝수일 때
                evenSum += i;
            } else {
                oddSum += i;
            }
        }
        System.out.println(evenSum);
        System.out.println(oddSum);

        // 1~100 숫자 중 3의 배수와 7의 배수의 개수를 구해주세요
        int count3 = 0; // 3의 배수 개수
        int count7 = 0; // 7의 배수 개수

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                count3++;
            }
            if (i % 7 == 0) {
                count7++;
            }
        }
        System.out.println(count3);
        System.out.println(count7);
    }
}
