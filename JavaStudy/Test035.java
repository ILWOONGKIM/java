/*==============================================
	���� ���� �帧�� ��Ʈ�� (���) ����
	- ���ǹ�(�б⹮)
	- if��, if-else��
===============================================*/

// ����ڷκ��� ������ ������ �� �� �Է¹޾�
// ū ���� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �Է¹��� �� ���� ���� ���,
// �ƹ��͵� ������� �ʵ��� �����Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 11
// �� ��° ���� �Է� : 22
// >> ū �� �� 22
// ����Ϸ��� �ƹ� Ű�� ��������...

// ù ��° ���� �Է� : 55
// �� ��° ���� �Է� : 4
// >> ū �� �� 55
// ����Ϸ��� �ƹ� Ű�� ��������...

// ù ��° ���� �Է� : 31
// �� ��° ���� �Է� : 31
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test035
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b;

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		if (a>b)
		{
			System.out.printf("\nū �� �� %d\n", a);
		}
		else if (a<b)
		{
			System.out.printf("\nū �� �� %d\n", b);
		}
		else
		{
		}
	}
}