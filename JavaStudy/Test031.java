/*==============================================
	���� ���� �帧�� ��Ʈ�� (���) ����
	- ���ǹ�(�б⹮)
	- if��, if-else��
===============================================*/

// ����ڷκ��� �̸�, ��������, ��������, ���������� �Է¹޾�
// ������ ���� ���·� ����ϴ� ���α׷��� �ۼ��Ѵ�.
// �� ��, ����� ��� ������ �������� ó���Ѵ�.

// 90�� ~ 100�� : A			80�� ~ 90�� : B
// 70�� ~ 79�� : C			60�� ~ 69�� : D
// 60�� �̸� : F

// �Է¹޴� ������ BufferedReader �� Ȱ���� �� �ֵ��� �ϸ�,
// printf() �޼ҵ带 ���� ����� �� �ֵ��� �����Ѵ�.

// ���� ��)
// �̸� �Է� : ���Ͽ�
// ���� ���� : 90
// ���� ���� : 80
// ���� ���� : 70

// >> ����� �̸��� ���Ͽ��Դϴ�.
// >> ���� ������ 90,
// >> ���� ������ 80,
// >> ���� ������ 70,
// >> ������ 240, ����� 80�Դϴ�.
// >> ����� B �Դϴ�.
// ����Ϸ��� �ƹ� Ű�� �������� . . .


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



public class Test031
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name;
		int kor, eng, mat;


		// ���� �� ó��
		// �� ����ڿ��� �ȳ� �޼��� ���
		System.out.print("�̸� �Է� : ");
		
		// �� �̸�
		name = br.readLine();

		// ������� �Է°��� ���� ���·� ��ȯ�� �� �ش� ������ ��Ƴ���
		System.out.print("���� ���� �Է� : ");
		kor = Integer.parseInt(br.readLine());
		
		System.out.print("���� ���� �Է� : ");
		eng = Integer.parseInt(br.readLine());

		System.out.print("���� ���� �Է� : ");
		mat = Integer.parseInt(br.readLine());



		// ���� �߰� ����
		int tot = kor + eng + mat;
		double avg = tot / 3.0;
		char grade;				// sol1. Ư���� ���� ä�������(if else �������� Ư�������� �������� �������� ��¿� ���� �ڹ��� ���, + F ���� ����)
								// sol2. else if�� �ƴ� else

		if (avg >= 90)
		{
			grade = 'A';
		}
		else if (avg>=80)		// �̹� ���� 90���� ũ�ų� ���ٶ�� ������ �ƴϾ else if�� ���������Ƿ� aver<90 ��
		{
			grade = 'B';
		}
		else if (avg>=70)
		{
			grade = 'C';
		}
		else if (avg>=60)
		{
			grade = 'D';
		}
		else
		{
			grade = 'F';
		}

		// ���� ��� ���

		System.out.println();
		System.out.printf(">> ����� �̸��� %s�Դϴ�.\n", name);
		System.out.printf(">> ���� ������ %d,\n", kor);
		System.out.printf(">> ���� ������ %d,\n", eng);
		System.out.printf(">> ���� ������ %d,\n", mat);
		System.out.printf(">> ������ %d, ����� %.2f�Դϴ�.\n", tot, avg);
		System.out.printf(">> ����� %c �Դϴ�.\n", grade);

	}
}




/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



public class Test031
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name;
		int kor, eng, mat, tot, score;
		double aver;
		char grade;

		// ����� �޼���
	     
		System.out.print("�̸� �Է� : ");

		// ���� �ޱ�
		kor = Integer.parseInt(br.readLine());
		eng = Integer.parseInt(br.readLine());
		tot = Integer.parseInt(br.readLine());
		score = Integer.parseInt(br.readLine());

		tot = kor + eng + mat;
		aver = tot / 3;
		grade = (char)score;


		System.out.printf(">> ����� �̸��� %s�Դϴ�.\n", name);
		System.out.printf(">> ���� ������ %d,\n", kor);
		System.out.printf(">> ���� ������ %d,\n", eng);
		System.out.printf(">> ���� ������ %d,\n", mat);
		System.out.printf(">> ������ %d, ����� %f�Դϴ�.", tot, aver);


// 90�� ~ 100�� : A			80�� ~ 90�� : B
// 70�� ~ 79�� : C			60�� ~ 69�� : D
// 60�� �̸� : F

// �Է¹޴� ������ BufferedReader �� Ȱ���� �� �ֵ��� �ϸ�,
// printf() �޼ҵ带 ���� ����� �� �ֵ��� �����Ѵ�.

// ���� ��)
// �̸� �Է� : ���Ͽ�
// ���� ���� : 90
// ���� ���� : 80
// ���� ���� : 70

// >> ����� �̸��� ���Ͽ��Դϴ�.
// >> ���� ������ 90,
// >> ���� ������ 80,
// >> ���� ������ 70,
// >> ������ 240, ����� 80�Դϴ�.
// >> ����� B �Դϴ�.


		if(aver>=90 && aver<=100)
		{
			System.out.printf(">> ����� %c �Դϴ�.\n", ,);
		}

		if(aver>=80 && aver<=90)
		{
			System.out.printf(">> ����� %c �Դϴ�.\n", ,);
		}

		if(aver>=70 && aver<=80)
		{
			System.out.printf(">> ����� %c �Դϴ�.\n", ,);
		}

		if(aver>=60 && aver<=70)
		{
			System.out.printf(">> ����� %c �Դϴ�.\n", ,);
		}

		if(aver>=60 && aver<=70)
		{
			System.out.printf(">> ����� %c �Դϴ�.\n", ,);

		else(aver<60)
			
			System.out.printf(">> ����� %c �Դϴ�.\n, 


		}
		// ���

		}
	}
}
*/