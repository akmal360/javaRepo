package thisKeyword;

class Test{
	Test(int x,int y, int z){
		this(x, y); // internal constructor call
		System.out.println("The value Z="+z);
	}
	Test(int x,int y){
		this(x);
		System.out.println("The value Y="+y);
	}
	Test(int x){
		System.out.println("The value X="+x);
	}
}

public class DemoThis {	

	public static void main(String[] args) {
		Test t1=new Test(1,2,3);

	}

}
