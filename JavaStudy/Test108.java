/*================================
	���� ����޷� ����
=================================*/

// ���� ��)
// ���������� �Է��ϼ��� : 2021
// �������� �Է��ϼ���	 : 1

/*
	[ 2021�� 1�� ]

 ��  ��  ȭ  ��  ��  ��  ��
============================
					  1	  2
  3   4   5   6   7   8   9
 10  11  12  13  14  15  16
 17  18  19  20  21  22  23
 24  25  26  27  28  29  30 
 31
============================
����Ϸ��� �ƹ� Ű�� ��������...
*/

/*
�� ���� �ν� �� �м�

	- ���� 1�� 1�� 1�� : ������
	- ������ 4�� ����̸鼭 100�� ����� �ƴϰų�,
	  400�� ����̸� 2���� 29�ϱ��� �ִ� (����),
	  ������ 2���� 28�� ���� �ִ� (���)

	- ���� 2020�� 8�� �޷��� �׸��ٰ� �����ϸ�
	  1.1.1 ~ 2020. 7. 31 ������ �� ���� ���Ѵ�.
	  --------------------------------
	  (1.1.1 ~ 2019.12.31) + (2020.1.1 ~ 2020.7.31)

	- ���� ����� ���� ������ �� ���� ��+1�������� �����ϸ�...
	  (2020�� 8�� 1���� ���� Ȯ��)

	---------------------------------������� �����ϸ� �޷��� �׷��� �غ� ��~!!!

	- ���� = ��ü���� % 7
	  ���� = 0 �� �Ͽ���
	  	   = 1 �� ������
		   = 2 �� ȭ����
		   		:

		

*/


import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test108
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �迭 ���� �� �ʱ�ȭ
		//-- �� ���� ����ִ� ������ ��¥(�� ���� �ִ� ��¥)
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		// �׽�Ʈ(Ȯ��)
		//System.out.println(days.length);
		//--==>> 12


		// �ֿ� ���� ����
		int nalsu, y, m, w;		//--�� ��, ��, ��, ����

		do
		{
			System.out.print("���������� �Է��ϼ��� : ");
			y = Integer.parseInt(br.readLine());
		}
		while (y<1);
		// �Է¹��� �⵵�� 1���� ���� ��� �ٽ��Է¹޵��� ó��
		
		do
		{
			System.out.print("�������� �Է��ϼ��� : ");
			m = Integer.parseInt(br.readLine());
		}
		while (m<1 || m>12);

		// �Է¹��� ���� 1���� �۰ų� 12���� Ŭ ���... �ٽ��Է¹޵��� ó��

		//----------------- ������� �����ϸ� ��ȿ�� ��, ���� �Է��� ����


		// �Է¹��� �⵵�� �ش��ϴ� 2���� ������ �� ���
		if (y%4==0 && y%100!=0 || y%400==0) //-- �����̶��
			days[1] = 29;
		//-- else ������ ���� days �迭�� 1��° ���(2��)�� 28�� �����Ǿ��ִ� �����̹Ƿ� ��������

		// 1�� 1�� 1�� ~ �Է¹��� �⵵ �����⵵�� 12�� 31�� ������ �� �� ���
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;

		// �Է¹��� �⵵(�ش�⵵)�� 1�� 1�� ~ �Է��� ���� ���� �� ������ �� �� ���� ����
		for (int i=0; i<(m-1); i++)
		{
			nalsu += days[i];
		}

		//----------------- ������� �����ϸ� �Է³� �Է¿��� �Ϸ� �� �� �� ���� ����


		// �Է¹��� ���� 1���� �� �� ���� ����
		nalsu += 1;		// ++nalsu;

		//----------------- ������� �����ϸ� ��� �� ���� ���� ���� �Ϸ�


		// ���� ����
		// : �Է¹��� ���� 1���� ���� �������� Ȯ���ϱ� ���� ����
		//	 �� ������ �����ؾ� �޷¿��� 1���� ��� ��ġ���� �׸��� �����ؾ� �ϴ���
		//   �� �� �ְ� �ȴ�.
		w = nalsu % 7;		// 0: �Ͽ���, 1: ������ ...

		// �׽�Ʈ(Ȯ��)
		//System.out.println(w);
		
		//----------------- ������� �����ϸ� �ش� ��,�� 1����
		//					���� �������� Ȯ�� �Ϸ�


		// ���(�޷� �׸���)
		System.out.println();
		System.out.printf("\t[ %d�� %d�� ]\n", y, m);
		System.out.println("  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("============================");
                                                           
		// Ư�� ���Ϻ��� 1���� ����� �� �ֵ��� ���� �߻�(����)
		for (int i=1; i<=w; i++)
		{
			System.out.print("    "); // ���� 4ĭ �߻�
		}

		// �׽�Ʈ(Ȯ��)
		//System.out.printf("%4d", 1);


		// �ش� ��(�Է��� ��)�� ��¥�� ��µ� �� �ֵ��� �ݺ��� ����
		for (int i=1; i<=days[m-1]; i++)
		{
			System.out.printf("%4d", i);	// 1 2 3 4 5 6 ... 1��  ��¥�� ����
			w++;							// 7 8 9 ..				������ ǥ���ϴ� �迭�� ����

			if(w%7==0) // �Ͽ��Ͽ� �ش��ϴ� ��¥�� ��� ����
				System.out.println();

		}

		// ���� ������ ��¥�� ��� ������ ��� ä���� ���
		// �̹� �Ͽ��� ������ �̷�����⶧����
		// �� ��쿡�� �߰� ������ ���� �ʵ��� ó��
		//System.out.println();
		if (w%7!=0)
			System.out.println();

		System.out.println("============================");


/*
		System.out.print("���������� �Է��ϼ��� : ");
		year = sc.nextInt();
		
		System.out.print("�������� �Է��ϼ��� : ");
		mon = sc.nextInt();

		System.out.println("\n\n");
		System.out.printf("	[ %4d�� %2d�� ]  \n", year, mon);


		// 
		String[] week = {"��", "��", "ȭ", "��", "��", "��", "��"};
		
	
		System.out.println("============================");
*/

	}
}