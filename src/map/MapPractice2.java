package map;

import javax.swing.plaf.IconUIResource;
import java.util.*;

public class MapPractice2 {
    public static void main(String[] args) {
        /*
        - put(Object key, Object value)
        it is used to insert/store an entry in the map
        - putAll(Map map)
        it is used to insert the specified map in the map
        - putIfAbsent(K key, V value)
        it inserts the specified value with the specified
        key in the map only if key is not alredy specified in map/or doesnt exist in key set
         */
        LinkedHashMap<String, String> movies = new LinkedHashMap<>();
        movies.put("comedy", "Mask");
        movies.put("comedy", "Mask2");
        System.out.println(movies);
        movies.putIfAbsent("horror", "Silent Hill");
        System.out.println(movies);
        HashMap<String, String> copyOfMovies = new HashMap<>();
        copyOfMovies.put("drama", "Notebook");
        System.out.println(copyOfMovies);
        copyOfMovies.putAll(movies);
        System.out.println(copyOfMovies);
        HashMap<String, String> copyOfMovies2 = new HashMap<>(movies);
        System.out.println(copyOfMovies2);
/*
- get(Object key)
	it is used to get the value of associated key
 */
        String movie = movies.get("horror").toUpperCase().replace(" ", "-");
        System.out.println(movie);
        /*
        	- remove(Object key)
	delete entry(key/value) of specified key
	- remove(Object key, Object value)
         */
        movies.remove("Comedy");
        System.out.println(movies);
        System.out.println(movies.size());
        /*
        keySet()
        returns set of keys
         */
        System.out.println(copyOfMovies.keySet());
        Set<String> keys=copyOfMovies.keySet();
        for (String key:keys) {
            if (key.equals("drama")){
              copyOfMovies.put(key,copyOfMovies.get(key).toUpperCase());
            }
        }
        System.out.println(copyOfMovies);//{drama=Notebook, horror=Silent Hill, comedy=Mask2}
        /*
        entrySet()
      returns the set of Map.Entry<DataType,DataType>
      Set<Map.Entry<DataType,DataType>
      Set<Entry<DataType,DataType>
         */
       Set<Map.Entry<String,String>> nameOfEntrySet = copyOfMovies.entrySet();
        for (Map.Entry<String,String> item:nameOfEntrySet) {
            System.out.println(item.getKey());
            System.out.println(item.getValue());
        }
        copyOfMovies.put("horror","Silent Hill");

        copyOfMovies.replace("horror","Hill","silent");
        System.out.println(copyOfMovies);
        copyOfMovies.replace("drama","war and peace");
        System.out.println(copyOfMovies);

       // {drama=war and peace, horror=Silent Hill, comedy=Mask2}
       // warn and peace, silent hill, mask2
        //containsValue(Object value)  --> true/false
        //containsKey(Object key) --> true/false
        System.out.println("Key Set: "+copyOfMovies.keySet());
        System.out.println(copyOfMovies.containsKey("Drama"));
        Collection<String> values = copyOfMovies.values();
        System.out.println("Values collection: "+values);
        System.out.println(copyOfMovies.containsValue("war and peace"));
        ArrayList<String> valueList = new ArrayList<>(copyOfMovies.values());
        System.out.println(valueList.get(0));
        ArrayList<String> keyList = new ArrayList<>(copyOfMovies.keySet());
        System.out.println(keyList.get(0));
        //clear() -> deletes the entries from map
        // size() -> amount of entries in map
        // isEmpty() -> checks if map contains entries
        System.out.println(copyOfMovies.size());
        System.out.println(copyOfMovies.isEmpty());
        System.out.println(copyOfMovies);
        copyOfMovies.clear();
        System.out.println(copyOfMovies.size());
        System.out.println(copyOfMovies.isEmpty());
        System.out.println(copyOfMovies);


    }
}
