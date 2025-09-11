public class DataTypes{
    public static void main(String[] args){

        //primitive type

        byte b = 9;
        short s = 999;
        int i = 9999;
        long l = 9999999;

        float f = 3.14f;
        double d = 324.79412;

        char c = 'c';
        boolean bool = true;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(bool);

        //non primitive type
        String str = "Good Night";
        String str2 = "Shannu";
        byte time = 11;

        int [] ids = {101,102,103}; 

        //concatenation
        System.out.println(str+str2+time);
        System.out.println("he will sleep by: "+ time+1);
        System.out.println("he will sleep by: "+ (time+1));

        int n1 = 10;
        int n2 = 10;
        System.out.println(n1 + n2);

    }
}
