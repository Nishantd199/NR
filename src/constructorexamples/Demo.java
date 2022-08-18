package constructorexamples;

public class Demo {
	private static final char[] d = null;
	static int a=10;
	int b=20;
	Demo(){
		int b=20;
	}
    Demo(int c){
		int d=12;
	}
	public static void main(String[] args) {
	Demo y=new Demo();
	System.out.println(y.b);
	Demo w=new Demo(10);
	System.out.println(w.d);
	}
}
