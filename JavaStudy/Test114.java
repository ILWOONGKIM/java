/*==================================
  ■■■ 정렬(Sort) 알고리즘 ■■■
  - 향상된 버블 정렬(Bubble Sort)
===================================*/

// 사용자로부터 여러 학생의 성적 데이터를 입력받아
// 점수가 높은 순으로 등수를 부여하여 결과를 출력하는 프로그램을 구현한다.
// 단, 배열과 정렬 알고리즘을 활용하여 작성할 수 있도록 한다.

// 실행 예)
// 인원 수 입력 : 5
// 이름 점수 입력(1) : 조인경 90
// 이름 점수 입력(2) : 박다빈 80
// 이름 점수 입력(3) : 허수민 85
// 이름 점수 입력(4) : 박해진 75
// 이름 점수 입력(5) : 강정우 95

/*
---------------
1등 강정우 95
2등 조인경 90
3등 허수민 85
4등 박다빈 80
5등 박해진 75
---------------
계속하려면 아무키나 누르세요...
*/
//※ 2등이 2명인 경우, 그 다음 등수는 3등으로 처리



// 인원 수 입력받은 수만큼 배열 구성

// 등수나 점수대로 정렬됨

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class Test114
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		Scanner sc = new Scanner(System.in);

		// 사용자로부터 인원 수 받기
		System.out.print("인원 수 입력 : ");
		n = Integer.parseInt(br.readLine());

		// 받은 인원 수 만큼 배열하면서, 이름점수 입력받기
		// 배열 선언 및 길이 구조화, 입력받을 이름, 점수를 담을 변수 설정
		int[] arr = new int[n];
		String name;
		int score;

		for (int i=0; i<arr.length; i++)
		{
			// 먼저 이름, 점수 공백구분하여 입력받고
			System.out.printf("이름 점수 입력(%d) : ", n);
			
			// 이름은 name, 점수는 score로 '각각' 담고
			name = sc.next();
			score = sc.nextInt();
		
			// 점수에 따라서 다시 배열한다(뒤에 등수 정렬하기위함)
			int[] Score = new int[score]; 

		}
		
		// 담은 점수에따른 배열(int[] Score)을
		// 해당 배열을 점수대로 등수를 먼저 부여
		String rank;

		for (; ; )
		{
		}

		// 부여된 등수에 따라 등수대로 정렬(Sort)

	}
}