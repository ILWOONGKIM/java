/*===========================
  ���� Ŭ���� ��� ����
  - ��ø Ŭ����(���� Ŭ����) p403 ����Ŭ���� ����
===========================*/

class Test2
{
	static int a = 10;		// a : ��������, Test2�� �������, static ����
	int b = 20;				// b : ��������, Test2�� �������, instance ����

	void write()			// �� ù ��° write() �޼ҵ�
	{
		System.out.println("write()...��");
		final int c = 30;	// c : ��������, ���ȭ�� ����(���� ������ �ʴ� ��)
		int d = 40;			// d : ��������, ���� ���÷� ���� �� �ִ� ����


		// �޼ҵ� �ȿ� �����ϴ� �Ǵٸ� Ŭ����(local class, ����Ŭ����)
		class LocalTest		// �ν��Ͻ� ������ �ؾ� �޸��Ҵ�ް� write ���� ����
		{
			void write()	// �� �� ��° write() �޼ҵ�
			{
				System.out.println("write()...��");
				System.out.println("a : " + a);
				System.out.println("b : " + b);
				System.out.println("c : " + c);
				//System.out.println("d : " + d);
				//local variables referenced from an inner class must be final or effectively final
                //               System.out.println("d : " + d);
			}
		}

		// �� ���� c �� ���� d �� �� �� ��������������...
		//	  c �� final �����̱� ������
		//	  �� ��° write() �޼ҵ忡�� ���� �����ϴ���
		//	  ������ ������ ������� �� �ִ�.
		//
		//	  �ݸ鿡 d�� �� ���� ���÷� ������ �� �ִ� ��Ȳ�̹Ƿ�
		//	  LocalTest Ŭ������ �ν��Ͻ� ���� ������
		//	  ������� �� ���� ������ d �� �����ϴ� ���� ���ؾ� �ϴ� ���̴�.

		d = 10;

		LocalTest ob1 = new LocalTest();
		ob1.write();		//-- �� ��° write() �޼ҵ� ȣ��

		d+=10;

	}
}


public class Test128
{
	public static void main(String[] args)
	{
		Test ob2 = new Test2();
		ob2.write();		//-- ù ��° write() �޼ҵ� ȣ��


	}
}
