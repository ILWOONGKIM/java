/*==============================================
	���� ���� �帧�� ��Ʈ�� (���) ����
	- ���ǹ�(�б⹮)
	- switch�� �ǽ�
===============================================*/

// ����ڷκ��� ������ �� ���ڸ� �Է¹޾�
// �Է¹��� ���ڰ� �������� ���ڰ� �ƴ����� �Ǻ��ϴ� ���α׷��� �����Ѵ�.
// ��, switch-case ���� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.

// ���� ��)
// �� ���� �Է� : 6
// >> �Է��Ͻ� ���ڴ� �����Դϴ�.
// ����Ϸ��� �ƹ� Ű�� ��������. . . 

// �� ���� �Է� : t
// >> �Է��Ͻ� ���ڴ� ���ڰ� �ƴմϴ�.
// ����Ϸ��� �ƹ� Ű�� ��������. . . 


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test042
{ 
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n;

		System.out.print("�� ���� �Է� : ");
		n = System.in.read();

		switch (n)
		{
		case 48: case 49: case 50: case 51: case 52: case 53: case 54: case 55: case 56: case 57: 
			System.out.printf(">> �Է��Ͻ� ���ڴ� �����Դϴ�.\n");
				break;
		default :
			System.out.printf(">> �Է��Ͻ� ���ڴ� ���ڰ� �ƴմϴ�.\n");
		}

	}
}