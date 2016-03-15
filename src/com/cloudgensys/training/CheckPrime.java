package com.cloudgensys.training;

public class CheckPrime {

	public boolean isPrime(int num){
		
		boolean itsPrime = true;
		
		for(int i=2; i < num; i++){
			
			if(num%i == 0){
				itsPrime = false;
			}
		}
		
		return itsPrime;
	}
	
	public static void main(String[] args) {
		
		int number = 32;
		
		CheckPrime checkPrime = new CheckPrime();
		
		boolean isPrime = checkPrime.isPrime(number);
		
		if(isPrime){
			System.out.println(number + " : is Prime");
		}else{
			System.out.println(number + " : is not prime");
		}
	}
	
}
