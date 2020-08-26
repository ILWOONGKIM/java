/*====================
 ���� �迭 ����
 - �迭�� �迭(2���� �迭)
=====================*/

// �۰���
// �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
// ������ ���� �����͸� ��ҷ� ���ϴ� �迭(5*5)�� �����ϰ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �迭�� �����ϴ� ������ ����ϴ� ������
// ������ �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
/*					i=0,1,2,3..,j=4
	1	 2	 3	 4	 10
	5	 6	 7	 8	 26
	9	10	11	12	 42
   13	14	15	16	 58
   28	32	36	40	136
i=0,j=0,1,2,3

����Ϸ��� �ƹ� Ű�� ��������..
*/

// 1. i�� ����Ҷ� n=i+4�� �ʱ�ȭ
// 2. j�� arr[i][j] = n;, n++; �ε� 
// 2-1. if(j==4) �� sum = arr[0][4] + arr[1][4] + ... + arr[3(=i-1)][4]
// 2-2. if(i==4) �� sum = arr[0][4] + arr[1][4] + ... + arr[3(=j-1)][4]

// (�״��� ���� i���� n �� n=i+4�� �ʱ�ȭ
// 3. ���


public class Test095
{
	public static void main(String[] args)
	{
		// �迭�� �迭 ���� �� �޸� �Ҵ�

		int[][] arr = new int[5][5];

		int n=0;

		for (int i=0; i<4; i++)		// 5x5 ����� ij �Ѵ� 4������
		{
			for (int j=0; j<4; j++)
			{
				n++;
				arr[i][j] = n;

				arr[i][4] += arr[i][j];	// 00 �� 1 01 �� 2 02  �� 3 ...

			/*
			   1   2   3   4  10
			   5   6   7   8  26
			   9  10  11  12  42
			  13  14  15  16  58
			   0   0   0   0   0
			*/

				arr[4][j] += arr[i][j];

			/*
			   1   2   3   4  10
			   5   6   7   8  26
			   9  10  11  12  42
			  13  14  15  16  58
			  28  32  36  40   0
			
			*/
			
				arr[4][4] += arr[i][j];

			}
				
		}

		
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%4d", arr[i][j]);
			

			}
			System.out.println();
		}
	}
}


/*
public class Test095
{
	public static void main(String[] args)
	{
		// �迭�� �迭 ���� �� �޸� �Ҵ�

		int[][] arr = new int[5][5];

		int n=1;
		int sum=0;

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				arr[i][j] = n;
				n++;

				if (j==4)
				{
					for (int k=0; k<4; k++)
					{
						sum =n;
						n += arr[k][4];
					}
				}
				
			}
			

		}

	
		
		// ��ü ��� ���
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%4d", arr[i][j]);
			

			}
			System.out.println();
		}
	}
} 

*/