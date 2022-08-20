package inheritance;

public class FrenchCook extends Cook{

    void bake(){

        System.out.println("baking bagel");
    }

    FrenchCook(String name,int age){
        super(name, age);
    }






     @Override
     void cookFood(){
         System.out.println("cooking french onion soup");
     }

     /*method overriding
     - same name
     - return type should same or covariant

      */

    /*
    super  this.
    super()  this()
     */

    @Override
    Double cookingTime(){
        System.out.println("Ordinary cook spends "+super.cookingTime());
        return 1d;
    }

}
