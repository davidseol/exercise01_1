
/* 534자루의 연필을 30명의 학생들에게 똑같은 개수로 나누어 줄 떄 1인당 몇 개를 가질 수 있고,
 몇 개가 남는지를 구하는 코드입니다. 1----- ~ 2------에 들어갈 알맞은 코드를 작성하세요.
 */

public class Exercise01_10 {
    public static void main(String[] args) {
        int pencils = 534;
        int students = 30;

        int pencilsPerStudent = 534 / 30;
        System.out.println(pencilsPerStudent);

        int pencilsLeft = 534 % 30;
        System.out.println(pencilsLeft);
    }
}
