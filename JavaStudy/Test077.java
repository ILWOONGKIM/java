/*===============================
 ���� Ŭ������ �ν��Ͻ� ����
 - ������(Constructor)
================================*/

 
class NumberTest2
{
	int num;

	/*
	NumberTest()
	{
	}
	*/

	// ����� ���� ������	��	int �� �Ű������� ���� ������
	NumberTest2(int n)
	{
		num = n;
		System.out.println("������ ȣ�� �� �Ű����� ���� : " + n);
	}

	int getNum()
	{
		return num;
	}
}

public class Test077
{
	public static void main(String[] args)
	{
		// NumberTest2 �ν��Ͻ� ����

		//NumberTest2 ob1 = new NumberTest2();
		//--==>> ���� �߻�(������ ����)

		//-- NumberTest2 Ŭ��������
		//	����� ���� �����ڰ� �����ϰ� �ִ� ��Ȳ�̱� ������
		//	�������� �����ϴ� ��������
		//	��default �����ڡ��� �ڵ����� ���Ե��� ������,
		//	����� ���� �����ڴ� �Ű������� ���� ���·� �����߱� ������
		//	���� ���� �Ű����� ���� ������ ȣ�� �� ������ �߻��� �� �ۿ� ����.


		NumberTest2 ob1 = new NumberTest2(10);
		//--==>> ������ ȣ�� �� �Ű����� ���� : 10
		System.out.println("�޼ҵ� ��ȯ �� : " + ob1.getNum() );
		//--==>> �޼ҵ� ��ȯ �� : 10

		NumberTest2 ob2 = new NumberTest2(3925)
		System.out.println("�޼ҵ� ��ȯ �� : " + ob2.getNum() );
		//--==>> ������ ȣ�� �� �Ű����� ���� : 3925
		//		 �޼ҵ� ��ȯ �� : 3925

	}
}
