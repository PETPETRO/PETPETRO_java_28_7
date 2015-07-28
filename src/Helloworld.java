
public class Helloworld {

	public static void main(String[] args) {

		System.out.println("------------PERSON--------------------");

		Person p = new Person("Janko Hrasko", 18);
		System.out.println(p.toString());

		System.out.println("------------TRIANGLE--------------------");

		Triangle t = new Triangle(10);
		System.out.println(t.toString());

		System.out.println("------------LINE--------------------");

		Line l = new Line(10, true);
		System.out.print(l.toString());

		System.out.println("------------SQUARE--------------------");

		Square s = new Square(10);
		System.out.println(s.toString());

		System.out.println("------------RECTANGLE--------------------");

		Rectangle r = new Rectangle(5, 10);
		System.out.println(r.toString());

		
		 System.out.println("------------HelloWorld o jedno pismeno menej vzdy (v cykle)------");
		
		 int i = 0;
		 String hello = "hello world";
		 while (i < hello.length()) {
		 String hell1;
		 hell1 = hello.substring(0, hello.length() - i);
		 i++;
		 System.out.println(hell1);
		 }
		
		 System.out.println("\n------------to iste len opacne----------------");
		
		 i = 0;
		 while (i <= hello.length()) {
		 String hell1;
		 hell1 = hello.substring(0, i);
		 i++;
		 System.out.println(hell1);
		 }
		
		
		 System.out.println("\n-------uberat aj zo zaciatku aj z konca; upravit aby fungovalo pre akykolvek retazec----------------");
		
		 i = 0;
		 while (i < hello.length() / 2) {
		 String hell = hello.substring(i, hello.length() - i);
		 System.out.println(hell);
		 i++;
		 }
		
		
		
		 System.out.println("\n-------pridat medzery aby z toho bol rovnoramenny trojuholnik----------------");
		 i = 0;
		
		 while (i < hello.length() / 2) {
		 String hell = hello.substring(i, hello.length() - i);
		 for (int a = 0; a < i; a++) {
		 hell = " " + hell;
		 }
		 System.out.println(hell);
		 i++;
		 }

	}

}