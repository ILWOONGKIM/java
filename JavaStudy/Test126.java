/*===========================
  ���� Ŭ���� ��� ����
  - �������̽�(Interface) 
===========================*/

// �� �ǽ� ����
// ���� ó�� ���α׷��� �����Ѵ�.
// ��, �������̽��� Ȱ���� �� �ֶǷ� �Ѵ�.

// ���� ��)
// �ο� �� �Է�(1~10) : 2
// 1��° �л��� �й� �̸� �Է�(���� ����) : 2012170 ������
// ���� ���� ���� ���� �Է�	  (���� ����) : 90 100 85
// 2��° �л��� �й� �̸� �Է�(���� ����) : 2012112 ��ȫ��
// ���� ���� ���� ���� �Է�	  (���� ����) : 85 70 65

// 2012170 ������	90   100   85   275   91
//					��    ��   ��
// 2012112 ��ȫ��   85    70   65   220   73
//					��	  ��   ��

// ����Ϸ��� �ƹ� Ű�� ��������...


// input -> �ο��� -> �ο��� ���� �����Է¹ޱ� -> (�й� nextint, �̸� name) -> (���� score)
// 

import java.util.Scanner;


// �Ӽ��� �����ϴ� Ŭ����	��	�ڷ��� Ȱ��
class Record
{
	String hak, name;		//-- �й�, �̸�
	int kor, eng, mat;		//-- ����, ����, ���� ����
	int tot, avg;			//-- ����, ���(���ǻ� ���� ó��)
}

// �������̽�
interface Sungjuk
{
	public void set();		//-- �ο� �� ����
	public void input();	//-- �� ������ �Է�
	public void print();	//-- ��� ���
}

// ���� �ذ� �������� �����ؾ� �� Ŭ����
class SungjukImpl implements Sungjuk
{
	Record[] arr;

	int n;
	Scanner sc = new Scanner(System.in);

	/*
	public void set();		//-- �ο� �� ����
	public void input();	//-- �� ������ �Է�
	public void print();	//-- ��� ���
	*/


	@Override
	public void set()
	{
		
		System.out.print("�ο� �� �Է�(1~10) : ");
		n = sc.nextInt();
		arr = new Record[n];	// ��ü �迭����


	}
	// Ŭ����(��ü)�迭�� �迭�� ��������� �� ������ �ʱ�ȭ�� �����ؾ��Ѵ�.
	// Ŭ���� �迭�� �� �濡 ������������ �� �� �ֵ��� ���� �ϳ��� ����°��̰�,
	// ������ �ʱ�ȭ���� �ν��Ͻ����� �����Ǳ� �����̴�.


	@Override
	public void input()
	{
		// �Է¹��� �ο���(1~10 ��) n������ �л� �й�,�̸��� �޾ƾ��Ѵ�.
		
		if (n<0||n>10)
			return;

		for (int j=0; j<arr.length; j++)
		{
			arr[j] = new Record();
			System.out.printf("%d��° �л��� �й� �̸� �Է�(���� ����) : ", j+1);
			arr[j].hak = sc.next();
			arr[j].name = sc.next();
			System.out.printf("���� ���� ���� ���� �Է�	(���� ����) : ", arr[j].kor, arr[j].eng, arr[j].mat);
			arr[j].kor = sc.nextInt();
			arr[j].eng = sc.nextInt();
			arr[j].mat = sc.nextInt();
			arr[j].tot = arr[j].kor+arr[j].eng+arr[j].mat;
			arr[j].avg = arr[j].tot/3;

		}

		// int�� �迭 score�� 5���� ���� �����
		// 0,1,2 �迭�� ����, ����, ���� ����, 3�迭�� ����, 4�迭�� ����� ��´�


	
	}// input method ends

	@Override
	public void print()
	{
				// 2012170 ������	90   100   85   275   91
				//					��    ��   ��
		String grade1, grade2, grade3;

		for (int j=0; j<arr.length; j++)
		{
		
			System.out.printf("%s %s\t %d\t %d\t %d\t %d\t %d\t\n", arr[j].hak, arr[j].name, arr[j].kor, arr[j].eng, arr[j].mat, arr[j].tot, arr[j].avg);
			grade1 = grade(arr[j].kor);
			grade2 = grade(arr[j].eng);
			grade3 = grade(arr[j].mat);
			System.out.printf("                 %s\t %s\t %s\t \t \t \n", grade1,grade2,grade3);
		}
		
	}

	public String grade(int score)
	{
		String grade = "";

		switch (score/10)
		{
		case 10 : case 9 : grade = "��"; break;
		case 8 : grade = "��"; break;
		case 7 : grade = "��"; break;
		case 6 : grade = "��"; break;
		default : grade = "��";
		
		}
		
		return grade;

	}
	

}

// main() �޼ҵ带 �����ϰ� �ִ� �ܺ� Ŭ����(���� ��Ű��)
public class Test126
{
	public static void main(String[] args)
	{
		Sungjuk ob = new SungjukImpl();

		// ���� �ذ� �������� �ۼ��ؾ� �� ob ����

		ob.set();
		ob.input();
		ob.print();

	}
}

//���� ���
/*
�ο� �� �Է�(1~10) : 2
1��° �л��� �й� �̸� �Է�(���� ����) : 2020sist ���Ͽ�
���� ���� ���� ���� �Է�        (���� ����) : 100 90 90
2��° �л��� �й� �̸� �Է�(���� ����) : 2020sist ��¹�
���� ���� ���� ���� �Է�        (���� ����) : 10 20 30
2020sist ���Ͽ�  100     90      90      280     93
                 ��      ��      ��
2020sist ��¹�  10      20      30      60      20
                 ��      ��      ��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/