/*==============================================
	■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	- 조건문(분기문)
	- switch문 실습
===============================================*/

// 1부터 3까지의 정수 중 하나를 사용자로부터 입력받아
// 입력받은 정수만큼의 별문자(★)가 출력되는 프로그램을 작성한다.
// 단, 두 가지 방법으로 구현할 수 있도록 한다.

// 1. switch 문의 일반 모델을 사용하여 문제를 해결한다.
// 2. switch 문의 기본 모델을 사용하되,
//   『break』를 딱 한 번만 사용하여 문제를 해결한다.

// 실행 예)
// 임의의 정수 입력(1~3) : 3
// ★★★
// 계속하려면 아무 키나 누르세요. . .

// 임의의 정수 입력(1~3) : 1
// ★
// 계속하려면 아무 키나 누르세요. . .

// 임의의 정수 입력(1~3) : 7
// 입력 오류
// 계속하려면 아무 키나 누르세요. . .


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test040
{ 
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n;

		System.out.print("임의의 정수 입력(1~3) : ");
		n = Integer.parseInt(br.readLine());

//*sol 1(일반 모델)

		switch (n)
		{
		case 1 : System.out.printf("★\n"); 
				break;
		case 2 : System.out.printf("★★\n");
				break;
		case 3 : System.out.printf("★★★\n");
				break;
		default: System.out.printf("입력 오류\n");
		}
	}
}


/*sol 2(기본 모델)

		switch (n)
		{
		case 3 : 
			System.out.printf("★");
		case 2 : 
			System.out.printf("★");
		case 1 :
			System.out.printf("★\");
				break;
		default: 
			System.out.printf("입력 오류\n");
		}
		System.out.println();
	}
*/

/*
		switch(avg/10)
		{
			case 10 : case 9 : 	grade='A';	break;
			case 8 : grade='B';	break;
			case 7 : grade='C';	break;
			case 6 : grade='D';	break;
			case 0 : grade='F';	break;
			//default: grade ='F'; break;

		}
		


		switch(avg)
		{
			case 100 : case 99: case 98...case 90
				grade='A';	break;
			case 89 : 
				grade='B';	break;
						:
			case 0 :	grade='F';	break;
			
		}
		
		switch(avg)
		{
			case 100 : grade='A';	break;
			case 99 :  grade='A';	break;
						:
			case 0 :	grade='F';	break;
			
		}
*/