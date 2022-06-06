
// 다음 코드를 실행하면 출력 결과로 5를 기대했는데 4가 출력되었습니다. 어디에서 잘못 작성 된 것일까요?
public class Exercise01_11 {
    public static void main(String[] args) {
        int var1 = 5;
        int var2 = 2;
        double var3 = var1 / var2;
        int var4 = (int) (var3 * var2);
        System.out.println(var4);
    }
}

// var1/var2 가 int값으로 출력된것이라 실수형으로 바꿔줘야 2가 아닌 2.5의 값으로 var3에 저장될수 있다.