/*======================================================
	���� �޼ҵ� �ߺ�����(Method Overloading) ����
	- Method Overloading �� ������ ���¿� �Ұ����� ����
=======================================================*/


public class Test107
{
	public static void main(String[] args)
	{	
		print('A');

		double result = print(10.0);	// Test107:java25		// �Ұ�, ���Կ����� �캯�� print(10.0)���� ���µ�, �׶� 14���� ȣ��� ���е�������
		print(10.0);					// Test107:java24
	}

	public static void print() {}
	public static void print(int i) {}
	//public static void print(int j) {}				//--(��) ���� ������ �Ű������� �Ѱ��شٴ� �ǹ̿��� �� ���� �ǹ̾��� �����̹Ƿ�
														//		 ȣ���� �� ������ �� ����
	//public static void print(char c) {}				//--(��) ����������, �ڵ�����ȯ ��Ģ�� ��������.
	public static void print(int i, int j) {}

	public static void print(double d) {}				//--(��) ����������, �ڵ�����ȯ ��Ģ�� ��������.
	//public static double print(double d) {return 3.14;}
	//public static void print(double d) {return 3.14;}	// ���ǺҰ�(3.14�� ���Ϲ޴µ� void����)
	//public static void print(double e) {}		
 
 }