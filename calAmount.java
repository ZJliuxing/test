// 计算一段时间（年数），固定年化利率下（小数），定投金额所得收益总额
import java.util.Scanner;
public class calAmount
{
	public static void main(String[] args) {
		System.out.println("注：收益率填小数");

		System.out.print("请输入年化收益率：");
		Scanner sc1 = new Scanner(System.in);
		float rate_year = sc1.nextFloat();

		System.out.print("请输入年数：");
		Scanner sc2 = new Scanner(System.in);
		int year = sc2.nextInt();

		System.out.print("请输入每月定投金额：");
		Scanner sc3 = new Scanner(System.in);
		float yuan = sc3.nextFloat();

		int mon=12*year;
		double sum=0;
		double rate=rate_year/12;		
		for (int i=1;i<=mon ;i++ ) {
			sum = yuan+sum*(1+rate);
		}		
		System.out.println("经过"+year+"年后，总金额为："+sum);
	}
}