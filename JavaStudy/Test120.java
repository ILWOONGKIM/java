/*===========================
  ■■■ 클래스 고급 ■■■
  - 추상 클래스(Abstract) - '미완성된' 클래스 -> 완성된 객체 생성 Ⅹ
 ===========================*/

/*
○  추상 클래스(Abstract)
	선언만 있고 정의가 없는 하나 이상의 메소드(추상 메소드)를 갖는 클래스로
	하위 클래스에서 오버라이딩(Overriding)할 것으로 예상되는 메소드에 대해
	메모리 낭비 없이 미리 호출 계획을 세워두기 위해 만든다.

○ 형식 및 구조
   [접근제어지시자] abstract class 클래스명
   {
		[접근제어지시자] abstract 자료형 메소드명([매개변수], ...)
   }

○ 특징
   클래스가 적어도 하나 이상의 추상 메소드를 포함할 때
   그 클래스는 클래스 앞에 『abstract』 키워드를 붙여
   추상 클래스로 명시해야 하며,
   추상 클래스로 선언한 경우에는
   불완전한 형태의 클래스이므로 객체를 생성할 수 없다.
   추상 메소드가 존재하지 않는 추상 클래스마저도
   객체를 생성할 수 없는 것이다.

   즉, 추상 클래스는 독립적으로 존재할 수 없기 때문에
   상속을 위해서만 존재하며
   추상 클래스에서 상속받은 하위 클래스에서는
   반드시 추상 메소드를 오버라이딩(Overriding)해야 한다.

※	『abstract』 키워드는	
	클래스와 메소드에서만 사용할 수 있으며
	멤버 변수나 로컬 변수에서는 사용 불가능하다.


// ※ 어차피 덮어쓰는거 메소드 역할만 하도록 abstract붙이면서 미완성인상태로 두고 ;붙임
// 추상 메소드를 하나라도 가지면 해당클래스는 추상클래스
// 추상클래스는 인스턴스 생성불가
// 상속이 없다면 존재가치가 없음
	
*/

abstract class SortInt120
{
	private int[] value;


	protected void sort(int[] value)
	{
		this.value = value;
		sorting();
	}

	// 추상 메소드
	protected abstract void sorting();		// 선언구만 있고 정의구가 없음 → 추상메소드
											// 너가 선호하는대로 정렬해서써라의 의미

	protected int dataLength()
	{
		return value.length;
	}
	
	// 『final』 키워드로 인해
	// 이 클래스는 SortInt120을 상속받는 클래스에서
	// 이 메소드를 재정의(Method Overriding)할 수 없다.
	protected final int compare(int i, int j)	// 크기비교 메소드
	{
		int x = value[i];
		int y = value[j];
		if (x==y)
			return 0;
		else if(x>y)
			return 1;
		else
			return -1;
	}
	
	// 상동(final)
	protected final void swap(int i, int j)		// 자리바꿈 메소드
	{
		int temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}

}

// SortInt120 클래스를 상속받은 클래스	→	추상 메소드를 상속받았으므로 일단 추상 메소드
// → 추상 메소드 『sorting()』을 Overriding → 일반 정상 클래스
//public abstract class Test120 extends SortInt120
public class Test120 extends SortInt120
{

	/*----------------------------------
	
	protected void sort(int[] vaule)
	{
		this.value = value;
		sorting();
	}
	protected abstract void sorting();		
	protected int dataLength()
	{
		return value.length;
	}
	protected final int compare(int i, int j)	// 크기비교 메소드
	{
		int x = value[i];
		int y = value[j];
		if (x==y)
			return 0;
		else if(x>y)
			return 1;
		else
			return -1;
	}
	protected final void swap(int i, int j)		// 자리바꿈 메소드
	{
		int temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}

	------------------------------------*/

	int i, j;

	static int[] data = {7, 10, 3, 8, 7};


	@Override
	
	//protected abstract void sorting();
	protected void sorting()
	{
		// 정의	→ 완성

		// selection sort
		for (i=0; i<datalength()-1; i++)
		{
			for (j = i+1; j<datalength(); j++)
			{
				// 크기비교
					// 자리바꿈
				if (compare(i, j)>0)	// int형 위에 선언했음, compare(i, j)==1이어도 됨
					swap(i,j)			

			}
		}
	}



}

	public static void main(String[] args)
	{
		//SortInt120 ob = new SortInt120();
		// 추상이라 불가
		//Test120 = new Test120();
		// 상속받은 순간 인스턴스 생성 불가능 → 마찬가지로 추상이라 불가

		System.out.print("Source Data : ");
		for (int n : data)
			System.out.print(n + " ");
		System.out.println();

		Test120 ob = new Test120();
		ob.sort(data);

		System.out.print("Sorted Data : ");
		for (int n : data)
			System.out.print(n + " ");
		System.out.println();
	}
}