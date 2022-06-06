
// 다음 코드를 실행하면 출력 결과로 "10%입니다."를 기대했는데 "10%가 아닙니다."가 출력 되었습니다.
// 어디서 잘못 작성된 것일까요?

public class Exercise01_13 {
    public static void main(String[] args) {
        float var1 = 10f;
        float var2 = var1 / 100;
        System.out.println(var2);
        if(var2 == 0.1) {
            System.out.println("10%입니다.");
        } else {
            System.out.println("10%가 아닙니다.");
        }
    }
}
// var2 는 float 값이므로 0.1이 같아지려면 0.1f 를 입력해야 된다.