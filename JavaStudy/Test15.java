/*==============================================
	■■■ 자바 기본 프로그래밍 ■■■
	- 자바의 기본 입출력 : printf()
===============================================*/

public class Test15
{
	public static void main(String[] args)
	{
		System.out.print("AAA");
		System.out.print("BBB");
		System.out.print("CCC\n");	//--『\n』개행
		//--==>> AABBCC

		//System.out.print();
		//--==>> 컴파일 에러 발생(매개변수 없음)

		System.out.println();	// 개행

		System.out.printf("12345678901234567890");
		System.out.printf("12345678901234567890\n");	//-- 『\n』개행
		System.out.printf("12345678901234567890%n");	//-- 『%n』개행

		//System.out.printf();	// 컴파일에러 발생(매개변수 없음)

		System.out.printf("%d + %d = %d\n", 10, 20, 30);
		//--==>> 10 + 20 = 30

		System.out.printf("%d\n", 123);
		System.out.printf("%10d\n", 123); // 10칸의 공간 확보후 해당 숫자를 포함하여 오른쪽부터 정렬되어 출력됨
		System.out.printf("%8d\n" , 1234);
		System.out.printf("%010d\n", 123); // %10d는 공백으로 채우는데, %010d는 0으로 공백을 채운다
		//--==>>123
		//				123
		//			1234
		//		 0000000123

		System.out.printf("%d\n", 365);
		//--==>> 365
		//		 365

		System.out.printf("%+d\n", 365);
		System.out.printf("+%d\n", 365);
		//--==>> +365
		//		 +365

		System.out.printf("%d\n", 365);
		System.out.printf("%d\n", -365);
		//--==>> 365
		//		 -365
		
		//System.out.printf("%-d\n", 365);
		//--==>> 에러 발생(런타임 에러)
		System.out.printf("-%d\n", 365);
		//--==>> -365

		System.out.printf("%(d\n", -365);
		System.out.printf("%(d\n", 365);
		//--==>>(365)
		//		365

		//System.out.printf("%d\n", 'A');
		//--==>> 에러 발생(런타임 에러)
		System.out.printf("%c\n", 'A');
		//--==>> A

		//System.out.printf("%c\n", "ABCD");
		//--==>> 에러 발생(런타임 에러)
		System.out.printf("%s\n", "ABCD");
		//--==>> ABCD

		System.out.printf("%h\n", 365); // 16진수로 담김
		//--==>> 16d
		System.out.printf("%o\n", 24); // 8진수
		//--==>> 30


		System.out.printf("%b\n", true);
		System.out.printf("%b\n", false);
		//--==>> true
		//		 false


		System.out.printf("%f\n", 123.23);
		//--==>> 123.230000
		System.out.printf("%.2f\n", 123.23);
		//--==>> 123.23
		System.out.printf("%.2f\n", 123.231);
		//--==>> 123.23
		System.out.printf("%.2f\n", 123.236);
		//--==>> 123.24
		System.out.printf("%8.2f\n", 123.236);
		//--==>>   123.24(앞에 두 칸 남음)
		System.out.printf("%2.2f\n", 123.236);
		//--==>> 123.24(%.2f와 동일)

	}
}

// 실행결과
/*
AAABBBCCC

1234567890123456789012345678901234567890
12345678901234567890
10 + 20 = 30
123
       123
    1234
0000000123
365
+365
+365
365
-365
-365
(365)
365
A
ABCD
16d
30
true
false
123.230000
123.23
123.23
123.24
  123.24
계속하려면 아무 키나 누르십시오 . . .
*/