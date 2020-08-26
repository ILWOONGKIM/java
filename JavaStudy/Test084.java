/*====================
 ■■■ 배열 ■■■
 - 배열의 기본적 활용
=====================*/

// 사용자로부터 처음 입력받은 인원 수 만큼의
// 학생 이름과 전화번호를 입력받고
// 입력받은 내용을 전체 출력하는 프로그램을 구현한다.
// 단, 배열을 활용하여 처리할 수 있도록 한다.

// 실행 에)
// 입력 처리할 학생 수 입력(명, 1~10) : 27
// 입력 처리할 학생 수 입력(명, 1~10) : 3
// 이름 전화번호 입력[1](공백 구분) : 주재완 010-1111-2222
// 이름 전화번호 입력[2](공백 구분) : 정의진 010-2222-3333
// 이름 전화번호 입력[3](공백 구분) : 안혜지 010-3333-4444

// ----------------
// 전체 학생 수 : 3명
// -----------------
// 이름 전화번호
// 주재완 010-1111-2222
// 정의진 010-2222-3333
// 안혜지 010-3333-4444
// -----------------
// 계속하려면 아무키나 누르세요...



// 입력받은 인원수 -> 배열 방의 개수 -> buffered integer
// 이름 전화번호[1] -> scanner, 배열의 수를 받아서 배열의 수만큼 출력
// 

import java.util.Scanner;
import java.io.IOException;

public class Test084
{
	public static void main(String[] args) throws IOException
	{
		// Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		// 사용자가 입력하는 학생 수를 담아둘 변수
		int memCount = 0;

		do
		{
			System.out.print("입력 처리할 학생 수 입력(명, 1~10) : ");
			memCount = sc.nextInt();
		}
		while (memCount<1 || memCount>10);											// 여기까지, 유효한 학생수를 입력받은 상태

		
		// 테스트(확인)
		System.out.println("사용자가 입력한 인원 수 : " + memCount);		// 해당 인원수만큼, 이름과 전화번호를 입력받고
																			// 해당 배열에 각각 맞게 담아야한다.


		// 이름 저장 배열 구성
		String[] names = new String[memCount];


		// 전화번호 저장 배열 구성
		String[] tels = new String[memCount];
		//String[] tels = new String[names.length]; // 같은 말


		// for(int i=0; i<tels.length; i++)
		// for(int i=0; i<names.length; i++)

		for (int i=0; i<memCount; i++)
		{
			System.out.printf("이름 전화번호 입력[%d](공백 구분) : ", (i+1));

			names[i] = sc.next();
			tels[i] = sc.next();
		}
		
																					// 여기까지, 이름 전화번호를 입력받은 상태

		// 결과 출력(이름,전화번호)

		System.out.println("-----------------");
		System.out.printf("전체 학생 수 : %d\n", memCount);
		System.out.println("-----------------");
		System.out.println("이름 전화번호");

		for (int i=0; i<memCount; i++)
		{
			System.out.printf("%4s %13s\n", names[i], tels[i]);
		}

		System.out.println("-----------------");



		/*
		// 배열 선언 및 생성, 초기화

		int n;							// 입력받을 입력처리할 학생수
	
		Scanner sc = new Scanner(System.in);

		do
		{ 
			System.out.print("입력 처리할 학생 수 입력(명, 1~10) : ");
			n = sc.nextInt();
		}
		while (n>10||n<1);
		

		String[] arr = new String[3];			// 배열


		// 이름, 폰번호 받기
		
		String name, phone;
		

		for (int i=0; i<n; i++)
		{

		// 반복적으로 이름, 폰번호 받기

			System.out.printf("이름 전화번호 입력[%d](공백 구분) : ", i+1);
			name = sc.next();
			phone = sc.next();

			arr[i] = name + " " + phone;
		}

		// 출력구문

		System.out.println("-----------------");
		System.out.printf("전체 학생 수 : %d\n", n);
		System.out.println("-----------------");
		System.out.println("이름 전화번호");

		for (int j=0; j<arr.length; j++)
		{
			System.out.println(arr[j] + " ");
		}
		System.out.println("-----------------");
		*/
;

// ----------------
// 전체 학생 수 : 3명
// -----------------
// 이름 전화번호
// 주재완 010-1111-2222
// 정의진 010-2222-3333
// 안혜지 010-3333-4444
// -----------------
// 계속하려면 아무키나 누르세요...

		

/*
		arr[0] = "주재완 010-1111-2222";
		arr[1] = "정의진 010-2222-3333";
		arr[2] = "안혜지 010-3333-4444";
*/
		

	}
}
