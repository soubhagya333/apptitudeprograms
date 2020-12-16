package aptiprograms.general_aptitude.primenumber;

public class PrimeRangeForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int startNum = 10;
	       int endNum = 50;
	       System.out.println("prime numbers b/w the range"+ startNum+ "-" +endNum);
	       for(int i = startNum; i<=endNum;i++) {
	    	   int count = 0;
	    	   for(int j= 2; j<= i/2; j++) {
	    	   
	    		   if( i%j == 0) {
	    			   count++;
	    		   }
	    	   }
	    	   if(count==0) {
	    		   System.out.println(i);
	    	   }
	       }
		}
	

	}

