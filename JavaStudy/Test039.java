/*==============================================
	■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	- 조건문(분기문)
	- switch문
===============================================*/

/*
○ 다중 선택문이라 하며, switch 문 다음의 수식 값에 따라
	실행 순서를 여러 방향으로 분기할 때 사용하는 문장이다.
○ 형식 및 구조
   switch(수식)
   {
	   case 상수1 : 문장1; [break;]		// []는 생략가능함을 나타냄
	   case 상수2 : 문장2; [break;]

	   [default : 문장n+1; [break;]]
    }

	switch 문의 『수식』과 case의 『상수』는
	byte, short, int, long 형이어야 한다.

	case 문 뒤에 『break;』가 없는 형태인 경우
	다음 case 문장을 계속해서 수행하게 된다. → 기본 모델
*/

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test039
{ 
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name;
		int kor, eng, mat, avg;
		char grade;

		System.out.print("이름 입력 : ");
		name = br.readLine();
		System.out.print("국어점수 입력 : ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("영어점수 입력 : ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("수학점수 입력 : ");
		mat = Integer.parseInt(br.readLine());

		avg = (kor+eng+mat) / 3;
		grade = 'F';

		switch(avg/10)
		{
			case 10 : case 9 : 	grade='A';	break;
			case 8 : grade='B';	break;
			case 7 : grade='C';	break;
			case 6 : grade='D';	break;
			case 0 : grade='F';	break;
			//default: grade ='F'; break;

		}
		

		/*
		switch(avg)
		{
			case 100 : case 99: case 98...case 90
				grade='A';	break;
			case 89 : 
				grade='B';	break;
						:
			case 0 :	grade='F';	break;
			
		}
		
		*/

		/*
		switch(avg)
		{
			case 100 : grade='A';	break;
			case 99 :  grade='A';	break;
						:
			case 0 :	grade='F';	break;
			
		}
		*/
/*
		if (avg>=90)		
			grade = 'A';
		else if (avg>=80)
			grade = 'B';
		else if (avg>=70)
			grade = 'C';
		else if (avg>=60)
			grade = 'D';
		else
			grade = 'F';
*/
		System.out.println();
		System.out.printf(">> 당신의 이름은 %s입니다.\n", name);
		System.out.printf(">> 국어 점수는 %d,\n", kor);
		System.out.printf(">> 영어 점수는 %d,\n", eng);
		System.out.printf(">> 수학 점수는 %d,\n", mat);
		System.out.printf(">> 총점은 %d, 평균은 %d입니다.\n", (kor+eng+mat), avg);
		System.out.printf(">> 등급은 %c 입니다.\n", grade);

	}
}
