package exercise;

public class splitstring {
	public static void main(String[] args) {
		
	String a="All is well";
	String[] idx =a.split(" ");
	int z=idx.length;
	for(int i=z-1; i>=0; i--) {
		System.out.print(idx[i]+" ");
	}
	
	
}
}

