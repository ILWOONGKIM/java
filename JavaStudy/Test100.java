/*====================
 ■■■ 배열 ■■■
 - 배열의 복사
=====================*/

// ※   배열 변수의 복사에는 데이터 복사, 주소값 복사 두 가지 형태가 존재한다.
//
//	    주소값 복사 → 얕은 복사 → 원본을 수정하면 복사본에 영향을 미치게 되는 복사 방법,
//									(배열 뿐 아니라 모든 참조형 데이터에 해당하는 방법)
//		데이터 복사 → 깊은 복사 → 실제 요소가 들어 있는 값에 대한 복사로
//									원본을 수정해도 복사본에 영향을 미치지 않는 복사 방법, 
// Test099.java 파일과 비교

// 데이터 복사
//	int형 배열에 대한 깊은 의미의 복사를 처리하는
//	메소드를 정의하는 형태로 실습을 진행한다.


public class Test100
{
	public static void main(String[] args)
	{
		int[] nums = {10, 20, 30, 40, 50};			// 배열 원본 ...2

		int[] copys1 = nums;						// 얕은 의미의 배열 복사 수행(주소값 복사)

		int[] copys2 = copyArray(nums);				// 깊은 의미의 배열 복사 수행(데이터 복사) ; 하나의 요소를 따로따로 옮겨담음
													// (사용자 정의 메소드 호출)

		int[] copys3 = (int[])nums.clone();			// 깊은 의미의 배열 복사 수행(데이터 복사) ; 배열도 객체로 인식함
													// (자바 제공 → clone() 메소드 호출)
		
		// 원본 배열 요소의 수정
		nums[1] = 2;
		
		System.out.print("copys1 : ");
		for (int i=0; i<copys1.length; i++)
			System.out.print(copys1[i] + " ");
		System.out.println();
		// 10 2 30 40 50

		System.out.print("copys2 : ");
		for (int i=0; i<copys2.length; i++)
			System.out.print(copys2[i] + " ");
		System.out.println();
		// 10 20 30 40 50

		System.out.print("copys3 : ");
		for (int i=0; i<copys3.length; i++)
			System.out.print(copys3[i] + " ");
		System.out.println();
		// 10 20 30 40 50
	}

	// 매개변수로 int 배열 타입을 넘겨받아
	// 이를 복사한 후
	// 복사한 배열을 결과값으로 반환하는 기능을 가진 메소드 정의
	public static int[] copyArray(int[] os)
	//			  -----		      ----  타입 같아야
	{
		// 매개변수로 넘겨받은 배열(os)
		// 즉, 원본 배열 만큼의 배열방(메모리 공간, 길이)을 확보한
		// 복사할 배열방 생성
		int[] result = new int[os.length];
	//						   --------- os의 크기, 즉 os.length의 방의길이 만큼 배열을 생성해야
										// int[] result = new int[5];
										// 결과적으로는 result.length = os.length


		// 원본 배열(os)에 담겨있는 각각의 요소들을 복사 배열(result)에 담아내기
		for (int i=0; i<os.length; i++)		// for (int i=0; i<result.length; i++)		
		{
			result[i] = os[i];
		}

		// 복사한 배열(result) 반환		...1
		return result;


	}
}