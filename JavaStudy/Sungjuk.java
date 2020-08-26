/*======================================
	■■■ 클래스와 인스턴스 ■■■
	- 클래스와 인스턴스 활용
======================================*/

// 2. Sungjuk 클래스
//	  → 인원 수를 입력받아, 입력받은 인원 수 만큼
//		 이름, 국어점수, 영어점수, 수학점수를 입력받고
//		 총점과 평균을 산출하는 클래스로 설계할 것
//		 ＊속성 : 인원수, ※Record 형태의 배열(Record[] arr;)
//		 ＊기능 : 인원수 입력, 상세 데이터 입력, 총점 및 평균 연산, 결과 출력

import java.util.Scanner;

public class Sungjuk
{
	// 주요 속성 구성(=주요 변수 선언)
	int inwon;		//-- 인원 수
	Record[] rec;	//-- Record 배열(학생 한 명 당 Record 배열 방 한 개 활용)
					//-- Record를 기반으로 생성된 객체만 담아낼 수 있는 배열

	/*
	메소드()
	{
		Record[] rec;
		FruitSeller fs = new FruitSeller();
		arr[0] = fs; -> 불가
	}
	*/

	// 주요 메소드 구성(기능 구성 → 메소드 정의)
	// ① 인원 수 입력
	public void set()			// 사용자한테 인원수에대한 안내문을 안내하고 그에따라 입력받은 값을 직접 처리하는것이고,
								// 넘겨주는 매개변수(리턴)가 없으므로 void를 쓴다.(다른 메소드 거치지 않고 스스로해결가능)
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("인원 수 입력(1~100) : ");
			inwon = sc.nextInt();
		}
		while (inwon<1 || inwon>100);	
//○ 인원 수 입력 받은 상태, 이 인원만큼의 배열을 만들어야


		// Record 클래스를 기반으로 생성된 객체(인스턴스)를 담을 수 있는
		// 배열방을 inwon 만큼 생성한 것이지,
		// "Record 클래스의 인스턴스를 생성한 것은 아니다."
		rec = new Record[inwon];

	}
//○ rec의 배열방을 세팅해놓은 상태, 이제 이 방에 입력받은 것들을 인원수의 크기만큼 배열하여 적재해야함


	// 주요 메소드 구성(기능 구성 → 메소드 정의)
	// ② 상세 데이터 입력 (이름, 국어점수, 영어점수, 수학점수 입력) + 총점 평균 산출
	public void input()
	{
		
		Scanner sc = new Scanner(System.in);
		
		String[] title = {"국어 점수 : ", "영어 점수 : ", "수학 점수 : "};
		
		// 인원 수 만큼 반복 → 인원 수에만큼 만들어진 배열의 길이만큼 반복
		// ※check※ 배열의 타입이 Record인데, 이 배열에 넣으려면 반복문으로 Record 타입의 인스턴스가 생성되면서 rec방에 넣어야한다

		for (int i=0; i<inwon; i++)	// == for(int i=0; i<rec.length; i++)
		{
			// Record 클래스 기반의 인스턴스 생성

			//Record ob = new Record();
			//rec[i] = ob;
			rec[i] = new Record(); // 상동

			//rec[i].name = "홍길동";
			System.out.printf("%d번째 학생의 이름 입력  ", (i+1));
			rec[i].name = sc.next();

			/*
			System.out.printf("국어 점수 : ");
			rec[i].kor = sc.nextInt();
			System.out.printf("영어 점수 : ");
			rec[i].eng = sc.nextInt();
			System.out.printf("수학 점수 : ");
			rec[i].mat = sc.nextInt();
			*/
			// 멤버 변수를 int kor eng mat 으로 만들었으면

			/*
			System.out.printf("국어 점수 : ");
			rec[i].score[0] = sc.nextInt();
			System.out.printf("영어 점수 : ");
			rec[i].score[1] = sc.nextInt();
			System.out.printf("수학 점수 : ");
			rec[i].score[2] = sc.nextInt();
			*/
			// 이걸 반복문으로, for문 중첩

			for (int j=0; j<title.length; j++)
			{
				// 안내 메세지 출력
				System.out.print(title[j]);

				// 사용자가 입력한 데이터를 스코어(score) 배열에 담아내기
				rec[i].score[j] = sc.nextInt(); // score[0] → 국어 점수
												// score[1] → 영어 점수
												// score[2] → 수학 점수
				// 국어, 영어, 수학 점수 데이터를 입력받는 동안

				// 총점 누적하기
				rec[i].tot += rec[i].score[j];		
			}

			// 평균 산출하기
			rec[i].avg = rec[i].tot / 3.0;

		}// end outer-for


	}// end input()


	// 주요 메소드 구성(기능 구성 → 메소드 정의)
	// ③ 결과 출력
	
// 윤홍준 90 80 70 240 xx.xx	2
// 김승범 82 72 62 xxx xx.xx	3
// 이예슬 98 88 78 xxx xx.xx	1
	public void print()
	{
		ranking();

		System.out.println();

		// 출력은 학생 한명당 반복 출력구문을 구성하면됨
		for (int i=0; i<inwon; i++)
		{
			// 이름 출력
			System.out.printf("%5s", rec[i].name);

			// 성적(국어, 영어, 수학) 반복 출력
			for (int j=0; j<3; j++)
			{
				System.out.printf("%4d", rec[i].score[j]);
			}

			// 총점, 평균 출력
			System.out.printf("%5d", rec[i].tot);
			System.out.printf("%6.2f", rec[i].avg);

			// 석차 출력 구문 추가
			System.out.printf("%5d", rec[i].rank);

			System.out.println();
		}
	}

	// 주요 메소드 구성(기능 구성 → 메소드 정의)
	// ④ 석차 산출 메소드
	// -  Record 배열의 rank 속성 초기화를 수행하는 기능 → 반환 자료형 void 
	// -  클래스 내부에서 활용할 메소드로 정의
	// 즉, 외부에 노출할 메소드가 아닌 형태로 정의 → 접근제어 지시자 private
	// → 외부에서 접근(호출) 불가
	
	private void ranking() // private을 쓰는 이유, print 메소드에서 다른 주요변수들이 출력된 것처럼 처리를 할것이고, 
						   // 곧 Test104에서 이 ranking 메소드를 호출할 필요가 없기 때문이다.
	{
		// 1 2 3 4 5 번 학생의 ranking 숫자를 1로 고정시키고,
		// 평균을 기준으로 1 > 2~5 , 2 > 3~5 ... 4 > 5 까지 비교하면서 
		// 낮은쪽의 ranking 숫자를 1씩 증가시킨다.
		
		// 석차를 record 배열에 담아내기
		
		
		int i, j;		// 루프 변수

		// 모든 학생들의 등수(석차, rank)를 1로 초기화
		for (i=0; i<inwon; i++)
			rec[i].rank = 1;
		
		// 등수 산출
		for (i=0; i<inwon-1; i++)				// 비교 기준	0	1	2	3
		{
			for (j=i+1; j<inwon; j++)			// 비교 대상	1234 234 34 4
			{
				// 기준의 평균이 대상의 평균보다 크다면...
				if (rec[i].avg > rec[j].avg)
				{
					// 대상의 rank를 1만큼 증가
					rec[j].rank++;
				}
				// 대상의 평균이 기준의 평균보다 크다면...
				else
				{
					// 기준의 rank를 1만큼 증가
					rec[i].rank++;
				}

			}
		}

	}



}// 끝나면, print 메소드에서 석차 산출 메소드를 호출한다.(구문추가)



