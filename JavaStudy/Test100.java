/*====================
 ���� �迭 ����
 - �迭�� ����
=====================*/

// ��   �迭 ������ ���翡�� ������ ����, �ּҰ� ���� �� ���� ���°� �����Ѵ�.
//
//	    �ּҰ� ���� �� ���� ���� �� ������ �����ϸ� ���纻�� ������ ��ġ�� �Ǵ� ���� ���,
//									(�迭 �� �ƴ϶� ��� ������ �����Ϳ� �ش��ϴ� ���)
//		������ ���� �� ���� ���� �� ���� ��Ұ� ��� �ִ� ���� ���� �����
//									������ �����ص� ���纻�� ������ ��ġ�� �ʴ� ���� ���, 
// Test099.java ���ϰ� ��

// ������ ����
//	int�� �迭�� ���� ���� �ǹ��� ���縦 ó���ϴ�
//	�޼ҵ带 �����ϴ� ���·� �ǽ��� �����Ѵ�.


public class Test100
{
	public static void main(String[] args)
	{
		int[] nums = {10, 20, 30, 40, 50};			// �迭 ���� ...2

		int[] copys1 = nums;						// ���� �ǹ��� �迭 ���� ����(�ּҰ� ����)

		int[] copys2 = copyArray(nums);				// ���� �ǹ��� �迭 ���� ����(������ ����) ; �ϳ��� ��Ҹ� ���ε��� �Űܴ���
													// (����� ���� �޼ҵ� ȣ��)

		int[] copys3 = (int[])nums.clone();			// ���� �ǹ��� �迭 ���� ����(������ ����) ; �迭�� ��ü�� �ν���
													// (�ڹ� ���� �� clone() �޼ҵ� ȣ��)
		
		// ���� �迭 ����� ����
		nums[1] = 2;
		
		System.out.print("copys1 : ");
		for (int i=0; i<copys1.length; i++)
			System.out.print(copys1[i] + " ");
		System.out.println();
		// 10 2 30 40 50

		System.out.print("copys2 : ");
		for (int i=0; i<copys2.length; i++)
			System.out.print(copys2[i] + " ");
		System.out.println();
		// 10 20 30 40 50

		System.out.print("copys3 : ");
		for (int i=0; i<copys3.length; i++)
			System.out.print(copys3[i] + " ");
		System.out.println();
		// 10 20 30 40 50
	}

	// �Ű������� int �迭 Ÿ���� �Ѱܹ޾�
	// �̸� ������ ��
	// ������ �迭�� ��������� ��ȯ�ϴ� ����� ���� �޼ҵ� ����
	public static int[] copyArray(int[] os)
	//			  -----		      ----  Ÿ�� ���ƾ�
	{
		// �Ű������� �Ѱܹ��� �迭(os)
		// ��, ���� �迭 ��ŭ�� �迭��(�޸� ����, ����)�� Ȯ����
		// ������ �迭�� ����
		int[] result = new int[os.length];
	//						   --------- os�� ũ��, �� os.length�� ���Ǳ��� ��ŭ �迭�� �����ؾ�
										// int[] result = new int[5];
										// ��������δ� result.length = os.length


		// ���� �迭(os)�� ����ִ� ������ ��ҵ��� ���� �迭(result)�� ��Ƴ���
		for (int i=0; i<os.length; i++)		// for (int i=0; i<result.length; i++)		
		{
			result[i] = os[i];
		}

		// ������ �迭(result) ��ȯ		...1
		return result;


	}
}