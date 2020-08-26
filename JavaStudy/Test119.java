/*==================================
  ���� Ŭ���� ��� ����
  - ���(Inheritance)
  ==================================*/

/*
�� �޼ҵ� �������̵�(Method Overriding)�� Ư¡


	- �޼ҵ� �̸�, ����Ÿ��(��ȯ �ڷ���), �Ķ���� ���� Ÿ���� ������ ��ġ�ؾ� �Ѵ�.

	- �ݵ�� ��� ���谡 �־�� �Ѵ�.

	- �����ǵ� ���� Ŭ������ �޼ҵ� �������������ڴ�
 	  ���� Ŭ������ �޼ҵ� �������������ں��� ������ ũ�ų� ���ƾ� �Ѵ�.
	  ���� ���, ���� Ŭ���� �޼ҵ��� �������������ڰ� ��protected���� ���
	  ���� Ŭ������ �� �޼ҵ带 �������̵�(Overriding)�ϴ� ���
	  �������������ڴ� ��protected�� �Ǵ� ��public�� �̾�� �Ѵ�.

				�޼ҵ嵵 final�� ���������ϳ�, 				private�� �����Ŀ�� ������ü�� �� �ȴ�
	- ��static��, ��final��, ��private�� �޼ҵ�� �������̵�(Overriding) �� �� ����.
	  ���� �¾�µ� �ٽ� �����..?	

	- Exception�� �߰��� �Ұ����ϴ�.
	  ��, ���� Ŭ������ �޼ҵ尡 ������ �ִ� ���� ���� ���׿�
	  ���ο� Exception�� �߰��ϴ� ���� �Ұ����ϴٴ� ���̴�.

*/

// �θ� Ŭ����
class SuperTest119
{
	private int a = 5;
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		//System.out.println("Super write() �޼ҵ� : " + a + " : " + b + " : " + c);
		//-- Super Class���� ����� ���� a���� ������ �� ����.
		//	�� private �����̱� ������...

		System.out.println("Super print() �޼ҵ� : " + a + " : " + b + " : " + c);

	}

}

// �ڽ� Ŭ����
class SubTest119 extends SuperTest119
{
	protected int b = 100;

	public void print()
	{
		System.out.println("Sub print() �޼ҵ� : " + b + " : " + c);

		//System.out.println("Super print() �޼ҵ� : " + b);
		//System.out.println("Sub print() �޼ҵ� : " + this.b);
		//System.out.println("Sub print() �޼ҵ� : " + super.b);
		//-- ���� b�� ���� ����� ����
		//	 �ٸ� b�� ���� �� ����� �̷������.
		//	 ����Ŭ�������� ����� b, ����Ŭ�������� ����� b

		//System.out.println("Super print() �޼ҵ� : " + c);
		//System.out.println("Super print() �޼ҵ� : " + this.c);
		//System.out.println("Super print() �޼ҵ� : " + super.c);
		//-- ���� c�� �����ϴµ� �ƹ��� ����� ������ ����.
		//	 ����Ŭ�������� ����� c

	}

	@Override
	public void write()
	{
		//System.out.println("Sub write() �޼ҵ� : " + a + " : " + b + " : " + c);
		// �������ϱ� ������ ����(���ڿ��� �ٸ�, ~�޼ҵ�), ������ a�� private�̶� �����Ͽ���
		//-- Super Class���� ����� ���� a���� ������ �� ����.
		//		�� private �����̱� ������...
		System.out.println("Sub write() �޼ҵ� : " + b + " : " + c);

	}

}

// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����(���� ��Ű��)
public class Test119
{
	public static void main(String[] args)
	{
		// ���� Ŭ����(SubTest119) �ν��Ͻ� ����
		SubTest119 ob = new SubTest119();
		ob.print();
		//--==>>Sub print() �޼ҵ� : 100 : 20

		// write() �޼ҵ带 override�ϱ� ���� ��Ȳ
		ob.write();
		//--==>>Super print() �޼ҵ� : 5 : 10 : 20

		// write() �޼ҵ带 override�ϱ� ���� ��Ȳ
		//--==>>Sub write() �޼ҵ� : 100 : 20

		System.out.println("-----------------------------------------------------------���м�");

		System.out.println(ob.b);
		//--==>> 100

		//System.out.println(ob.super.b)
		// super��� Ű���带 ���ٸ� �ش� Ű���尡 ���Ե� Ŭ����(Test119)�� ���� �� �θ�Ŭ������ ���� b�� ã�ƾ�
		
		System.out.println( ((SuperTest119)ob).b);
		//--==>> 10
		// �� ���� �θ�

		//((SuperTest119)ob).write();
		//--==>>Sub write() �޼ҵ� : 100 : 20
		// �ڽ��� �������� �޼ҵ�� ����
		// �θ�κ��� ���� write()�� '�̹� ����������' ���� ���� �Ұ�

		// �� �޼ҵ�� ������ ��!!!!!!!!!!!!!!!!!!!!! �����Ͽ� ���� �� �� !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


	}
}