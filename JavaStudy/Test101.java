/*======================================
	���� Ŭ������ �ν��Ͻ� ����
	- �������а� �������� ������
======================================*/

import java.util.Scanner;


class CircleTest2
{
	// ���� ����(Information Hiding)
	// ��� �����̸鼭 �ν��Ͻ� ����(�޸��Ҵ��� ���ؼ��� �ν��Ͻ��� �����Ǿ�� ...)
	// ���� ����(� �޼ҵ尡 �ִ������� �ش� Ŭ���� ��������, ��� �޼ҵ忡�� ��������)
	// ��private���̶�� ���������������� ������
	// Ŭ���� ���ο����� ���� �� ������ �����ϰ� �ϰڴٴ� �ǹ�
	// int �� ���� 0���� �ʱ�ȭ ����

	private int r;
	//int r;

	// getter(�����پ���) / setter(�� �����Ҷ�) ����
/*
	int getR()
	{
		return r;
	}

	void setR(int r)		// �Ű������� �޾� �ʱ�ȭ
	{
		this.r = r;
	}
*/		

	void input()		// r�� privateȭ �Ǿ��־�, �޼ҵ� input���� r�� ���� ä������
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Է� : ");
		r = sc.nextInt();
	}

	double calArea()
	{
		return r * r * 3.141592;
	}

	void write(double a)
	{
		
		System.out.println("������ : " + r);
		System.out.println("��	�� : " + a);
	}


}


public class Test101
{
	public static void main(String[] args)
	{
		CircleTest2 ob = new CircleTest2();
			
		//ob.r = 10;
		//System.out.println("���� ������ : " + ob.r);		-> private �����̹Ƿ� ���ٺҰ�, �����Ͽ���

		//ob.setR(1);
		//System.out.println("���� ������ : " + ob.getR());
		// ���� ������ : 100
		
		ob.input();
		// ������ �Է� : 1000
		//�� ob.r = 1000;

		double result = ob.calArea();
		ob.write(result);
		// ������ �Է� : 2000
		// ������ : 2000
		// ��	�� 

	}
}