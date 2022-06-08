// while문과 Math.random() 메소드를 이용해서 2개의 주사위 던졌을떄 나오는 눈을 (눈1,눈2)형태로 출력하고
// 눈의 합이 5가 아니면 계속 자사위를 던지고 눈의 합이 5이면 실행을 멈추는 코드 작성하시오.

public class Exercise02_15 {
    public static void main(String[] args) {
        while(true) {
            int num1 = (int) (Math.random() * 6) + 1;
            int num2 = (int) (Math.random() * 6) + 1;

            System.out.println("(" + num1 + "," + num2 + ")");

            if((num1 + num2) == 5) {
                break;
            }

        }
    }
}
