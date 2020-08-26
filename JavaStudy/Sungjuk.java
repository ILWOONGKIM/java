/*======================================
	���� Ŭ������ �ν��Ͻ� ����
	- Ŭ������ �ν��Ͻ� Ȱ��
======================================*/

// 2. Sungjuk Ŭ����
//	  �� �ο� ���� �Է¹޾�, �Է¹��� �ο� �� ��ŭ
//		 �̸�, ��������, ��������, ���������� �Է¹ް�
//		 ������ ����� �����ϴ� Ŭ������ ������ ��
//		 ���Ӽ� : �ο���, ��Record ������ �迭(Record[] arr;)
//		 ����� : �ο��� �Է�, �� ������ �Է�, ���� �� ��� ����, ��� ���

import java.util.Scanner;

public class Sungjuk
{
	// �ֿ� �Ӽ� ����(=�ֿ� ���� ����)
	int inwon;		//-- �ο� ��
	Record[] rec;	//-- Record �迭(�л� �� �� �� Record �迭 �� �� �� Ȱ��)
					//-- Record�� ������� ������ ��ü�� ��Ƴ� �� �ִ� �迭

	/*
	�޼ҵ�()
	{
		Record[] rec;
		FruitSeller fs = new FruitSeller();
		arr[0] = fs; -> �Ұ�
	}
	*/

	// �ֿ� �޼ҵ� ����(��� ���� �� �޼ҵ� ����)
	// �� �ο� �� �Է�
	public void set()			// ��������� �ο��������� �ȳ����� �ȳ��ϰ� �׿����� �Է¹��� ���� ���� ó���ϴ°��̰�,
								// �Ѱ��ִ� �Ű�����(����)�� �����Ƿ� void�� ����.(�ٸ� �޼ҵ� ��ġ�� �ʰ� �������ذᰡ��)
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("�ο� �� �Է�(1~100) : ");
			inwon = sc.nextInt();
		}
		while (inwon<1 || inwon>100);	
//�� �ο� �� �Է� ���� ����, �� �ο���ŭ�� �迭�� ������


		// Record Ŭ������ ������� ������ ��ü(�ν��Ͻ�)�� ���� �� �ִ�
		// �迭���� inwon ��ŭ ������ ������,
		// "Record Ŭ������ �ν��Ͻ��� ������ ���� �ƴϴ�."
		rec = new Record[inwon];

	}
//�� rec�� �迭���� �����س��� ����, ���� �� �濡 �Է¹��� �͵��� �ο����� ũ�⸸ŭ �迭�Ͽ� �����ؾ���


	// �ֿ� �޼ҵ� ����(��� ���� �� �޼ҵ� ����)
	// �� �� ������ �Է� (�̸�, ��������, ��������, �������� �Է�) + ���� ��� ����
	public void input()
	{
		
		Scanner sc = new Scanner(System.in);
		
		String[] title = {"���� ���� : ", "���� ���� : ", "���� ���� : "};
		
		// �ο� �� ��ŭ �ݺ� �� �ο� ������ŭ ������� �迭�� ���̸�ŭ �ݺ�
		// ��check�� �迭�� Ÿ���� Record�ε�, �� �迭�� �������� �ݺ������� Record Ÿ���� �ν��Ͻ��� �����Ǹ鼭 rec�濡 �־���Ѵ�

		for (int i=0; i<inwon; i++)	// == for(int i=0; i<rec.length; i++)
		{
			// Record Ŭ���� ����� �ν��Ͻ� ����

			//Record ob = new Record();
			//rec[i] = ob;
			rec[i] = new Record(); // ��

			//rec[i].name = "ȫ�浿";
			System.out.printf("%d��° �л��� �̸� �Է�  ", (i+1));
			rec[i].name = sc.next();

			/*
			System.out.printf("���� ���� : ");
			rec[i].kor = sc.nextInt();
			System.out.printf("���� ���� : ");
			rec[i].eng = sc.nextInt();
			System.out.printf("���� ���� : ");
			rec[i].mat = sc.nextInt();
			*/
			// ��� ������ int kor eng mat ���� ���������

			/*
			System.out.printf("���� ���� : ");
			rec[i].score[0] = sc.nextInt();
			System.out.printf("���� ���� : ");
			rec[i].score[1] = sc.nextInt();
			System.out.printf("���� ���� : ");
			rec[i].score[2] = sc.nextInt();
			*/
			// �̰� �ݺ�������, for�� ��ø

			for (int j=0; j<title.length; j++)
			{
				// �ȳ� �޼��� ���
				System.out.print(title[j]);

				// ����ڰ� �Է��� �����͸� ���ھ�(score) �迭�� ��Ƴ���
				rec[i].score[j] = sc.nextInt(); // score[0] �� ���� ����
												// score[1] �� ���� ����
												// score[2] �� ���� ����
				// ����, ����, ���� ���� �����͸� �Է¹޴� ����

				// ���� �����ϱ�
				rec[i].tot += rec[i].score[j];		
			}

			// ��� �����ϱ�
			rec[i].avg = rec[i].tot / 3.0;

		}// end outer-for


	}// end input()


	// �ֿ� �޼ҵ� ����(��� ���� �� �޼ҵ� ����)
	// �� ��� ���
	
