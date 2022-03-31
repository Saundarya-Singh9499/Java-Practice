package Strings;

public class StringStarter {

	public static void main(String[] args) {
		
		String str = "Saundarya";
		String str1 = " Singh";		
		
		System.out.println(str.length());
		System.out.println(str.charAt(1));
        System.out.println(str.concat(str1));
//		System.out.println(str + str1);
//          str = srt1 + str2;
//		str += str1;
//         System.out.println(str);
//		str = str.concat(str1);
//        System.out.println(str);
//        System.out.println(str.equals(str2));
        System.out.println(str.compareTo(str1));
        System.out.println(str.contains("S"));
        String substr = str.substring(4);
        System.out.println(substr);
        substr = str.substring(1, 5);
        System.out.println(substr);
        
        
	}
	
}
