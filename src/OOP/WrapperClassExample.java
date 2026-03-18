package OOP;

public class WrapperClassExample {
    public static void main(String[] args) {

        //AutoBoxing
        {
            int n = 10;        //Primitive int variable
            Integer obj = n;   //Autoboxing (int->Integer)

            System.out.println("primitive int value :" + n);
            System.out.println("Integer object value :" + obj);
        }


        //AutoUnboxing
        {
            Integer obj1 = 20;     //Integer object
            int b = obj1;          //unboxing (Integer -> int)

            System.out.println("Integer object value :" + obj1);
            System.out.println("primitive int value :" + b);
        }


        //StringToInt (parseInt)
        {
            String str = "125";
            int c = Integer.parseInt(str);
            System.out.println("Integer value :" + c);
            //Integer.parseInt() -> String -> int convert
        }


        //ValueOf -> Example
        {
            String str = "125";
            Integer d = Integer.valueOf(str);
            System.out.println("Integer Object value :" + d);
            //valueOf() -> String -> Integer Object
        }

    }
}

