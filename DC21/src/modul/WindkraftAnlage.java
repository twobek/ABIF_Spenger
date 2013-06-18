package modul;

import java.util.LinkedList;

public class WindkraftAnlage
{
	private int windstaerke;
	private boolean running;
	private LinkedList<Windrad> windraeder;
	
	public int getWindstaerke()
	{
		return windstaerke;
	}
	public boolean isRunning()
	{
		return running;
	}
	public LinkedList<Windrad> getWindraeder()
	{
		return windraeder;
	}
	public void setWindstaerke(int windstaerke)
	{
		if(windstaerke < 0 && windstaerke > 500)
	{
		this.windstaerke = windstaerke;
	}
		else
		{
			System.out.println("wtf setWindstaerke");
		}
	}
	
	public void setRunning(boolean running)
	{
		this.running = running;
	}
	
	public boolean addWindrad(Windrad wr)
	{
		if( ! windraeder.contains(wr) )
		{
			if(wr != null)
			{
				windraeder.add(wr);
				wr.setZentrale(this);
			}
			else
			{
				System.out.println("wtf addWindrad");
			}
		}
		else
		{
			System.out.println("wtf addWindrad");
		}
	}
	
}
