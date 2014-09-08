package sol1;

import java.io.*;

public class RemoveDuplicate {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str=null;
		str=br.readLine();
		str=str.toLowerCase();
		int size=str.length();
		char arr[]=str.toCharArray();
		for(int i=0;i<size;++i)
		{
			for(int j=i+1;j<size;++j)
			{
				if(arr[i]==arr[j])
				{
					arr[j]='*';				//replacing the duplicate letter with *
				}
			}
		}
		String str1=new String();
		for(int k=0;k<size;++k)
		{
			if(arr[k]!='*')
				str1=str1+arr[k];
		}
		System.out.println(str1);
	}

}
