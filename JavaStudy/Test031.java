/*==============================================
	■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	- 조건문(분기문)
	- if문, if-else문
===============================================*/

// 사용자로부터 이름, 국어점수, 영어점수, 수학점수를 입력받아
// 다음과 같은 형태로 출력하는 프로그램을 작성한다.
// 이 때, 등급은 평균 점수를 기준으로 처리한다.

// 90점 ~ 100점 : A			80점 ~ 90점 : B
// 70점 ~ 79점 : C			60점 ~ 69점 : D
// 60점 미만 : F

// 입력받는 과정은 BufferedReader 를 활용할 수 있도록 하며,
// printf() 메소드를 통해 출력할 수 있도록 구현한다.

// 실행 예)
// 이름 입력 : 김일웅
// 국어 점수 : 90
// 영어 점수 : 80
// 수학 점수 : 70

// >> 당신의 이름은 김일웅입니다.
// >> 국어 점수는 90,
// >> 영어 점수는 80,
// >> 수학 점수는 70,
// >> 총점은 240, 평균은 80입니다.
// >> 등급은 B 입니다.
// 계속하려면 아무 키나 누르세요 . . .


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



public class Test031
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name;
		int kor, eng, mat;


		// 연산 및 처리
		// ① 사용자에게 안내 메세지 출력
		System.out.print("이름 입력 : ");
		
		// ② 이름
		name = br.readLine();

		// 사용자의 입력값을 정수 형태로 변환한 후 해당 변수에 담아내기
		System.out.print("국어 점수 입력 : ");
		kor = Integer.parseInt(br.readLine());
		
		System.out.print("영어 점수 입력 : ");
		eng = Integer.parseInt(br.readLine());

		System.out.print("수학 점수 입력 : ");
		mat = Integer.parseInt(br.readLine());



		// 변수 추가 선언
		int tot = kor + eng + mat;
		double avg = tot / 3.0;
		char grade;				// sol1. 특정한 값을 채워줘야함(if else 구문에서 특정조건을 만족하지 못했을떄 출력에 대한 자바의 우려, + F 구문 제외)
								// sol2. else if가 아닌 else

		if (avg >= 90)
		{
			grade = 'A';
		}
		else if (avg>=80)		// 이미 위에 90보다 크거나 같다라는 조건이 아니어서 else if로 내려왔으므로 aver<90 뺌
		{
			grade = 'B';
		}
		else if (avg>=70)
		{
			grade = 'C';
		}
		else if (avg>=60)
		{
			grade = 'D';
		}
		else
		{
			grade = 'F';
		}

		// 최종 결과 출력

		System.out.println();
		System.out.printf(">> 당신의 이름은 %s입니다.\n", name);
		System.out.printf(">> 국어 점수는 %d,\n", kor);
		System.out.printf(">> 영어 점수는 %d,\n", eng);
		System.out.printf(">> 수학 점수는 %d,\n", mat);
		System.out.printf(">> 총점은 %d, 평균은 %.2f입니다.\n", tot, avg);
		System.out.printf(">> 등급은 %c 입니다.\n", grade);

	}
}




/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



public class Test031
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name;
		int kor, eng, mat, tot, score;
		double aver;
		char grade;

		// 사용자 메세지
	     
		System.out.print("이름 입력 : ");

		// 변수 받기
		kor = Integer.parseInt(br.readLine());
		eng = Integer.parseInt(br.readLine());
		tot = Integer.parseInt(br.readLine());
		score = Integer.parseInt(br.readLine());

		tot = kor + eng + mat;
		aver = tot / 3;
		grade = (char)score;


		System.out.printf(">> 당신의 이름은 %s입니다.\n", name);
		System.out.printf(">> 국어 점수는 %d,\n", kor);
		System.out.printf(">> 영어 점수는 %d,\n", eng);
		System.out.printf(">> 수학 점수는 %d,\n", mat);
		System.out.printf(">> 총점은 %d, 평균은 %f입니다.", tot, aver);


// 90점 ~ 100점 : A			80점 ~ 90점 : B
// 70점 ~ 79점 : C			60점 ~ 69점 : D
// 60점 미만 : F

// 입력받는 과정은 BufferedReader 를 활용할 수 있도록 하며,
// printf() 메소드를 통해 출력할 수 있도록 구현한다.

// 실행 예)
// 이름 입력 : 김일웅
// 국어 점수 : 90
// 영어 점수 : 80
// 수학 점수 : 70

// >> 당신의 이름은 김일웅입니다.
// >> 국어 점수는 90,
// >> 영어 점수는 80,
// >> 수학 점수는 70,
// >> 총점은 240, 평균은 80입니다.
// >> 등급은 B 입니다.


		if(aver>=90 && aver<=100)
		{
			System.out.printf(">> 등급은 %c 입니다.\n", ,);
		}

		if(aver>=80 && aver<=90)
		{
			System.out.printf(">> 등급은 %c 입니다.\n", ,);
		}

		if(aver>=70 && aver<=80)
		{
			System.out.printf(">> 등급은 %c 입니다.\n", ,);
		}

		if(aver>=60 && aver<=70)
		{
			System.out.printf(">> 등급은 %c 입니다.\n", ,);
		}

		if(aver>=60 && aver<=70)
		{
			System.out.printf(">> 등급은 %c 입니다.\n", ,);

		else(aver<60)
			
			System.out.printf(">> 등급은 %c 입니다.\n, 


		}
		// 출력

		}
	}
}
*/