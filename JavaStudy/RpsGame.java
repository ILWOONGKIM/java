

import java.util.Scanner;
import java.util.Random;

public class RpsGame
{

	RpsGame[] = rps;		// ������������ 1,2,3���� ���� �迭
	int nansu;
	

	// �� set �޼ҵ� : ������������ �� ������ ������ rps[i] �迭�濡 ���� �� �ֵ��� ����
	public void set()
	{
		
		Scanner sc = new Scanner(System.in);

		// ����ڷκ��� 1~3������ ������ �����޵��� �ݺ��� ����

		do
		{
			System.out.print("1:����, 2:����, 3:�� �� �Է�(1~3) : ");
			nansu = sc.nextInt();
		}
		while (nansu<1 || nansu>3);


		// 1~3������ �Է°��� �������� ������ ���������Ƿ�,
		// �ش�������� ������ ���������ָ鼭 �迭�� ����, �̶�, ������ 0���ͽ����ϴ� ������ ������+1

		// ���� Random �ν��Ͻ� ����
		Random rd = new Random();

		rps = new RpsGame[nansu];


		for (int i=0; i<3; i++)	
		{
			rps[i] = rd.nextInt(3)+1;
			//-- 1(0+1)~3(2+1) 
		}														// ������ ���� �迭�� ���ÿϷ�

	}


	// �� input �޼ҵ� : ���õ� �迭�濡 ������ ����, ��ǻ���� �ڵ����� ���� ���� �ֱ�
	public void input()
	{
			
		Scanner sc = new Scanner(System.in);
		
		String[] wp = {"����", "����", "��"};
		
	}




	
		

}