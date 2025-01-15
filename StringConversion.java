// Challenge#2 Prompt: Convert a String to a Number
// We need a function that can transform a string into a number. What ways of achieving this do you know?
//Note: Don't worry, all inputs will be strings, and every string is a perfectly valid representation of an integral number.
//Begin CreditCardMask.java [Java]
private class StringToNumber {
  public static int stringToNumber(String str) {
    // I must convert the string into an integer using Integer.parseInt
    return Integer.parseInt(str);
  }

  public static void main(String[] args) {
    // I want to test the function with example inputs
    System.out.println(stringToNumber("123"));  // Output: 123
    System.out.println(stringToNumber("-456")); // Output: -456
    System.out.println(stringToNumber("7890")); // Output: 7890
  }
}
