package ruiz;

import javax.swing.*;
import java.awt.*;
public class Frame613 extends JFrame
{
	public Frame613()
	{
		setTitle("613 rock!");
		setSize(300,200);
		setLocation(100,200);
		
		Panel613 panel = new Panel613();
		Container cp = getContentPane();
		cp.add(panel);
	}
}