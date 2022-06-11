import java.util.*;
import java.io.*;

class count
{
    private String str;
    count(String str)
    {
        this.str = str;
    }
    
    int countSubstring()
    {
        int counter=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) =='1')
            {
                counter ++;
            }
        }
        
        return (counter)*(counter-1)/2;
    }
}

public class CountSubstring
{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string");
		String s = br.readLine();
		count str = new count(s);
		System.out.println("Number of substrings starts and ends with n is : "+ str.countSubstring());
	}
}