package animalpackage;
public interface Animal
{
   void get_cries();
   void get_eating_type();
}
package animalpackage .herbivorous;
public class Cow implements Animal
{
  public void get_cries()
  {
    System.out.println("Cow cries: Moo");
  }
  public void get_eating_type()
  {
    System.out.println("Cow eating type: Herbivorous");
  }
}
public class Elephant implements Animal
{
  public void get_cries()
  {
    System.out.println("Elephant cries: Trumpet");
  }
  public void get_eating_type()
  {
    System.out.println("Elephant eating type: Herbivorous");
  }
}
package animalpackage.carnivorous;
public class Lion implements Animal
{
  public void get_cries()
  {
    System.out.println("Lion cries: Roar");
  }
  public void get_eating_type()
  {
    System.out.println("Lion eating type: Carnivorous");
  }
}
public class Bear implements Animal
{
  public void get_cries()
  {
    System.out.println("Bear cries: Growl");
  }
  public void get_eating_type()
  {
    System.out.println("Bear eating type: Carnivorous");
  }
}
public class Main
{
  public static void main(String[] args)
  {
    animalpackage.herbivorous.Cow cow = new animalpackage.herbivorous.Cow();
    animalpackage.herbivorous.Elephant elephant =new animalpackage.herbivorous.Elephant();
    animalpackage.carnivorous.Lion lion =new animalpackage.carnivorous.Lion();
    animalpackage.carnivorous.Bear bear =new animalpackage.carnivorous.Bear();
    System.out.println("Herbivorous Animals:");
    cow.get_cries();
    cow.get_eating_type();
    elephant.get_cries();
    elephant.get_eating_type();
    System.out.println("\nCarnivorous Animals:");
    lion.get_cries();
    lion.get_eating_type();
    bear.get_cries();
    bear.get_eating_type();
 }
} 
