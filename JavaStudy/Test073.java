/*===============================
 ���� Ŭ������ �ν��Ͻ� ����
================================*/

// �� CircleTest.java ���ϰ� ��Ʈ
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

//----------------------------------------------------


import java.io.IOException;

public class Test073
{
			// �� �޸��Ҵ� ���� : Ŭ�����ε� -> �ν��Ͻ� ����
			// static�� Ŭ�����ε��������� �̹� �޸𸮸� �Ҵ����

	public static void main(String[] args) throws IOException		// input ���� throw �Ǹ� main �޼ҵ忡�� �����Ƿ� main������ throw�ؾ���
																	// �̷� �̷�� ����, br�� readLine �޼ҵ忡�� IOException�� throw �Ǿ��� ����
	{
		CircleTest ct = new CircleTest();

		ct.input();
		double a = ct.calArea();
		double l = ct.calLength();
		ct.print(a, l);

	}
}

// ó�� ���
/*
������ �Է� : 10

�������� 10�� ����
���� : 314.16
�ѷ� : 62.83
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/


/*(���� Ǯ��)

// 1. Ŭ���� ����(������, ������, ���� �ѷ�, ���� ����)
// 2. ���� ��� �� �з�


������(������)
���(�Է¹��� ������ ��, return �ȹ���)

���� �ѷ�
���� ����
���




import java.io.IOException;

public class Test073
{
	public static void main(String[] args) throws IOException
	{
		// �ν��Ͻ� ����
		CircleTest ct = new CircleTest();

		// �Է� �޼ҵ� ȣ��(������)
		ct.input();

		// ���� �޼ҵ� ȣ��
		double width = ct.calWidth();

		// �ѷ� �޼ҵ� ȣ��
		double length = ct.calLength();

		// ��� �޼ҵ� ȣ��
		ct.print(width, length);

	}
}

*/