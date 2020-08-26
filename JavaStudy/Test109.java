/*========================================
  ■■■ 주민등록번호 유효성 검사 ■■■
=========================================*/

/*
○ 주민등록번호 검증 공식

	① 마지막 자리를 제외한 앞자리 수를 규칙에 맞게 곱한다.

		123456-1234567 (주민번호)
		****** ******  ----------- 각 자릿수에 곱하기
		234567 892345  (각 자리에 곱해질 수)

	② 규칙에 맞게 곱셈 연산을 수행한 결과를 모두 더한다.

	ex) 7 5 0 6 1 5 - 1 8 6 2 1 3 3
	    * * * * * *   * * * * * * 
		2 3 4 5 6 7   8 9 2 3 4 5
	--------------------------------
	→  14 + 15 + 0 + 30 + 6 + 35 + 8 + 72 + 12 + 6 + 4 + 15

		== 217

	③ 더해진 결과값을 11로 나누어 『나머지』를 취한다.

		   19
		-------
	11 | 217
		  11
		  ---
		  107
		   99
		   --
		    8  → 나머지

	④ 11에서 나머지(8)을 뺀 결과 값을 구한다.
	
		11 - 8 = 3
	
		※ ③의 처리 과정에서 나머지가 0인 경우 → 11-0 → 11 → 1
									   1인 경우 → 11-1	→ 10 → 0
		이를 다시 10으로 나누어 나머지를 취한다.

	⑤  ④의 연산 결과가 주민번호를 구성하는 마지막 숫자와
		일치하는지의 여부를 확인한다.

		일치 → 유효한 주민번호
		불일치 → 잘못된 주민번호	
*/

// 실행 예)
// 주민번호 입력(xxxxxx-xxxxxxx) : 123456-12345678	→	입력 갯수 초과
// >> 입력 오류
// 계속하려면 아무 키나 누르세요..

// 주민번호 입력(xxxxxx-xxxxxxx) : 123456-123456	→	입력 갯수 미달
// >> 입력 오류
// 계속하려면 아무 키나 누르세요..

// 주민번호 입력(xxxxxx-xxxxxxx) : 931214-1009822	→	유효한 주민번호
// >> 정확한 주민번호
// 계속하려면 아무 키나 누르세요..

// 주민번호 입력(xxxxxx-xxxxxxx) : 931214-1009823	→	유효하지 않은 주민번호
// >> 잘못된 주민번호
// 계속하려면 아무 키나 누르세요..


// ※ 추가 팁

// 배열.length			→	배열의 길이(배열방의 갯수) 반환
// 문자열.length()		→	문자열의 길이 반환 메소드
// 문자열.substring()	→	문자열 추출 메소드

