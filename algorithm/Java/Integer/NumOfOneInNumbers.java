package algorithm.Integer;

public class NumOfOneInNumbers {

	public static int[] countOne1(int n) {
		int[] result = new int[n+1];
		
		for(int i = 0;i <= n;i++) {
			int j = i;
			
			while(j!=0) {
				result[i]++;
				j = j&(j-1);
			}
		}
		return result;
	}
	
	public static int[] countOne2(int n) {
		int[] result = new int[n+1]; 
		for(int i = 1 ; i<=n; i++) {
			
			result[i] = result[i&(i-1)]+1;
						
		}
		
		
		return result;
	}
	
	
}
