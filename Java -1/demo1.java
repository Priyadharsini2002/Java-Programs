public class demo1 {

	public static void main(String[] args) {
		//step-2
		Scanner scan=new Scanner(System.in);
		//step-3
		System.out.println("Eneter the mark");
		int mark=scan.nextline();
		if (mark>=95 && mark<=100)
		{
		System.out.println("HD");
		}
		else if(mark>=75 && mark<=94) {
			System.out.println("D");
		}
		else if(mark>=65 && mark<=74) {
			System.out.println("c");
		}
		else if(mark>=35 && mark<=64) {
			System.out.println("P");
		}
		else if(mark>=0 && mark<=34) {
			System.out.println("f");
		}
		else {
			System.out.println("invalid");
		}
	}
}
