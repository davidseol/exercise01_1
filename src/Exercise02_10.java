// while문으로 1부터100까지 합

public class Exercise02_10 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while(i<=100) {
            sum += i;
            i++;
        }
        System.out.println("1~" + (i-1) + " 합: " + sum);
        }
    }
