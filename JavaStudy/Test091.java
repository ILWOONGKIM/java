/*====================
 ���� �迭 ����
 - �迭�� �迭(2���� �迭)
=====================*/

// �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
// ������ ���� �����͸� ��ҷ� ���ϴ� �迭(5*5)�� �����ϰ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �迭�� �����ϴ� ������ ����ϴ� ������
// ������ �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
/*					������ ����				����� Ư¡
  1  6  11  16  21	�� n n+5 +5 ...		��i=0 j=0 �� 1 ���
  2  7  12  17  22  �� n+1 n+5 +5 ...	��i=1 j=1 �� 2 ��� 
  3  8  13  18  23	�� (n+1)+1 n+5 +5 ...��i=2 j=2 �� 3 ��� 
  4  9  14  19  24	�� 					��i=3 j=3 �� 4 ��� 
  5 10  15  20  25	�� 					��i=4 j=4 �� 5 ��� 
  ����Ϸ��� �ƹ�Ű�� ��������...
*/
// i j
// 0 0  =  1
// 0 1  =  6
// :
// 1 0  =  2
// 1 1  =  7


// j���� n�� +5��ŭ ����
// i���� j�� 0�϶� n�� i+1�� �ʱ�ȭ �ǰ�, +1��ŭ ����
// n�� i,j���� ����� j++ -> n += 5
//					 if (j==0) i++ -> n += i+1

public class Test091
{
	public static void main(String[] args)
	{
		int[][] arr = new int[5][5];

		int n=1;

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				arr[j][i] = n++;		// ji		ji			ji	
										// 00 �� 1	00 �� 6		02 �� 11
										// 10 �� 2	00 �� 7		12 �� 12
										// 20 �� 3	00 �� 8		22 �� 13
										// 30 �� 4	00 �� 9		32 �� 14
										// 40 �� 5	00 �� 10	42 �� 15 
			
		}

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%3d", arr[i][j]);

			}
			System.out.println();
		}

		}
	}
}

/*
public class Test091
{
	public static void main(String[] args)
	{
		int[][] arr = new int[5][5];

		int n=1;

		for (int i=0; i<arr.length; i++)
		{
			n = i+1;

			for (int j=0; j<arr[i].length; j++)
			{
				arr[i][j] = n;

				if (j==0)
				{
					n=i+1;
				}			
				n += 5;		
			}
		

				
		}

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%3d", arr[i][j]);

			}
			System.out.println();
		}

	}
}

*/