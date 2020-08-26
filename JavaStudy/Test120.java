/*===========================
  ���� Ŭ���� ��� ����
  - �߻� Ŭ����(Abstract) - '�̿ϼ���' Ŭ���� -> �ϼ��� ��ü ���� ��
 ===========================*/

/*
��  �߻� Ŭ����(Abstract)
	���� �ְ� ���ǰ� ���� �ϳ� �̻��� �޼ҵ�(�߻� �޼ҵ�)�� ���� Ŭ������
	���� Ŭ�������� �������̵�(Overriding)�� ������ ����Ǵ� �޼ҵ忡 ����
	�޸� ���� ���� �̸� ȣ�� ��ȹ�� �����α� ���� �����.

�� ���� �� ����
   [��������������] abstract class Ŭ������
   {
		[��������������] abstract �ڷ��� �޼ҵ��([�Ű�����], ...)
   }

�� Ư¡
   Ŭ������ ��� �ϳ� �̻��� �߻� �޼ҵ带 ������ ��
   �� Ŭ������ Ŭ���� �տ� ��abstract�� Ű���带 �ٿ�
   �߻� Ŭ������ ����ؾ� �ϸ�,
   �߻� Ŭ������ ������ ��쿡��
   �ҿ����� ������ Ŭ�����̹Ƿ� ��ü�� ������ �� ����.
   �߻� �޼ҵ尡 �������� �ʴ� �߻� Ŭ����������
   ��ü�� ������ �� ���� ���̴�.

   ��, �߻� Ŭ������ ���������� ������ �� ���� ������
   ����� ���ؼ��� �����ϸ�
   �߻� Ŭ�������� ��ӹ��� ���� Ŭ����������
   �ݵ�� �߻� �޼ҵ带 �������̵�(Overriding)�ؾ� �Ѵ�.

��	��abstract�� Ű�����	
	Ŭ������ �޼ҵ忡���� ����� �� ������
	��� ������ ���� ���������� ��� �Ұ����ϴ�.


// �� ������ ����°� �޼ҵ� ���Ҹ� �ϵ��� abstract���̸鼭 �̿ϼ��λ��·� �ΰ� ;����
// �߻� �޼ҵ带 �ϳ��� ������ �ش�Ŭ������ �߻�Ŭ����
// �߻�Ŭ������ �ν��Ͻ� �����Ұ�
// ����� ���ٸ� ���簡ġ�� ����
	
*/

abstract class SortInt120
{
	private int[] value;


	protected void sort(int[] value)
	{
		this.value = value;
		sorting();
	}

	// �߻� �޼ҵ�
	protected abstract void sorting();		// ���𱸸� �ְ� ���Ǳ��� ���� �� �߻�޼ҵ�
											// �ʰ� ��ȣ�ϴ´�� �����ؼ������ �ǹ�

	protected int dataLength()
	{
		return value.length;
	}
	
	// ��final�� Ű����� ����
	// �� Ŭ������ SortInt120�� ��ӹ޴� Ŭ��������
	// �� �޼ҵ带 ������(Method Overriding)�� �� ����.
	protected final int compare(int i, int j)	// ũ��� �޼ҵ�
	{
		int x = value[i];
		int y = value[j];
		if (x==y)
			return 0;
		else if(x>y)
			return 1;
		else
			return -1;
	}
	
	// ��(final)
	protected final void swap(int i, int j)		// �ڸ��ٲ� �޼ҵ�
	{
		int temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}

}

// SortInt120 Ŭ������ ��ӹ��� Ŭ����	��	�߻� �޼ҵ带 ��ӹ޾����Ƿ� �ϴ� �߻� �޼ҵ�
// �� �߻� �޼ҵ� ��sorting()���� Overriding �� �Ϲ� ���� Ŭ����
//public abstract class Test120 extends SortInt120
public class Test120 extends SortInt120
{

	/*----------------------------------
	
	protected void sort(int[] vaule)
	{
		this.value = value;
		sorting();
	}
	protected abstract void sorting();		
	protected int dataLength()
	{
		return value.length;
	}
	protected final int compare(int i, int j)	// ũ��� �޼ҵ�
	{
		int x = value[i];
		int y = value[j];
		if (x==y)
			return 0;
		else if(x>y)
			return 1;
		else
			return -1;
	}
	protected final void swap(int i, int j)		// �ڸ��ٲ� �޼ҵ�
	{
		int temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}

	------------------------------------*/

	int i, j;

	static int[] data = {7, 10, 3, 8, 7};


	@Override
	
	//protected abstract void sorting();
	protected void sorting()
	{
		// ����	�� �ϼ�

		// selection sort
		for (i=0; i<datalength()-1; i++)
		{
			for (j = i+1; j<datalength(); j++)
			{
				// ũ���
					// �ڸ��ٲ�
				if (compare(i, j)>0)	// int�� ���� ��������, compare(i, j)==1�̾ ��
					swap(i,j)			

			}
		}
	}



}

	public static void main(String[] args)
	{
		//SortInt120 ob = new SortInt120();
		// �߻��̶� �Ұ�
		//Test120 = new Test120();
		// ��ӹ��� ���� �ν��Ͻ� ���� �Ұ��� �� ���������� �߻��̶� �Ұ�

		System.out.print("Source Data : ");
		for (int n : data)
			System.out.print(n + " ");
		System.out.println();

		Test120 ob = new Test120();
		ob.sort(data);

		System.out.print("Sorted Data : ");
		for (int n : data)
			System.out.print(n + " ");
		System.out.println();
	}
}