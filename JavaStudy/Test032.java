/*==============================================
	���� ���� �帧�� ��Ʈ�� (���) ����
	- ���ǹ�(�б⹮)
	- if��, if-else��
===============================================*/

// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������... ¦������, Ȧ������, ������
// ����� �Ǻ��Ͽ� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ������ ���� �Է� : 4
// 4 �� ¦��
// ����Ϸ��� �ƹ� Ű�� ��������...

// ������ ���� �Է� : 13
// 4 �� Ȧ��
// ����Ϸ��� �ƹ� Ű�� ��������...

// ������ ���� �Է� : 0
// 0 �� ��
// ����Ϸ��� �ƹ� Ű�� ��������...


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test032
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		int nNum;

		// ����� �޼���
		System.out.print("������ ���� �Է� : ");

		// ���� �ޱ�
		nNum = Integer.parseInt(br.readLine());

/*
		// ���ǹ��� ����'����' �߿�(�� ���ǹ��� ¦������ ���;���)

		if (nNum == 0)
		{
			System.out.printf("%d �� �� \n", nNum);
		}
		
		else if (nNum %2 != 0)
		{
			System.out.printf("%d �� Ȧ��\n", nNum);
			
		}
		else if (nNum%2 ==0)
		{
			System.out.printf("%d �� ¦��\n", nNum);
		}
*/

		String result;

		if (nNum ==0)
		{
			result = "��";
		}
		else if (nNum%2==0)
		{
			result = "¦��";	
		}
		else if (nNum%2!=0)
		{
			result = "Ȧ��";
		}
		else
		{
			result = "�Ǻ� �Ұ�";
		}

		System.out.println(nNum + " �� " + result);

// �� ���ǹ��� ������ ������ �׻� ������ ���� ������ �����ؾ� �Ѵ�.

// �� ���ǹ��� ���� �������� ������ ����(else)��
//	  ������ ���Ե� �������� ó���ϴ� ���� �ٶ������� ���� ��찡 �ִ�.
//	  �Ұ����� ���� ��¿ �� ������
//	  �������̸� ������ ���Ե��� ���� ������
//	  �̿��� ����(else)���� ó���� �� �ֵ��� �Ѵ�.

//	��) if ��� else if ���� else �Ǻ��Ұ�(����2���� ���ǹ�2��, ������1�� �̷�������)

/*
		String result = "�Ǻ� �Ұ�";

		if (nNum ==0)
		{
			result = "��";
		}
		else if (nNum%2==0)
		{
			result = "¦��";	
		}
		else if (nNum%2!=0)
		{
			result = "Ȧ��";
		}

		System.out.println(nNum + " �� " + result);
*/

		/*
		// ���ǹ�

		if (nNum == 0)
		{
			System.out.printf("%d �� ��\n", nNum);
		}
		
		else if (nNum %2 == 1)
		{
			System.out.printf("%d �� Ȧ��\n", nNum);
			
		}
		else
		{
			System.out.printf("%d �� ¦��\n", nNum);
		}
		*/


	}
}