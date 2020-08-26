/*======================================
	���� Ŭ������ �ν��Ͻ� ����
	- Ŭ���� ����
	- �迭 Ȱ��
	- �������а� �������� ������
======================================*/

// ����ڷκ��� ��, ��, ���� �Է¹޾�
// �ش� ��¥�� ������ ����ϴ� ���α׷��� �����Ѵ�.
// ��, �޷� Ŭ����(Calender)�� ������� �ʴ´�.
// ����, Ŭ������ ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�. (WeekDay Ŭ���� ����)
// �׸���, �迭�� ���䵵 ������� �ۼ��� �� �ֵ��� �Ѵ�.
// ���������������� ���䵵 Ȯ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.
// ���������� WeekDay Ŭ������ ���踦 ����
// Test102 Ŭ������ main() �޼ҵ尡 ���������� ���α׷� ����� �� �ֵ��� �Ѵ�.

// ���� ��)
// �� �� �� �Է�[���� ����] : 2020 8 19

// 2020�� 8�� 19�� �� ������
// ����Ϸ��� �ƹ� Ű�� ��������...

// �� 1�� 1�� 1�� �� ������
// �� ���� vs ���, ���� vs ���, 
// �� 1�� 1�� 1�� -> 2020 8 19 ������ �� ��¥�� / 7 


// 1. ������ ��¹޾ƾ��ϹǷ� private int day - �ν��Ͻ�  -> ����Ҷ� 7�γ��� �������� ���� ���;
// �޼ҵ� ��. input 
//		Scanner sc = new Scanner
//	    sc.nextInt = day
//		  ��. 1�� 1�Ϻ��� �Է¹��� ��¥������ �� ��¥�� ���
//			for �� �̿�, ���� �� ���� ���
//		  
//		  ��. �� ��¥�� / 7���� �������� ���� ���Ͽ� ���� ���� ���
//		  ��. �迭���� �� ���Ϻ����� �迭�� ���?
//		  ��. ��½� public class ���� ��Ƶ� ���Ϻ����� ���� ���� ���
//		



//  ���� �Է� �ް�

//	ex ) 2020 08 19 -> ----�� ----�� ----��  �̷��� ����ǰ� ǥ�õ� �� �ְ� ���� ������ �����ϰ� ����

//			(?���� �������� �Ǵ�)				  (?���� �������� �Ǵ�) 
//	-> {(�´ٸ� 366, �ƴ϶�� 365) x (?-1-1)�� + ?�� ?�ϱ����� ���ϰ��}-> �Է��� �������� '���⵵' 12�� 31�ϱ��� ���ϱ� ����
//		--------------------------------------	 ------------------------ = ?���� (30? 31?) -> 30 or 31 x ?��
//					��									��

//  �� �ϼ��� ������ 7�� ������ ������������ ���� ���

import java.util.Scanner;

class WeekDay
{
	// ��� ����
	private int year;
	private int mon;
	private int day;

	int yearDay=0;
	int monDay=0;
	int dayDay=0;
	int totday;

	void input()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("�� �� �� �Է�[���� ����] : ");
		
		year = sc.nextInt();
		mon = sc.nextInt();
		day = sc.nextInt();
	}

	int calYear()
	{
		// �Է¹��� ���� ���⵵�� 12�� 31�ϱ����� ���
		// 1�� 1�� 1�� ���� 4�� 7�� 1��
		// 3�� 12�� 31��(2x365) + 4�� 1�� 1�Ϻ��� 4�� 7�� 1��
		// 3(year(4)-1) x 365 + xx

		int y = 1;
		int n = 1;
		int countY=0;
		int countN=0;

		for (int i=1; i<year; i++)		// year-1������ �ݺ�
		{
			year = y;
			year = n;
			
			if (i%4==0 && i%100!=0 && i%400==0)		// ����, 366
			{
				y=366;
				countY++;
			}

			else		// ���, 365
			{
				n=365;
				countN++;
			}

		}

		yearDay = (y * countY) + (n * countN);
		return yearDay;
	}

	int calMon()
	{
		// ���� �� �� ���


		// 2���ΰ��	...1
		// 2 -> ����year�� 4�ǹ��,400�ǹ��,100�ǹ���� �ƴϸ� 29��, /  �׷��� ������ 28��

		// 2���� �ƴѰ��
		// 1,3,5,7,8,10,12 -> �Է¹��� ���� mon �� 7�����̰� Ȧ���̰ų�, / 8�̻��̰� ¦���̸� 31
		// �׿� 2(else if�� ����) 4 6 9 11 -> 30��

		// 1+2 = return
		
		int m0=0;		// 28��
		int m1=0;		// 29��
		int m2=0;		// 31��
		int m3=0;		// 30��
		int count0=0;
		int count1=0;
		int count2=0;
		int count3=0;

		for (int i=1; i<mon; i++)
		{
			m0=mon;
			m1=mon;
			m2=mon;
			m3=mon;

			if (m==2 && year%4==0 && year%100!=0 || year%400==0)		// 2��, 29���ΰ��
			{
				m0 = 29;
				count0++;
			}
			else if (m==2)			// 2��, 28���� ���
			{
				m1 = 28;
				count1++;
			}

			else if ( (m!=2 && m<=7 && m%2!=0) || (m!=2 && m>8 && m%2==0) )		// ���, 31���� ���
			{
				m2 = 31;
				count2++;
			}
			else if (m!=2)
			{
				m3 = 30; 			// ���, 30���� ���
				count3++;
			}


		}
		monDay = (m0 * count0) + (m1 * count1) + (m2 * count2) + (m3 * count3);
		return monDay;
	}

	// �� �� ���

	int calDay()
	{
		dayDay = day;
		return dayDay;
	}
	
	int calTotDay()
	{
		totday = yearDay + monDay + dayDay
		return totday;
	}


	// �� ��¥ ���� 7�� ������ �������� ���� �迭�� ����
	void arrayDay(int[])
	{
		String[] arr = new String[7];

		for (int i=0; i<arr.length; i++)
		{
			if (totday%7==0)
				arr[0] = "�Ͽ���";
			else if (totday%7==1)
				arr[1] = "������";
			else if (totday%7==2)
				arr[2] = "ȭ����";
			else if (totday%7==3)
				arr[3] = "������";
			else if (totday%7==4)
				arr[4] = "�����";
			else if (totday%7==5)
				arr[5] = "�ݿ���";
			else if (totday%7==6)
				arr[6] = "�����";

		}
	}


	// ���
	void print(int a)
	{
		System.out.printf("%d�� %d�� %d�� �� ", year, mon, day);
		System.out.printf("%s", arr[i]);

	}
}

// 2020�� 8�� 19�� �� ������
// ����Ϸ��� �ƹ� Ű�� ��������...



public class Test102
{
	public static void main(String[] args)
	{
		WeekDay wd = new Weekday();
		
		wd.input();

	}
}