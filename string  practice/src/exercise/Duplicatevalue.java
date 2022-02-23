package exercise;

public class Duplicatevalue {

	public static void main(String[] args) 
	{
//		int a[]= {100,11,22,25,23,11,22};
		 String a[]= {"b","k","l","k","r","u","s","h","a","n"};
		for(int i =0; i<=a.length-1;i++)
		{
			for(int j=i+1; j<=a.length-1; j++) {
				if (a[i]==a[j])
				{
					System.out.println("duplicateno="+" " +a[i]);
				}
				
				}
			}
		}
				

	}

//duplicate no11
//duplicate no22
