package datevalid;

import java.util.Arrays;
import java.util.List;

public class ValidationDate {
	
	List<Integer> shortmonth=Arrays.asList(4,6,9,11); // initialisation directe
	public boolean validationAnnee(int a)
	{
		return a> 1930 && a< 2022 ;
		
	}
	public boolean validerMois(int m)
	{
		if(m > 0 && m<=12)
			return true;
		else
			return false;		
	}
	public boolean bissextille(int a)
	{
		return a % 4==0;
	}
	public boolean verifjour(int j,int m,int a)
	{
		if(j<1 ||j>31)
		{
			return false;
		}
		else if(!validationAnnee(a)|| !validerMois(m))
		{
			return false;
		}
		else if(m==2)
		{
			if(bissextille(a))
			{
				if(j<=29)
					return true;
				else
				{return false;}
			}
			else
			{
				if(j<=28)
					return true;
				else
					return false;
			}
			
			
		}
		else if(shortmonth.contains(m))
		{
			if(j<=30)
				return true;
			else 
				return false;
		}
		else
		{
			return true;
		}
	}
	

}
