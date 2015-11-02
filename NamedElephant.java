class NamedElephant extends Elephant
{
	private String myName;
    public NamedElephant(String type, String sound, String name)     {         
   
        myName = name;  
    }     
    public NamedElephant()     {         
 
        myName = "Joe";  
    }      

    public String getName(){return myName;}


}