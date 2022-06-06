
/* 키보드로 두 실수를 다음과 같이 입력받습니다(scanner 이용) 입력된 첫번째 수에 두번째수를 나눈 결과를
"결과:값"으로 출력하되, 두번쨰 수에 0 또는 0.0이 입력되었을 경우 "결과:무한대"가 출력되도록 코드를 작성해보세요
(scanner의 next()사용)
 */
import java.util.Scanner;

public class Exercise01_15 {
    public static void main(String[] args) {
        Scanner sch = new Scanner(System.in);

        System.out.println("첫번쨰수: ");
        double num1 = Double.parseDouble(sch.nextLine());

        System.out.println("두번째수: ");
        double num2 = Double.parseDouble(sch.nextLine());

        if(num2 != 0.0) {
            System.out.println("결과: " + (num1 / num2));
        } else {
            System.out.println("결과: 무한대");
        }
    }
}