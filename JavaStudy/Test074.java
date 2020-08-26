/*===============================
 ���� Ŭ������ �ν��Ͻ� ����
================================*/

// ����ڷκ��� ������ ������ �Է¹޾�
// 1���� �Է¹��� �� ������ ���� �����Ͽ�
// ������� ����ϴ� ���α׷��� �����Ѵ�.

// ��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
// ����, �Է� ó�� �������� BufferedReader�� ����Ͽ�,
// �Է� �����Ͱ� 1���� ���ų� 1000���� ū ���
// �ٽ� �Է¹��� �� �ִ� ó���� �����Ͽ� ���α׷��� ������ �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է�(1~1000) : 1022
// ������ ���� �Է�(1~1000) : -23
// ������ ���� �Է�(1~1000) : 100
// >> 1 ~ 100 ������ �� : 5050
// ����Ϸ��� �ƹ� Ű�� ��������...

//----------------------------------

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class Hap
{
	// �ֿ� ���� ����(�Ӽ� ����)
	//-- ������� �Է°��� ��Ƶ� ����
	int su;

	// �ֿ� �޼ҵ� ����(��� ����)
	//-- �Է� ����� ������ �޼ҵ�
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		do
		{
			System.out.print("������ ���� �Է�(1~1000) : ");
			su = Integer.parseInt(br.readLine());

		}
		while (su<1 || su>1000);

	}

	// �ֿ� �޼ҵ� ����(��� ����)
	//-- ���� ó�� ����� ������ �޼ҵ�
	int calculate()
	{
		int result = 0;

		for (int i=1; i<=su; i++)
			result += i;

		return result;
	}

	// �ֿ� �޼ҵ� ����(��� ����)
	//-- ��� ��� ����� ������ �޼ҵ�
	void print(int sum)
	{
		System.out.printf(">> 1 ~ %d ������ �� : %d\n", su, sum);

	}

}


public class Test074
{
	public static void main(String[] args) throws IOException
	{
		// Hap Ŭ������ ������� �� �ν��Ͻ� ����
		Hap ob = new Hap();

		// ������ �ν��Ͻ��� ���ؼ�(Ȱ���ؼ�) �Է� �޼ҵ� ȣ��
		ob.input();

		// ������ �ν��Ͻ��� ���ؼ� ���� �޼ҵ� ȣ��
		int s = ob.calculate();

		// ������ �ν��Ͻ��� ���ؼ� ��� �޼ҵ� ȣ��
		ob.print(s);

	}
}


/*


//----------------------------------------------------------------------------
	// Ŭ�������� �� ����
	// 1. ��� ����, 2. �Է¹޴� �����޴� �޼ҵ��� + �Է¹����� 1~1000������ �ƴѰ�츦 ������ �ݺ��� ����
	// 3. 1~�Է°� ������ ��, 4. ���







import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class Hap
{
	// ��� ���� ����
	int n;		// �Է¹��� ����
	int a;		// ��������
	int sum=0;	// �������� ���� ����
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �Է¹��� ������ �޼ҵ�
		void input() throws IOException
		{	
			System.out.print("������ ���� �Է�(1~1000) : ");
			n = Integer.parseInt(br.readLine());

		}

		// �Է� ���ѷ��� �޼ҵ�
		void infiniteLoop() throws IOException
		{
			while (true)
			{
				System.out.print("������ ���� �Է�(1~1000) : ");
				n = Integer.parseInt(br.readLine());
				
				//input()
				//if(�����Լ�) ->true  calSum(); print();
				//else		   ->
			}
		}

		// 
		boolean check()
		{
			return (n>=1 && n<=1000);
		}
		

		// 1���� �Է°� n������ ������ �޼ҵ�
		void calSum()
		{
			a=n;
		
			while(n>=a)
			{
				sum += a;
				a++;
			}
		
		}
		
		// ��� �Լ�
		void print()
		{
			System.out.printf(">> 1 ~ 100 ������ �� : %d", sum);
		}

	
}


public class Test074
{
	public static void main(String[] args)
	{
		
	}
}

*/