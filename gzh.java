package FuLi;
import java.util.*;
import java.text.DecimalFormat;
public class gzh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��ӭʹ�ø�����������");
	
		 
		/*
		 * �������㹫ʽ:
		 * F=P*(1+i)N(�η�)
���� F��������ֵ
���� P������
���� i������
���� N�����ʻ�ȡʱ���������
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("������������");
		System.out.println("����1 ����(����)��2");
		int num = input.nextInt();
		DecimalFormat df1 = new DecimalFormat("#.00");
		if(num==1){
		System.out.println("�����븴����ֵ��");
		double F = input.nextDouble();
		System.out.println("������������:");
	    double i = input.nextDouble();
		System.out.println("�������������:");
		int N = input.nextInt();
		double P = F/Math.pow(1+i, N); //����
		System.out.println("����"+df1.format(P));
		}
		if(num==2){
		System.out.println("��������뱾��:");
		double P = input.nextDouble();
	    System.out.println("������������:");
	    double i = input.nextDouble();
		System.out.println("�������������:");
		int N1 = input.nextInt();
		double D = P*(1+i*N1); //����
		System.out.println("������ֵ��"+df1.format(D));
		System.out.println("�������긴��������");
		int m = input.nextInt();
		double F1 = P*(Math.pow((1+i/m), N1*m)); //����
		System.out.println("������ֵ:"+df1.format(F1));
		}
		
		
		

	}

}
