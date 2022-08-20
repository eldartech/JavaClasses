package map;

import java.security.KeyStore;
import java.util.*;

public class MapPracticeMethods {
/*
Scanner
Map
for5{
ask question
store users input
put(usersZip,usersCity)
}
 */
public static void main(String[] args) {
   /* Scanner scanner=new Scanner(System.in);
    Map<Integer,String> cities=new HashMap<>();
    for (int i=0; i<5;i++){
        System.out.println("Enter zip code:");
        Integer zipCode=scanner.nextInt();
        System.out.println("Enter city name:");
        scanner.nextLine();
        String cityName= scanner.nextLine();
        cities.put(zipCode,cityName);
    }
    System.out.println(cities);*/
    HashMap<Integer, String> zipsCities = new HashMap();
    zipsCities.put(33180,"Aventura");
    zipsCities.put(33160, "Sunny Isles Beach");
    zipsCities.put(33172,"Miami Beach");
    zipsCities.put(33334, "Fort Lauderdale");
    Map<Integer,String> cities=new HashMap<>();
    cities.put(23523,"Hollywood");
    System.out.println(cities);
    cities.putAll(zipsCities);
    System.out.println(cities);
    cities.putIfAbsent(23524,"Broard");
    System.out.println(cities);
    cities.remove(23524);
    System.out.println("after removing: "+cities);
    cities.remove(23523,"Hollywood");
    System.out.println("remove with key and value: "+cities);
    System.out.println("33172 is for "+cities.get(33172));
    Set<Integer> zipKeys=cities.keySet();
    System.out.println("All zipcodes in DB:");
    for (Integer zip:zipKeys){
        System.out.println(zip);
    }

    Set<Map.Entry<Integer,String>> keyAndValue= cities.entrySet();
    for (Map.Entry<Integer,String> entry:keyAndValue){
        System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue().toUpperCase());
    }

    cities.put(60056,"Mount Prospect");
    cities.put(60001,"Chicago");
    cities.put(60026,"Glenview");
    cities.put(60016,"Des Planes");

    /*
    new map and store
    if zip code starts with 33
    store into new map
     */
    Map<Integer, String> florida=new HashMap<>();
    Map<Integer, String> illinois=new HashMap<>();
    for (Map.Entry<Integer,String> entry:keyAndValue){
        if (entry.getKey().toString().startsWith("33")){
            florida.put(entry.getKey(),entry.getValue());
        }else {
            illinois.put(entry.getKey(), entry.getValue());
        }
    }
    System.out.println("Illinois: "+illinois);
    System.out.println("Florida: "+florida);

    TreeMap<String,Integer> products = new TreeMap<>();
    products.put("Bread",5);
    products.put("Milk",3);
    System.out.println(products);
    int count=products.get("Bread");
    products.put("Bread",--count);
    System.out.println(products);

    System.out.println(cities.containsKey(60016));



}
}
