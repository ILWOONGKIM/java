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
/*
  1  2  3  4  5 i=0 n=1
  2  3  4  5  6 i=1 n=2
  3  4  5  6  7 i=2 n=3
  4  5  6  7  8 i=3 n=4
  5  6  7  8  9 i=4 n=5
  ����Ϸ��� �ƹ�Ű�� ��������...
*/

public class Test089
{
	public static void main(String[] args)
	{
		// �迭�� �迭 ���� �� �޸� �Ҵ�
		int[][] arr = new int[5][5];

		int n;

		for (int i=0; i<arr.length; i++)
		{
			n=i+1;		// n=0+1 / n=1+1 / n=2+1 / n=3+1 / n=4+1
						// n=1		n=2		n=3		n=4		n=5

			for (int j=0; j<arr[i].length; j++)
			{
				arr[i][j]=n;
				n++;
			}


		}
		
		// ��ü ��� ���
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[j].length; j++ )
			{
				System.out.printf("%3d", arr[i][j]);
			
			}
			System.out.println();
		}



/*

public class Test089
{
	public static void main(String[] args)
	{
		// �迭�� �迭 ����
		int[][] arr = new int[5][5];
		
		// �ʱ�ȭ�� ��� ũ�⸦ ���� ���� ���� �� �ʱ�ȭ
		int n=1;

		// �迭�� �迭 ����ȭ

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				arr[i][j]=n;
				n++;
			}
			n -= 4;
		}

		// ���� �� ���
		
		for (int i=0; i<arr.length ; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%3d",arr[i][j]);
			}

			System.out.println();

		}


*/
			
		// �迭 ->	  0			 1			 2			3			4				
		//        1 2 3 4 5  2 3 4 5 6	3 4 5 6 7  4 5 6 7 8    5 6 7 8 9
		// arr[0][0] = 1,  arr[0][1] = 2,  arr[0][2] = 3, ...  arr[0][4] = 5, arr[1][0] = 2

	}
}

// int m=0;
