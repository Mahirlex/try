package inter.basic.practise;

public class Ae {
		public static void main(String[] args) {
			String name="mahi";
			String tr="tommy is mine";
			System.out.println(4); //prints number of letters in string
			System.out.println(name.length());  //prints length of string
			System.out.println(name.toLowerCase()); //changes to lower case
			System.out.println(tr.length()); //prints length of string
			System.out.println(name.charAt(2)); //prints the character at given index number
			System.out.println(name.concat(tr)); //concatination b/w two strings
			System.out.println(tr.compareTo(name));
			System.out.println(name.codePointAt(3));
			System.out.println(tr.toUpperCase());
			System.out.println(name.indexOf(97));
			System.out.println(tr.lastIndexOf('m'));
			System.out.println(tr.isEmpty());
			System.out.println(tr.replace('m', 'k'));
			System.out.println(tr.trim());
			System.out.println(name.split(tr));
			System.out.println(name.equals(tr));
		}
}
