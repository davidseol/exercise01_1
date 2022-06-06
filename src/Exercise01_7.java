

// 다음 코드에서 컴파일 에러가 발생하는 위치와 이유를 설명해보세요.

class Exercise01_7 {
    public static void main(String[] args) {
        byte b = 5;
        b = (byte)-b;       //원래는 b = -b; 였음.
        int result = 10 / b;
        System.out.println(result);
    }
}

// 부호연산자로 컴파일 되면 byte 값이 int로 바뀌는데 큰값을 작은값에 담을려면 강제적으로 형번환 해줘야함.