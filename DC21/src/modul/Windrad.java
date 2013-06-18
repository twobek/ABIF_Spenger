package modul;

public class Windrad 
{
	private float nennleistung;
	private boolean running;
	private WindkraftAnlage zentrale;
	
	public float getNennleistung()
	{
		return nennleistung;
	}
	
	public boolean isRunning()
	{
		return running;
	}
	
	public WindkraftAnlage getZentrale()
	{
		return zentrale;
	}
	
	public void setNennleistung(float nennleistung)
	{
		if(nennleistung >= 0.1 && nennleistung <= 10)
		{
			this.nennleistung = nennleistung;
		}
		else
		{
			System.out.println("wtf setNennleistung");
		}
	}
	
	public void setRunning(boolean running)
	{
		this.running = running;
	}
	
	public void setZentrale(WindkraftAnlage zentrale)
	{
		if(this.zentrale == null && zentrale != null)
		{
			this.zentrale = zentrale;
		}
		else
		{
			System.out.println("wtf setZentrale");
		}
	}
	
}