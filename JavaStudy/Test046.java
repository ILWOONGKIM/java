/*==============================================
	���� ���� �帧�� ��Ʈ�� (���) ����
	- �ݺ���(while) �ǽ�
===============================================*/

// ���� ��)
// 1���� 100���� ������ �� : xxxx
// 1���� 100���� ¦���� �� : xxxx
// 1���� 100���� Ȧ���� �� : xxxx
// ����Ϸ��� �ƹ� Ű�� ��������...


public class Test046
{
	public static void main(String[] args)
	{

		// �ֿ� ���� ����
		int n=1, sum, even, odd;
		sum=even=odd=0;

		while (n<=100)
		{
			sum+=n;

			if(n%2==0)
			{
				even+=n;
			}
			else if(n%2!=0)
			{
				odd+=n;
			}
			else
			{
				System.out.println("�Ǻ� �Ұ� ������");
				return;
			}
			n++;
		}

		// ��� ���

		System.out.println("1���� 100���� ������ �� : " + sum);
		System.out.println("1���� 100���� ¦���� �� : " + even);
		System.out.println("1���� 100���� Ȧ���� �� : " + odd);


		/*

		int n=1;
		int sumN=0, sumEven=0, sumOdd=0;

		while (n<=100)
		{
			if (n%2==0)
			{
				sumEven += n;
			}
			else if (n%2!=0)
			{
				sumOdd += n;
			}
			
			sumN += n;
			n++;
		}

		System.out.println("1���� 100���� ������ �� : " + sumN);
		System.out.println("1���� 100���� ¦���� �� : " + sumEven);
		System.out.println("1���� 100���� Ȧ���� �� : " + sumOdd);

		*/


	}
}