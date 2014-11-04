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

          System.out.println("読み込んだ整数値をそのまま反復して表示します");
          System.out.print("xの値:");		
          int x = stdIn.nextInt();


		System.out.println(x);	
		System.out.println(x);
	}
}

class Ex2_4 extends Ex{
	void execute(){
          Scanner stdIn = new Scanner(System.in);

          System.out.println("読み込んだ整数値に10を加えた値と10を減じた値を出力します");
		int x = stdIn.nextInt();


		System.out.println(x+10);	
		System.out.println(x-10);
	}
}

class Ex2_5 extends Ex{
        void execute(){
          Scanner stdIn = new Scanner(System.in);

          System.out.println("2つの実数値を読み込み、その和と平均を求め表示します");
                double x = stdIn.nextDouble();
                double y = stdIn.nextDouble();

                System.out.println(x+y);
                System.out.println((x+y)/2);
        }                
}

class Ex2_6 extends Ex{
        void execute(){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("三角形の底辺と高さを実数値で読み込んで、その面積を表示する");
              System.out.print("xの値(底辺):");
              double x = stdIn.nextDouble();

              System.out.print("yの値(高さ):");
              double y = stdIn.nextDouble();

              System.out.println((x * y)/2);
        }
}

/* class Ex2_000 extends Ex{
  void execute(){
      Random rand = new Random();
 
      int luchy = rand.nextInt(10);   // 0～9の乱数
 
      System.out.println("今日のラッキーナンバーは" + luchy + "です。");
  }
   }          */


 class Ex2_7 extends Ex{
  void execute(){
      Random rand = new Random();
      
      System.out.print("1桁の正の整数値をランダムで表示");
      int luchy = rand.nextInt(9)+1;   // 1～9の乱数
      System.out.println(luchy);

      System.out.print("1桁の負の整数値をランダムで表示");
      int nluchy = rand.nextInt(9)-9;  //-9~-1の乱数
      System.out.println(nluchy);

      System.out.print("2桁の正の整数値をランダムで表示");
      int dluchy = rand.nextInt(90)+10; //10~99の乱数
      System.out.println(dluchy);
  }
   }         


class Ex2_8 extends Ex{
  void execute(){
      Random rand = new Random();

      System.out.print("読み込んだ整数値プラスマイナス5の範囲の整数値をランダムに表示します。");
      int luchy = rand.nextInt();   // 
 
      System.out.println(luchy);
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
                a = new Ex2_4();
                a.execute();
                a = new Ex2_5();
                a.execute();
                a = new Ex2_6();
                a.execute();
                a = new Ex2_7();
                a.execute();
                a = new Ex2_8();
                a.execute();
	}
}
