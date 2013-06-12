
/**
 * Write a description of class Auto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Auto
{
    private String fahrer;
    private String marke;
    private int baujahr;
    private int kmStdAlt;
    private int kmStdNeu;
    private float einnahmen;
    private boolean frei;
    private Taxizentrale zentrale;

    public Auto(String newMarke, int kmStdAlt, int bauJahr)
    {
        setBauJahr(bauJahr);
        setMarke(newMarke);
        setKmStdAlt(kmStdAlt);
        setKmStdNeu(kmStdAlt);
        setEinnahmen(0);
        setFrei(true);
        
    }

    public String getFahrer()
    {
        return fahrer;
    }

    public String getMarke()
    {
        return marke;
    }

    public int getBaujahr()
    {
        return baujahr;
    }

    public int getKmStdAlt()
    {
        return kmStdAlt;
    }

    public int getKmStdNeu()
    {
        return kmStdNeu;
    }

    public float getEinnahmen()
    {
        return einnahmen;
    }

    public boolean getFrei()
    {
        return frei;
    }

    public void setZentrale(Taxizentrale xyz)
    {
        if(this.zentrale == null && xyz != null)
        {
            this.zentrale = xyz;
        }
        else
        {
            System.out.println("wtf setZentrale");
        }
    }
    public void setFahrer(String name)
    {
        if(name != null)
        {
            this.fahrer = name;
        }
        else 
        {
            System.out.println("Bitte Name für Fahrer eingeben");
        }
    }

    public void setMarke(String markenName)
    {
        if(this.marke == null)
        {
            if(markenName != null)
            {
                this.marke = markenName;
            }
            else
            {
                System.out.println("Fehler! ... markenname muß eingengeben werden!");
            }
        }
        else
        {
            System.out.println("FEHLER! ... Markenname für das Auto schon vergeben.");
        }
    }

    public void setBauJahr(int bjahr)
    {
        if(this.baujahr == 0)
        {
            if(bjahr > 1885 && bjahr < 2013)
            {
                this.baujahr = bjahr;
            }
            else
            {
                System.out.println("Fehler! ... baujahr muß zwischen 1885 und 2013");         
            }
        }
        else
        {
            System.out.println("FEHLER! ... baujahr für dieses Auto schon vergeben.");
        }
    }

    public void setKmStdAlt(int kmStd)
    {
        if(kmStd > 0 && kmStd < 100000)
        {
            this.kmStdAlt = kmStd;
        }
        else
        {
            System.out.println("FEHLER! ... kmtstd muß zwischen 0 und kmstd");
        }
    }

    public void setKmStdNeu(int km)
    {
        if(km >= this.kmStdAlt && km < 100000)
        {
            this.kmStdNeu = km;
        }
        else 
        {
            System.out.println("FEHLER! ... km müßen zwischen kmstdalt und 100000 sein!");
        }
    }

    public void setEinnahmen(float geld)
    {
        if(geld >= 0)
        {
            this.einnahmen = geld;
        }
        else
        {
            System.out.println("FEHLER! ... geld soll größer als 0 sein)");
        }
    }

    public void setFrei(boolean free)
    {
        if( !this.frei )
        {
            this.frei = true;
        }
        else
        {
            System.out.println("FEHLER! ... Auto ist schon frei!");
        }
    }

    public void fahren(int km)
    {
        if(km > 0 && km < 1000)
        {

            if( (this.kmStdNeu + km) > 100000 )
            {
                setKmStdNeu( (this.kmStdNeu + km - 100000) );
            }
            else
            {
                setKmStdNeu(this.kmStdNeu + km);
            }
        }
        else
        {
            System.out.println("Fehler! ... gefahrene km müßen zwischen 0 und 1000 liegen!");
        }
    }

    public int berechneKm()
    {
        int ans = 0;
        if(this.kmStdNeu > this.kmStdAlt)
        {
            ans = this.kmStdNeu - this.kmStdAlt;
            return ans;
        }
        else 
        {
            ans = (99999 - this.kmStdAlt) + this.kmStdNeu;
            return ans;
        }
    }
    
    public double berechneFahrtPreis()
    {
        double ans = 0;
        
        ans = (double)berechneKm() * 0.75 + 2.5;
        return ans;
    }
}

