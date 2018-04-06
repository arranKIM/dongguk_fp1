import java.util.Scanner;

public class ShowByteBits {
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        byte bv = sc.nextByte();
        System.out.printf("%d", (bv & 0b10000000) >> 7);
        System.out.printf("%d", (bv & 0b1000000) >> 6);
        System.out.printf("%d", (bv & 0b100000) >> 5);
        System.out.printf("%d", (bv & 0b10000) >> 4);
        System.out.printf("%d", (bv & 0b1000) >> 3);
        System.out.printf("%d", (bv & 0b100) >> 2);
        System.out.printf("%d", (bv & 0b10) >> 1);
        System.out.printf("%d\n", (bv & 0b00000001));
    }
}