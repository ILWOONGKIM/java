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


public class Test018
{
	public static void main(String[] args)
	{
		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		// �ֿ� ���� ����
		String name;
		int kor, eng, mat, tot;

		// ���� �� ó��
		System.out.print("�̸�,����,����,���� �Է�(��,������) : ");
		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		//				-----------		������, 	�̰ɷ�    ©��޶� ��� �ǹ�, 
		//				���Ͽ�,90,80,70(�������)
		//
		// �̶�, �������� �ϳ��� �ɼ����� �ν��ؼ� �ΰ����Ἥ ��¥ �������� �ǹ̸� ��Ÿ���ش�

		name = sc.next();			// ���Ͽ�
		kor = sc.nextInt();			// 90
		eng = sc.nextInt();			// 80
		mat = sc.nextInt();			// 70

		tot = kor + eng + mat;
		

		// ��� ���

		System.out.println();
		System.out.println(">> �̸� : " + name);
		System.out.println(">> ���� : " + tot);

	}
}

//���� ���
/*
�̸�,����,����,���� �Է�(��,������) : ���Ͽ�,90,80,70

>> �̸� : ���Ͽ�
>> ���� : 240
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/