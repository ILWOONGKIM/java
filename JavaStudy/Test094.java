/*====================
 ■■■ 배열 ■■■
 - 배열의 배열(2차원 배열)
=====================*/

// ○과제
// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열(5*5)을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.
// 단, 배열을 구성하는 구문과 출력하는 구문은
// 별도로 작성할 수 있도록 한다.

// 실행 예)
/*
	E	J	O	T	Y
	D	I	H	S	X
	C	H	M	R	W
	B	G	L	Q	V
	A	F	K	P	U
계속하려면 아무 키나 누르세요..
*/

// i=4,j=0 → i=3, j=0 →...→ i=0, j=0 → i=0, j=1
// i=4 -> j=0 , i=3 -> j=1, i=2 -> j=2, i=1 -> j=3, i=0 -> j=4

							
/*						
B	4,1 ->	F	3,0
C	4,2	->	K	2,0
D	4,3 ->	P	1,0
E	4,4	->	U	0,0

H	3,2 ->	L	2,1
I	3,3 ->	Q	1,1
J	3,4	->	V	0,1

*/

public class Test094
{
	public static void main(String[] args)
	{
		int[][] arr = new int[5][5];

		int n = 65;
		
		for (int i=4; i>=0; i--)
		{
			for (int j=0; j<=4; j++)
			{
				
				arr[4-j][4-i] = n;		//	i -> 4-j,	j -> 4-i
				n++;
			}
			
		}

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%3c", (char)arr[i][j]);
			}
			System.out.println();
		}
	}
}
// 실행 결과
/*
  E  J  O  T  Y
  D  I  N  S  X
  C  H  M  R  W
  B  G  L  Q  V
  A  F  K  P  U
계속하려면 아무 키나 누르십시오 . . .
*/