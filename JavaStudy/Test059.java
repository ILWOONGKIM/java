/*==============================================
	���� ���� �帧�� ��Ʈ�� (���) ����
	- �ݺ���(for) �ǽ�
	- ���� for��(�ݺ����� ��ø)�� Ȱ��
===============================================*/

// 1���� 100������ �� �� �Ҽ��� ����ϴ� ���Ϸ��� �����Ѵ�.
// ��, for ���� ��ø ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �ϸ�
// 5���� ��µ� �� ���� ���� ó���� �� �ֵ��� �Ѵ�.

// ���� ��)
// ====[1���� 100������ �Ҽ�]====
//  2	3	5	7	11
//	13	17	19	23	29
//			:
// ����Ϸ��� �ƹ� Ű�� ��������...


public class Test059
{
	public static void main(String[] args)
	{			
		int divisor;		//-- ������ ���� ��Ƴ� ����
		int count = 0;		//-- ������ ���� ��� �׸��� ī��Ʈ�� ����

		System.out.println("====[1���� 100������ �Ҽ�]====");
		for (int number=2; number<=100; divisor++)	// 2,3,4 ...99 100
		{
			for (divisor=2; number%divisor!=0; divisor++);		//--"�ſ��߿�!!"-->> for �� ���� ;�� ���̰� ���๮�� ������?
																//-->> �ι�°�� ���̸� divisor++(����), �����̸� �����ٷ� �Ѿ�� ���� �̿�
			

			// Ȯ��
			// System.out.printf("number: %d, divisor : %d\n", number, divisor);
			
			if (divisor==number)
			{
				System.out.printf("%5d", number);

				if (++count%5==0)
				System.out.println();
			}

			
		}


	}		
			
}


/*(���� Ǯ��)
		// outer for���� 2 3 5 7 11�� 5���� ��� �� �����ϴ� �������
		// inner for���� �Ҽ����� �Ǻ��ϴ� �ݺ��۾� ���

		
		int count=0;

		System.out.println("====[1���� 100������ �Ҽ�]====");

		for (int i=1; i<=100; i++)
		{
			for (int j=2; j<=i; j++)
			{
				if(i%j==0)
				{
					if (i==j)
					{
						System.out.printf("%4d", i);
						count++;

						if (count%5==0)
						{
							count=0;
							System.out.println();
						}
					}
					
					else if (i!=j)
					{
						break;
					}
				
				}
			}	
			
		}
*/

/*(��Ȯ��)

		int j;

		for (j=2; j<=100; j++)
		{
			if (j<=10)
			{
				if (j==2 && j==3 && j==5 && j==7)
				{
					System.out.printf("%4d", j);
				}
			}

			else if (j%2!=0 && j%3!=0 && j%5!=0 && j%7!=0)
				{
					System.out.printf("%4d", j);
				}

				
		}
*/
		


/*
			System.out.printf("%4d", n);	//-- %4d�� 4ĭ���� �װ��� �������� ����������
			if(n%(4*5)==0)					//-- n�� 4*5�� ����� �� �� �� 20�� ���
				System.out.println();

*/