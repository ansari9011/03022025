package Demo;

public class Addition {
	int a;
	int b;
	int Addition;
	
	public Addition() {
		System.out.println("Zero parameter input");
	}
	
	public Addition(int A,int B) {
		a=A;
		b=B;
		Addition=a+b;
		
	}

	public static void main(String[] args) {

		Addition A1= new Addition();
		Addition A2= new Addition(10,20);
		System.out.println(A2.a+" "+A2.b);
		System.out.println(A2.Addition);
	}

}
