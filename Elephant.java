class Elephant implements Animal 
{     
    protected String myType;
    protected String mySound;

    public Elephant(String type, String sound)     {         
        myType = type;         
        mySound = sound;     
    }     
    public Elephant()     {         
        myType = "Elephant";         
        mySound = "prrrrummmph";     
    }      
    public String getSound(){return mySound;}     
    public String getType(){return myType;} 

}