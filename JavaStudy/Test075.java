/*===============================
 ���� Ŭ������ �ν��Ͻ� ����
================================*/

// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// ��Ģ������ �����ϴ� ���α׷��� �����Ѵ�.
// ��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ �� ���� �Է�(���� ����) : 10 5
// ������ ������ �Է�( + - * / ) : +
// >> 10 + 5 = 15
// ����Ϸ��� �ƹ�Ű�� ��������..

import java.util.Scanner;
import java.io.IOException;

class Calculate
{
	// �ֿ� �Ӽ� ���� �� ���� ����
	int su1, su2;			// ����ڷκ��� �Է¹��� �� ������ ��Ƴ� ����
	char op;				// ����ڷκ��� �Է¹��� �����ڸ� ��Ƴ� ����
	

	/*
	//������ - ��������� ������
	Calculate();
	'����Ʈ ������'
	{
		'�� ��� ����'
	}

	*/




	// �ֿ� ��� ���� �� �޼ҵ� ����(��� : �Է�)
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �� ���� �Է�(���� ����) : ");
		su1 = sc.nextInt();
		su2 = sc.nextInt();
		
		System.out.print("������ ������ �Է�( + - * / ) : ");
		op = (char)System.in.read();		// read�� IOException
	}

	// �ֿ� ��� ���� �� �޼ҵ� ����(��� : ����)
	int cal()			// ����������ִ� ������ ������ �����ϸ�Ǿ, ���� �Ű������� �ʿ��� ���� ��ȯ�����ʴ´�.
	{
		int result = 0;

		switch (op)
		{
			case '+' : result = su1+su2; break;
			case '-' : result = su1-su2; break;
			case '*' : result = su1*su2; break;
			case '/' : result = su1/su2; break;
			// result=0���� �ʱ�ȭ�Ǿ��־ default X
		}
		return result;
	}

	// �ֿ� ��� ���� �� �޼ҵ� ����(��� : ���)
	void print(int s)
	{
		System.out.printf(">> %d %c %d = %d\n", su1, op, su2, s);
//												   		      | 
//							�����پ�, ����  print �޼ҵ�ȿ� int�� �ƹ� ���� ����(����ϱ�����)
	}
}


public class Test075
{
	public static void main(String[] args) throws IOException
	{
		// Calculate �ν��Ͻ� ����
		Calculate cal = new Calculate();

		// ������ �ν��Ͻ��� ���� �Է� �޼ҵ� ȣ��
		cal.input();

		// ������ �ν��Ͻ��� ���� ���� �޼ҵ� ȣ��
		int result = cal.cal(); // ��ȯ ���� ������ �Ű���������, 

		// ������ �ν��Ͻ��� ���� ��� �޼ҵ� ȣ��
		cal.print(result);

	}
}
/*
������ �� ���� �Է�(���� ����) : 10 12
������ ������ �Է�( + - * / ) : -
>> 10 - 12 = -2
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/


/*
import java.util.Scanner;
import java.io.IOException;

class Calculate
{
	// �������
	int a, b;			// �Է¹��� �� ����
	char ch;			// �Է¹��� ������
	
	// �Է� ���� �� ������ ������ �޼ҵ�
	void input() throws IOException
	{
		// �Է¹��� �� ���� ������� a, b�� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �� ���� �Է�(���� ����) : ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		// �Է¹��� ������ ������� ch�� ���
		System.out.print("������ ������ �Է�( + - * / ) : ");
		ch = (char)System.in.read();	
	}
	// ���� �Է°� ����
	int operate()
	{
		int calResult = 0;

		switch (ch)
		{
			case '+' : calResult = a+b; break;
			case '-' : calResult = a-b; break;
			case '*' : calResult = a*b; break;
			case '/' : calResult = a/b; break;
			
		}
		return calResult;
	}

	// ���
	void print(int result)
	{
		System.out.printf(">> %d %c %d = %d\n", a, ch, b, result);

	}
}


public class Test075
{
	public static void main(String[] args) throws IOException
	{
		Calculate cal = new Calculate();

		cal.input();
		int op = cal.operate();
		cal.print(op);

	}
}

*/