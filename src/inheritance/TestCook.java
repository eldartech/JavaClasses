package inheritance;

 class TestCook {

    public static void main(String[] args) {
        Cook cook=new Cook("Benjamin",24);

        cook.cookFood();
        cook.makeSalad();
        System.out.println(cook.name);
        System.out.println(cook.age);
        System.out.println(cook.cookingTime());
        FrenchCook frenchCook=new FrenchCook("Farnsua",35);
        System.out.println(frenchCook.name);
        System.out.println(frenchCook.age);
        frenchCook.makeSalad();
        frenchCook.cookFood();

        System.out.println(frenchCook.cookingTime());

    }
}
