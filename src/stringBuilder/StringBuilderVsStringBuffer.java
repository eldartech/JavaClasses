package stringBuilder;

public class StringBuilderVsStringBuffer {
    public static void main(String[] args) {
        //creating the StringBuilder without value
        StringBuilder stringBuilder=new StringBuilder();
        //value is passed into the object
        StringBuilder stringBuilder1=new StringBuilder("Apple");

        StringBuffer stringBuffer=new StringBuffer("Orange");
        //System.out.println(stringBuffer);

        StringBuilder stringBuilder2=new StringBuilder(5);
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder1.length());
        System.out.println(stringBuilder2.length());

        //.append() method in StringBuilder
       String str="123";
       str.concat("5984");
        System.out.println(str);//123
        stringBuilder.append("Techtorial").append(str);
        System.out.println(stringBuilder);
        stringBuilder.append(true);
        System.out.println(stringBuilder);
        stringBuffer.append(6000);
        System.out.println(stringBuffer);
        StringBuilder stringBuilder3= new StringBuilder();
        for (char letter='a';letter<='z';letter++){
            stringBuilder2.append(letter);
        }
        System.out.println(stringBuilder2);





    }
}
