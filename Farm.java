class Farm 
{     
	private Animal[] aBunchOfAnimals = new Animal[3];
	public Farm()     {       
       aBunchOfAnimals[0] = new NamedElephant("elephant","prrrrummmph", "Big Elephant");           
       aBunchOfAnimals[1] = new Camel("camel","grumph.","*slobber*");       
       aBunchOfAnimals[2] = new Polarbear("polar bear","roar");
    }         
   public void animalSounds()    {       
     for (int nI=0; nI < aBunchOfAnimals.length; nI++)       {          
       System.out.println( aBunchOfAnimals[nI].getType() + " goes " + aBunchOfAnimals[nI].getSound()); 
   }
       System.out.println(((NamedElephant)aBunchOfAnimals[0]).getName() + ", I shall name thee Joe.");  
      }    
    } 

