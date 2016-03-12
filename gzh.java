package FuLi;
import java.util.*;
import java.text.DecimalFormat;
public class gzh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("欢迎使用复利计算器！");
	
		 
		/*
		 * 复利计算公式:
		 * F=P*(1+i)N(次方)
　　 F：复利终值
　　 P：本金
　　 i：利率
　　 N：利率获取时间的整数倍
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("复利计算器：");
		System.out.println("本金按1 复利(单利)按2");
		int num = input.nextInt();
		DecimalFormat df1 = new DecimalFormat("#.00");
		if(num==1){
		System.out.println("请输入复利终值：");
		double F = input.nextDouble();
		System.out.println("请输入年利率:");
	    double i = input.nextDouble();
		System.out.println("请输入存入年限:");
		int N = input.nextInt();
		double P = F/Math.pow(1+i, N); //本金
		System.out.println("本金："+df1.format(P));
		}
		if(num==2){
		System.out.println("请输入存入本金:");
		double P = input.nextDouble();
	    System.out.println("请输入年利率:");
	    double i = input.nextDouble();
		System.out.println("请输入存入年限:");
		int N1 = input.nextInt();
		double D = P*(1+i*N1); //单利
		System.out.println("单利终值："+df1.format(D));
		System.out.println("请输入年复利次数：");
		int m = input.nextInt();
		double F1 = P*(Math.pow((1+i/m), N1*m)); //复利
		System.out.println("复利终值:"+df1.format(F1));
		}
		
		
		

	}

}
