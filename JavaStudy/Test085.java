/*====================
 ���� �迭 ����
 - �迭�� �⺻�� Ȱ��
=====================*/

// �۰���
// ����ڷκ��� ������ ������ ������ ������ŭ �Է¹޾�
// �Է¹��� �� �߿��� ���� ū ���� ����ϴ� ���α׷��� �ۼ��Ѵ�.
// ��, �迭�� Ȱ���Ͽ� ������ �� �ֵ��� �Ѵ�.

// ���� ��)
// �Է��� �������� ����		: 10
// ������ �Է�(���� ����)	: 74 65 92 13 2 86 7 12 25 64 50
// >> ���� ū �� �� 92
// ����Ϸ��� �ƹ� Ű�� ��������...



import java.util.Scanner;
import java.io.IOException;

public class Test085
{
	public static void main(String[] args) throws IOException
	{
		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		// �Է��� �������� ������ ���� ����
		int count = 0;
		
		System.out.print("�Է��� �������� ���� : ");
		count = sc.nextInt();
		
		System.out.print("������ �Է�(���� ����) : ");


		// �迭 ����

		int[] arr = new int[count];

		for (int i=0; i<arr.length ; i++)
		{
			arr[i] = sc.nextInt();

		}
		
		// ���� ū ��
		
		int max=arr[0];

		for (int i=0; i<arr.length; i++)
		{
			if (arr[i]>max)
			{
				max = arr[i];
			}
			
		}

		System.out.printf("���� ū �� �� %d\n", max);

	}
}

// ���� ���
/*
�Է��� �������� ���� : 4
������ �Է�(���� ����) : 30 70 50 60
���� ū �� �� 70
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/