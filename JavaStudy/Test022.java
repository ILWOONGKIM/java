/*==============================================
	■■■ 연산자(Operator) ■■■
	- 비트 단위 연산자
===============================================*/

public class Test022
{
	public static void main(String[] args)
	{
		int a = 13, b = 7;
		int c, d, e;

		c = a & b;	// 비트 AND
		d = a | b;	// 비트 OR
		e = a ^ b;	// 비트 XOR

		System.out.printf("a & b : %d\n", c);
		System.out.printf("a | b : %d\n", d);
		System.out.printf("a ^ b : %d\n", e);

	}
}

/*
& : 둘다 참(1)이어야 1

		 13 → 00001101
		& 7 → 00000111
		---------------
			   00000101  →  5


| : 하나라도 참이면(1) 1


		 13 → 00001101
		| 7 → 00000111
		---------------
			   00001111	 → 15

^ : 달라야지 참(1)

		 13 → 00001101
		^ 7 → 00000111
		---------------
			   00001010  → 10
		
a & b : 5
a | b : 15
a ^ b : 10
계속하려면 아무 키나 누르십시오 . . .

*/