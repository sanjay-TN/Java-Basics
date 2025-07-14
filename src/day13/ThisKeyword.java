package day13;

public class ThisKeyword {
	int x,y; // class variables
	
	ThisKeyword(int x,int y) // since variables are same as class variables so we use this keyword for reference
	{
		this.x=x;  // local variables
		this.y=y;
	}
	void display()
	{
		System.out.println(x+" "+y);
	}

	public static void main(String[] args) {
		ThisKeyword tk = new ThisKeyword(1,5);
		tk.display();

	}

}
