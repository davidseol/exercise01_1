
// 다음 코드는 사다리꼴 넓이를 구하는 코드입니다. 정확히 소수 자릿수가 나올 수 있도록 ____에 알맞은 코드를 작성하세요.

public class Exercise01_14 {
    public static void main(String[] args) {
        int lengthTop = 5;
        int lengthBottom = 10;
        int height = 7;
        double area = (lengthTop + lengthBottom) * height / 2.0;
        System.out.println(area);
    }
}

// 2.0으로 나누어야 double 값으로 소수점 자릿수까지 나오게 할수있다.