//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;

public class NumberAnalyzer
{
	private ArrayList<Number> list = new ArrayList<Number>();

	public NumberAnalyzer()
	{
	}

	public NumberAnalyzer(String numbers)
	{
		setList(numbers);
	}

	public void setList(String numbers)
	{
		list = new ArrayList<Number>();
		Scanner chop = new Scanner(numbers);
		while(chop.hasNextInt()){
			 list.add(new Number(chop.nextInt()));
		}
	}

	public int countOdds()
	{
      int oddCount=0;
		for(int x=0; x<list.size(); x++){
			if(list.get(x).getNumber()%2==1)
				oddCount++;
		}
      return oddCount;
	}

	public int countEvens()
	{
      int evenCount=0;
			for(int x=0; x<list.size(); x++){
			if(list.get(x).getNumber()%2==0)
				evenCount++;
		}
      return evenCount;
	}

	public int countPerfects()
	{
		int perfectCount=0;
		for(int x=0; x<list.size(); x++){
			if(list.get(x).isPerfect())
				perfectCount++;
		}
      return perfectCount;
	}

	public String toString( )
	{
		return "" + list;
	}
}