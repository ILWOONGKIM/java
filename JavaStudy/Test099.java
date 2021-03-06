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
// Test100.java 파일과 비교

// 주소값 복사

public class Test099
{
	public static void main(String[] args)
	{
		int[] nums = {10, 20, 30, 40, 50};	//--배열의 원본
		int[] copys;						//--복사본으로 만들 배열

		int temp;							//-- 실습 진행(테스트)을 위한 임시 변수


		// check !
		copys = nums;						//-- 복사 실행

		temp = nums[0];						//-- temp = 10 의미

		nums[0] = 1000;						//-- nums = {1000, 20, 30, 40, 50}

		// copys 배열의 전체 요소 출력(nums에만 대입한것이 copys에 어떻게 영향을 미치는지 확인)
		for (int i=0; i<copys.length; i++)
			System.out.print(copys[i] + " ");
		System.out.println();
		// 1000 20 30 40 50

		System.out.println("temp : "+ temp);
		// temp : 10


		// copys 는 주소값을 공유,
		// temp는 값자체를 공유
	}
}