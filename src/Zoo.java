public class Zoo {

      public static void main(String[] args){
          Tiger tigger = new Tiger("Tigger");
          Bear pooh = new Bear("Pooh");
          Unicorn rarity = new Unicorn("Rarity");
          Giraffe gemma = new Giraffe("Gemma");
          Bee stinger = new Bee("Stinger");

          tigger.eat("meat");
          pooh.eat("fish");
          pooh.eat("meat");
          rarity.eat("marshmallows");
          gemma.eat("meat");
          gemma.eat("leaves");
          stinger.eat("ice cream");
          stinger.eat("pollen");

          Animal[] animals = {tigger, pooh, rarity, gemma, stinger};
          Zookeeper zoebot = new Zookeeper("Zoebot");
          zoebot.feedAnimals(animals, "pizza");
      }

    /*static String favoriteFood = "bacon";

    public static void eat(String name, String food){
        System.out.print(name + " eats " + food);
        if (food.equals(favoriteFood)){
            System.out.print("YUM!!! " + name + " wants more " + food);
        } else {
            sleep(name);
        }
    }*/
}
