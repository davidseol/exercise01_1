public class Exercise01_6 {
    public static void main(String[] args) {
        int a = 1000000;
        int b = 2000000;

        long c = (long)a * b;
        System.out.println(c);
    }
}

// int타입과 int타입의 연산결과는 int타입이므로 변수 a,b중에 형 변환 해야함