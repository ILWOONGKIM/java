/*======================================
	■■■ 클래스와 인스턴스 ■■■
	- 클래스와 인스턴스 활용
======================================*/

// 학생별로 국어 점수, 영어 점수, 수학 점수를 입력받아
// 총점, 평균을 계산하는 프로그램을 구현한다.
// 단, 클래스의 개념을 활용하여 작성할 수 있도록 한다.
// 또한, 이 과정에서 배열을 적극적으로 활용할 수 있도록 한다.


// 프로그램을 구성하는 클래스
// 1. Record 클래스
//	  → 속성만 존재하는 클래스로 설계 할 것(속성 값들만 취할 수 있도록)

// 2. Sungjuk 클래스
//	  → 인원 수를 입력받아, 입력받은 인원 수 만큼
//		 이름, 국어점수, 영어점수, 수학점수를 입력받고
//		 총점과 평균을 산출하는 클래스로 설계할 것
//		 ＊속성 : 인원수, ※Record 형태의 배열(Record[] arr;)
//		 ＊기능 : 인원수 입력, 상세 데이터 입력, 총점 및 평균 연산, 결과 출력

// 3. Test104 클래스
//	  → main() 메소드가 존재하는 외부 클래스로 설계할 것


// 실행 예)
// 인원 수 입력(1~100) : 102
// 인원 수 입력(1~100) : -10
// 인원 수 입력(1~100) : 3

// 1번째 학생의 이름 입력 : 윤홍준
// 국어 점수 : 90
// 영어 점수 : 80
// 수학 점수 : 70

// 2번째 학생의 이름 입력 : 김승범
// 국어 점수 : 82
// 영어 점수 : 72
// 수학 점수 : 62

// 3번째 학생의 이름 입력 : 이예슬
// 국어 점수 : 98
// 영어 점수 : 88
// 수학 점수 : 78

// 윤홍준 90 80 70 240 xx.xx	2
// 김승범 82 72 62 xxx xx.xx	3
// 이예슬 98 88 78 xxx xx.xx	1

// 계속하려면 아무키나 누르세요...

import java.util.Scanner;

public class Test104
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		// 사용자가 입력하는 학생 수를 담아둘 변수
		int memCount = 0;
	
			do
			{
			System.out.print("인원 수 입력(1~100) : ");
				memCount = sc.nextInt();
			}
			while (memCount<1 || memCount>100);

									// 인원수 입력 완료(memCount에)


		// 입력받은 인원수별로 이름, 국어점수 영어점수 수학점수 입력값이 들어갈 배열 선언 및 길이 설정
		String[] names = new String[memCount];
		int[] score = new int[memCount];
	
		// 이름, 국어점수, 영어점수, 수학점수를 입력받기
		for (int i=0; i<memCount; i++)
		{
			System.out.printf("%d번째 학생의 이름 입력 : ", memCount);
			names = sc.next();
	
			System.out.printf("\n국어 점수 : %d\n", score);
			score = sc.nextInt();
			System.out.printf("영어 점수 : %d\n", score);
			score = sc.nextInt();
			System.out.printf("수학 점수 : %d\n", score);
			score = sc.nextInt();
		}

	}

}

/*
	// 배열 선언 및 메모리 할당
	int[] arr = int[st];

	// 해당 범위가 나올때까지 출력

	int n=0;

	for (int i=0; i<arr.length; i++)
	{
		System.out.printf("인원 수 입력(1~100) : %d", st);
		arr[i] = nextInt();
	}

	// 점수를 받을 변수 선언 및 초기화
	int score = 0;

}

public class Test104
{
	public static void main(String[] args)
	{
		
	}
}
*/