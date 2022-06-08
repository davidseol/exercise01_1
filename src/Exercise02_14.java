// for문 이용해서 1~100까지의 정수중에 3의 배수의 총합을 구하는 코드 작성.

public class Exercise02_14 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0) {
                continue;
            }
            sum += i;
        }
        System.out.println(sum);
    }
}