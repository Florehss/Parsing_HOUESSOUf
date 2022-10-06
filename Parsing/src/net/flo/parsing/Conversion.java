package net.flo.parsing;

import java.util.HashMap;

public class Conversion {
	
	private static final HashMap<Character, Integer> roman = new HashMap<Character,Integer>()
	{{
		put('I', 1);
		put('V', 5);
		put('X', 10);
		put('L', 50);
		put('C', 100);
		put('D', 500);
		put('M', 1000);
	}};
	public static int addRomNum(String romain)
	{
	
		final int length=romain.length();
		int number=0;
		int num;
		int i=0;
		if(length<0)
		{
			return -1;
		}
		if(length==1)
		{
			num=roman.get(romain.charAt(i));
			number+=num;;
		}
		while(i<length-1 && length>0)
		{ 
			char charI=romain.charAt(i);
			char charI1=romain.charAt(i+1);
			if(roman.get(charI)<roman.get(charI1))
			{
				

				num=roman.get(charI1)-roman.get(charI);
				number+=num;
				i+=1;
				System.out.println(number);
				
			}else 
			if(charI==charI1)
			{
				if(charI=='V'|| charI=='L' || charI=='D')
				{
					return -1; 
				}else
				{
					num=roman.get(charI);
					number+=num*2;
					i=i+1;
					System.out.println(number);
					if(i==length-2)
					{
						num=roman.get(romain.charAt(length-1));
						number+=num;
					}
				}
				
			}else
			{
				
				num=roman.get(charI);
				number+=num;
			
				
			}
			
			i+=1;
		
		
		}
		
	return number;
			
	}

}
