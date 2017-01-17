//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Number
{
	private Integer number;

	public Number()
	{
	}

	public Number(int num)
	{
		number = num;
	}

	public void setNumber(int num)
	{
		number = num;
	}

	public int getNumber()
	{
		return number;
	}

	public boolean isOdd()
	{
		if(number%2==0)
			return false;
		return true;
	}

	public boolean isPerfect()
	{
		int total=0;
		for(int x = 1; x<=number/2; x++)
		{
			if(number%x==0)
				total+=x;
		}
		return (number==total);
	}

	public String toString( )
	{
		String output = "";
		return "" + number;
	}
}