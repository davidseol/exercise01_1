/* while문과 Scanner를 이용해서 키보드로 입력된 데이터로 예금,출금,조회,종료 기능을 제공하는 코드를 작성해보세요.
다음과 같은 실행가 나와야합니다(Scanner의 nextLine() 사용.)
 */
import java.util.Scanner;

public class Exercise02_18 {
    public static void main(String[] args) {
        boolean run = true;
        int balance = 0;
        Scanner scanner = new Scanner(System.in);

        while(run) {
            System.out.println("------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("------------------------");
            System.out.print("선택> ");

            int menuNum = Integer.parseInt(scanner.nextLine());

            switch(menuNum) {
                case 1:
                    System.out.print("예금액> ");
                    balance += Integer.parseInt(scanner.nextLine());
                    break;
                case 2:
                    System.out.print("출금액> ");
                    balance -= Integer.parseInt(scanner.nextLine());
                    break;
                case 3:
                    System.out.print("잔고> ");
                    System.out.println(balance);
                    break;
                case 4:
                    run = false;
                    break;
                }
            System.out.println();
            }
        System.out.println("프로그램 종료");
    }
}
