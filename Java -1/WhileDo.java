public class WhileDo {
  public static void main(String[] args) {

/*System.out.println(0);
System.out.println(1);
System.out.println(2);
System.out.println(3);
System.out.println(4);*/

  int i = 2,j=2;
    while (i < 5) {
System.out.println( " Inside only while");
      System.out.println(i);
      i++; //i = i+1
    } 

do {
System.out.println( " Inside do while");
  System.out.println(j);
  j++;
}
while (j < 2);
System.out.println("The value of j out side Do-while block "+j);
}
}