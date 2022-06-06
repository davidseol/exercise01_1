
// 대입 연산자(=)와 산술 연산자(+,-,*,/)로 구성된 실행문을 대입 연산자 하나로 구성된 실행문으로 변경해보세요.
public class Exercise01_19 {
    public static void main(String[] args) {
        int value = 0;
        value = value + 10; //----------(value += 10;)
        value = value - 10; //----------(value -= 10;)
        value = value * 10; //----------(value *= 10;)
        value = value / 10; //----------(value /= 10;)
    }
}
