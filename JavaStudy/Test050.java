/*==============================================
	���� ���� �帧�� ��Ʈ�� (���) ����
	- �ݺ���(while) �ǽ�
===============================================*/

// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ �Ҽ����� �ƴ����� �Ǻ��Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ������ ���� �Է� : 100
// 100 �� �Ҽ� �ƴ�
// ����Ϸ��� �ƹ� Ű�� ��������...

// ������ ���� �Է� : 11
// 11 �� �Ҽ�
// ����Ϸ��� �ƹ� Ű�� ��������...


// �� �Ҽ� : 1 �Ǵ� �ڱ� �ڽ��� �� �̿��� � ���ε�
//			������ �������� �ʴ� ��.
//			��, 1�� �Ҽ��� �ƴϴ�.


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test050
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// �ֿ� ���� ����
		int num;		//-- ����� �Է°��� ��Ƶ� ����


		// ���� �� ó��
		System.out.print("������ ���� �Է� : ");
		num = Integer.parseInt(br.readLine());

		int n=2;		//-- �Է°��� ������� ������ ������ ������ ����
						//	 (1�� ����)		27 �� 2 3 4 5 6 ... 26

		boolean flag = true;
		//String flag = "�Ҽ���";
		
		while(n<num)	// num=7 �� n=2~6 / num=50 �� n=2~49
						// num=1 �� while �ݺ��� ������ϹǷ�, ó�� flag�� ������ "�Ҽ���" ���
		{
			if (num%n==0)
			{
				flag = false;	// �̹� �Ҽ��� �ƴϹǷ� break ���
				break;		// ���� ����� '�ݺ���'�� ��������, while ������ ����
			}

			n++;
		}

		// ��� ���
		//-- ��� ���� �����ؾ� �� �߰� Ȯ��
		//	�� �Է°��� 1���� �ƴ����� ���� �߰� ����
		
		if (flag && num!=1)
			System.out.printf("%d �� �Ҽ�\n", num);
		else
			System.out.printf("%d �� �Ҽ��� �ƴϴ�\n", num);





/*

		// ���� ����
		int n, m=1, count=0;
		
		// ����� �޼���
		System.out.print("������ ���� �Է� : ");
		
		// ���� ���
		n = Integer.parseInt(br.readLine()); 

		// ���ǹ�

		while (m<=n)
		{
			if (n%m==0)
			{
				count++;		// �Է¹��� n�� ���� m�� ���� ���������� �������� 0�� ���� ������ 1�� �ڱ��ڽ����� 2���� ���;���
			}
			m++;
		}
		
		if (count==2)
		{
		System.out.printf("%d �� �Ҽ�\n", n);
		}
		else if(count!=2)
		{
		System.out.printf("%d �� �Ҽ� �ƴ�\n", n);
		}

*/
	}
}

// �ڵ� �� ����
// 1. ����� �޼��� ��°� '���ڿ�'�� ���ڷ� �Է¹޾ƾ��ϹǷ� BufferedReader�� Integer.parseInt(readLine())�� ������ ��´�.
// 2. ���� ������ ���ǹ��� ����Ͽ� ���� �Ѵ�.
// 2-1. ���ǹ� while�� �ڱ��ڽű��� ������ �ݺ����� + if������ ������������ �ȳ����� ������ �����Ѵ�.
// 3. ����Ѵ�.