
/**
 * Write a description of class Taxizentrale here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Iterator;
import java.util.ArrayList;

public class Taxizentrale
{
    private String name;
    private ArrayList<Auto> taxis;
    private float grundPreis;
    private float kmPreis;
    private float gesamtEinnahmen;

    public Taxizentrale(String zentralenName)
    {
        setName(zentralenName);
        taxis = new ArrayList<Auto>(100);
        taxis.add(new Auto("bmw",3400,1999));
        taxis.add(new Auto("Mercedes",3500,2004));
        taxis.add(new Auto("bmw",98999,2010));
        taxis.add(new Auto("bmw",3400,1999));
        taxis.add(new Auto("bmw",7500,2000));
        taxis.add(new Auto("bmw",8888,1999));
        taxis.add(new Auto("bmw",6575,1999));

    }

    public String getName()
    {
        return name; 
    }

    public float getGrundPreis()
    {
        return grundPreis;
    }

    public float getKmPreis()
    {
        return kmPreis;
    }

    public float gesamtEinnahmen()
    {
        return gesamtEinnahmen;
    }

    public void setName(String zentralenName)
    {
        if(zentralenName != null)
        {
            this.name = zentralenName;
        }
    }

    public void setGrundPreis(float prize)
    {
        if(prize >0)
        {
            this.grundPreis = prize;
        }
    }

    public void setKmPreis(float prize) 
    {
        if(prize >0)
        {
            this.kmPreis = prize;
        }
    }

    public void addTaxi(Auto taxi)
    {
        if( ! taxis.contains(taxi) )
        {
            if( taxi != null)
            {
                taxis.add(taxi);
                taxi.setZentrale(this);
            }
            else
            {
                System.out.println("wtf addTaxi");
            }
        }
        else
        {
            System.out.println("wtf addTaxi");
        }
    }

    public int berechneAnzTaxisFrei()
    {
        int anz = 0;

        for(int c = 0; c < taxis.size(); c++)
        {
            Auto karre;
            karre = taxis.get(c);
            if(karre.getFrei() == true)
            {
                anz++;
            }
        }

        return anz;
    }

    public int getPosFahrer(String fahrer)
    {
        boolean x = false;
        int pos = -9999;

        for(int c = 0; c < taxis.size() || x == true; c++)
        {
            Auto karre;
            karre = taxis.get(c);
            if(karre.getFahrer().equals(fahrer) == true)
            {
                x = true;
                pos = c;
            }
        }
        return pos;
    }

    public void reserviereTaxi(String fahrer)
    {
        Iterator<Auto> it = taxis.iterator();

        while(it.hasNext()) 
        {
            Auto auto = it.next();
            if(auto.getFahrer().equals(fahrer) == true )
            {
                if(auto.getFrei() == true )
                {
                    auto.setFrei(false);
                }
                else
                {
                    System.out.println("wtf reserviereTaxi");
                }
            }
        }

    }

    public void sortTaxis()
    {
        Auto save;
        for(int c = 0; c < taxis.size();c++)
        {
            Auto karre;
            karre = taxis.get(c);

            for(int i = 0; i < taxis.size(); i++)
            {
                Auto car;
                car = taxis.get(i);
                if(karre.getKmStdAlt()> car.getKmStdAlt() )
                {
                    save = karre;
                    taxis.set(c, car);
                    taxis.set(i, save);
                }

            }
        }
    }

    public void sortTaxis1()
    {
        Auto save;
        for(int c = 0; c < taxis.size()-1;c++)
        {

            for(int i = 0; i < taxis.size()-1; i++)
            {
                Auto car;
                Auto karre;
                karre = taxis.get(i);
                car = taxis.get(i+1);
                if(karre.getKmStdAlt()> car.getKmStdAlt() )
                {
                    save = karre;
                    taxis.set(i, car);
                    taxis.set(i+1, save);
                }

            }
        }
    }
    
    
}
