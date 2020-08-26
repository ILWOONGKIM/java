/*====================
 ���� �迭 ����
 - �迭�� ���� ó��
=====================*/

// �� Random Ŭ���� Ȱ��

// ����ڷκ��� ������ ������ �Է¹޾�
// �� ������ ������ŭ ����(1~100)�� �߻����Ѽ� �迭�� ��Ƴ���
// �迭�� ����ִ� �����͵� ��
// ���� ū ���� ���� ���� ���� �����Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// �߻���Ų ������ ���� �Է� : 6
// (53 17 6 9 4 5 �� �������� �߻��� ���� ������ ������..)
// (int[] arr = {53, 17, 69, 45, 10, 55}; �� �迭�� ��Ƴ���)
// ���� ū �� : 69, ���� ���� �� : 10
// ����Ϸ��� �ƹ� Ű�� ��������..

import java.util.Scanner;
import java.util.Random;

public class Test098
{
	public static void main(String[] args)
	{
//��		Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		// �ȳ� �޼��� ���
		System.out.print("�߻���Ų ������ ���� �Է� : ");
		int size = sc.nextInt(); 

		// size ������ ��Ƴ� �� ��ŭ�� �迭�� �����
		// (�迭 ���� �� �޸� �Ҵ�
		int[] arr = new int[size];

		// ������ ����(����)�� �߻���Ű�� ���ؼ���
		// ���� �߻� ���� ��ü�� �ʿ��ϴ�.
		// �� ��java.util.Random�� , Random �ν��Ͻ� ����
		Random rd = new Random();

		// �� Random Ŭ������ ��nextInt(int n)�� �޼ҵ�
		//-- 0 ~ �Ű������� �Ѱܹ��� ���� n-1 ������ �� ��
		//	 ������ ����(����) 1���� �߻���Ų��.

		// �׽�Ʈ(Ȯ��)
		//System.out.print("�߻��� ���� : " + rd.nextInt(10));
									 //Random�� nextInt, 0~9������ ������ ���� "1��" ��ȯ
		

		// �迭 ����(�ʱ�ȭ) �� �߻��� ������ �迭�濡 ���� ��Ƴ���, size ������ŭ �����߻����Ѿ���
		for (int i=0; i<size; i++)	// 0���� ���������Ƿ� size�� ���� �ȵ�.
		{
			//arr[i] = rd.nextInt(100);
			//-- 0~99 ������ ���� �Ѱ� �߻�, for������ size�� ��ŭ �ݺ� �Է¹���

			arr[i] = rd.nextInt(100)+1;
			//-- 1~100 ������ ���� �Ѱ� �߻�, for������ size�� ��ŭ �ݺ� �Է¹���
		}

		// �׽�Ʈ(Ȯ��) �� ������ �迭�� ��ü ��� ���
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	

		/*
		�߻���Ų ������ ���� �Է� : 10
		�߻��� ���� : 2 1  26  72  54  49  56  51  79  29  19
		����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
		*/

// ��		���� ū ��, ���� ���� �� Ȯ��
		int max, min;		//--�ִ밪, �ּҰ�
		max=min=arr[0];		// max = min = 2,  min�� 2�� ��� �״��� max���� ����
		
		for (int i=1; i<arr.length; i++)		// i=1���� �ϴ�����, �������� (2�� 2)�� ���� �ʿ���
		{
			if (max<arr[i])
				max=arr[i];		// max=79;
			if (min>arr[i])
				min=arr[i];		// min=2�� ������
		}


		// ���� ��� ���
		System.out.printf("���� ū �� : %d, ���� ���� �� : %d\n", max, min);


	}
}

// ���� ���
/*

�߻���Ų ������ ���� �Է� : 10
99 5 86 39 78 73 89 27 91 79
���� ū �� : 99, ���� ���� �� : 5
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


*/