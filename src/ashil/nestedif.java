package ashil;

public class nestedif 
{
	public static void main(String args[]) 
	{
		String air="amsterdam";
		String dam="football";
		air=dam;
		if (air=="football")
		{
			if(air==dam){
				System.out.println("ajax");
			}
			else {
				System.out.println("afc");			
			}
		}
		else
		{
			System.out.println("ufc");
		}
		
	}

}
