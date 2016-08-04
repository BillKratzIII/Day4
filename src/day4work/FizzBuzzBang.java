package day4work;

public class FizzBuzzBang {

	public static void main(String[] args) {
		for (int i=1; i<=110; i++){
			if(divisibleByAllThree(i)){
				System.out.println("Fizz-Buzz-Bang");
			}else if(divisibleByThreeFive(i)){
				System.out.println("Fizz-Buzz");
			}else if(divisibleByThreeSeven(i)){
				System.out.println("Fizz-Bang");
			}else if(divisibleByFiveSeven(i)){
				System.out.println("Buzz-Bang");
			}else if(divisibleByThree(i)){
				System.out.println("Fizz");
			}else if(divisibleByFive(i)){
				System.out.println("Buzz");
			}else if(divisibleBySeven(i)){
				System.out.println("Bang");
			}else{
				System.out.println(i);
			}
		}

	}
		
	public static boolean divisibleByAllThree(int fromTheForLoop){
		int testNum = fromTheForLoop;
		boolean isDivisible = false;
		
		if ((testNum%3==0)&&(testNum%5==0)&&(testNum%7==0)){
			isDivisible = true;
		}
		return isDivisible;
	}
	
	public static boolean divisibleByThreeFive(int fromTheForLoop){
		int testNum = fromTheForLoop;
		boolean isDivisible = false;
		
		if ((testNum%3==0)&&(testNum%5==0)){
			isDivisible = true;
		}
		return isDivisible;
	}
	
	public static boolean divisibleByThreeSeven(int fromTheForLoop){
		int testNum = fromTheForLoop;
		boolean isDivisible = false;
		
		if ((testNum%3==0)&&(testNum%7==0)){
			isDivisible = true;
		}
		return isDivisible;
	}
	
	public static boolean divisibleByFiveSeven(int fromTheForLoop){
		int testNum = fromTheForLoop;
		boolean isDivisible = false;
		
		if ((testNum%5==0)&&(testNum%7==0)){
			isDivisible = true;
		}
		return isDivisible;
	}
	
	public static boolean divisibleByThree(int fromTheForLoop){
		int testNum = fromTheForLoop;
		boolean isDivisible = false;
		
		if ((testNum%3==0)){
			isDivisible = true;
		}
		return isDivisible;
	}

	public static boolean divisibleByFive(int fromTheForLoop){
		int testNum = fromTheForLoop;
		boolean isDivisible = false;
		
		if ((testNum%5==0)){
			isDivisible = true;
		}
		return isDivisible;
	}

	public static boolean divisibleBySeven(int fromTheForLoop){
		int testNum = fromTheForLoop;
		boolean isDivisible = false;
		
		if ((testNum%7==0)){
			isDivisible = true;
		}
		return isDivisible;
	}
}
