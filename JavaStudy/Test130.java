/*===========================
  ���� Ŭ���� ��� ����
  - ��ø Ŭ����(���� Ŭ����) p403 ����Ŭ���� ����
===========================*/

/*
�� Annonymous Ŭ����(�͸��� Ŭ����, ���� Ŭ����)

   - AWT �� �ȵ���̵� �̺�Ʈ ó������ �Ϲ������� ���.
   - ���� Ŭ���� �޼ҵ带 �ϳ� ���� �������� �ʿ伺�� ���� �� ���.
   - Ŭ������ ��ü�� �ʿ��ϸ� �� �ٽ� Ŭ������ �����ؾ� �ϴ�
     ���ŷο����� ���� �͸��� Ŭ������ �����Ͽ� ó���� �� �ִ�.

�� ���� �� ����

   new ����Ŭ������ ������()
   {
	   �������������� �ڷ��� �޼ҵ�()
	   {
		   ...;
	   }
   };	// �� �ݵ�� �����ݷ� �ʿ���~!!


// ��, Ŭ������ �޼ҵ� �� �ϳ��� ��������� Ŭ�������� �� �ϸ� ���ŷο�ϱ� ����?

*/

//package default;

//import java.lang.*;	��	import java.lang.Object;

class Test3 // extends Object
{
	/*
	
	Object Ŭ������ �����...
	...
	...
	
	public String toString()
	{
		...;
	}

	*/

	public Object getString()
	{
		//return ...;
		//	     ----
		//       Object Ÿ�� ... ��Line83 ����

		//return new Object();
		//	     ------------
		//	     Object Ÿ��
		
		// �ؿ��� new Object(); �� new Object() {...};�� �Ѱ�
		//						   -------------------
		//							Object Ÿ��

		return new Object()
		{
			@Override
			public String toString()
			{
				return "�͸��� Ŭ����...";
			}
		};
	}		// �� �����ݷ� check~!!!

}


public class Test130 // extends Object
{
	/*
	Object �� �����ִ� �����
	��, Object�� ���� ��ӹ޴� �����
	...
	*/

	public static void main(String[] args)
	{
		Test3 ob1 = new Test3();
		Test3 ob2 = new Test3();

		System.out.println(ob1.toString());
		//--==>> Test3@15db9742

		System.uut.println(ob2.getString());
		//--==>> �͸��� Ŭ����...
	}
}

/*
public int �޼ҵ��()
{
	return 10;
		   ---
		   int Ÿ��
}

public Scanner �޼ҵ��()
{
	Scanner sc = new Scanner(System.in);

	return sc;
		   ---
		   Scanner Ÿ��
}

public Scanner �޼ҵ��()
{
	
	return new FruitSeller();
		   -----------------
		   	FruitSeller Ÿ��
		  
}

*/