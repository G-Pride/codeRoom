package DaDaRentCar;
import java.util.*;

public class test {
	public static void main(String[] args) {
		peopleCar car1 = new peopleCar("奥迪A4 ",500,4);
		peopleCar car2 = new peopleCar("马自达6 ",400,4);
		peoplegoodCar car3 = new peoplegoodCar("皮卡雪6 ",450,4,2);
		peopleCar car4 = new peopleCar("金龙 ",800,20);
		goodCar car5 = new goodCar("松花江 ",400,4);
		goodCar car6 = new goodCar("依维柯 ",1000,20);
		
		System.out.println("欢迎使用达达租车系统：");
		System.out.println("您是否要租车：1是 0否");
		Scanner input = new Scanner(System.in);
		int rent = input.nextInt();
		if(rent==1){
			System.out.println("您可租车的类型及其价目表:");
			System.out.println("序号\t汽车名称\t 租金\t 容量");
			System.out.println("1.\t"+car1.name+"\t"+car1.money+"元/天  "+car1.count+"人");
			System.out.println("2.\t"+car2.name+"\t"+car2.money+"元/天  "+car2.count+"人");
			System.out.println("3.\t"+car3.name+"\t"+car3.money+"元/天  "+car3.count+"人"+"\t"+car3.height+"吨");
			System.out.println("4.\t"+car4.name+"\t"+car4.money+"元/天  "+car4.count+"人");
			System.out.println("5.\t"+car5.name+"\t"+car5.money+"元/天  "+car5.height+"吨");
			System.out.println("6.\t"+car6.name+"\t"+car6.money+"元/天 "+car6.height+"吨");
		
		System.out.println("请输入要租车的数量：");
		int quality = input.nextInt();//租车数量
		int money=0;
		int height=0;
		int count=0;
		String name1="";//存储客车名
		String name2="";//存储货车名
		for(int i=1;i<=quality;i++){
			System.out.println("请输入第"+i+"辆车的序号");
			int score = input.nextInt();//租车序号
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
		System.out.println("请输入租车天数");
		int day = input.nextInt();//租车天数
		System.out.println("您的账单：");
		System.out.println("***您租载人的车有：");
		System.out.println(name1+"总载人数："+count+"人");
		System.out.println("***您租载货的车有：");
		System.out.println(name2+"总载货量："+height+"吨");
		System.out.println("***您租了："+day+"天");
		System.out.println("***租车总价格："+day*money+"元");
	} else if(rent==0){
		System.out.println("系统已停止工作，欢迎您再来！");
	}else{
		System.out.println("您输入有误！请重新运行");
	}
	}

}
