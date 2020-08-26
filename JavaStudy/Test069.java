/*=======================================
  ■■■ 메소드와 변수의 스코프 ■■■
  - 메소드의 재귀호출
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

		showHi(4);	// showHi(5); (postfix이기때문) → showHi(--cnt) ...1
		if(cnt==1)	// 조건문 수행이 안되고 바로 위로 대입됨... 따라서 위치를 바꿔준다
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