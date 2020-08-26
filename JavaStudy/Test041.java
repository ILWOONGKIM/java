/*==============================================
	���� ���� �帧�� ��Ʈ�� (���) ����
	- ���ǹ�(�б⹮)
	- switch�� �ǽ�
===============================================*/

// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� �������� ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, switch ���� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
// ����� ���ǻ� ���� ���·� ó���Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 20
// �� ��° ���� �Է� : 11
// ������ �Է�[+ - * /] : -

// >> 20 - 11 = 9
// ����Ϸ��� �ƹ� Ű�� �������� . . .

// ù ��° ���� �Է� : 20
// �� ��° ���� �Է� : 11
// ������ �Է�[+ - * /] : $

// ����Ϸ��� �ƹ� Ű�� ��������. . .

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test041
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//*��� 1	

		int a, b, result;
		String op;

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("������ �Է�[+ - * /] : ");
		op = br.readLine();

		// + �� op:43 , - �� op:45, * �� op:42, / �� op:47
		
		switch (op)
		{
			case "+" : result = a+b; break;
			case "-" : result = a-b; break;
			case "*" : result = a*b; break;
			case "/" : result = a/b; break;
			default : return;	//--�޼ҵ� ���� �� main() �޼ҵ� ���� �� �� ���α׷� ����
		}										

		// �� ��return�� 1. ���� ��ȯ �� �޼ҵ� ȣ�� ����
		//				 2. �޼ҵ��� ����
		
		// ��� ���

		System.out.println();		
		System.out.printf(">> %d %s %d = %d\n", a, op, b, result);





/*���2
		int a, b, result;
		char op;

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("������ �Է�[+ - * /] : ");
		op = (char)System.in.read();

		// + �� op:43 , - �� op:45, * �� op:42, / �� op:47
		
		switch (op)
		{
			case '+' : result = a+b; break;
			case '-' : result = a-b; break;
			case '*' : result = a*b; break;
			case '/' : result = a/b; break;
			default : return;	//--�޼ҵ� ���� �� main() �޼ҵ� ���� �� �� ���α׷� ����
		}										

		// �� ��return�� 1. ���� ��ȯ �� �޼ҵ� ȣ�� ����
		//				 2. �޼ҵ��� ����
		
		// ��� ���

		System.out.println();		
		System.out.printf(">> %d %c %d = %d\n", a, (char)op, b, result);

*/


/* ���3
		int a, b, result, op;

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("������ �Է�[+ - * /] : ");
		op = System.in.read();

		// + �� op:43 , - �� op:45, * �� op:42, / �� op:47
		
		switch (op)
		{
			case 43 : result = a+b; break;
			case 45 : result = a-b; break;
			case 42 : result = a*b; break;
			case 47 : result = a/b; break;
			default : return;	//--�޼ҵ� ���� �� main() �޼ҵ� ���� �� �� ���α׷� ����
		}										

		// �� ��return�� 1. ���� ��ȯ �� �޼ҵ� ȣ�� ����
		//				 2. �޼ҵ��� ����
		
		// ��� ���

		System.out.println();		
		System.out.printf(">> %d %c %d = %d\n", a, (char)op, b, result);
*/

/*
		if (op=='+')
		{	
		System.out.printf(">>%d + %d = %d\n", a, b, (a+b));
		}
		else if (op=='-')
		{
			System.out.printf(">>%d - %d = %d\n", a, b, (a-b));
		}
		else if (op=='*')
		{
			System.out.printf(">>%d * %d = %d\n", a, b, (a*b));
		}
		else if (op=='/')
		{
			System.out.printf(">> %d / %d = %d\n", a, b, (a/b));
		}
		else
		{
			
		}

*/

		
	}
}