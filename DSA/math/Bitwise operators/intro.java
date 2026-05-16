class intro{
    public static void main(String[] args) {
        //bitwise AND(&) -  it return true when both the inputs are true, otherwise false.
        int a = 5,b =3;
        System.out.println(a&b);

        //bitwise OR(|) - it return false when both the inputs are false, otherwise true.
        System.out.println(a | b); 

        // bitwise XOR(^) -  it gives true when only one input is true,
        System.out.println(a^b);

        //bitwise complement(~) -it gives opesite of input.
        System.out.println(~b);

        //bitwise left shift(<<) - it shift the bits by one and return digit.
        //a<<b=a*2^b
        //a<<1 = it doubles the given digit 
        System.out.println(4<<1);
        
        //bitwise right shift(>>) 
        //a>>b=a/2^b - it only gives int value
        System.out.println(a>>b);
    }
}