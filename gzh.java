package FuLi;

import java.util.*;
import java.math.*;
import java.text.*;

public class gzh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��ӭʹ�ø�����������--BY ��־��");
		/*
		 * �������㹫ʽ: F=P*(1+i)N(�η�) ���� F��������ֵ ���� P������ ���� i������ ���� N�����ʻ�ȡʱ���������
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("������������");
		System.out.println("����1 ����(����)��2 ���ް�3 ���ʰ�4 �����ֵ��5 ���ڸ�Ϣ��6");
		int num = input.nextInt();
		DecimalFormat df1 = new DecimalFormat("#.00");
		// �󱾽�
		if (num == 1) {
			System.out.println("�����븴����ֵ��");
			double F = input.nextDouble();
			System.out.println("������������:");
			double i = input.nextDouble();
			System.out.println("�������������:");
			int N = input.nextInt();
			double P = F / Math.pow(1 + i, N); // ����
			System.out.println("���豾��Ϊ��" + df1.format(P));
		}
		// ������������
		else if (num == 2) {
			System.out.println("��������뱾��:");
			double P = input.nextDouble();
			System.out.println("������������:");
			double i = input.nextDouble();
			System.out.println("�������������:");
			int N = input.nextInt();
			double D = P * (1 + i * N); // ����
			System.out.println("������ֵ��" + df1.format(D));
			System.out.println("�������긴��������");
			int m = input.nextInt();
			double F = P * (Math.pow((1 + i / m), N * m)); // ����
			System.out.println("������ֵΪ:" + df1.format(F));
		}
		// ����������
		else if (num == 3) {
			System.out.println("��������뱾��:");
			double P = input.nextDouble();
			System.out.println("�����븴����ֵ��");
			double F = input.nextDouble();
			System.out.println("������������:");
			double i = input.nextDouble();
			int N = (int) ((Math.log(F) / Math.log(1 + i)) - (Math.log(P) / Math
					.log(1 + i)));
			System.out.println("��������Ϊ:" + N);
		} else if (num == 4) {
			System.out.println("��������뱾��:");
			double P = input.nextDouble();
			System.out.println("�����븴����ֵ��");
			double F = input.nextDouble();
			System.out.println("�������������:");
			int N = input.nextInt();
			double i = (Math.pow(F / P, 1.0 / N)) - 1;
			System.out.println("������Ϊ��" + i);
			System.out.println("����n����Ƿ�ᷭn�������밴1");
			int up = input.nextInt();
			if (up == 1) {
				System.out.println("�����뼸���");
				int n = input.nextInt();
				System.out.println("��������");
				int f = input.nextInt();
				double I = 72.0 / (n / f); // 72����
				System.out.println(n + "��󱾽𷭱�������������Ϊ��" + df1.format(I));
			}
			if (up != 1) {
				System.out.println("��ӭ������");

			}
		} else if (num == 5) {
			System.out.println("����Ͷ�ʰ�1 ����Ͷ�ʰ�2  ");
			int number = input.nextInt();
			if (number == 1) {
				System.out.println("ҪͶ�ʵı���");
				double P = input.nextDouble();
				System.out.println("��õ������ʻر���");
				double i = input.nextDouble();
				System.out.println("Ͷ������(��)��");
				double N = input.nextInt();

				double F = P * (Math.pow(1 + i, N) - 1) / i;
				System.out.println("����Ͷ�ʵ������ֵΪ��" + df1.format(F));
			}
			if (number == 2) {
				System.out.println("ҪͶ�ʵı���");
				double P = input.nextDouble();
				System.out.println("��õ������ʻر���");
				double i = input.nextDouble();
				System.out.println("Ͷ������(��)��");
				double N = input.nextInt();
				double F = P * (Math.pow(1 + i / 12.0, N * 12) - 1) / (i / 12);
				System.out.println("����Ͷ�ʵ������ֵΪ��" + df1.format(F));
			}
			if (number != 1 || number != 2) {
				System.out.println("�������");
			}
		} else if (num == 6) {
			System.out.println("Ҫ����ı���");
			double P = input.nextDouble();
			System.out.println("���������ʣ�(��)");
			double i = input.nextDouble();
			System.out.println("������(��)��");
			double N = input.nextDouble();
			double H = P
					* (((i / 12) * (Math.pow(1 + i / 12, N * 12))) / (Math.pow(
							1 + i / 12, N * 12) - 1));
			System.out.println("��ÿ�»��" + df1.format(H));
		} else {
			System.out.println("�������");
		}
	}
}