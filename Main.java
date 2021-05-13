public class Main {

    public static void main(String [] args) {

    	//TODO: проссумировать числа в диапазоне от 1 - 5

    		/*
				1 + 2 + 3 + 4 + 5 = 15

				1 + 2 = 3
				3 + 3 = 6
				6 + 4 = 10
				10 + 5 = 15
    		*/

				int sum = 1 + 2;
				boolean isEvemNumber = sum % 2 == 0;
				if(isEvemNumber == true) {
					System.out.println( "Число " + sum + " является четным");
				} else if(isEvemNumber == false) {
					System.out.println( "Число " + sum + " является нечетным");
				}

				int sum1 = sum + 3;
				boolean isEvemNumber1 = sum1 % 2 == 0;
				if(isEvemNumber1 == true) {
					System.out.println( "Число " + sum1 + " является четным");
				} else if(isEvemNumber1 == false) {
					System.out.println( "Число " + sum1 + " является нечетным");
				}

				int sum2 = sum1 + 4;
				boolean isEvemNumber2 = sum2 % 2 == 0;
				if(isEvemNumber2 == true) {
					System.out.println( "Число " + sum2 + " является четным");
				} else if(isEvemNumber2 == false) {
					System.out.println( "Число " + sum2 + " является нечетным");
				}

				int result = sum2 + 5;
				boolean isEvemNumber3 = result % 2 == 0;
				if(isEvemNumber3 == true) {
					System.out.println( "Число " + result + " является четным");
				} else if(isEvemNumber3 == false) {
					System.out.println( "Число " + result + " является нечетным");
				}

				System.out.println("1 + 2 + 3 + 4 + 5 = " + result);
	}
} 