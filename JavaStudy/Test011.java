/*==============================================
���� �ڹ� �⺻ ���α׷��� ����
	- ������ �ڷ���
	- �ڹ��� �⺻ ����� : BufferedReader Ŭ����
==============================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test011 
{
	public static void main(String[] args) throws IOException
	{
		// BufferedReader�� �ν��Ͻ� ���� ����
		// BufferedReader br = new BufferedReader( ������(System.in) ) ;
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

		
		// �ֿ� ���� ����
		int r;						//--������
		final double PI = 3.141592;	//--������
		double a, l;				//--����, �ѷ�


		// ���� �� ó��


		// �� ����ڿ��� �ȳ� �޽��� ���
		System.out.print("���� ������ �Է� : ");

		// �� ����ڰ� �Է��� ���� �޾ƿ� ������ ���� r�� ��Ƴ���

		// BufferedReader �ȿ�... readLine() �޼ҵ�... �ܺ� �Է°� ��������
		// r = br.readLine();
		// r = "30";	--------(X)
		// r = parseInt();			��	�Ű������� �Ѱܹ���
		//								���� ����� ���ڿ� �����͸� ���������� ��ȯ
		// r = Integer.parseInt();	��	Integer �� ����ִ� parseInt()
		// r = Integer.parseInt("30 ");
		r = Integer.parseInt(br.readLine());
		// r = Integer.parseInt(br.readLine());
		// r = 30;

		//-- ����ڰ� �Է��� ���� BufferedReader(br)�� ��readLine()��
		//	 �޼ҵ带 Ȱ���Ͽ� �о���� ��
		//	 �� ���� ��Integer.parseInt���� ���� ������(������)���� ��ȯ�� ��
		//	 ���� ������ ������ ���� r�� ��Ƴ���

		// �� ���� ���� �� �ѷ� ����
		a = r * r * PI;
		l = r * 2 * PI;

		// ��� ���
		/*
		System.out.println(">> ���� : " + a);
		System.out.println(">> �ѷ� : " + l);
		*/

		//System.out.printf(">> ���� : ��\n", �ۿ� ���� ��);
		//System.out.printf(">> �ѷ� : ��\n", �ۿ� ���� ��);
		
		System.out.printf(">> ���� : %.2f\n", a);
		System.out.printf(">> �ѷ� : %.2f\n", l);
		//-- ��%f���� �Ǽ����� ��Ƴ��� �ɼ� ����
		//	 ��%.2f���� �Ҽ��� ���� �� ��° �ڸ����� ǥ���ϰڴٴ� �ǹ�
		//	 �� �� ��° �ڸ����� �ݿø�

	}
}

// ���� ���
/*
���� ������ �Է� : 30
>> ���� : 2827.43
>> �ѷ� : 188.50
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/