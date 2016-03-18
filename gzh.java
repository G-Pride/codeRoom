package FuLi;

import java.util.*;
import java.math.*;
import java.text.*;

public class gzh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("欢迎使用复利计算器！--BY 郭志豪");
		/*
		 * 复利计算公式: F=P*(1+i)N(次方) 　　 F：复利终值 　　 P：本金 　　 i：利率 　　 N：利率获取时间的整数倍
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("复利计算器：");
		System.out.println("本金按1 复利(单利)按2 年限按3 利率按4 年金终值按5 定期付息按6");
		int num = input.nextInt();
		DecimalFormat df1 = new DecimalFormat("#.00");
		// 求本金
		if (num == 1) {
			System.out.println("请输入复利终值：");
			double F = input.nextDouble();
			System.out.println("请输入年利率:");
			double i = input.nextDouble();
			System.out.println("请输入存入年限:");
			int N = input.nextInt();
			double P = F / Math.pow(1 + i, N); // 本金
			System.out.println("所需本金为：" + df1.format(P));
		}
		// 求复利（单利）
		else if (num == 2) {
			System.out.println("请输入存入本金:");
			double P = input.nextDouble();
			System.out.println("请输入年利率:");
			double i = input.nextDouble();
			System.out.println("请输入存入年限:");
			int N = input.nextInt();
			double D = P * (1 + i * N); // 单利
			System.out.println("单利终值：" + df1.format(D));
			System.out.println("请输入年复利次数：");
			int m = input.nextInt();
			double F = P * (Math.pow((1 + i / m), N * m)); // 复利
			System.out.println("复利终值为:" + df1.format(F));
		}
		// 求所需年限
		else if (num == 3) {
			System.out.println("请输入存入本金:");
			double P = input.nextDouble();
			System.out.println("请输入复利终值：");
			double F = input.nextDouble();
			System.out.println("请输入年利率:");
			double i = input.nextDouble();
			int N = (int) ((Math.log(F) / Math.log(1 + i)) - (Math.log(P) / Math
					.log(1 + i)));
			System.out.println("所需年限为:" + N);
		} else if (num == 4) {
			System.out.println("请输入存入本金:");
			double P = input.nextDouble();
			System.out.println("请输入复利终值：");
			double F = input.nextDouble();
			System.out.println("请输入存入年限:");
			int N = input.nextInt();
			double i = (Math.pow(F / P, 1.0 / N)) - 1;
			System.out.println("年利率为：" + i);
			System.out.println("本金n年后是否会翻n番？是请按1");
			int up = input.nextInt();
			if (up == 1) {
				System.out.println("请输入几年后：");
				int n = input.nextInt();
				System.out.println("翻几番：");
				int f = input.nextInt();
				double I = 72.0 / (n / f); // 72法则
				System.out.println(n + "年后本金翻倍的年利率至少为：" + df1.format(I));
			}
			if (up != 1) {
				System.out.println("欢迎再来！");

			}
		} else if (num == 5) {
			System.out.println("按年投资按1 按月投资按2  ");
			int number = input.nextInt();
			if (number == 1) {
				System.out.println("要投资的本金：");
				double P = input.nextDouble();
				System.out.println("获得的年利率回报：");
				double i = input.nextDouble();
				System.out.println("投资年限(年)：");
				double N = input.nextInt();

				double F = P * (Math.pow(1 + i, N) - 1) / i;
				System.out.println("按年投资的年金终值为：" + df1.format(F));
			}
			if (number == 2) {
				System.out.println("要投资的本金：");
				double P = input.nextDouble();
				System.out.println("获得的年利率回报：");
				double i = input.nextDouble();
				System.out.println("投资年限(年)：");
				double N = input.nextInt();
				double F = P * (Math.pow(1 + i / 12.0, N * 12) - 1) / (i / 12);
				System.out.println("按月投资的年金终值为：" + df1.format(F));
			}
			if (number != 1 || number != 2) {
				System.out.println("输入错误！");
			}
		} else if (num == 6) {
			System.out.println("要贷款的本金：");
			double P = input.nextDouble();
			System.out.println("贷款年利率：(年)");
			double i = input.nextDouble();
			System.out.println("贷款期(年)：");
			double N = input.nextDouble();
			double H = P
					* (((i / 12) * (Math.pow(1 + i / 12, N * 12))) / (Math.pow(
							1 + i / 12, N * 12) - 1));
			System.out.println("需每月还款：" + df1.format(H));
		} else {
			System.out.println("输入错误！");
		}
	}
}