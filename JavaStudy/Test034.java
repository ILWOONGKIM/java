/*==============================================
	���� ���� �帧�� ��Ʈ�� (���) ����
	- ���ǹ�(�б⹮)
	- if��, if-else��
===============================================*/

// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� �������� ���� ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, if ���ǹ��� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
// ���� ����� ���ǻ� ���������� ó���� �� �ֵ��� �Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 10
// �� ��° ���� �Է� : 14
// ������ �Է�[+ - * /] : 

// >> 10 + 14 = 24
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test034
{
	public static void main(String[] args) throws IOException
	{
/*
		// ��� ��

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b;		//-- ù ��°, �� ��° ����
		char op;		//-- ������
		
		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		
		// Integer.parseInt()		��	�Էµ� ���ڿ��� �������̾���Ѵ�.
		// "1234"	��	Integer.parseInt("1234");	�� 1234
		// "abcd"	��	Integer.parseInt("abcd");	�� (��)
		
		System.out.print("������ �Է�[+ - * /] : ");
		// op = Integer.parseInt(br.readLine());	�� (��)
		// op = br.readLine();						�� (��)
		op = (char)System.in.read();

		// System.in.read() ������ ��� �׽�Ʈ
		//System.out.println("op : " + op);


		
		if (op=='+')
		{
			System.out.printf("\n>> %d + %d = %d\n" , a, b, (a+b));
		}
		else if(op=='-')
		{
			System.out.printf("\n>> %d - %d = %d\n" , a, b, (a-b));
		}
		else if(op=='*')
		{
			System.out.printf("\n>> %d * %d = %d\n" , a, b, (a*b));
		}
		else if(op=='/')
		{
			System.out.printf(">>\n %d / %d = %.2f\n" , a, b, (a/(double)b));		// a/b���� �� �� �ϳ� double
		
		}
		else
		{
			System.out.printf(">>\n �Է� ������ ������ �����մϴ�.\n");
		}
*/

/*
		// ��� �� , �����ڵ� ���������� ó��

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b, op;		//-- ù ��°, �� ��° ����, ������
		
		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�[+ - * /] : ");
		// op = Integer.parseInt(br.readLine());
		op = System.in.read();

		if (op==43)
			System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b));
		else if (op==45)
			System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b));
		else if(op=='*')
			System.out.printf("\n>> %d * %d = %d\n" , a, b, (a*b));
		else if(op=='/')
			System.out.printf("\n>> %d / %d = %d\n" , a, b, (a/b));
		else
			System.out.printf("\n>> �Է� ������ ������ �����մϴ�.");

*/

		// ��� ��, result, ����� ���� �߰����� �� ��� ����� �ϳ���

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, result = 0;	// result �ʱ�ȭ����, ���� �ҰŸ� else ���� �ʿ�
		char op;

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�[+ - * /] : ");
		op = (char)System.in.read();

		if(op=='+')
			result = a + b;
		else if (op=='-')
		{
			result = a - b;
		}
		else if (op=='*')
		{
			result = a * b;
		}
		else if (op=='/')
		{
			result = a / b;
		}

		System.out.printf("\n>> %d %c %d = %d\n", a, op, b, result);




/*(���� Ǯ��)
public class Test034
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// ���� ���� 
		int a, b;
		char calc;
		
		// ����� �޼���
		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.print("������ �Է�[+ - * /] : ");
		calc = (char)System.in.read();


		
		if (calc=='+')
		{
			System.out.printf(">> %d + %d = %d\n" , a, b, (a+b));
		}
		else if(calc=='-')
		{
			System.out.printf(">> %d - %d = %d\n" , a, b, (a-b));
		}
		else if(calc=='*')
		{
			System.out.printf(">> %d * %d = %d\n" , a, b, (a*b));
		}
		else if(calc=='/')
		{
			if (b==0)
			{
			System.out.printf("0 ���� ���� �� �����ϴ�.\n");
			}

			else
			{
			System.out.printf(">> %d / %d = %.2f\n" , a, b, (a/(double)b));
			}

		}
		else
		{
			System.out.printf(">> �Ǻ� �Ұ�\n");
		}
*/
	}
}
/*
ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 7
������ �Է�[+ - * /] : /

>> 10 / 7 = 1
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/