/*====================
 ���� �迭 ����
 - �迭�� �⺻�� Ȱ��
=====================*/

// ��char�� �ڷ����� �迭�� �����
// �� �迭�� �� �濡 ���ĺ� �빮�ڸ� ä���
// ä���� �� �迭�� ��ü ��Ҹ� ����ϴ� ���α׷��� �����Ѵ�.
// ��, ä��� ������ ����ϴ� ������ ���� �и��Ͽ� ó���Ѵ�.

// ���� ��)
// A B C D E F G .. W X Y Z
// ����Ϸ��� �ƹ� Ű�� ��������...

public class Test083
{
	public static void main(String[] args)
	{
		// ��� ��
		/*
		char[] arr1;
		arr = new char[26];
		arr1[0] = 'A'
			:
		arr1[25] = 'Z'
		*/

		/*// ��� ��
		char[] arr = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		*/
	
		// ��� ��
		char[] arr = new char[26];
		for (int i=0, ch=65; i<arr.length; i++, ch++)
			arr[i] = (char)ch;

		// �迭 ��� ��ü ���
		for (int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");

		System.out.println();

/*
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/


		/*
		char[] arr = new char[26];

		char alpa = 'A';

		for (int i=0; i<arr.length; i++)
		{
			arr[i] = alpa++;
		}
		
		for (int j=0; j<arr.length; j++)
		{
			System.out.print(arr[j]+" ");
		}

		System.out.println();
		*/


		/*
		char[] arr = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

		// A���� Z���� => �ƽ�Ű�ڵ� 65���� 90���� => 26��
		

		for (int i=0; i<26; i++)
		{
			System.out.print(arr[i] + " ");
		}

		System.out.println();
		*/

	}
}
