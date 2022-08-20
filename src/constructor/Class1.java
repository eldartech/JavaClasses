package constructor;

public class Class1 {
    String name;
    int id;
    String email;
    static String emailDomain;

  Class1(String name){
     this.name=name;
  }

  Class1(int number){
      id=number;
  }

  Class1(String name,int id){
      this(name);
      this.id=id;
  }

  Class1(String name,int id, String email){
      this(name,id);
      this.email=email;

  }




    void print(String name){
      int i=0;
        System.out.println(name+ " Method of Class1");

    }

}
