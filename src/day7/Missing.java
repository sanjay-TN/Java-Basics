package day7;

public class Missing {

	public static void main(String[] args) {
		int a[]= {1,3,5,4};
		int miss=3;
		for(int i=0;i<=a.length;i++)
		{
			
			if(a[i]*1!=miss)
				break;
				
		}
		System.out.println(miss);

	}

}
