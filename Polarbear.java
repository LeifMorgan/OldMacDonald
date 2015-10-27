class Polarbear implements Animal 
{     
    private String myType;
    private String mySound;

    public Polarbear(String type, String sound)     {         
        myType = type;         
        mySound = sound;     
    }     
    public Polarbear()     {         
        myType = "unknown";         
        mySound = "unknown";     
    }      
    public String getSound(){return mySound;}     
    public String getType(){return myType;} 
}