//Java 8 introduced built-in support for Base64 encoding and decoding through the java.util.Base64 class.
//
//Base64 converts binary data into a textual representation that uses a defined set of characters.
//
//It is commonly used when binary data needs to be represented as text.
//
//Important: Base64 is an encoding mechanism, not encryption. It does not provide confidentiality or security by itself.

import java.util.Base64;

public class Base64EncodingandDecoding {
    public static void main(String[] args) {
        String text = "Hello Java";

        String encoded =
                Base64.getEncoder()
                .encodeToString(
                        text.getBytes());

        System.out.println("Encoded: " + encoded);

        byte[] decodedBytes = Base64.getDecoder()
                .decode(encoded);

        System.out.println("Decoded: " +
                new String(decodedBytes));
    }
}
