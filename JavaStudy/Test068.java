/*==============================================
	���� ���� �帧�� ��Ʈ�� (���) ����
	- return
===============================================*/
// return�� �ǹ�
// 1. ���� ��ȯ
// 2. �޼ҵ� ��ȯ

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test068
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n, s;

		System.out.print("������ ���� �Է�(10�̻�) : ");
		n = Integer.parseInt(br.readLine());

		if (n<10)
		{
			System.out.println("10 �̻��� ������ �Է��ؾ� �մϴ�.");
			return;
			// �̰� �����ϸ� 10�̻� �����Է��϶�� ����ϱ��ϴµ� 5�Է½� ������ 15�� �Է��̵�)
			// �޼ҵ� ���� �� main() �޼ҵ� ����
		}

		s=0;
		for (int i=1; i<=n; i++)
			s+=i;

		System.out.println("��� : ");

	}
	
}
/*
������ ���� �Է�(10�̻�) : 5
10 �̻��� ������ �Է��ؾ� �մϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/