/*========================================
  ���� �ֹε�Ϲ�ȣ ��ȿ�� �˻� ����
=========================================*/

/*
�� �ֹε�Ϲ�ȣ ���� ����

	�� ������ �ڸ��� ������ ���ڸ� ���� ��Ģ�� �°� ���Ѵ�.

		123456-1234567 (�ֹι�ȣ)
		****** ******  ----------- �� �ڸ����� ���ϱ�
		234567 892345  (�� �ڸ��� ������ ��)

	�� ��Ģ�� �°� ���� ������ ������ ����� ��� ���Ѵ�.

	ex) 7 5 0 6 1 5 - 1 8 6 2 1 3 3
	    * * * * * *   * * * * * * 
		2 3 4 5 6 7   8 9 2 3 4 5
	--------------------------------
	��  14 + 15 + 0 + 30 + 6 + 35 + 8 + 72 + 12 + 6 + 4 + 15

		== 217

	�� ������ ������� 11�� ������ ������������ ���Ѵ�.

		   19
		-------
	11 | 217
		  11
		  ---
		  107
		   99
		   --
		    8  �� ������

	�� 11���� ������(8)�� �� ��� ���� ���Ѵ�.
	
		11 - 8 = 3
	
		�� ���� ó�� �������� �������� 0�� ��� �� 11-0 �� 11 �� 1
									   1�� ��� �� 11-1	�� 10 �� 0
		�̸� �ٽ� 10���� ������ �������� ���Ѵ�.

	��  ���� ���� ����� �ֹι�ȣ�� �����ϴ� ������ ���ڿ�
		��ġ�ϴ����� ���θ� Ȯ���Ѵ�.

		��ġ �� ��ȿ�� �ֹι�ȣ
		����ġ �� �߸��� �ֹι�ȣ	
*/

// ���� ��)
// �ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 123456-12345678	��	�Է� ���� �ʰ�
// >> �Է� ����
// ����Ϸ��� �ƹ� Ű�� ��������..

// �ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 123456-123456	��	�Է� ���� �̴�
// >> �Է� ����
// ����Ϸ��� �ƹ� Ű�� ��������..

// �ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 931214-1009822	��	��ȿ�� �ֹι�ȣ
// >> ��Ȯ�� �ֹι�ȣ
// ����Ϸ��� �ƹ� Ű�� ��������..

// �ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 931214-1009823	��	��ȿ���� ���� �ֹι�ȣ
// >> �߸��� �ֹι�ȣ
// ����Ϸ��� �ƹ� Ű�� ��������..


// �� �߰� ��

// �迭.length			��	�迭�� ����(�迭���� ����) ��ȯ
// ���ڿ�.length()		��	���ڿ��� ���� ��ȯ �޼ҵ�
// ���ڿ�.substring()	��	���ڿ� ���� �޼ҵ�

