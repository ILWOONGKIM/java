/*===============================
 ���� Ŭ������ �ν��Ͻ� ����
================================*/

// �� Test073.java ���ϰ� ��Ʈ
//			�� �ش� ���� ����

// ���� ���̿� �ѷ� ���ϱ�
// ���� ���̿� �ѷ��� ���� �� �ִ� Ŭ������ �����Ѵ�.
// (Ŭ������ : CircleTest)

// ���� ���� = ������ * ������ * 3.141592
// ���� �ѷ� = ������ * 2 * 3.141592

// ���� ��)
// ������ �Է� : xx <- ����ڰ� �Է�

// �������� xx�� ����		<- �ν��Ͻ� �������� ���
// ���� : xxx.xx
// �ѷ� : xxx.xx
// ����Ϸ��� �ƹ� Ű�� ��������...
//-------------------------------------------------------

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

// ���� �������� �Է¹޾� ���̿� �ѷ��� ���ϴ� ��ü����

	
public class CircleTest 
{
	// ��� ���� �� �ֿ� �Ӽ�
	int r;								//-- ������
	final double PI = 3.141592;			//-- ������(������ ���ȭ)

	// ������ �Է� ��� �� �޼ҵ� ����
	void input() throws IOException
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.print("������ �Է� : ");
		r = Integer.parseInt(br.readLine());

	}

	// ���� ��� ��� �� �޼ҵ� ����
	double calArea()
	{
		double result = 0;
		result = r * r * PI;

		return result;
	}		

	// �ѷ� ��� ��� �� �޼ҵ� ����
	double calLength()
	{
		double result = 0;
		result = r * 2.0 * PI;

		return result;
	}			
	
	// ��� ��� ��� �� �޼ҵ� ����
	void print(double a, double l)
		
	{
		// �������� xx�� ����
		// ���� : xxx.xx
		// �ѷ� : xxx.xx
		System.out.printf("\n�������� %d�� ����\n", r);
		System.out.printf("���� : %.2f\n", a);
		System.out.printf("�ѷ� : %.2f\n", l);
	}

}






/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
	
class CircleTest 
{

	int r;								// �������(������)
	final double PI = 3.141592;


	void input() throws IOException		// ���(������ �� �Է¹ޱ�)
	{
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	System.out.print("������ �Է� : ");

	r = Integer.parseInt(br.readLine());

	}
	
	double calWidth()					// ���� ����
	{
		double result = 0.0;
		result = r * r * PI;

		return result;
	}		
	
	double calLength()					// ���� �ѷ����
	{
		double result = 0.0;
		result = r * 2.0 * PI;

		return result;
	}			
							
	void print(double w, double l)		// ���
		
	{
		System.out.printf("\n�������� %d�� ����\n", r);
		System.out.printf("���� : %.2f\n", w);
		System.out.printf("�ѷ� : %.2f\n", l);
	}

}

*/