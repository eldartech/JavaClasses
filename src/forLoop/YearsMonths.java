package forLoop;

public class YearsMonths {

    // Print years and month from 2022 to 2040
    // Skip the years 2032 -2035
    // skip the months 7-9

    //2022 - January
    //2022 - February
    public static void main(String[] args) {
        for (int y = 2022; y <=2040 ; y++) {
            if (y>=2032&&y<=2035)
                continue;

            for (int m = 1; m <=12 ; m++) {
                if(m>=7&&m<=9)
                  continue;
                switch (m){
                    case  1:
                        System.out.println(y+" - January");
                        break;
                    case  2:
                        System.out.println(y+" - February");
                        break;
                    case  3:
                        System.out.println(y+" - March");
                        break;
                    case  4:
                        System.out.println(y+" - April");
                      break;
                    case  5:
                        System.out.println(y+" - May");
                        break;
                    case  6:
                        System.out.println(y+" - June");
                        break;
                    case  10:
                        System.out.println(y+" - October");
                        break;
                    case  11:
                        System.out.println(y+" - November");
                        break;
                    case  12:
                        System.out.println(y+" - December");
                    break;
                }
                //System.out.println(y+"  "+m);
            }
        }
    }
}
