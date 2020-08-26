/*==============================================
	���� ���� �帧�� ��Ʈ�� (���) ����
	- ���ǹ�(�б⹮)
	- switch��
===============================================*/

/*
�� ���� ���ù��̶� �ϸ�, switch �� ������ ���� ���� ����
	���� ������ ���� �������� �б��� �� ����ϴ� �����̴�.
�� ���� �� ����
   switch(����)
   {
	   case ���1 : ����1; [break;]		// []�� ������������ ��Ÿ��
	   case ���2 : ����2; [break;]

	   [default : ����n+1; [break;]]
    }

	switch ���� �����ġ��� case�� ���������
	byte, short, int, long ���̾�� �Ѵ�.

	case �� �ڿ� ��break;���� ���� ������ ���
	���� case ������ ����ؼ� �����ϰ� �ȴ�. �� �⺻ ��
*/

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test039
{ 
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name;
		int kor, eng, mat, avg;
		char grade;

		System.out.print("�̸� �Է� : ");
		name = br.readLine();
		System.out.print("�������� �Է� : ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("�������� �Է� : ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("�������� �Է� : ");
		mat = Integer.parseInt(br.readLine());

		avg = (kor+eng+mat) / 3;
		grade = 'F';

		switch(avg/10)
		{
			case 10 : case 9 : 	grade='A';	break;
			case 8 : grade='B';	break;
			case 7 : grade='C';	break;
			case 6 : grade='D';	break;
			case 0 : grade='F';	break;
			//default: grade ='F'; break;

		}
		

		/*
		switch(avg)
		{
			case 100 : case 99: case 98...case 90
				grade='A';	break;
			case 89 : 
				grade='B';	break;
						:
			case 0 :	grade='F';	break;
			
		}
		
		*/

		/*
		switch(avg)
		{
			case 100 : grade='A';	break;
			case 99 :  grade='A';	break;
						:
			case 0 :	grade='F';	break;
			
		}
		*/
/*
		if (avg>=90)		
			grade = 'A';
		else if (avg>=80)
			grade = 'B';
		else if (avg>=70)
			grade = 'C';
		else if (avg>=60)
			grade = 'D';
		else
			grade = 'F';
*/
		System.out.println();
		System.out.printf(">> ����� �̸��� %s�Դϴ�.\n", name);
		System.out.printf(">> ���� ������ %d,\n", kor);
		System.out.printf(">> ���� ������ %d,\n", eng);
		System.out.printf(">> ���� ������ %d,\n", mat);
		System.out.printf(">> ������ %d, ����� %d�Դϴ�.\n", (kor+eng+mat), avg);
		System.out.printf(">> ����� %c �Դϴ�.\n", grade);

	}
}
