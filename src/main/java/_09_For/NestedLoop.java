package _09_For;

public class NestedLoop {
    public static void main(String[] args) {
        // 2중 for문
        for (int day = 1; day <= 7; day++) {
            System.out.println(day + "일 살았음");
        } // for문 전체를 일주일로 치환해서 생각할 수 있다.
        // 한달 -> 일주일을 4번 반복하면 된다.
        for (int week = 1; week <= 4; week++) {
            System.out.println(week + "주 시작!");
            for (int day = 1; day <= 7; day++) {
                System.out.println("\t" + day + "일 살았음");
            }
            System.out.println(week + "주 끝!");
        }

        // 구구단 출력해 주세요!
        /*
        2단 시작!
            2 x 1 = 2
            2 x 2 = 4
            ...
            2 x 9 = 18
         2단 끝!
         */

        for (int number = 2; number <= 9; number++) {
            System.out.println(number + "단 시작!");
            for (int times = 1; times <= 9; times++) {
                int multiplication = number * times;
                System.out.println("\t" + number + " x " + times + " = " + multiplication);
            }
            System.out.println(number + "단 끝!");
        }
    }
}
