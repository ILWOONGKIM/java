/*====================
 ���� �迭 ����
 - �迭�� �⺻�� Ȱ��
=====================*/

// ����ڷκ��� ó�� �Է¹��� �ο� �� ��ŭ��
// �л� �̸��� ��ȭ��ȣ�� �Է¹ް�
// �Է¹��� ������ ��ü ����ϴ� ���α׷��� �����Ѵ�.
// ��, �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.

// ���� ��)
// �Է� ó���� �л� �� �Է�(��, 1~10) : 27
// �Է� ó���� �л� �� �Է�(��, 1~10) : 3
// �̸� ��ȭ��ȣ �Է�[1](���� ����) : ����� 010-1111-2222
// �̸� ��ȭ��ȣ �Է�[2](���� ����) : ������ 010-2222-3333
// �̸� ��ȭ��ȣ �Է�[3](���� ����) : ������ 010-3333-4444

// ----------------
// ��ü �л� �� : 3��
// -----------------
// �̸� ��ȭ��ȣ
// ����� 010-1111-2222
// ������ 010-2222-3333
// ������ 010-3333-4444
// -----------------
// ����Ϸ��� �ƹ�Ű�� ��������...



// �Է¹��� �ο��� -> �迭 ���� ���� -> buffered integer
// �̸� ��ȭ��ȣ[1] -> scanner, �迭�� ���� �޾Ƽ� �迭�� ����ŭ ���
// 

import java.util.Scanner;
import java.io.IOException;

public class Test084
{
	public static void main(String[] args) throws IOException
	{
		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		// ����ڰ� �Է��ϴ� �л� ���� ��Ƶ� ����
		int memCount = 0;

		do
		{
			System.out.print("�Է� ó���� �л� �� �Է�(��, 1~10) : ");
			memCount = sc.nextInt();
		}
		while (memCount<1 || memCount>10);											// �������, ��ȿ�� �л����� �Է¹��� ����

		
		// �׽�Ʈ(Ȯ��)
		System.out.println("����ڰ� �Է��� �ο� �� : " + memCount);		// �ش� �ο�����ŭ, �̸��� ��ȭ��ȣ�� �Է¹ް�
																			// �ش� �迭�� ���� �°� ��ƾ��Ѵ�.


		// �̸� ���� �迭 ����
		String[] names = new String[memCount];


		// ��ȭ��ȣ ���� �迭 ����
		String[] tels = new String[memCount];
		//String[] tels = new String[names.length]; // ���� ��


		// for(int i=0; i<tels.length; i++)
		// for(int i=0; i<names.length; i++)

		for (int i=0; i<memCount; i++)
		{
			System.out.printf("�̸� ��ȭ��ȣ �Է�[%d](���� ����) : ", (i+1));

			names[i] = sc.next();
			tels[i] = sc.next();
		}
		
																					// �������, �̸� ��ȭ��ȣ�� �Է¹��� ����

		// ��� ���(�̸�,��ȭ��ȣ)

		System.out.println("-----------------");
		System.out.printf("��ü �л� �� : %d\n", memCount);
		System.out.println("-----------------");
		System.out.println("�̸� ��ȭ��ȣ");

		for (int i=0; i<memCount; i++)
		{
			System.out.printf("%4s %13s\n", names[i], tels[i]);
		}

		System.out.println("-----------------");



		/*
		// �迭 ���� �� ����, �ʱ�ȭ

		int n;							// �Է¹��� �Է�ó���� �л���
	
		Scanner sc = new Scanner(System.in);

		do
		{ 
			System.out.print("�Է� ó���� �л� �� �Է�(��, 1~10) : ");
			n = sc.nextInt();
		}
		while (n>10||n<1);
		

		String[] arr = new String[3];			// �迭


		// �̸�, ����ȣ �ޱ�
		
		String name, phone;
		

		for (int i=0; i<n; i++)
		{

		// �ݺ������� �̸�, ����ȣ �ޱ�

			System.out.printf("�̸� ��ȭ��ȣ �Է�[%d](���� ����) : ", i+1);
			name = sc.next();
			phone = sc.next();

			arr[i] = name + " " + phone;
		}

		// ��±���

		System.out.println("-----------------");
		System.out.printf("��ü �л� �� : %d\n", n);
		System.out.println("-----------------");
		System.out.println("�̸� ��ȭ��ȣ");

		for (int j=0; j<arr.length; j++)
		{
			System.out.println(arr[j] + " ");
		}
		System.out.println("-----------------");
		*/
;

// ----------------
// ��ü �л� �� : 3��
// -----------------
// �̸� ��ȭ��ȣ
// ����� 010-1111-2222
// ������ 010-2222-3333
// ������ 010-3333-4444
// -----------------
// ����Ϸ��� �ƹ�Ű�� ��������...

		

/*
		arr[0] = "����� 010-1111-2222";
		arr[1] = "������ 010-2222-3333";
		arr[2] = "������ 010-3333-4444";
*/
		

	}
}
