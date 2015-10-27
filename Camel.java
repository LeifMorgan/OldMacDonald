class Camel implements Animal 
{     
    private String myType;
    private String mySound;

    public Camel(String type, String sound, String sound1)     {         
        myType = type; 
        if((int)(Math.random()*10 ) < 5){ mySound = sound;}
        else {mySound = sound1;}        
            
    }     
    public Camel()     {         
        myType = "unknown";
       if((int)Math.random()*10 - 5 < 0){ mySound = "grumph.";} 
       else {mySound = "slobber";}      
           
    }      
    public String getSound(){return mySound;}     
    public String getType(){return myType;} 
}