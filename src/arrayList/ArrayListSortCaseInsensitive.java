package arrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListSortCaseInsensitive {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(new String[]{"zxsf","ASDF","ERTY","YUIT","ZXSF","qwer","QWER","abcd","A","Z","a","z","b"});
    //    Collections.sort(words);//[A, ASDF, ERTY, QWER, YUIT, Z, ZXSF, a, abcd, b, qwer, z, zxsf]
        Collections.sort(words,String.CASE_INSENSITIVE_ORDER);
        System.out.println(words);//[A, a, abcd, ASDF, b, ERTY, qwer, QWER, YUIT, Z, z, zxsf, ZXSF]
        List<String> employeeNames = Arrays.asList(new String[]{"Zolo","Bob","Alex","abby","Bethy","Nancy"});
        Collections.sort(employeeNames);
        System.out.println(employeeNames);
        //[Alex, Bethy, Bob, Nancy, Zolo, abby]
        Collections.sort(employeeNames,String.CASE_INSENSITIVE_ORDER);
        //[abby, Alex, Bethy, Bob, Nancy, Zolo]
        System.out.println(employeeNames);

        Collections.sort(employeeNames,Collections.reverseOrder());
        //[abby, Zolo, Nancy, Bob, Bethy, Alex]
        System.out.println(employeeNames);


        System.out.println(Collections.binarySearch(employeeNames,"Zolo"));
    }
}
