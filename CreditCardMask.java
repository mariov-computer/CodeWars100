// Challenge#1 Prompt:
// Usually when you buy something, you're asked whether your credit card number, phone number or answer to your most secret question is still correct. 
//However, since someone could look over your shoulder, you don't want that shown on your screen. Instead, we mask it.
//Your task is to write a function maskify, which changes all but the last four characters into '#'.
//Begin CreditCardMask.java [Java]
public class Maskify {
    public static String maskify(String str) {
        if (str == null || str.length() <= 4) {
            return str;
        }
        int lengthToMask = str.length() - 4;
        String maskedPart = "#".repeat(lengthToMask);
        String visiblePart = str.substring(lengthToMask);
        return maskedPart + visiblePart;
    }

    public static void main(String[] args) {
        // Sample test cases
        System.out.println(maskify("4556364607935616")); // Output: "############5616"
        System.out.println(maskify("64607935616"));      // Output: "#######5616"
        System.out.println(maskify("1"));               // Output: "1"
        System.out.println(maskify(""));                // Output: ""
        System.out.println(maskify(null));              // Output: null
    }
}
