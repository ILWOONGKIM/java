/*==============================================
���� �ڹ� �⺻ ���α׷��� ����
	- ������ �ڷ���
	- �ڹ��� �⺻ ����� : BufferedReader Ŭ����
===============================================*/

// ����ڷκ��� �̸�, ��������, ��������, ���������� �Է¹޾�
// �̸��� ������ ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// �̸��� �Է��ϼ��� : ���Ͽ�
// ���� ���� �Է� : 90
// ���� ���� �Է� : 80
// ���� ���� �Է� : 70
// 
// ====[���]====
// �̸� : ���Ͽ�
// ���� : 240
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test013
{
	public static void main(String[] args) throws IOException
	{
		// BufferedReader �ν��Ͻ� ����
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		//--BufferedReader br = new BufferedReader(new InputStreamReader(System.in))�� ����


		// �ֿ� ���� ����
		String strName;			//-- �̸� ����
		int nKor, nEng, nMat;	//-- ����, ����, ���� ���� ����
		int nTot;				//-- ���� ����

		// �߰� ���� ����
		String strTemp;			//-- ���ڿ� �����͸� �ӽ÷� ������ ����
			

		// ���� �� ó��
		// �� ����ڿ��� �ȳ� �޽��� ��� �� �̸� �Է� �ȳ�
		System.out.print("�̸��� �Է��ϼ��� : ");
		
		// �� ����ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
		strName = br.readLine();		// br.readLine()�� ������ IOException ��Ű���� ����, �� ��Ű�� ��ġ import �ؾ�
										// ���� ��� ���ڿ� �����̴�

		// �� ����ڿ��� �ȳ� �޽��� ��� �� ���� ���� �Է� �ȳ�
		System.out.print("���� ���� �Է� : ");

		// �� ����ڰ� �Է��� ���� ���� ���·� ��ȯ�� �� nKor ������ ��Ƴ���
		strTemp = br.readLine();
		nKor = Integer.parseInt(strTemp);
		
		// �� ����ڿ��� �ȳ� �޽��� ��� �� ���� ���� �Է� �ȳ�
		System.out.print("���� ���� �Է� : ");

		// �� ����ڰ� �Է��� ���� ���� ���·� ��ȯ�� �� nEng ������ ��Ƴ���
		strTemp = br.readLine();
		nEng = Integer.parseInt(strTemp);

		// �� ����ڿ��� �ȳ� �޽��� ��� �� �������� �Է� �ȳ�
		System.out.print("���� ���� �Է� : ");

		// �� ����ڰ� �Է��� ���� ���� ���·� ��ȯ�� �� nMat ������ ��Ƴ���
		strTemp = br.readLine();
		nMat = Integer.parseInt(strTemp);

		// �� �� ���� ������ ����ִ� ������(�Է� ������)����
		//	  �����Ͽ� ���� ������ �����ϴ� ������ ���� ������ �����ϰ�
		//	  �� ����� ���� ������ ��Ƴ���
		nTot = nKor + nEng + nMat;


		// ��� ���
		//System.out.println(); // ���� - ���1
		System.out.println("\n====[���]===="); // ���� - ���2
		//System.out.println("�̸� : " + strName);
		//System.out.printf("�̸� : ��\n", strName);
		System.out.printf("�̸� : %s\n", strName);
		//System.out.println("���� : " + nTot);
		System.out.printf("���� : %d\n", nTot);


/*
// ������

�̸��� �Է��ϼ��� : ���Ͽ�
���� ���� �Է� : 90
���� ���� �Է� : 80
���� ���� �Է� : 70

====[���]====
�̸� : ���Ͽ�
���� : 240
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/




//----------------------------------------------------------------------------------------------

		/*

		
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test013
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader();


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	// �ν��Ͻ�
		
		// �ֿ� ���� ����
		int Korean, English, Mathematics, GrossScore;		// ����, ����, ����, ����
		String name;		// �̸�

		// ���� �� ó��

		// 1. ����ڿ� �ȳ��޽��� ���, ������ ��Ƴ���
		System.out.print("�̸��� �Է��ϼ��� : ");	// �̸�
		name = br.readLine();
		
		System.out.print("���� ���� �Է� : ");	// ��������
		Korean = Integer.parseInt(br.readLine());

		System.out.print("���� ���� �Է� : ");	// ��������
		English = Integer.parseInt(br.readLine());

		System.out.print("���� ���� �Է� : ");	// ��������
		Mathematics = Integer.parseInt(br.readLine());

		System.out.println();
		GrossScore = Korean + English + Mathematics;


		System.out.println("====[���]====");
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + GrossScore);
		*/


	}
}

/*
// ������

�̸��� �Է��ϼ��� : ���Ͽ�
���� ���� �Է� : 90
���� ���� �Է� : 80
���� ���� �Է� : 70

====[���]====
�̸� : ���Ͽ�
���� : 240
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/