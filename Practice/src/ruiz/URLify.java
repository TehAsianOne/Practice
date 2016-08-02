package ruiz;

public class URLify 
{
	public static void main(String[] args) 
	{
		URLify url = new URLify();
		System.out.println(url.convertToURL("example url for site", 20));
	}

	public String convertToURL(String str, int length)
	{
		StringBuilder build = new StringBuilder();
		
		for(int i = 0; i < length; i++)
		{
			if(str.charAt(i) == ' ')
			{
				build.append("%20");
			}
			else
			{
				build.append(str.charAt(i));
			}
		}
		
		return build.toString();
	}
}