/*

		// �ֹι�ȣ ���ڿ��� ���ڿ��� �Է¹ް�
		// �� ���ڿ��� ���� 14���� �ȵǴ� ��� ����Ʈ ������ְ� ������ ����ش�

		// ��μ� ���� 14���� ���������� ���ڿ��� String �迭�� ����
		// String �迭�� ���� �ֹι�ȣ�� �ϳ��ϳ� ���ڷ� �ٲ��ְ�
		// ��ȿ�� ������ ���ؼ� �ٸ� int�� �迭(������ ���ڸ� �迭�� ����)

*/

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Test109
{
	public static void main(String[] args) throws IOException
	{
		// BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// �Է¹޴� �ֹι�ȣ(���ڿ� ����)
		String str;		// -�� ���ڿ��� �ڸ����� Ȯ���� �ؾ��ϴ»�Ȳ�̹Ƿ� String

		// �ֹι�ȣ�� �� �ڸ����� ���ϰ� �� �� �� �迭 ���·� ����

		//		 ex) 7  5  0  6  1  5  -  1  8  6  2  1  3  3
		//		     *  *  *  *  *  *     *  *  *  *  *  * 
		int[] chk = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5};
		//							  ---check

		// ���� ���� �� ������ (�� ���� ����� ���� ������...)
		int tot = 0;		// �������̹Ƿ� 0���� �ʱ�ȭ



		System.out.print("�ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : ");
		//str = Integer.parseInt(br.readLine());
		str = br.readLine();

		if (str.length() != 14)			// �Է� ���� ��, �ٽ��Է¹޴°� �ƴ϶� ���α׷��� ���� ���̱⶧���� do while (��)
		{
			System.out.print(">> �Է� ����~!!!");
			return;		// ���α׷� ������(main() �޼ҵ� ����)
		}

		// �׽�Ʈ(Ȯ��)
		//System.out.println(">> �ڸ��� ����~!!!");

		// ex)750615-1252085
		for (int i=0; i<13; i++)	//	�ֹι�ȣ �� �ڸ����� ���ϴ� ����
		{
			if (i==6)
			{
				//skip(1)
				continue; // "-" �϶�(i==6)�� continue (�޺κ�(line 134) �����ϰ� �����ض�)
			}
			//chk[i] * �ֹι�ȣ Ư�� �ڸ��� ����(���ڸ���� ���� ���ڿ�)
			tot += chk[i] * Integer.parseInt(str.substring(i, (i+1)));		// ���ڸ����� ����
			
			//chk[0] * Integer.parseInt(str.substring(0,0+1))
			//2 * Integer.parseInt("7")
			//2 * 7
			//  :		
			
		}

		//---------- ������� �����ϸ� ��� �踦 ��� ���� ��Ȳ�̸�
		//			 ��Ģ�� �°� ���� ������ ������ ����� ��� ���� ����
		//			 ���� tot�� ����ִ� ��Ȳ�� �ȴ�.

		// �� �� ���� ���� ����
		int su = 11 - tot % 11;

		// �׽�Ʈ(Ȯ��)
		//System.out.println(su);
		
		// ���� ��� ��� ������... �߰� ���� �ʿ�~!!
		// su�� ���� ���� ����� �� �ڸ��� ���� ���
		// �ֹι�ȣ ������ �ڸ��� ���ڿ� ���� �� ���� ��Ȳ
		su = su % 10;		// su %= 10;


		if(su == Integer.parseInt(str.substring(13)))
		{
			System.out.println(">> ��Ȯ�� �ֹι�ȣ~!!!");
		}
		else
		{
			System.out.println(">> �߸��� �ֹι�ȣ~!!!");
		}

	}
}



/*

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Test109
{
	public static void main(String[] args) throws IOException
	{
		// 1. �ֹι�ȣ �Է¹ޱ�("xxxxxx-xxxxxxx") -> 14�� ���ڿ�
		// 2. 14���� ���ڿ��� �ʰ�, �̴� �ϴ°�츦 ���ڿ�.length() �޼ҵ�, while������ �ݺ����� ����
		// 3. ��ȿ�� ������ ���� �����ϱ�(�ֹι�ȣ ���ڿ��� �����Ͽ� �迭�� ���)
		// 4. �Է°��� ������ ��ȿ�Ҷ��� ��ȿ���� �������� ������ �Բ� ���

		int num;
		String id, subid;
		String[] idCode = String int[14];

		// 1. �ֹι�ȣ �Է¹ޱ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);

		System.out.print("�ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : ");
		id = sc.next();

		do
		{
				System.out.print(id.substring(0));
				System.out.print(">> �Է� ����\n");
			
		}
		while (id.length()!=14);



		for (int i=0; i<id.length(); i++)
		{
			String = 
		}

		
		//System.out.print(id.substring(0));

		



		// 2. -���� 14�� ���ڿ� ����� �޾����� �ֹι�ȣ ��ȿ�� ����
		// �Է¹��� ���ڿ� ����, �迭�� ���
		
		// 2-1. ���� String id�� ���ڷ� �о���̰�, int�� �迭�� ��´�
		
		//num = Integer.parseInt(br.readLine());
		

		

	}
}
*/
/*
		// �׽�Ʈ

		String strTemp = "���ΰ�";
		System.out.println(strTemp.length());
		//--==>> 3

		strTemp = "���ع��� ��λ���";
		System.out.println(strTemp.length());
		//--==>> 9

		strTemp = "study-hard";
		System.out.println(strTemp.length());
		//--==>> 10

		strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(3, 5));
		//--==>> DE
		// ABCDEFGHIJKLMNOPQRSTUVWXYZ
		// 0123456789..
		//    DE 
		
		strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(13, 17));
		//--==>> NOPQ
		// 13��°���� (17-1)��° ����

		//int[] arr = {1,2,3};
		//System.out.println(arr[5]);
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
        //at Test109.main(Test109.java:108)
		// ���� �߻� �� ArrayIndexOutOfBoundsException

		//strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		//System.out.println(strTemp.substring(13, 57));
		// ���� �߻� �� StringIndexOutOfBoundsException

		strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(15));
		//--==>> PQRSTUVWXYZ
		// �ϳ������� ���������� ������
		*/