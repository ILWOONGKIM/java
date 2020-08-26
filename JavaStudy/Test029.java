/*==============================================
	���� ������(Operator) ����
	- ���� ������(�� ���� ������)
===============================================*/

// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������... �������� ������� �Ǻ��Ͽ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �Է��� BufferedReader �� Ȱ���ϰ�
// ���ǿ����ڸ� Ȱ���Ͽ� ������ ������ �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է� : 2000
// 2000�� �� ����
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

// ������ ���� �Է� : 2012
// 2012�� �� ����
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . . 

// �� 2���� 28�� ���� �ִ� �� �� ���
//			29�� ���� �ִ� �� �� ����

// �� ������ �Ǻ� ����
//	  ������ 4�� ����̸鼭 100�� ����� �ƴϰų�
//	  400�� ����̸� ����, �׷��� ������ ���


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test029
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int year;			//-- ����ڷκ��� �Է¹��� ������ ��Ƶ� ����
		String result;		//-- �������� ��������� ���� �Ǻ� ����� ��Ƶ� ����
		
		System.out.print("������ ���� �Է� : ");
		year = Integer.parseInt(br.readLine());

		result = (year%4==0 && year%100!=0 || year%400==0) ? "����" : "���" ;

		System.out.println(year + " �� " + result);
		

	}
}
// ������
/*
������ ���� �Է� : 2000000000
2000000000 �� ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/


/*(��)

	// ���� ����

	int year;
	String result;

	// �ν��Ͻ�

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	// ����� �޼���

	System.out.print("������ ���� �Է� : ");


	// ���� ���
	year = Integer.parseInt(br.readLine());

	result = ((year % 4 == 0) && (year % 400 == 0) || (year % 100 != 0)) ? "����" : "���" ;
	//(�Է°�) = (������ 4�ǹ�� && ������ 400�� ��� || ������ 100�� ���) ? ("����") : ("���");


	// ��� ���
	System.out.println(year + "��" + " �� " + result);



/*(�¹�)

int year;

System.out.print("������ ���� �Է� : ");
year = Integer.parseInt(br.reaLine());

String yearType;
// 400�� ����̰ų� or (4�� ���������, 100�� ����� �ƴ�) ��
boolean isLeap = (year % 400 == 0) || (year % 4 == 0 && year % 100 !=0);
yearType = isLeap ? "����" : "���";

System.out.printf("%d�� -> %s\n", year, yearType);

*/

