/*==================================
  ���� ����(Sort) �˰��� ����
  - ���� ���� ����(Bubble Sort)
===================================*/

// ����ڷκ��� ���� �л��� ���� �����͸� �Է¹޾�
// ������ ���� ������ ����� �ο��Ͽ� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �迭�� ���� �˰����� Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// �ο� �� �Է� : 5
// �̸� ���� �Է�(1) : ���ΰ� 90
// �̸� ���� �Է�(2) : �ڴٺ� 80
// �̸� ���� �Է�(3) : ����� 85
// �̸� ���� �Է�(4) : ������ 75
// �̸� ���� �Է�(5) : ������ 95

/*
---------------
1�� ������ 95
2�� ���ΰ� 90
3�� ����� 85
4�� �ڴٺ� 80
5�� ������ 75
---------------
����Ϸ��� �ƹ�Ű�� ��������...
*/
//�� 2���� 2���� ���, �� ���� ����� 3������ ó��



// �ο� �� �Է¹��� ����ŭ �迭 ����

// ����� ������� ���ĵ�

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class Test114
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		Scanner sc = new Scanner(System.in);

		// ����ڷκ��� �ο� �� �ޱ�
		System.out.print("�ο� �� �Է� : ");
		n = Integer.parseInt(br.readLine());

		// ���� �ο� �� ��ŭ �迭�ϸ鼭, �̸����� �Է¹ޱ�
		// �迭 ���� �� ���� ����ȭ, �Է¹��� �̸�, ������ ���� ���� ����
		int[] arr = new int[n];
		String name;
		int score;

		for (int i=0; i<arr.length; i++)
		{
			// ���� �̸�, ���� ���鱸���Ͽ� �Է¹ް�
			System.out.printf("�̸� ���� �Է�(%d) : ", n);
			
			// �̸��� name, ������ score�� '����' ���
			name = sc.next();
			score = sc.nextInt();
		
			// ������ ���� �ٽ� �迭�Ѵ�(�ڿ� ��� �����ϱ�����)
			int[] Score = new int[score]; 

		}
		
		// ���� ���������� �迭(int[] Score)��
		// �ش� �迭�� ������� ����� ���� �ο�
		String rank;

		for (; ; )
		{
		}

		// �ο��� ����� ���� ������ ����(Sort)

	}
}