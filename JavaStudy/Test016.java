/*==============================================
	���� �ڹ� �⺻ ���α׷��� ����
	- �ڹ��� �⺻ ����� : java.util.Scanner
===============================================*/

// �� java.util.Scanner
//	  �ܶ� ���� ������ ����Ͽ� �Է��� ��ū�� ���� �����ϸ�
//	  ����Ʈ(default)�� ���Ǵ� �ܶ����ڴ� �����̴�.
//	  �ۼ��� ���� ��ū�� ��next()��	�޼ҵ带 ���
//	  �ٸ� ����(�ڷ���)�� ������ ��ȯ�� �� �ִ�.

import java.util.Scanner;

public class Test016
{
	public static void main(String[] args)
	{
		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		// �ֿ� ���� ����
		String name;		//-- �̸�
		int kor, eng, mat;	//-- ����, ����, ���� ����

		
		// ���� �� ó��
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = sc.next(); // ���� �ʿ����

		System.out.print("���� ���� �Է� : ");
		//kor = integer.parseInt(readLine());
		kor = sc.nextInt();

		System.out.print("���� ���� �Է� : ");
		eng = sc.nextInt();

		System.out.print("���� ���� �Է� : ");
		mat = sc.nextInt();

		
		// ��� ���
		System.out.println();
		System.out.println(">> �̸� : " + name);
		System.out.println(">> ���� : " + (kor + eng + mat));	
		//--==>> ���� ������� ��Ű��, ���ڰ��� �����ϵ��� ��Ŵ




	}
}

// ������

/*
�̸��� �Է��ϼ��� : ���Ͽ�
���� ���� �Է� : 90
���� ���� �Է� : 80
���� ���� �Է� : 70

>> �̸� : ���Ͽ�
>> ���� : 240
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/