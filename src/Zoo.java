public class Zoo {

    public static void sleep(String name){
        System.out.print(name + " sleeps for 8 hours");
    }

//    public static void main(String[] args){
//        sleep("Tigger");
//    }

    static String favoriteFood = "bacon";

    public static void eat(String name, String food){
        System.out.print(name + " eats " + food);
        if (food.equals(favoriteFood)){
            System.out.print("YUM!!! " + name + " wants more " + food);
        } else {
            sleep(name);
        }
    }
}
