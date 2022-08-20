package wrapperClasses;

public class WrapperClassIntro {
    public static void main(String[] args) {

        Byte byteNum = new Byte((byte)10);//deprecated
        System.out.println(byteNum);
        Byte byteNumn2 = (byte)10;//Autoboxing --> converting primitive type to Wrapper(Object) type

        int primitiveNum = 123;
        Integer integerNum1= primitiveNum;//Autoboxing --> int(primitive)  ==> Integer(wrapper)
        System.out.println(integerNum1);

        int primitiveA=100;
        String numberStr="50";

        Integer wrapperA = Integer.valueOf(primitiveA);//Autoboxing --> valueOf() method is converting primitive into wrapper
        String strNum = wrapperA.toString().concat("$");
        System.out.println(strNum);
        Integer wrapperB = Integer.valueOf(numberStr);
        System.out.println(wrapperA.getClass());
        System.out.println(wrapperB.getClass());
        System.out.println(wrapperA+wrapperB);

        Character letter = 'A';
        System.out.println(letter);

        Boolean wrapperBoolean = 2>0;
        Boolean wrapperBoolean1 = "java".equals("Java");
        Boolean wrapperBoolean2 = new Boolean(100==0 || "java".startsWith("j"));
        Boolean wrapperBoolean3 = new Boolean(true);
        Boolean wrapperBoolean4 = new Boolean("TruE");//Case Insensitive, true or false
        Boolean wrapperBoolean5 = new Boolean("fAlse");//Case Insensitive
        System.out.println(wrapperBoolean);
        System.out.println(wrapperBoolean1);
        System.out.println(wrapperBoolean2);
        System.out.println(wrapperBoolean3);
        System.out.println(wrapperBoolean4);
        System.out.println(wrapperBoolean5);
        Integer wrapperInteger = new Integer("100");
        System.out.println(wrapperInteger+100);
        Integer num1=100;
        Integer num2=100;
        System.out.println(num1==num2);//true
        System.out.println(num1.equals(num2));//true

        Integer num3 = new Integer(100);
        Integer num4 = new Integer(100);
        System.out.println(num3==num4);//false
        System.out.println(num3.equals(num4));//true

        int x= 55;
        double y = x;// implicit casting
        System.out.println(y);

        Short shortWrapper = new Short((short) 500);// autoboxing of cast int into Wrapper Short

        Integer wrapperNum = x;
        //Double wrapperDouble =  wrapperNum;//---> prohibited to casting

        int primitveInt = wrapperNum;//unboxing -> converting Wrapper Integer into primitive int
        System.out.println(primitveInt+100);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);

       int num6 =  wrapperNum.intValue();
       int num7 = wrapperNum;

       int num10 = Integer.parseInt("100");

//parseDouble()
       Double wrapperDouble = Double.parseDouble("666");//autoboxing of primitive into Wrapper Class
        Double wrapperDouble2 = 100d;//autoboxing of primitive into Wrapper class
        System.out.println(wrapperDouble);
        System.out.println(wrapperDouble2);
//toString()
        String strDouble = wrapperDouble.toString();
        System.out.println(strDouble.concat("$"));
        String strDouble2 = Double.toString(y);
        System.out.println(strDouble2.concat("#"));
//compare()
        int t = 10;
        int r = 5;
        System.out.println(Integer.compare(t,r));// 1 if t is greater than r
        System.out.println(Integer.compare(9,10));// -1 since 9 is less than 10
        System.out.println(Integer.compare(10,10));// 0, since 10 is equal to 10
//compareTo()
        Double doubleNum=123d;
        Double doubleNum2 = 122.9;
        System.out.println(doubleNum.compareTo(doubleNum2));//1, since doubleNum is greater than doubleNum2
        System.out.println(new Long(12423L).compareTo(new Long(543234L)));//-1, since 1st object is less than 2nd object
        Short shortNum = new Short((short) 125);
        Short shortNum2 = new Short((short)125);
        System.out.println(shortNum.compareTo(shortNum2));//0, since shortNum is equal to shortNum2
//max()
        System.out.println(Integer.max(100,90));//returns the max number out of provided values
//min()
        System.out.println(Integer.min(100,90));//returns the min number out of provided values






















    }


}
