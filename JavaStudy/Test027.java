/*==============================================
	���� ������(Operator) ����
	- ���� ������(�� ���� ������)
===============================================*/

// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ �������, ��������, ������ �����Ͽ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �Է� �����ʹ� BufferedReader�� readLine()�� ���� �Ѱܹ��� �� �ֵ��� �ϸ�,
// ���� ������(���׿�����)�� Ȱ���Ͽ� ����� ������ �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է� : -12
// -12 �� ����
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

// ������ ���� �Է� : 257
// 257 �� ���
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

// ������ ���� �Է� : 0
// 0 �� ��
// ����Ϸ��� �ƹ� Ű�� ��������

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test027
{
	public static void main(String[] args) throws IOException
	{
		// �ֿ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int nNum;			//--������� �Է°��� ���� ����
		String strResult;	//--�Ǻ� ���(������� �������� ������)�� ���� ����

		// ���� �� ó��
		// �� ����ڿ��� �ȳ� �޼��� ���
		System.out.print("������ ���� �Է� : ");

		// �� ������� �Է°��� ������ ��ȯ �� ���� nNum �� ��Ƴ���
		nNum = Integer.parseInt(br.readLine());

		// �� ���� ���� ó��(�б⹮)
		/*
		nNum�� 0���� ũ�� - true	�� nNum�� ���
						  - false	�� nNum�� 0���� �۴� - true	�� nNum�� ����
														 - false�� nNum�� ��
					 
		*/

		//(nNum > 0) ? (��) : (��) ;
		//(nNum > 0) ? ("���") : (��);
		//(nNum > 0) ? ("���") : (nNum�� 0���� �۴�) ? (��) : (��);
		
		strResult = (nNum > 0) ? ("���") : (nNum < 0) ? ("����") : ("��");
		
		//strResult = (-12 > 0) ? ("���") : (nNum < 0) ? ("����") : ("��");
		//strResult = (false) ? ("���") : (nNum < 0) ? ("����") : ("��");
		//strResult = (false) : (nNum < 0) ? ("����") : ("��");
		//strResult = (nNum < 0) ? ("����") : ("��");
		//strResult = ("����");
		//strResult = "����"


		// ��� ���
		System.out.println(nNum + " �� " + strResult);
		


		/* ��Ǯ��(��)

		// ����

		int nNum;
		String strResult1;

		// �ν��Ͻ�

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		// ����ڿ��� �������� �޽���

		System.out.print("������ ���� �Է� : ");
		

		// ������ ���

		nNum = Integer.parseInt(br.readLine());
		strResult1 = (nNum > 0) ? "���" : "����" ;
		strResult1 = (nNum == 0) ? "��" : strResult1 ;


		// ���

		System.out.println();
		System.out.printf("%d �� %s\n", nNum, strResult1);
		*/


	}
}

// ���� ���
/*
������ ���� �Է� : 0
0 �� ��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/