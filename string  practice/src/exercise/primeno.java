package exercise;

public class primeno {
	public static void main(String[] args) {
		int a=7;
		
		
		int c=0;
		for(int i=2; i<=6; i++) {
			if(a%i==0) {
				 c=c+1;
			}
		}
			if(c>0) {
				System.out.print(a+"not aprime no.");
			}
			else {
				System.out.println(a+"prime no.");
			}
		}
		    
		
	}


