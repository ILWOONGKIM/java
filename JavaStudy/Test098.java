/*====================
 ■■■ 배열 ■■■
 - 배열과 난수 처리
=====================*/

// ※ Random 클래스 활용

// 사용자로부터 임의의 정수를 입력받아
// 그 정수의 갯수만큼 난수(1~100)를 발생시켜서 배열에 담아내고
// 배열에 담겨있는 데이터들 중
// 가장 큰 값과 가장 작은 값을 선택하여
// 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// 발생시킨 난수의 갯수 입력 : 6
// (53 17 6 9 4 5 → 무작위로 발생한 정수 형태의 난수들..)
// (int[] arr = {53, 17, 69, 45, 10, 55}; → 배열에 담아내기)
// 가장 큰 값 : 69, 가장 작은 값 : 10
// 계속하려면 아무 키나 누르세요..

import java.util.Scanner;
import java.util.Random;

public class Test098
{
	public static void main(String[] args)
	{
//○		Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		// 안내 메세지 출력
		System.out.print("발생시킨 난수의 갯수 입력 : ");
		int size = sc.nextInt(); 

		// size 변수에 담아낸 수 만큼의 배열방 만들기
		// (배열 선언 및 메모리 할당
		int[] arr = new int[size];

		// 무작위 숫자(난수)를 발생시키기 위해서는
		// 난수 발생 전용 객체가 필요하다.
		// → 『java.util.Random』 , Random 인스턴스 생성
		Random rd = new Random();

		// ※ Random 클래스의 『nextInt(int n)』 메소드
		//-- 0 ~ 매개변수로 넘겨받은 정수 n-1 까지의 수 중
		//	 무작위 정수(난수) 1개를 발생시킨다.

		// 테스트(확인)
		//System.out.print("발생한 난수 : " + rd.nextInt(10));
									 //Random의 nextInt, 0~9까지의 무작위 정수 "1개" 반환
		

		// 배열 구성(초기화) → 발생한 난수로 배열방에 값을 담아내기, size 개수만큼 난수발생시켜야함
		for (int i=0; i<size; i++)	// 0부터 시작했으므로 size는 들어가면 안됨.
		{
			//arr[i] = rd.nextInt(100);
			//-- 0~99 무작위 정수 한개 발생, for문으로 size개 만큼 반복 입력받음

			arr[i] = rd.nextInt(100)+1;
			//-- 1~100 무작위 정수 한개 발생, for문으로 size개 만큼 반복 입력받음
		}

		// 테스트(확인) → 구성된 배열의 전체 요소 출력
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	

		/*
		발생시킨 난수의 갯수 입력 : 10
		발생한 난수 : 2 1  26  72  54  49  56  51  79  29  19
		계속하려면 아무 키나 누르십시오 . . .
		*/

// ○		가장 큰 값, 가장 작은 값 확인
		int max, min;		//--최대값, 최소값
		max=min=arr[0];		// max = min = 2,  min에 2을 담고 그다음 max에도 담음
		
		for (int i=1; i<arr.length; i++)		// i=1부터 하는이유, 같은숫자 (2와 2)는 비교할 필요없어서
		{
			if (max<arr[i])
				max=arr[i];		// max=79;
			if (min>arr[i])
				min=arr[i];		// min=2가 담긴상태
		}


		// 최종 결과 출력
		System.out.printf("가장 큰 값 : %d, 가장 작은 값 : %d\n", max, min);


	}
}

// 실행 결과
/*

발생시킨 난수의 갯수 입력 : 10
99 5 86 39 78 73 89 27 91 79
가장 큰 값 : 99, 가장 작은 값 : 5
계속하려면 아무 키나 누르십시오 . . .


*/