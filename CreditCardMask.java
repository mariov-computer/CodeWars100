// Challenge#1
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
