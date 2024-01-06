public class Cal {

int c;

void add(int a, int b) {
	
	System.out.println("Im in add method");
	System.out.println(c=a+b);
}

void sub(int a, int b) {
	
	System.out.println("Im in sub method");
	System.out.println(c=a-b);	
	
}

void mul(int a, int b) {

	System.out.println("Im in mul method");
	System.out.println(c=a*b);
}

void div(int a, int b) {
	;
	System.out.println("Im in div method");
	System.out.println(c=a/b);
}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal s = new Cal();
		s.add(20, 30);
		s.sub(30,10);
		s.mul(2,2);
		s.div(6,3);
	
	}

}

