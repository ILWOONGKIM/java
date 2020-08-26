/*===========================
  ���� Ŭ���� ��� ����
  - �������̽�(Interface) 375p~
===========================*/

// �������̽�
interface Demo
{
	public void write();
	public void print();
}


// Ŭ���� - �������̽��� �����ϴ� �߻� Ŭ����
//class DemoImpl implements Demo
//�������̽��� �����ϴ� �߻� Ŭ����
abstract class DemoImpl implements Demo
{
	/*
	public void write();
	public void print();
	*/

	@Override
	public void write()
	{
		System.out.println("write() �޼ҵ� ������ ... ");
	}

	// public void print();
}

// Ŭ����	
//class DemoImplSub extends DemoImpl
// �߻� Ŭ������ ��ӹ޴� �߻� Ŭ����
//abstract class DemoImplSub extends DemoImpl
// �߻� Ŭ������ ��ӹ޴� Ŭ����
class DemoImplSub extends DemoImpl
{
	@Override
	public void print()
	{
		System.out.println("print() �޼ҵ� ������ ... ");
	}
}

// Ŭ���� - main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����(���� ��Ű��)
public class Test124
{
	public static void main(String[] args)
	{
		//Demo ob1 = new Demo();
		//-- �������̽� �� �ν��Ͻ� ���� �Ұ�
		//DemoImpl ob2 = new DemoImpl();
		//-- �߻�Ŭ���� �� �ν��Ͻ� ���� �Ұ�
		DemoImplSub ob3 = new DemoImplSub();
		
		ob3.write();
		ob3.print();
		//--==>> write() �޼ҵ� ������ ...
		//		 print() �޼ҵ� ������ ...

		

	}
}