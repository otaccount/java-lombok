package test;

import lombok.Getter;
import lombok.val;
import ot.utils.Basic;

@Getter
public class Test extends Basic{
	private String aaa;
	
	public Test(String aaa) {
		this.aaa = aaa;
	}
	
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		out("start");
		
		test01();
		
		out("end");
	}

	public static void test01() {
		val test = new Test("init");
		val aaa = "star";
		
		out(test.getAaa());
		out(aaa);
	}
}
