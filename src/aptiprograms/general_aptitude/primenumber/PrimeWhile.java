package aptiprograms.general_aptitude.primenumber;

public class PrimeWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =2;
    int n = 13;
    int count = 0;
    while(i<n/2){
    	if(n%i==0) {
    		count++;
    		
    	//System.out.println("number is not prime");
    	break;
    	}
    	i++;
    }
    System.out.println("number of itration ="+ i);
    	if(count ==0) {
    		System.out.println("prime number");
    	}
    	else {
    		System.out.println("not prime number");
    		//System.out.println("is prime");
    	}
    	i++;
    }
	}

