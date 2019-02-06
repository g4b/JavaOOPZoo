public class Bear extends Animal{


    public Bear(String name){
        super(name, "fish");
    }

    public void sleep(){
        System.out.println(this.name + " hibernates for 4 months");
    }

    public void eat(String food){
        System.out.println(this.name + " eats " + food);
        if (food.equals(this.favoriteFood)){
            System.out.println("YUM!!! " + this.name + " wants more " + food);
        } else {
            this.sleep();
        }
    }
}
