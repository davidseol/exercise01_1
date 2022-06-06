
// 다음 코드를 실행했을 떄 출력 결과는 무엇입니까?

public class Exercise01_8 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = (++x) + (y--);
        System.out.println(z);
    }
}

// 32. 증감연산자의 후위냐 전위냐 차이인데 z에 담긴 y의 값은 값이 바뀌기전의 값인 20이 찍히므로 32가 나온다