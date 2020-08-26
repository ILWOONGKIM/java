/*==================================
  ���� Ŭ���� ��� ����
  - ���(Inheritance)
  ==================================*/

// ������ ���� ���α׷��� �����Ѵ�.
// ��, ����� ������ �����Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ �� ���� �Է�(���� ����) : 20 15
// ������ �Է�(+ - * /) : -
// >> 20 - 15 = 5.00
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// super class
class Aclass
{
	protected int x, y;
	protected char op;

	Aclass()
	{
	}

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f%n", x, op, y, result);
	}

}

// sub class �� Aclass �� ��ӹ޴� Ŭ����
class Bclass extends Aclass 
{
	
		/*----------------
		protected int x,y;
		protected char op;	

		void write(double result)
		{
			System.out.printf(">> %d %c %d = %.2f%n", x, op, y, result);
		}	
		----------------*/

	Bclass()
	{	
	}

	boolean input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("������ �� ���� �Է�(���� ����) : ");	// 20 15
		String temp = br.readLine();							// "20 15"
		String[] strArr = temp.split("\\s");	// ���ڿ� ��ü�� �޼ҵ�, �����ڿ����� �ϸ鼭 �߶󳻴� ��������, \s�� �ѱ� -> \s�� �����ǹ�, ���ڿ� �迭 Ÿ�� ��ȯ
		//String[] strArr = {"20", "15"};	

		//	��	���ڿ�.split("������");
		//"��� ���� �ٳ���".split("\\s");	��	{"���, "����", "�ٳ���"}

		if(strArr.length !=2)
			return false;
		//-- false�� ��ȯ�ϸ� input() �޼ҵ� ����
		//	 �� ������ ������ ���
		//	 �Ʒ��� �����ؾ� �ϴ� �ڵ尡 �����־
		//	 ������� ��ȯ�ϸ� �޼ҵ�� ����ȴ�.

		
		x = Integer.parseInt(strArr[0]);
		y = Integer.parseInt(strArr[1]);

		System.out.print("������ �Է�(+ - * /) : ");
		op = (char)System.in.read();

		/*
		if (op != '+' &&  op != '-' && op != '*' && op != '/')
		{
			return false;
		}
		
		return true;
		*/

		if (op=='+' || op=='-' || op=='*' || op=='/')
		{
			return true;
		}
		
		return false;

	}//end input


	double calc()	// ������ ������ �Ǽ����·� ��ȯ
	{
		double result = 0;		// default �κ� ���� ����(result 0 �ʱ�ȭ)

		switch (op)
		{
		case '+' : result = x+y; break;
		case '-' : result = x-y; break;
		case '*' : result = x*y; break;		
		case '/' : result = (double)x/y; break;

		}

		return result;
	}//end clac

	// ����ϴ� �޼ҵ�� ��ӹ޾�����, ���� �����ʿ����.

}// end Bclass



/*
	double result = 0.0;

	public void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �� ���� �Է�(���� ����) : ");
		x = sc.nextInt();
		y = sc.nextInt();

		System.out.print("������ �Է�(+ - * /) : ");
		op = (char)System.in.read();

	}

	public void calOp()
	{

		switch (super.op)
		{
		case '+': result = super.x + super.y; break;
		case '-': result = super.x - super.y; break;
		case '*': result = super.x * super.y; break;
		case '/': result = super.x / (double)super.y; break;
		default : return;
		}
		
		super.write(result);
*/


// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����(���� ��Ű��)
public class Test118
{
	public static void main(String[] args) throws IOException
	{
		Bclass ob = new Bclass();

		if (!ob.input())	//ob.input()�޼ҵ尡 �����̶��...
		{
			System.out.print("Error...\n");
			return;
		}
		
		double result = ob.calc();

		ob.write(result);	// ob.calc()�޼ҵ忡 ��� double result�� ����� �Ѱ���� 

		/*
		Bclass ob2 = new Bclass();

		ob2.input();
		ob2.calOp();
		*/
	}
}