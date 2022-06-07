// for문의 1~100까지의 합 구하기

public class Exercise02_8 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1; i<=100; i++) {
            sum = sum + i;
        }
        System.out.println("1~100의 합:" + sum);
    }
}
