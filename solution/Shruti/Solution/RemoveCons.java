package sol1;

import java.io.*;

public class RemoveCons {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str=null;
		str=br.readLine();
		
		int size=str.length();
		
		for(int i=1;i<size;++i)
		{
			if(str.toLowerCase().charAt(i-1)==str.toLowerCase().charAt(i))					//comparing by converting to lower case 
			{
				str=str.replace(str.charAt(i-1)+""+str.charAt(i), str.charAt(i-1)+"");		//replacing all occurrences of duplicate letters with a single letter with string preserving the 1st character among the two
				size=str.length();															//Eg: I/p: Nnneenaa  O/p: Nena
				--i;
			}

		}
		
		System.out.println(str);
	}

}
