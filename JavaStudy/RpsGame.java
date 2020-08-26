

import java.util.Scanner;
import java.util.Random;

public class RpsGame
{

	RpsGame[] = rps;		// 가위바위보를 1,2,3으로 넣을 배열
	int nansu;
	

	// ① set 메소드 : 난수생성범위 및 생성된 난수를 rps[i] 배열방에 넣을 수 있도록 세팅
	public void set()
	{
		
		Scanner sc = new Scanner(System.in);

		// 사용자로부터 1~3사이의 난수만 생성받도록 반복문 구성

		do
		{
			System.out.print("1:가위, 2:바위, 3:보 중 입력(1~3) : ");
			nansu = sc.nextInt();
		}
		while (nansu<1 || nansu>3);


		// 1~3사이의 입력값이 난수생성 범위로 설정됐으므로,
		// 해당범위에서 난수를 생성시켜주면서 배열을 생성, 이때, 난수는 0부터시작하니 생성된 난수에+1

		// 난수 Random 인스턴스 생성
		Random rd = new Random();

		rps = new RpsGame[nansu];


		for (int i=0; i<3; i++)	
		{
			rps[i] = rd.nextInt(3)+1;
			//-- 1(0+1)~3(2+1) 
		}														// 난수에 따른 배열방 세팅완료

	}


	// ② input 메소드 : 세팅된 배열방에 유저의 난수, 컴퓨터의 자동생성 난수 각각 넣기
	public void input()
	{
			
		Scanner sc = new Scanner(System.in);
		
		String[] wp = {"가위", "바위", "보"};
		
	}




	
		

}