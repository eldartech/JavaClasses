package javaIntro;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class PrimitiveData {
    public PrimitiveData() {
    }

    public static void main(String[] var0) {
        byte var1 = 12;
        byte var2 = 13;
        int var3 = var1 + var2;
        System.out.println(var3);
        byte var4 = 5;
        System.out.println(var3 - var4);
        double var5 = 4.5D;
        System.out.println(var5 * (double)var4);
        byte var7 = 2;
        System.out.println(var5 * (double)var4 / (double)var7);
        byte var8 = 3;
        byte var9 = 2;
        int var10 = var8 % var9;
        System.out.println(var10);
        byte var11 = 65;
        byte var12 = 66;
        System.out.println(var12 + var11);
        int var13 = (var8 + var9) * var10 / var7;
        System.out.println(var13);
        byte var16 = 55;
        System.out.println(var16);
        String var14 = "1";
        System.out.println(var14);
        var14 = var14 + "2";
        System.out.println(var14);
        var14 = var14 + "2";
        System.out.println(var14);
        String var15 = "hustuling";
        System.out.println(var15.indexOf("u"));
        System.out.println(var15.indexOf("in"));
        System.out.println(var15.indexOf("t", 3));
        System.out.println(var15.indexOf("u", 4));
    }
}
