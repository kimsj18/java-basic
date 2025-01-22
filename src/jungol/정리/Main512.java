package jungol;

public class Main512 {
    public static void main(String[] args) {
        // 변수 선언
        double weight = 49;  // 추의 무게
        double gravityRatio = 0.268300;  // 중력의 비율

        // 곱셈 계산
        double result = weight * gravityRatio;

        // 출력 (소수점 이하 6자리까지 출력)
        System.out.printf("%.0f * %.6f = %.6f\n", weight, gravityRatio, result);
    }
}

