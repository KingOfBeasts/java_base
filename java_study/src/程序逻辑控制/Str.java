package 程序逻辑控制;
//20
//观察String类型
public class Str{
	public static void main(String args[]) {
		String firstname = "隔壁" ;
		String lastname = "老王";
		int num = 10;
		double f = 1.1;
		System.out.println(firstname + lastname + num + f);//隔壁老王101.1
		System.out.println(firstname + lastname + (num + f));//隔壁老王11.1
	}
}