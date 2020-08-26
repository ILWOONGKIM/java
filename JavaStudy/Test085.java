/*====================
 ■■■ 배열 ■■■
 - 배열의 기본적 활용
=====================*/

// ○과제
// 사용자로부터 임의의 정수를 임의의 갯수만큼 입력받아
// 입력받은 수 중에서 가장 큰 수를 출력하는 프로그램을 작성한다.
// 단, 배열을 활용하여 구현할 수 있도록 한다.

// 실행 예)
// 입력할 데이터의 갯수		: 10
// 데이터 입력(공백 구분)	: 74 65 92 13 2 86 7 12 25 64 50
// >> 가장 큰 수 → 92
// 계속하려면 아무 키나 누르세요...



import java.util.Scanner;
import java.io.IOException;

public class Test085
{
	public static void main(String[] args) throws IOException
	{
		// Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		// 입력할 데이터의 갯수를 담을 변수
		int count = 0;
		
		System.out.print("입력할 데이터의 갯수 : ");
		count = sc.nextInt();
		
		System.out.print("데이터 입력(공백 구분) : ");


		// 배열 선언

		int[] arr = new int[count];

		for (int i=0; i<arr.length ; i++)
		{
			arr[i] = sc.nextInt();

		}
		
		// 가장 큰 수
		
		int max=arr[0];

		for (int i=0; i<arr.length; i++)
		{
			if (arr[i]>max)
			{
				max = arr[i];
			}
			
		}

		System.out.printf("가장 큰 수 → %d\n", max);

	}
}

// 실행 결과
/*
입력할 데이터의 갯수 : 4
데이터 입력(공백 구분) : 30 70 50 60
가장 큰 수 → 70
계속하려면 아무 키나 누르십시오 . . .
*/