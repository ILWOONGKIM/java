/*====================
 ■■■ 배열 ■■■
 - 배열의 기본적 활용
=====================*/

// 『char』 자료형의 배열을 만들어
// 그 배열의 각 방에 알파벳 대문자를 채우고
// 채워진 그 배열의 전체 요소를 출력하는 프로그램을 구현한다.
// 단, 채우는 구문과 출력하는 구문은 따로 분리하여 처리한다.

// 실행 예)
// A B C D E F G .. W X Y Z
// 계속하려면 아무 키나 누르세요...

public class Test083
{
	public static void main(String[] args)
	{
		// 방법 ①
		/*
		char[] arr1;
		arr = new char[26];
		arr1[0] = 'A'
			:
		arr1[25] = 'Z'
		*/

		/*// 방법 ②
		char[] arr = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		*/
	
		// 방법 ③
		char[] arr = new char[26];
		for (int i=0, ch=65; i<arr.length; i++, ch++)
			arr[i] = (char)ch;

		// 배열 요소 전체 출력
		for (int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");

		System.out.println();

/*
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
계속하려면 아무 키나 누르십시오 . . .
*/


		/*
		char[] arr = new char[26];

		char alpa = 'A';

		for (int i=0; i<arr.length; i++)
		{
			arr[i] = alpa++;
		}
		
		for (int j=0; j<arr.length; j++)
		{
			System.out.print(arr[j]+" ");
		}

		System.out.println();
		*/


		/*
		char[] arr = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

		// A부터 Z까지 => 아스키코드 65부터 90까지 => 26개
		

		for (int i=0; i<26; i++)
		{
			System.out.print(arr[i] + " ");
		}

		System.out.println();
		*/

	}
}
