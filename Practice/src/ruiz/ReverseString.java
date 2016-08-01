package ruiz;

public class ReverseString {
	public static void main(String[] args) 
	{
		System.out.println(reverseString("this is going to be a really long string so i hope the run time wont be too long for this program to run at the best speed possible"));
	}
	
	public static String reverseString(String s) {
        String result = "";
        for(int i = 0; i < s.length(); i++)
        {
        	result += s.charAt((s.length() - 1) - i);
        }
        return result;
    }
}
