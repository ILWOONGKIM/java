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
  1  8  9 16 17   
  2  7 10 15 18
  3  6 11 14 19  
  4  5 12 13 20  
*/

// 1. i�� j �ٲ�
// 2. �ٲۻ��·� i�� j ¦���϶� Ȧ���϶� ������

public class Test093
{
	public static void main(String[] args)
	{
		// �迭�� �迭 ���� �� �޸� �Ҵ�
		int[][] arr = new int[4][5];
		
		int n=0;
		
		for (int i=0; i<5; i++)		// i �� 0 1 2 3 4 (arr.length=4���� 5�κ���)
		{
			for (int j=0; j<4; j++) // j �� 0 1 2 3
			{
				n++;		// n�� 0���� �ʱ�ȭ �Ǿ 1����������
				//arr[j][i] = n;
				// ���� ����غ���, ���ǹ� ���
				if (i%2==0)
					arr[j][i] = n;
				else
					arr[3-j][i] = n;	// �� �׽�Ʈ������ ���ηΰ��ٰ� �������� ����ŭ �������� ������
										// ���⼱ j�� �ִ� �տ����ͻ��ش�
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

/*

public class Test093
{
	public static void main(String[] args)
	{
		int[][] arr = new int[4][5];
		
		int n=1;
 
		for (int i=0; i<5; i++)
		{
			for (int j=0; j<4; j++)
			{
				if (i%2==0)
					arr[j][i] = n++;
				else
					arr[3-j][i] = n++;
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