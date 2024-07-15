public class Demo{
  public static void main(String[] args) {
int[][][] myNumbers = {
{
{1, 2}, {5, 6}
};
{
 {10, 11},{12,13}
};
{
{14,15},{16,17}
};
};
     for (int i = 0; i < myNumbers.length; ++i) {
        for(int j = 0; j < myNumbers[i].length; ++j) {
          for(int k = 0; k < myNumbers[i][j].length; ++k) {
           System.out.println(i + "and" + j + "and" + k +" value is " + myNumbers[i][j][k]);
}
}
}
}
}
