public class Tiger extends Animal {

    public Tiger(String name) {
        super(name, "meat");
    }

    public void sleep() {
        System.out.println(this.name + " sleeps for 8 hours");
    }

    public void eat(String food) {
        System.out.println(this.name + " eats " + food);
        if (food.equals(this.favoriteFood)) {
            System.out.println("YUM!!! " + this.name + " wants more " + food);
        } else {
            this.sleep();
        }
    }

    public static void main(String[] args) {
        //make and run a main method
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");
    }

}
