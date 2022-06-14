
public class ContinueExample {

	public static void main(String[] args) {
	    int first = 5, second = 20;
	    do {
	        if (first++ > --second) {    //5>19, 6>18, 7>17, 8>16, 9>15, 10>15, 11>14, 12>13, 13>12
	            Continue ; } //14>11, 15>10
	      } while (first < 15);//6<15,7<15, 8<15, 9<15, 10<15, 11<15, 12<15, 13<15, 14<15,15<15
	    System.out.println("first = " + first + " and second = " + second);

	}

}
