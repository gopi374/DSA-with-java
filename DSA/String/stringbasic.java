public class stringbasic {
    public static void main(String[] args) {
        String s="Hello i am gopi         ";
        System.out.println("Length: "+s.length()); // length()

        System.out.println("Character at index 4: "+s.charAt(4)); // charAt() return value of index

        System.out.println("Index of 'a': "+s.indexOf('a')); // indexOf() return index of first occurrence of character

        System.out.println("Substring (0,5): "+s.substring(0,5)); // substring() return string from start index to end index-1
        
        System.out.println("Substring (6): "+s.substring(6)); // substring() return string from start index to end of string
        
        System.out.println("Contains 'gopi': "+s.contains("gopi")); // contains() return true if string contains the specified sequence of char values
        
        System.out.println("Starts with 'Hello': "+s.startsWith("Hello")); // startsWith() return true if string starts with the specified prefix
        
        System.out.println("Ends with 'gopi': "+s.endsWith("gopi")); // endsWith() return true if string ends with the specified suffix
        
        System.out.println("Uppercase: "+s.toUpperCase()); // toUpperCase() return a string in uppercase
        
        System.out.println("Lowercase: "+s.toLowerCase()); // toLowerCase() return a string in lowercase
        
        System.out.println("Trimmed: "+s.trim()); // trim() return a string with leading and trailing whitespace removed
        
        System.out.println("Replace 'a' with 'A': "+s.replace('a', 'A')); // replace() return a string with all occurrences of old char replaced by new char
        
        System.out.println("Replace 'gopi' with 'GOPI': "+s.replace("gopi", "GOPI")); // replace() return a string with all occurrences of old string replaced by new string   
        
        System.out.println("Concatenated: "+s.concat(" and I am a student")); // concat() return a string with the specified string appended to the end of this string
        
        String str="Second string";
        
        System.out.println("String str: "+str);
        
        System.out.println("string one : "+s);
        
        System.out.println("Trimmed of s : "+s.trim()); 
        
        System.out.println("Concatenated with str: "+s.concat(str)); // concat() return a string with the specified string appended to the end of this string
        
        System.out.println("s equals str: "+s.equals(str)); // equals() return true if this string is equal to the specified object
    }
}
