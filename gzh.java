package FuLi;
import java.util.*;

public class gzh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("欢迎使用复利计算器！");
		float F,P,i,N;
		 
		/*
		 * 复利计算公式:
		 * F=P*(1+i)N(次方)
　　 F：复利终值
　　 P：本金
　　 i：利率
　　 N：利率获取时间的整数倍
		 */
		System.out.println("复利计算器：");
		Scanner input = new Scanner(System.in);
		System.out.println("请输入存入本金:");
		P = input.nextInt();
	    System.out.println("请输入年利率(%):");
	    i = input.nextInt();
		System.out.println("请输入存入年限:");
		N = input.nextInt();
		F = (int)(Math.pow((1+i/100), N))*P;
		System.out.println("请输入复利终值:"+F);
		
		

	}

}
