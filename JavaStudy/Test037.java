/*==============================================
	���� ���� �帧�� ��Ʈ�� (���) ����
	- ���ǹ�(�б⹮)
	- if��, if-else��
===============================================*/

// �� ����
// ����ڷκ��� ������ ���� 5���� �Է¹޾�
// ¦��, Ȧ���� �հ踦 ����ϴ� ���α׷��� �����Ѵ�.
// ��, Scanner �� Ȱ���Ͽ� �������� ���е� �����͸�
// �� ���� �Է¹޾� ó���� �� �ֵ��� �Ѵ�.

// ���� ��)
// ���� 5��(���鱸��)�� �Է��ϼ��� : 12 3 4 5 6

// >> ¦���� ���� 22�̰�, Ȧ���� ���� 8 �Դϴ�.
// ����Ϸ��� �ƹ� Ű�� ��������...


import java.util.Scanner;


public class Test037
{
	public static void main(String[] args)
	{
		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);
		
		// ���� ����
		int a, b, c, d, e;			//--���� 5��
		int addOdds=0, addEvens=0;	//--Ȧ���� ��, ¦���� ���� ���� ���� ���� �� �ʱ�ȭ

		// ����ڰ� �ȳ����� �޼���

		System.out.print("���� 5��(���鱸��)�� �Է��ϼ��� : ");

		// ������ ���
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		
		// ���ǹ� �ۼ�

		if (a%2==0)	addEvens+=a;
		else addOdds+=a;
		if (b%2==0)	addEvens+=b;
		else addOdds+=b;
		if (c%2==0)	addEvens+=c;
		else addOdds+=c;
		if (d%2==0)	addEvens+=d;
		else addOdds+=d;
		if (e%2==0)	addEvens+=e;
		else addOdds+=e;
		

		// ��� ���

		System.out.println();
		System.out.printf(">> ¦���� ���� %d�̰�, Ȧ���� ���� %d �Դϴ�.\n", addEvens, addOdds);


	}
}

//���� ���
/*
���� 5��(���鱸��)�� �Է��ϼ��� : 2 4 7 8 0

>> ¦���� ���� 14�̰�, Ȧ���� ���� 7 �Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/