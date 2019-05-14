// Lab17bvst.java
// The student, starting version of the Lab17b assignment.


import java.awt.*;
import java.applet.*;


public class Lab17bvst extends Applet
{

	public void paint (Graphics g)
	{
		drawSquare1(g,1000,650);
	}

	public void drawSquare1(Graphics g, int maxX, int maxY)
	{
		int midX = maxX/2;
		int midY = maxY/2;
		int startWidth = maxX/4;
		int startHeight = maxY/4;
		int tlX = midX - (startWidth/2);
		int tlY = midY - (startHeight/2);
		g.fillRect(tlX,tlY,startWidth,startHeight);
		DrawUL(g,tlX,tlY,startWidth,startHeight);
		DrawUR(g,tlX,tlY,startWidth,startHeight);
		DrawBL(g,tlX,tlY,startWidth,startHeight);
		DrawBR(g,tlX,tlY,startWidth,startHeight);
	}

	public void delay(long n)
	{
		n *= 1000;
		long startDelay = System.nanoTime();
		long endDelay = 0;
		while (endDelay - startDelay < n)
			endDelay = System.nanoTime();
	}


	public void DrawUL (Graphics g, int tlX, int tlY, int startWidth, int startHeight)
	{
		g.fillRect(tlX, tlY, startWidth, startHeight);
		startHeight = startHeight / 2;
		startWidth = startWidth / 2;
		tlX = tlX - startWidth;
		tlY = tlY - startHeight;
		if(startHeight >= 1)
		{
			DrawUL(g,tlX,tlY,startWidth,startHeight);
			DrawUR(g,tlX,tlY,startWidth,startHeight);
			DrawBL(g,tlX,tlY,startWidth,startHeight);
		}
	}
	public void DrawUR (Graphics g, int tlX, int tlY, int startWidth, int startHeight )
	{	
		g.fillRect(tlX, tlY, startWidth, startHeight);
		startHeight=startHeight / 2;
		startWidth =startWidth / 2;
		tlX = tlX+(startWidth*2);
		tlY= tlY - startHeight;
		if(startHeight>=1)
		{
			DrawUL(g,tlX,tlY,startWidth,startHeight);
			DrawUR(g,tlX,tlY,startWidth,startHeight);
			DrawBR(g,tlX,tlY,startWidth,startHeight);
		}
		
	}

	public void DrawBL(Graphics g, int tlX, int tlY, int startWidth, int startHeight)
	{
		g.fillRect(tlX, tlY, startWidth, startHeight);
		startHeight = startHeight / 2;
		startWidth = startWidth / 2;
		tlX = tlX - startWidth;
		tlY = tlY+(startHeight*2);
		if(startHeight >= 1)
		{
			DrawBL(g,tlX,tlY,startWidth,startHeight);
			DrawUL(g,tlX,tlY,startWidth,startHeight);
			DrawBR(g,tlX,tlY,startWidth,startHeight);
			}

	}

	public void DrawBR(Graphics g, int tlX, int tlY, int startWidth, int startHeight)
	{
		g.fillRect(tlX, tlY, startWidth, startHeight);
		startHeight = startHeight / 2;
		startWidth = startWidth / 2;
		tlX = tlX + (startWidth*2);
		tlY = tlY + (startHeight*2);
		if(startHeight>=1)
		{
			DrawBR(g,tlX,tlY,startWidth,startHeight);
			DrawUR(g,tlX,tlY,startWidth,startHeight);
			DrawBL(g,tlX,tlY,startWidth,startHeight);
		}

	}

}
