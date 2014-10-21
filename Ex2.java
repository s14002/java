import java.util.Scanner;
import java.util.Random;

abstract class Ex {
	abstract void execute();
}

class Ex2_0 extends Ex{
	void execute(){
		int x;
		int y;

		x = 63;
		y = 18;

		System.out.println("xの値は" + x + "です。");
		System.out.println("yの値は" + y + "です。");
		System.out.println("合計は" + (x + y) + "です。");
		System.out.println("平均は" + (x + y) / 2 + "です。");
	}
}

class Ex2_1 extends Ex{
	void execute(){
		double x;
		double y;

		x = 63;
		y = 18;

		System.out.println("xの値は" + x + "です。");
		System.out.println("yの値は" + y + "です。");
		System.out.println("合計は" + (x + y) + "です。");
		System.out.println("平均は" + (x + y) / 2 + "です。");
	}
}

class Ex2_2 extends Ex{
	void execute(){
		int x;
		int y;
                int z;

		x = 63;
		y = 18;
                z =  9;

		System.out.println("xの値は" + x + "です。");
		System.out.println("yの値は" + y + "です。"); 
		System.out.println("zの値は" + z + "です。");
		System.out.println("合計は" + (x + y + z) + "です。");
		System.out.println("平均は" + (x + y + z) / 3 + "です。");
	}
}

class Ex2_00 extends Ex{
void execute(){
  Scanner stdIn = new Scanner(System.in);

  System.out.print("xの値:");
  int x = stdIn.nextInt();

  System.out.print("yの値:");
  int y = stdIn.nextInt();

  System.out.print("x + x = " + (x + y));
  System.out.print("x - x = " + (x - y));
  System.out.print("x * x = " + (x * y));
  System.out.print("x / x = " + (x / y));
  System.out.print("x % x = " + (x % y));
}
}

class Ex2_3 extends Ex{
	void execute(){
          Scanner stdIn = new Scanner(System.in);

          System.out.println("");
		int x = stdIn.nextInt();


		System.out.println(x);	
		System.out.println(x);
		System.out.println(x);
		System.out.println(x);
	}
}


public class Ex2 {
	public static void main(String[] args){
		Ex a;
		a = new Ex2_0();
		a.execute();
                a = new Ex2_1();
                a.execute();
                a = new Ex2_2();
                a.execute();
                a = new Ex2_00(); 
                a.execute();
                a = new Ex2_3();
                a.execute();
	}
}
