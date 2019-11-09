package corejava;

public class polindram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		


			{
				int n=101;
					int r=n,c,sum=0;
					
					while(r!=0)
					{
					    c=r%10;
					    sum=sum*10+c;
					    
					    r=r/10;
					    
					}
					System.out.println("sum:"+sum);
			}
	}

}
