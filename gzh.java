package FuLi;
import java.util.*;

public class gzh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��ӭʹ�ø�����������");
		float F,P,i,N;
		 
		/*
		 * �������㹫ʽ:
		 * F=P*(1+i)N(�η�)
���� F��������ֵ
���� P������
���� i������
���� N�����ʻ�ȡʱ���������
		 */
		System.out.println("������������");
		Scanner input = new Scanner(System.in);
		System.out.println("��������뱾��:");
		P = input.nextInt();
	    System.out.println("������������(%):");
	    i = input.nextInt();
		System.out.println("�������������:");
		N = input.nextInt();
		F = (int)(Math.pow((1+i/100), N))*P;
		System.out.println("�����븴����ֵ:"+F);
		
		

	}

}
