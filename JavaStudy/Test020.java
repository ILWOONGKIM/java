/*==============================================
	���� �ڹ� �⺻ ���α׷��� ����
	- ��� ������
	- BufferedReader
	- printf()
===============================================*/

// ����ڷκ��� ������ ������ �� �� �Է¹޾�
// ��Ģ���� �� ������ ������ �����Ͽ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �Է¹޴� ������ BufferedReader �� Ȱ���� �� �ֵ��� �ϰ�
// ����ϴ� ������ printf() �޼ҵ带 Ȱ���� �� �ֵ��� �Ѵ�.
// ����, ������ ������ ���ǻ� ���� ������� ó���Ѵ�.(�� ���ϵ���)

// ���� ��)
// ù ��° ���� �Է� : 10
// �� ��° ���� �Է� : 2

// ===[���]===
// 10 + 2 = 12
// 10 - 2 = 8
// 10 * 2 = 20
// 10 / 2 = 5
// 10 % 2 = 0
// ============
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ�. . .

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test020
{
	public static void main(String[] args) throws IOException
	{
		// �ֿ� ���� ����
		int num1, num2;						//-- ����� �Է°��� ���� ����
		int res1, res2, res3, res4, res5;	//-- ���� ����� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		// ���� �� ó��
		// �� ����ڿ��� �ȳ� �޼��� ���
		System.out.print("ù ��° ���� �Է� : ");

		// �� ����ڰ� �Է��� ��(���ڿ�)��
		//	  ���� ���·� ��ȯ�� �� ���� num1�� ��Ƴ���
		num1 = Integer.parseInt(br.readLine());
		
		// �� ����ڿ��� �ȳ� �޼��� ���
		System.out.print("�� ��° ���� �Է� : ");

		// �� ����ڰ� �Է��� ��(���ڿ�)��
		//	  ���� ���·� ��ȯ�� �� ���� num2 �� ��Ƴ���
		num2 = Integer.parseInt(br.readLine());

		// �� ��� ���� ����
		res1 = num1 + num2;
		res2 = num1 - num2;
		res3 = num1 * num2;
		res4 = num1 / num2;		// ������ �Ǽ���, ������ �䱸������ ������ �Ѿ
		res5 = num1 % num2;

		// ��� ���
		System.out.printf("\n===[���]===\n");
		System.out.printf("%d + %d = %d\n", num1, num2, res1);
		System.out.printf("%d - %d = %d\n", num1, num2, res2);
		System.out.printf("%d * %d = %d\n", num1, num2, res3);
		System.out.printf("%d / %d = %d\n", num1, num2, res4);
		System.out.printf("%d %% %d = %d\n", num1, num2, res5);
		System.out.printf("\n==========\n");



/* Ǯ��(��) : a+b �� ���굵 %d �� �޾ƾ���, printf���� %���� ��Ÿ�ӿ���

		// ���� ����

		int a, b;

		// ����� �޽���
		
		System.out.print("ù ��° ���� �Է� : ");
		
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");

		b = Integer.parseInt(br.readLine());


		// ���� �� ���

		System.out.print("\n===[���]===\n");		// printf�� ���� \n ��ߴ�
		System.out.printf("%d + %d = %d\n", a, b, a + b);
		System.out.printf("%d - %d = %d\n", a, b, a - b);
		System.out.printf("%d * %d = %d\n", a, b, a * b);
		System.out.printf("%d / %d = %d\n", a, b, a / b);
		System.out.printf("%d % %d = %d\n", a, b, a % b);
		System.out.print("\n==========");

*/
	}
}

//������
/*
ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 2

===[���]===
10 + 2 = 12
10 - 2 = 8
10 * 2 = 20
10 / 2 = 5
10 % 2 = 0

==========
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/