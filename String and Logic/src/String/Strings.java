package String;

public class Strings {

	public static void main(String[] args) {
		String a = "Hello";
		String b = "Java";
		System.out.println(a);
        int length = a.length();
        System.out.println(length);
        String c = a.concat(b);
        System.out.println(c);
        boolean result = a.equals(c);
        System.out.println("String a and c are equal="+result);
        System.out.println(a.toLowerCase());
        System.out.println(b.toUpperCase());
        System.out.println(b.trim());
        System.out.println(a.charAt(1));
        String d = "Java is fun to learn";
        String s1 = d.replace("fun","easy");
        System.out.println(s1);
        int e =5;
        String s2 = String.valueOf(e);
        System.out.println(s2+3);
        String str = String.join("*","new","java","book");
        int s =str.indexOf(s1);
        System.out.println(s);
        System.out.println(str);
        StringBuilder nidhi = new StringBuilder("Java");
        nidhi.append(result);
        System.out.println(nidhi);
	}

}

