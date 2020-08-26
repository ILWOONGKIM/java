/*====================
 ■■■ 배열 ■■■
 - 배열의 배열(2차원 배열)
=====================*/

// ○과제
// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.
// 단, 배열을 구성하는 구문과 출력하는 구문은
// 별도로 작성할 수 있도록 한다.

// 실행 예)
/*							i		j			i		j								i j
	A				→		0		0			0		0		i가 짝수			A - 0 0
	C  B			←		1		01			1		01		i가 홀수			B - 1 1 , C - 1 0 
	D  E  F			→		2		012							i가 짝수			D - 2 0 , E - 2 1, F - 2 2
	J  I  H  G		←		3		0123						i가 홀수			G - 3 3 , H - 3 2, I - 3 1  G - 3 0
	K  L  M  N  O	→		4		01234						i가 짝수			K - 4 0 , L - 4 1, M - 4 2, N - 4 3, O - 4 4
																					
계속하려면 아무 키나 누르세요..
*/

// B C -> 1,0 , 1,1 를		->		 C B 인 1,1 , 1,0으로		
// D E F -> arr[i][j] =n 그대로
// G H I J -> 3,0 ,~ 3,3 을 ->		J I H G 인 3,3 3,2 3,1 3,0으로
// K L M N O 그대로

// 즉, i가 홀수 일 때
//	A(0,0)에서는 B(1,1), F(2,2)에서는 G(3,3)으로 바뀌고나서 바로 반복문을 break한다.


public class Test097
{
	public static void main(String[] args)
	{

		// 배열 선언 및 메모리 할당

		int[][] arr = new int[5][5];

		int n=65;		// 'A'의 아스키코드값을 int형 n으로 초기화하여 시작


		// for문을 이용하여 배열 구조화

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<=i; j++)
			{
				if (i%2==0)
					arr[i][j] = n++;
				
				if (i%2!=0)
					arr[i][i-j] = n++;
				
			}	

		}

		// 출력 

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%3c", (char)arr[i][j]);	// 자료형 변환으로 아스키코드값을 변환하여 출력
			}
			System.out.println();
		}


	}
}
	

// 실행 결과
/*
  A
  C  B
  D  E  F
  J  I  H  G
  K  L  M  N  O
계속하려면 아무 키나 누르십시오 . . .
*/