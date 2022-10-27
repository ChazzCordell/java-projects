public class Gorilla extends Mammal{
// super used to reach constructor
  public Gorilla(int energyLevel) {
    super(energyLevel);
  }

  public void throwSomething(){
    System.out.println("The gorilla has thrown something");
    this.energyLevel -= 5;
  }
  public void eatBananas(){
    System.out.println("The Gorilla ate");
    this.energyLevel += 10;
  }
  public void climb(){
    System.out.println("Gorilla climbed!");
    this.energyLevel -= 10;
  }
}
