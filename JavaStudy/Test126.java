/*===========================
  ■■■ 클래스 고급 ■■■
  - 인터페이스(Interface) 
===========================*/

// ○ 실습 문제
// 성적 처리 프로그램을 구현한다.
// 단, 인터페이스를 활용할 수 있또록 한다.

// 실행 예)
// 인원 수 입력(1~10) : 2
// 1번째 학생의 학번 이름 입력(공백 구분) : 2012170 안혜지
// 국어 영어 수학 점수 입력	  (공백 구분) : 90 100 85
// 2번째 학생의 학번 이름 입력(공백 구분) : 2012112 윤홍준
// 국어 영어 수학 점수 입력	  (공백 구분) : 85 70 65

// 2012170 안혜지	90   100   85   275   91
//					수    수   우
// 2012112 윤홍준   85    70   65   220   73
//					우	  미   양

// 계속하려면 아무 키나 누르세요...


// input -> 인원수 -> 인원수 별로 정보입력받기 -> (학번 nextint, 이름 name) -> (점수 score)
// 

import java.util.Scanner;


// 속성만 존재하는 클래스	→	자료형 활용
class Record
{
	String hak, name;		//-- 학번, 이름
	int kor, eng, mat;		//-- 국어, 영어, 수학 점수
	int tot, avg;			//-- 총점, 평균(편의상 정수 처리)
}

// 인터페이스
interface Sungjuk
{
	public void set();		//-- 인원 수 구성
	public void input();	//-- 상세 데이터 입력
	public void print();	//-- 결과 출력
}

// 문제 해결 과정에서 설계해야 할 클래스
class SungjukImpl implements Sungjuk
{
	Record[] arr;

	int n;
	Scanner sc = new Scanner(System.in);

	/*
	public void set();		//-- 인원 수 구성
	public void input();	//-- 상세 데이터 입력
	public void print();	//-- 결과 출력
	*/


	@Override
	public void set()
	{
		
		System.out.print("인원 수 입력(1~10) : ");
		n = sc.nextInt();
		arr = new Record[n];	// 객체 배열선언


	}
	// 클래스(객체)배열은 배열의 변수선언과 그 변수의 초기화를 따로해야한다.
	// 클래스 배열시 각 방에 참조변수들을 쓸 수 있도록 방을 하나씩 만드는것이고,
	// 변수의 초기화에서 인스턴스들이 생성되기 때문이다.


	@Override
	public void input()
	{
		// 입력받은 인원수(1~10 중) n까지의 학생 학번,이름을 받아야한다.
		
		if (n<0||n>10)
			return;

		for (int j=0; j<arr.length; j++)
		{
			arr[j] = new Record();
			System.out.printf("%d번째 학생의 학번 이름 입력(공백 구분) : ", j+1);
			arr[j].hak = sc.next();
			arr[j].name = sc.next();
			System.out.printf("국어 영어 수학 점수 입력	(공백 구분) : ", arr[j].kor, arr[j].eng, arr[j].mat);
			arr[j].kor = sc.nextInt();
			arr[j].eng = sc.nextInt();
			arr[j].mat = sc.nextInt();
			arr[j].tot = arr[j].kor+arr[j].eng+arr[j].mat;
			arr[j].avg = arr[j].tot/3;

		}

		// int형 배열 score에 5개의 방을 만들고
		// 0,1,2 배열은 국어, 영어, 수학 점수, 3배열은 총점, 4배열은 평균을 담는다


	
	}// input method ends

	@Override
	public void print()
	{
				// 2012170 안혜지	90   100   85   275   91
				//					수    수   우
		String grade1, grade2, grade3;

		for (int j=0; j<arr.length; j++)
		{
		
			System.out.printf("%s %s\t %d\t %d\t %d\t %d\t %d\t\n", arr[j].hak, arr[j].name, arr[j].kor, arr[j].eng, arr[j].mat, arr[j].tot, arr[j].avg);
			grade1 = grade(arr[j].kor);
			grade2 = grade(arr[j].eng);
			grade3 = grade(arr[j].mat);
			System.out.printf("                 %s\t %s\t %s\t \t \t \n", grade1,grade2,grade3);
		}
		
	}

	public String grade(int score)
	{
		String grade = "";

		switch (score/10)
		{
		case 10 : case 9 : grade = "수"; break;
		case 8 : grade = "우"; break;
		case 7 : grade = "미"; break;
		case 6 : grade = "양"; break;
		default : grade = "가";
		
		}
		
		return grade;

	}
	

}

// main() 메소드를 포함하고 있는 외부 클래스(동일 패키지)
public class Test126
{
	public static void main(String[] args)
	{
		Sungjuk ob = new SungjukImpl();

		// 문제 해결 과정에서 작성해야 할 ob 구성

		ob.set();
		ob.input();
		ob.print();

	}
}

//실행 결과
/*
인원 수 입력(1~10) : 2
1번째 학생의 학번 이름 입력(공백 구분) : 2020sist 김일웅
국어 영어 수학 점수 입력        (공백 구분) : 100 90 90
2번째 학생의 학번 이름 입력(공백 구분) : 2020sist 김승범
국어 영어 수학 점수 입력        (공백 구분) : 10 20 30
2020sist 김일웅  100     90      90      280     93
                 수      수      수
2020sist 김승범  10      20      30      60      20
                 가      가      가
계속하려면 아무 키나 누르십시오 . . .
*/