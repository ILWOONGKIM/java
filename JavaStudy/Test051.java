/*==============================================
	���� ���� �帧�� ��Ʈ�� (���) ����
	- �ݺ���(while) �ǽ�
===============================================*/

// ����ڷκ��� ������ �� ������ �Է¹޾�
// ���� �� ���� ū �� ������ ���� ���Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 10
// �� ��° ���� �Է� : 20
// >> 10 ~ 20������ �� : xxxx
// ����Ϸ��� �ƹ� Ű�� ��������...

// ù ��° ���� �Է� : 10
// �� ��° ���� �Է� : 2
// >> 2 ~ 10������ �� : 54
// ����Ϸ��� �ƹ� Ű�� ��������...


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test051
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �ֿ� ���� ����

		int n;					//--���� ������ Ȱ���� ����
		int su1, su2;			//--ù ��°, �� ��° �Է��ϴ� ������ ��Ƴ� ����
		int result=0;			//--������ ��Ƴ� ����
		

		// ���� �� ó��
		System.out.print("ù ��° ���� �Է� : ");
		su1 = Integer.parseInt(br. readLine());

		System.out.print("�� ��° ���� �Է� : ");
		su2 = Integer.parseInt(br. readLine());


		// �Է¹��� �� ���� ũ�� �� �� �ڸ� �ٲ�
		// ��, su1�� su2 ���� ū ��� �� ���� �ڸ��� �ٲ� �� �ֵ��� ó��

		if (su1 > su2)
		{
			// �ڸ� �ٲ�
			su1=su1^su2;
			su2=su2^su1;
			su1=su1^su2;
		}

		// �ݺ� ���� ����
		// �ݺ� ������ �����ϱ� ����
		// ���� ���� ���� �����Ͽ� ���� ������ Ȱ���Ѵ�.
		// (������, ����� ����� �ִ� �������� ���� ��(su1)�� �ʿ��ѵ�,
		// '����' �� ���� �������� ���� ���, ���� ��� ����� �Ұ����ϱ� ����)
		n = su1;

		while (n <= su2)
		{
			result += n;
			n++;
		}
		
		// ��� ���
		System.out.printf(">> %d ~ %d ������ �� : %d\n", su1, su2, result);






/*���� Ǯ��(������� > �������� �̼���)

		int a=0, b=0, sumA=0, sumB=0, n=0;

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br. readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br. readLine());


		if (a>b)
		{
			n=b;
			while (a>=n)
				{
					sumB += n;			// sumB = b+(b+1)+...+a
					n++;
				}

		System.out.printf(">> %d ~ %d������ �� : %d\n", b, a, sumB);

		}

		else if(a<b)
		{
			n=a;
			while (b>=n)
				{
					sumA += n;			// a+(a+1)+...+a
					n++;
				}
		

		System.out.printf(">> %d ~ %d������ �� : %d\n", a, b, sumA);

		}
*/

	}
}


// �ڵ���
// 1. ���� 2. ����� �޼��� ���� �� �������(integer.parseint(br.readLine()) 
// 3-1. while �� �ȿ��� ���������� ū�������� �� ����(a. �ݺ�����(����), ������)
// 3-2. if ���ȿ��� ... (��.a�� b���� ũ�ٸ� b���� a������ ��), (��.b�� a���� ũ�ٸ� a���� b������ ��)
// 4. ���