// ��ȫ�� 90 80 70 240 xx.xx	2
// ��¹� 82 72 62 xxx xx.xx	3
// �̿��� 98 88 78 xxx xx.xx	1
	public void print()
	{
		ranking();

		System.out.println();

		// ����� �л� �Ѹ�� �ݺ� ��±����� �����ϸ��
		for (int i=0; i<inwon; i++)
		{
			// �̸� ���
			System.out.printf("%5s", rec[i].name);

			// ����(����, ����, ����) �ݺ� ���
			for (int j=0; j<3; j++)
			{
				System.out.printf("%4d", rec[i].score[j]);
			}

			// ����, ��� ���
			System.out.printf("%5d", rec[i].tot);
			System.out.printf("%6.2f", rec[i].avg);

			// ���� ��� ���� �߰�
			System.out.printf("%5d", rec[i].rank);

			System.out.println();
		}
	}

	// �ֿ� �޼ҵ� ����(��� ���� �� �޼ҵ� ����)
	// �� ���� ���� �޼ҵ�
	// -  Record �迭�� rank �Ӽ� �ʱ�ȭ�� �����ϴ� ��� �� ��ȯ �ڷ��� void 
	// -  Ŭ���� ���ο��� Ȱ���� �޼ҵ�� ����
	// ��, �ܺο� ������ �޼ҵ尡 �ƴ� ���·� ���� �� �������� ������ private
	// �� �ܺο��� ����(ȣ��) �Ұ�
	
	private void ranking() // private�� ���� ����, print �޼ҵ忡�� �ٸ� �ֿ亯������ ��µ� ��ó�� ó���� �Ұ��̰�, 
						   // �� Test104���� �� ranking �޼ҵ带 ȣ���� �ʿ䰡 ���� �����̴�.
	{
		// 1 2 3 4 5 �� �л��� ranking ���ڸ� 1�� ������Ű��,
		// ����� �������� 1 > 2~5 , 2 > 3~5 ... 4 > 5 ���� ���ϸ鼭 
		// �������� ranking ���ڸ� 1�� ������Ų��.
		
		// ������ record �迭�� ��Ƴ���
		
		
		int i, j;		// ���� ����

		// ��� �л����� ���(����, rank)�� 1�� �ʱ�ȭ
		for (i=0; i<inwon; i++)
			rec[i].rank = 1;
		
		// ��� ����
		for (i=0; i<inwon-1; i++)				// �� ����	0	1	2	3
		{
			for (j=i+1; j<inwon; j++)			// �� ���	1234 234 34 4
			{
				// ������ ����� ����� ��պ��� ũ�ٸ�...
				if (rec[i].avg > rec[j].avg)
				{
					// ����� rank�� 1��ŭ ����
					rec[j].rank++;
				}
				// ����� ����� ������ ��պ��� ũ�ٸ�...
				else
				{
					// ������ rank�� 1��ŭ ����
					rec[i].rank++;
				}

			}
		}

	}



}// ������, print �޼ҵ忡�� ���� ���� �޼ҵ带 ȣ���Ѵ�.(�����߰�)



