/*====================
 ■■■ 배열 ■■■
 - 배열의 기본적 활용
=====================*/

// ○ 과제
// 사용자로부터 학생 수를 입력받고
// 그 만큼의 점수(정수 형태)를 입력받아
// 전체 학생 점수의 합, 평균, 편차를 구하여
// 결과를 출력하는 프로그램을 구현한다.
// 단, 배열을 활용하여 처리할 수 있도록 한다.

// 실행 예)
// 학생 수 입력 : 5
// 1번 학생의 점수 입력 : 90
// 2번 학생의 점수 입력 : 82
// 3번 학생의 점수 입력 : 64
// 4번 학생의 점수 입력 : 36
// 5번 학생의 점수 입력 : 98

// >> 합 : 370
// >> 평균 : 74.0
// >> 편차
// 90 : -16.0
// 82 : -8.0
// 64 : 10.0
// 36 : 38.0
// 98 : -24.0
// 계속하려면 아무 키나 누르세요...


import java.util.Scanner;

public class Test086
{
	public static void main(String[] args)
	{
		// 인스턴스

		Scanner sc = new Scanner(System.in);
		
		// 입력받을 학생수 변수에 담기

		// n번 학생의 점수 입력
		
		System.out.print("학생 수 입력 : ");

		int st = sc.nextInt();

		int score=0;

		int[] arr = new int[st];


		for (int i=0; i<arr.length; i++)
		{
			System.out.printf("%d번 학생의 점수 입력 : ", i+1);
			arr[i] = sc.nextInt();
		}
		
		System.out.println();


		// 합, 평균, 편차

		
		int sum=0;
		
		for (int i=0; i<arr.length; i++)
		{
			sum += arr[i];

		}
		
		double aver= (double)sum / st;

		System.out.println(">> 합 : " + sum);
		System.out.printf(">> 평균 : %.1f" + aver);
		System.out.println(">> 편차");

		for (int i=0; i<arr.length ; i++)
		{
			System.out.printf("%d : %.1f \n", arr[i], (aver - arr[i]));
		}
		System.out.println();

	}
}

// 실행결과
/*
학생 수 입력 : 5
1번 학생의 점수 입력 : 70
2번 학생의 점수 입력 : 80
3번 학생의 점수 입력 : 50
4번 학생의 점수 입력 : 80
5번 학생의 점수 입력 : 90

>> 합 : 370
>> 평균 : 74.0
>> 편차
70 : 4.0
80 : -6.0
50 : 24.0
80 : -6.0
90 : -16.0

계속하려면 아무 키나 누르십시오 . . .
*/