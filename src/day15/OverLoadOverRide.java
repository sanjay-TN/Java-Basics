package day15;

class abc
{
	void m1(int a)
	{
		System.out.println(a);
	}
	void m2(int b)
	{
		System.out.println(b);
	}
}
class def extends abc
{
	void m1(int a)
	{
		System.out.println(a*a);
	}
	void m2(int x,int y)
	{
		System.out.println(x*y);
	}
}

public class OverLoadOverRide {

	public static void main(String[] args) {
		def d = new def();
		d.m1(3);
		d.m2(44);
		d.m2(1, 56);

	}

}
