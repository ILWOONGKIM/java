/*======================================
	���� Ŭ������ �ν��Ͻ� ����
	- Ŭ������ �ν��Ͻ� Ȱ��
======================================*/

// 1 ~ 3 ������ ������ �߻����Ѽ�
// ����, ����, �� ���� ���α׷��� �����Ѵ�.
// ��, Ŭ������ ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
// ����, �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
// ���������� RpsGame Ŭ������ �ϼ��� �� �ֵ��� �Ѵ�.

// �� ���� ������ �� 1:����, 2:����, 3:��

// ���� ��)
// 1:����, 2:����, 3:�� �� �Է�(1~3) : 4
// 1:����, 2:����, 3:�� �� �Է�(1~3) : -2
// 1:����, 2:����, 3:�� �� �Է�(1~3) : 2

// - ����	: ����
// - ��ǻ��	: ��

// >> �º� ���� ��� : ��ǻ�Ͱ� �̰���ϴ�~!!
// ����Ϸ��� �ƹ�Ű�� ��������...


// 1. Ŭ���� Rpsgame�� ���� 1~3 ������ ���� �߻���Ű��(set �޼ҵ�, 1~3�� �ƴϸ� �ٽ��Է¹޴� do-while�� ����)
// 2. �޼ҵ� set���� �߻��� 1~3�� ������ �����̵Ǹ�, 3���� �迭��(arr)�� ����
// 3. 3���� �迭�濡 ����1 ����2 ��3 ����
// 4. ����� ������������ ����, ��ǻ�Ϳ� ���� 2�����迭(arr[i].player)
// 5. ����� 2�����迭������ ������ ����ڿ��� �Է¹��� ������, ��ǻ�ʹ� �ڵ����� ������ ������ ����

import java.util.Scanner;
import java.util.Random;


class RpsGame
{
	// �� �ֿ� �Ӽ� ����(���� ����)
	private int user;
	private int com;
	//private String resultStr;

	// �� �ֿ� ��� ����(�޼ҵ� ����)
	//	   - ������� ���� ������ �Է¹޴� ����� �޼ҵ�
	public void input()
	{
		runCom();			// ��ǻ�Ͱ� ���� ������

		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("1:����, 2:����, 3:�� �� �Է�(1~3) : ");
			user = sc.nextInt();

		}
		while (user<1 || user>3);
		


	}

	// �� �ֿ� ��� ����(�޼ҵ� ����)
	//	   - ��ǻ���� ���� ������ �Է¹޴� ����� �޼ҵ�

	private void runCom()							// ��ǻ���� ���� �ٲ��� �ʰ��ϱ�����
	{
		Random rd = new Random();
		com = rd.nextInt(3)+1;		//-- ��+1�� : 0 1 2 �� 1 2 3

	}


	// �� �ֿ� ��� ����(�޼ҵ� ����)
	//	   - �߰� ��� ���(������ ���� ���� Ȯ��)

	public void  middleCalc()						// ����ڿ��� �������� �ϱ�����
	{
		String[] str = {"����", "����", "��"};

		System.out.println();
		System.out.println(" - ���� : " + str[user-1]);		// str�迭 �ε����� 0���ͽ����ϹǷ�
		System.out.println(" - ��ǻ�� : " + str[com-1]);
		//-- ��-1�� : str[1] str[2] str[3] �� str[0] str[1] str[2]  

	}// ������� ���θ޼ҵ忡�� "�׽�Ʈ1"


	// �� �ֿ� ��� ����(�޼ҵ� ����)
	//	   - �ºο� ���� ����

	public String resultCalc()
	{
		String result = "���º� ��Ȳ�Դϴ�~!!!";
		
		// ( ����=="����" && ��ǻ��=="��") || ( ����=="����" && ��ǻ��=="����") || ( ����=="��" && ��ǻ��=="����")
		if ( (user==1 && com==3) || ( user==2 && com==1) || ( user==3 && com==2) ) 	// ����� �¸��� ��Ȳ
		{
			result = "����� �¸��߽��ϴ�~!!!";
		}

		// ( ����=="����" && ��ǻ��=="����") || ( ����=="����" && ��ǻ��=="��") || ( ����=="��" && ��ǻ��=="����")
		else if ((user==1 && com==2) || ( user==2 && com==3) || ( user==3 && com==1) )	// ��ǻ�Ͱ� �¸��� ��Ȳ
		{
			result = "��ǻ�Ͱ� �¸��߽��ϴ�~!!!";
		}
		
		// ���׽�Ʈ2��

		return result;
	}

	public void print(String str)
	{
		System.out.println();
		System.out.printf("\n>> �º� ���� ��� : %s\n", str);
	}


}


public class Test105
{
	public static void main(String[] args)
	{
		RpsGame ob = new RpsGame();

		ob.input();
		ob.middleCalc();

		// ���׽�Ʈ1�� 
		/*
		1:����, 2:����, 3:�� �� �Է�(1~3) : 1

		 - ���� : ����
		 - ��ǻ�� : ����
		*/

		String result = ob.resultCalc();

//		System.out.println(
//		System.out.println(

		// ���׽�Ʈ2��

		ob.print(result);

	}
}

// ������
/*

1:����, 2:����, 3:�� �� �Է�(1~3) : 2

 - ���� : ����
 - ��ǻ�� : ����


>> �º� ���� ��� : ����� �¸��߽��ϴ�~!!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


*/


/*

import java.util.Scanner;
import java.util.Random;

class User
{
	String[] UserResult = {"����", "����", "��"};
	int UserNum;
	String user;
		

void input

{
	String[] UserResult = {"����", "����", "��"};
	int UserNum;
	String user;
		
	Scanner sc = new Scanner(System.in);

	do
	{	
		System.out.print("1:����, 2:����, 3:�� �� �Է�(1~3) : ");
		UserNum = sc.nextInt();
	}
	while (UserNum<1 || UserNum>3);

	

	if (UserNum==1)
	{
		user = UserResult[0];
	}
	else if (UserNum==2)
	{
		user = UserResult[1];
	}
	else if (UserNum==3)
	{
		user = UserResult[2];
	}
}

}

class Com
{
	String[] ComResult = {"����", "����", "��"};
	int ComNum;
	String com;

	Scanner sc = new Scanner(System.in);
	Random rd = new Random();

	comNum = rd.nextInt(3)+1;


	if (comNum==1)
	{
		com = comResult[0];
	}
	else if (comNum==2)
	{
		com = comResult[1];
	}
	else if (comNum==3)
	{
		com = comResult[2];
	}	

}

class RpsGame
{
	if (UserResult[0] && )
	{
		
	}


}
*/

/*
class RpsGame
{

	int[] rps = new rps[3];		// ������������ 1,2,3���� ���� �迭
	int nansu;
	

	// �� set �޼ҵ�
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

		for (int i=0; i<3; i++)	
		{
			
			rps[i] = rd.nextInt(3)+1;
			//-- 1(0+1)~3(2+1) 
		}





	}

}
*/
