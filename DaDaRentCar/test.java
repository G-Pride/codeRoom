package DaDaRentCar;
import java.util.*;

public class test {
	public static void main(String[] args) {
		peopleCar car1 = new peopleCar("�µ�A4 ",500,4);
		peopleCar car2 = new peopleCar("���Դ�6 ",400,4);
		peoplegoodCar car3 = new peoplegoodCar("Ƥ��ѩ6 ",450,4,2);
		peopleCar car4 = new peopleCar("���� ",800,20);
		goodCar car5 = new goodCar("�ɻ��� ",400,4);
		goodCar car6 = new goodCar("��ά�� ",1000,20);
		
		System.out.println("��ӭʹ�ô���⳵ϵͳ��");
		System.out.println("���Ƿ�Ҫ�⳵��1�� 0��");
		Scanner input = new Scanner(System.in);
		int rent = input.nextInt();
		if(rent==1){
			System.out.println("�����⳵�����ͼ����Ŀ��:");
			System.out.println("���\t��������\t ���\t ����");
			System.out.println("1.\t"+car1.name+"\t"+car1.money+"Ԫ/��  "+car1.count+"��");
			System.out.println("2.\t"+car2.name+"\t"+car2.money+"Ԫ/��  "+car2.count+"��");
			System.out.println("3.\t"+car3.name+"\t"+car3.money+"Ԫ/��  "+car3.count+"��"+"\t"+car3.height+"��");
			System.out.println("4.\t"+car4.name+"\t"+car4.money+"Ԫ/��  "+car4.count+"��");
			System.out.println("5.\t"+car5.name+"\t"+car5.money+"Ԫ/��  "+car5.height+"��");
			System.out.println("6.\t"+car6.name+"\t"+car6.money+"Ԫ/�� "+car6.height+"��");
		
		System.out.println("������Ҫ�⳵��������");
		int quality = input.nextInt();//�⳵����
		int money=0;
		int height=0;
		int count=0;
		String name1="";//�洢�ͳ���
		String name2="";//�洢������
		for(int i=1;i<=quality;i++){
			System.out.println("�������"+i+"���������");
			int score = input.nextInt();//�⳵���
			switch(score){
			case 1:
				name1+=car1.name;
				money += car1.money;
				count += car1.count;
				break;
			case 2:
				name1+=car2.name;
				money+=car2.money;
				count+=car2.count;
				break;
			case 3:
				name1+=car3.name;
				name2+=car3.name;
				money+=car3.money;
				count+=car3.count;
				height+=car3.height;
				break;
			case 4:
				name1+=car4.name;
				money+=car4.money;
				count+=car4.count;
				break;
			case 5:
				name2+=car5.name;
				money+=car5.money;
				height+=car5.height;
				break;
			case 6:
				name2+=car6.name;
				money+=car6.money;
				height+=car6.height;
				break;
			}
			
		}
		System.out.println("�������⳵����");
		int day = input.nextInt();//�⳵����
		System.out.println("�����˵���");
		System.out.println("***�������˵ĳ��У�");
		System.out.println(name1+"����������"+count+"��");
		System.out.println("***�����ػ��ĳ��У�");
		System.out.println(name2+"���ػ�����"+height+"��");
		System.out.println("***�����ˣ�"+day+"��");
		System.out.println("***�⳵�ܼ۸�"+day*money+"Ԫ");
	} else if(rent==0){
		System.out.println("ϵͳ��ֹͣ��������ӭ��������");
	}else{
		System.out.println("��������������������");
	}
	}

}
