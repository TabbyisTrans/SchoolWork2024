/*
 * Activity 3.6.3
 */
public class PetSimulator
{
  public static void main(String[] args)
  {
    // create an array that can hold up to 10 pets (does not require looping)
    Pet[] pets = new Pet[10];
    // adopt (create and name) four pets, two cats, two dogs (does not require looping)
    pets[0] = new Pet("Bella",2);
    pets[1] = new Pet("Marcie",2);
    pets[2] = new Pet("Bob",2);
    pets[3] = new Pet("Zoey",2);
    pets[4] = new Pet("Paws",1);
    pets[5] = new Pet("Rose",1);
    // first things first, feed your pets
    for (Pet g: pets)
    {
      if (g != null)
      {
        g.feed();
      }
    }
    // next, make yourself the owner of all of your new pets
    for (Pet g: pets)
    {
      if (g != null)
      {
        g.setOwner("Tabitha");
      }
    }
    // your dogs make some noise, take them for a walk
    for (Pet g: pets)
    {
      if (g != null)
      {
        g.walk();
      }
    }
    // when you get back, your cats make some noise
    
    // give all of your pets a treat
    for (Pet g: pets)
    {
      if (g != null)
      {
        g.giveTreat();
      }
    }
    // groom your cats
    for (Pet g: pets)
    {
      if (g != null && g.getType() == 1)
      {
        g.groom();
      }
    }
    // grooming is done, play with all pets
    for (Pet g: pets)
    {
      if (g != null)
      {
        g.play();
      }
    }
    // whew, that was tiring, all pets nap and get fed
    for (Pet g: pets)
    {
      if (g != null)
      {
        g.feed();
        g.sleep();
      }
    }
    System.out.println("--- MY PETS ---");
    // show the state of all of your pets
    for (Pet g: pets)
    {
      if (g != null)
      {
        System.out.println(g);
      }
    }
    // You decide to get a couple of pets for your friend (does not require looping)
    pets[6] = new Pet("Lucy",1);
    pets[7] = new Pet("Rob",2);
    // set the owner of the new pets to your friends name
    for(Pet g: pets)
    {
      if (g!=null && g.getName() == null)
      {
        g.setOwner("William");
      }
    }
    System.out.println("--- MY PETS ---");
    // show the state of all of your pets
    for(Pet g: pets)
    {
      if (g!=null && g.getOwner() == "Tabitha")
      {
        System.out.println(g);
      }
    }
  }
}