/* 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오)
byte b = 10;
char ch = 'A';
int i = 100;
long l = 1000L;
 */



/*
1. b = (byte)i;
2. ch = (char)b;
3. short s = (short)ch;
4. float f = (float)l;
5. i = (int)ch;
 */

// 4,5번이다. 이유는 큰건 작은걸 담을때 형변환 필요없음.