/*==============================================
	■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	- 반복문(while) 실습
===============================================*/

// 사용자로부터 임의의 두 정수를 입력받아
// 작은 수 부터 큰 수 까지의 합을 구하여
// 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// 첫 번째 정수 입력 : 10
// 두 번째 정수 입력 : 20
// >> 10 ~ 20까지의 합 : xxxx
// 계속하려면 아무 키나 누르세요...

// 첫 번째 정수 입력 : 10
// 두 번째 정수 입력 : 2
// >> 2 ~ 10까지의 합 : 54
// 계속하려면 아무 키나 누르세요...


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test051
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 주요 변수 선언

		int n;					//--루프 변수로 활용할 변수
		int su1, su2;			//--첫 번째, 두 번째 입력하는 정수를 담아낼 변수
		int result=0;			//--누적합 담아낼 변수
		

		// 연산 및 처리
		System.out.print("첫 번째 정수 입력 : ");
		su1 = Integer.parseInt(br. readLine());

		System.out.print("두 번째 정수 입력 : ");
		su2 = Integer.parseInt(br. readLine());


		// 입력받은 두 수의 크기 비교 및 자리 바꿈
		// 즉, su1이 su2 보다 큰 경우 두 수의 자리를 바꿀 수 있도록 처리

		if (su1 > su2)
		{
			// 자리 바꿈
			su1=su1^su2;
			su2=su2^su1;
			su1=su1^su2;
		}

		// 반복 연산 수행
		// 반복 연산을 수행하기 전에
		// 작은 수를 따로 저장하여 루프 변수로 활용한다.
		// (이유는, 결과를 출력해 주는 과정에서 작은 수(su1)가 필요한데,
		// '직접' 이 수를 증가시켜 나갈 경우, 최종 결과 출력이 불가능하기 때문)
		n = su1;

		while (n <= su2)
		{
			result += n;
			n++;
		}
		
		// 결과 출력
		System.out.printf(">> %d ~ %d 까지의 합 : %d\n", su1, su2, result);






/*나의 풀이(오답원인 > 루프변수 미설정)

		int a=0, b=0, sumA=0, sumB=0, n=0;

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br. readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br. readLine());


		if (a>b)
		{
			n=b;
			while (a>=n)
				{
					sumB += n;			// sumB = b+(b+1)+...+a
					n++;
				}

		System.out.printf(">> %d ~ %d까지의 합 : %d\n", b, a, sumB);

		}

		else if(a<b)
		{
			n=a;
			while (b>=n)
				{
					sumA += n;			// a+(a+1)+...+a
					n++;
				}
		

		System.out.printf(">> %d ~ %d까지의 합 : %d\n", a, b, sumA);

		}
*/

	}
}


// 코딩전
// 1. 변수 2. 사용자 메세지 설정 및 변수담기(integer.parseint(br.readLine()) 
// 3-1. while 문 안에서 작은수부터 큰수까지의 합 구현(a. 반복범위(조건), 증감문)
// 3-2. if 문안에서 ... (ㄱ.a가 b보다 크다면 b부터 a까지의 합), (ㄴ.b가 a보다 크다면 a부터 b까지의 합)
// 4. 출력