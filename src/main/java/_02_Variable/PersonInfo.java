package _02_Variable;

public class PersonInfo {
    public static void main(String[] args) {
        // 실습
        /*
            아래의 데이터를 적절한 자료형과 변수명으로 저장하고,
            각 변수들을 출력해 주세요.
            1. 이름, 2. 출생년도, 3. 키(소수점포함),
            4. 혈액형, 5. 학생여부(true/false)
         */
        String myName = "이정민";
        int birthYear = 2003;
        double height = 158.7;
        char bloodType = 'O';
        boolean isStudent = true;

        // 정보출력
        System.out.println("이름: " + myName);
        System.out.println("출생년도: " + birthYear);
        System.out.println("키: " + height);
        System.out.println("혈액형: " + bloodType);
        System.out.println("학생여부: " + isStudent);
    }
}
