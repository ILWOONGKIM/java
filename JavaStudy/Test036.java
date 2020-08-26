/*==============================================
	���� ���� �帧�� ��Ʈ�� (���) ����
	- ���ǹ�(�б⹮)
	- if��, if-else��
===============================================*/

// ����ڷκ��� ������ ���� �� ���� �Է¹޾�
// ���� ������ ū �� ������ ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 112
// �� ��° ���� �Է� : 8
// �� ��° ���� �Է� : 21

// >> ���� ��� : 8 21 112
// ����Ϸ��� �ƹ� Ű�� ��������..

// ù ��° ���� �Է� : 15
// �� ��° ���� �Է� : 121
// �� ��° ���� �Է� : 15

// >> ���� ��� : 15 15 121
// ����Ϸ��� �ƹ� Ű�� ��������..


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test036
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b, c;		//-- ����ڰ� �Է��ϴ� ������ ������ ��Ƶ� ����

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		c = Integer.parseInt(br.readLine());

		// 3 1 2 
		// - - 
		// 1 3 2
		// -   -
		// 1 3 2
		//   - -
		// 1 2 3	ù ��° ���� ������ ���� ���� ��


		if (a>b)	// ù ��° ����(a)�� �� ��° ����(b)���� ũ�ٸ�
		{
			// a �� b �� �ڸ��� �ٲ۴�.(xor ��Ʈ�����ڷ�)
			a=a^b;
			b=b^a;
			a=a^b;
		}
		if (a>c)	// ù ��° ����(a)�� �� ��° ����(c)���� ũ�ٸ�
		{
			// a �� c �� �ڸ��� �ٲ۴�.
			a=a^c;
			c=c^a;
			a=a^c;
		}
		if (b>c)	// �� ��° ����(b)�� �� ��° ����(c)���� ũ�ٸ�
		{
			// b �� c �� �ڸ��� �ٲ۴�.
			b=b^c;
			c=c^b;
			b=b^c;
		}

		// ���� ��� ��� �� a, b, c ������� ���
		System.out.printf("\n>> ���� ��� : %d %d %d\n", a, b, c);

	}
	
}

// ���� ���
/*
ù ��° ���� �Է� : 5
�� ��° ���� �Է� : 5
�� ��° ���� �Է� : 0

>> ���� ��� : 0 5 5
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/