/*=======================================
  ���� �޼ҵ�� ������ ������ ����
  - �޼ҵ��� ���ȣ��
=======================================*/

public class Test069
{
	public static void main(String[] args)
	{
		showHi(5);

	}
	public static void showHi(int cnt)
	{
		System.out.println("Hi~ ");
		if(cnt==1)
			return;

		showHi(--cnt);
/*
	public static void main(String[] args)
	{
		showHi(5);

	}
	public static void showHi(4)
	{
		System.out.println("Hi~ ");

		showHi(4);	// showHi(5); (postfix�̱⶧��) �� showHi(--cnt) ...1
		if(cnt==1)	// ���ǹ� ������ �ȵǰ� �ٷ� ���� ���Ե�... ���� ��ġ�� �ٲ��ش�
			return;

*/

/*
	public static void main(String[] args)
	{
		showHi(3);

	}
	public static void showHi(int cnt)
	{
		System.out.println("Hi~ ");

		showHi(cnt--);		
		if(cnt==1)
			return;

*/

/*
	public static void main(String[] args)
	{
		showHi(3);

	}
	public static void showHi(int cnt)
	{
		System.out.println("Hi~ ");

		showHi(cnt--);		
		if(cnt==1)
			return;

*/

/*
	public static void main(String[] args)
	{
		showHi(3);

	}
	public static void showHi(int cnt)
	{
		System.out.println("Hi~ ");

		showHi(cnt--);		
		if(cnt==1)
			return;

*/

/*
	public static void main(String[] args)
	{
		showHi(3);

	}
	public static void showHi(int cnt)
	{
		System.out.println("Hi~ ");

		showHi(cnt--);		
		if(cnt==1)
			return;

*/


	}
}