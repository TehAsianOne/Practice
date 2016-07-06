package ruiz;

public class LinkedListItem 
{
	private int dataOne;
	private String description;
	
	public LinkedListItem(int dataOne, String desc)
	{
		this.dataOne = dataOne;
		this.description = desc;
	}

	public String toString()
	{
		return "Number: " + dataOne + "\nDescription: " + description;
	}
}
