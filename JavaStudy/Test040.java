/*==============================================
	���� ���� �帧�� ��Ʈ�� (���) ����
	- ���ǹ�(�б⹮)
	- switch�� �ǽ�
===============================================*/

// 1���� 3������ ���� �� �ϳ��� ����ڷκ��� �Է¹޾�
// �Է¹��� ������ŭ�� ������(��)�� ��µǴ� ���α׷��� �ۼ��Ѵ�.
// ��, �� ���� ������� ������ �� �ֵ��� �Ѵ�.

// 1. switch ���� �Ϲ� ���� ����Ͽ� ������ �ذ��Ѵ�.
// 2. switch ���� �⺻ ���� ����ϵ�,
//   ��break���� �� �� ���� ����Ͽ� ������ �ذ��Ѵ�.

// ���� ��)
// ������ ���� �Է�(1~3) : 3
// �ڡڡ�
// ����Ϸ��� �ƹ� Ű�� ��������. . .

// ������ ���� �Է�(1~3) : 1
// ��
// ����Ϸ��� �ƹ� Ű�� ��������. . .

// ������ ���� �Է�(1~3) : 7
// �Է� ����
// ����Ϸ��� �ƹ� Ű�� ��������. . .


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test040
{ 
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n;

		System.out.print("������ ���� �Է�(1~3) : ");
		n = Integer.parseInt(br.readLine());

//*sol 1(�Ϲ� ��)

		switch (n)
		{
		case 1 : System.out.printf("��\n"); 
				break;
		case 2 : System.out.printf("�ڡ�\n");
				break;
		case 3 : System.out.printf("�ڡڡ�\n");
				break;
		default: System.out.printf("�Է� ����\n");
		}
	}
}


/*sol 2(�⺻ ��)

		switch (n)
		{
		case 3 : 
			System.out.printf("��");
		case 2 : 
			System.out.printf("��");
		case 1 :
			System.out.printf("��\");
				break;
		default: 
			System.out.printf("�Է� ����\n");
		}
		System.out.println();
	}
*/

/*
		switch(avg/10)
		{
			case 10 : case 9 : 	grade='A';	break;
			case 8 : grade='B';	break;
			case 7 : grade='C';	break;
			case 6 : grade='D';	break;
			case 0 : grade='F';	break;
			//default: grade ='F'; break;

		}
		


		switch(avg)
		{
			case 100 : case 99: case 98...case 90
				grade='A';	break;
			case 89 : 
				grade='B';	break;
						:
			case 0 :	grade='F';	break;
			
		}
		
		switch(avg)
		{
			case 100 : grade='A';	break;
			case 99 :  grade='A';	break;
						:
			case 0 :	grade='F';	break;
			
		}
*/