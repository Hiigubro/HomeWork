package HomeWork1;

public class Pobitovye {
    public static void main(String[] args) {
        // 42 = 0010 1010, 15 = 0000 1111, -42 = 1101 1110, -15 = 1111 0001
        // Побитовое AND (&)
        System.out.println(42 & 15); // результат 10 = 0000 1010
        System.out.println(-42 & -15); // результат -48 = 1101 0000

        // Побитовое OR (|)
        System.out.println(42 | 15); // результат 47 = 0010 1111
        System.out.println(-42 | -15); // результат -9 = 1111 0111

        // Побитовое XOR (^)
        System.out.println(42 ^ 15); // результат 37 = 0010 0101
        System.out.println(-42 ^ -15); // результат 39 = 0010 0111

        //Побитовое NOT (~)
        System.out.println(~42); // результат -43 = 1101 0101
        System.out.println(~15); // результат -16 = 1111 0000
        System.out.println(~-15); // результат 14 = 0000 1110
        System.out.println(~-42); // результат 41 = 0010 1001

        // Сдвиг влево <<
        System.out.println(42 << 2); // результат 168 = 1010 1000
        System.out.println(15 << 2); // результат 60 = 0011 1100
        System.out.println(-15 << 2); // результат -60 = 1100 0100
        System.out.println(-42 << 2); // результат -168 = 0101 1000

        // Сдвиг вправо >>
        System.out.println(42 >> 2); // результат 10 = 0000 1010
        System.out.println(15 >> 2); // результат 3 = 0000 0011
        System.out.println(-15 >> 2); // результат -4 = 1111 1100
        System.out.println(-42 >> 2); // результат -11 = 1111 0101

        // Сдвиг вправо без учёта знака >>>
        System.out.println(42 >>> 2); // результат 10 = 0000 1010
        System.out.println(15 >>> 2); // результат 3 = 0000 0011
        System.out.println(-15 >>> 2); // результат 1073741820 = 1100 0000 0000 0000 0000 0000 0000 0100
        System.out.println(-42 >>> 2); // результат 1073741813 = 1100 0000 0000 0000 0000 0000 0000 1011

        // Побитовое AND c присваиванием (&=)
        int a = 42;
        int b = 15;
        int a1 = -42;
        int b1 = -15;
        System.out.println(a &= b); // результат 10 = 0000 1010
        System.out.println(a1 &= b1); // результат -48 = 1101 0000

        // Побитовый OR с присваиванием (|=)
        System.out.println(a |= b); // результат 15 = 0000 1111
        System.out.println(a1 |= b1); // результат -15 = 1111 0001

        // Побитовый исключающее OR с присваиванием (^=)
        System.out.println(a ^= b); // результат 0
        System.out.println(a1 ^= b1); // результат 0

        // Сдвиг вправо с присваиванием (>>=)
        System.out.println(a >>= 2); // результат 0
        System.out.println(b >>= 2); // результат 3 = 0000 0011
        System.out.println(a1 >>= 2); // результат 0
        System.out.println(b1 >>= 2); // результат -4 = 1111 1100

        // Сдвиг влево c присваиванием (<<=)
        System.out.println(a <<= 2); // результат 0
        System.out.println(b <<= 2); // результат 12 = 0000 1100
        System.out.println(a1 <<= 2); // результат 0
        System.out.println(b1 <<= 2); // результат -16 = 1111 0000

        // Сдвиг вправо с заполнением нулями с присваиванием (>>>=)
        System.out.println(a >>>= 2); // результат 0
        System.out.println(b >>>= 2); // результат 3 = 0000 0011
        System.out.println(a1 >>>= 2); // результат 0
        System.out.println(b1 >>>= 2); // результат 1073741820 = 1100 0000 0000 0000 0000 0000 0000 0100
    }
}
