package Replit;

class Example {
    static String mixString(String s1, String s2) {
        String combined = "";
        int length = Math.max(s1.length(), s2.length());
        for (int i = 0; i < length; i++) {
            if (i < s1.length()) {
                combined += s1.charAt(i);
            }
            if (i < s2.length()) {
                combined += s2.charAt(i);
            }
        }
        return combined;
    }

    public static void main(String[] args) {
        System.out.println(Example.mixString("abc", "def"));
        System.out.println(Example.mixString("123", "456"));
        System.out.println(Example.mixString("Hello", "World"));
    }
}