/*

		// 주민번호 숫자열인 문자열로 입력받고
		// 그 문자열이 먼저 14개가 안되는 경우 프린트 출력해주고 변수에 담아준다

		// 비로소 받은 14개의 숫자형태의 문자열을 String 배열에 넣음
		// String 배열에 넣은 주민번호를 하나하나 숫자로 바꿔주고
		// 유효성 검증을 위해서 다른 int형 배열(곱해줄 숫자를 배열에 넣음)

*/

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Test109
{
	public static void main(String[] args) throws IOException
	{
		// BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력받는 주민번호(문자열 형태)
		String str;		// -이 문자열의 자릿수는 확보를 해야하는상황이므로 String

		// 주민번호의 각 자릿수에 곱하게 될 수 → 배열 형태로 구성

		//		 ex) 7  5  0  6  1  5  -  1  8  6  2  1  3  3
		//		     *  *  *  *  *  *     *  *  *  *  *  * 
		int[] chk = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5};
		//							  ---check

		// 곱셈 연산 후 누적합 (각 곱셈 결과를 더해 나가라...)
		int tot = 0;		// 누적합이므로 0으로 초기화



		System.out.print("주민번호 입력(xxxxxx-xxxxxxx) : ");
		//str = Integer.parseInt(br.readLine());
		str = br.readLine();

		if (str.length() != 14)			// 입력 오류 시, 다시입력받는게 아니라 프로그램을 끝낼 것이기때문에 do while (Ⅹ)
		{
			System.out.print(">> 입력 오류~!!!");
			return;		// 프로그램 끝내기(main() 메소드 종료)
		}

		// 테스트(확인)
		//System.out.println(">> 자릿수 적합~!!!");

		// ex)750615-1252085
		for (int i=0; i<13; i++)	//	주민번호 각 자릿수에 곱하는 연산
		{
			if (i==6)
			{
				//skip(1)
				continue; // "-" 일때(i==6)는 continue (뒷부분(line 134) 무시하고 진행해라)
			}
			//chk[i] * 주민번호 특정 자릿수 추출(숫자모양을 가진 문자열)
			tot += chk[i] * Integer.parseInt(str.substring(i, (i+1)));		// 한자리씩만 추출
			
			//chk[0] * Integer.parseInt(str.substring(0,0+1))
			//2 * Integer.parseInt("7")
			//2 * 7
			//  :		
			
		}

		//---------- 여기까지 수행하면 ①과 ②를 모두 끝낸 상황이며
		//			 규칙에 맞게 곱셈 연산을 수행한 결과를 모두 더한 값은
		//			 변수 tot에 담겨있는 상황이 된다.

		// ③ ④ 관련 연산 수행
		int su = 11 - tot % 11;

		// 테스트(확인)
		//System.out.println(su);
		
		// 최종 결과 출력 이전에... 추가 연산 필요~!!
		// su에 대한 연산 결과가 두 자리로 나올 경우
		// 주민번호 마지막 자리의 숫자와 비교할 수 없는 상황
		su = su % 10;		// su %= 10;


		if(su == Integer.parseInt(str.substring(13)))
		{
			System.out.println(">> 정확한 주민번호~!!!");
		}
		else
		{
			System.out.println(">> 잘못된 주민번호~!!!");
		}

	}
}



/*

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Test109
{
	public static void main(String[] args) throws IOException
	{
		// 1. 주민번호 입력받기("xxxxxx-xxxxxxx") -> 14개 문자열
		// 2. 14개의 문자열을 초과, 미달 하는경우를 문자열.length() 메소드, while문으로 반복구문 구성
		// 3. 유효성 검증을 위한 연산하기(주민번호 문자열을 추출하여 배열에 담기)
		// 4. 입력갯수 오류와 유효할때와 유효하지 않을때를 나눠서 함께 출력

		int num;
		String id, subid;
		String[] idCode = String int[14];

		// 1. 주민번호 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);

		System.out.print("주민번호 입력(xxxxxx-xxxxxxx) : ");
		id = sc.next();

		do
		{
				System.out.print(id.substring(0));
				System.out.print(">> 입력 오류\n");
			
		}
		while (id.length()!=14);



		for (int i=0; i<id.length(); i++)
		{
			String = 
		}

		
		//System.out.print(id.substring(0));

		



		// 2. -포함 14개 문자열 제대로 받았으면 주민번호 유효성 검증
		// 입력받은 문자열 추출, 배열에 담기
		
		// 2-1. 먼저 String id를 숫자로 읽어들이고, int형 배열에 담는다
		
		//num = Integer.parseInt(br.readLine());
		

		

	}
}
*/
/*
		// 테스트

		String strTemp = "조인경";
		System.out.println(strTemp.length());
		//--==>> 3

		strTemp = "동해물과 백두산이";
		System.out.println(strTemp.length());
		//--==>> 9

		strTemp = "study-hard";
		System.out.println(strTemp.length());
		//--==>> 10

		strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(3, 5));
		//--==>> DE
		// ABCDEFGHIJKLMNOPQRSTUVWXYZ
		// 0123456789..
		//    DE 
		
		strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(13, 17));
		//--==>> NOPQ
		// 13번째부터 (17-1)번째 까지

		//int[] arr = {1,2,3};
		//System.out.println(arr[5]);
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
        //at Test109.main(Test109.java:108)
		// 에러 발생 → ArrayIndexOutOfBoundsException

		//strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		//System.out.println(strTemp.substring(13, 57));
		// 에러 발생 → StringIndexOutOfBoundsException

		strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(15));
		//--==>> PQRSTUVWXYZ
		// 하나만쓰면 시작점부터 끝까지
		*/