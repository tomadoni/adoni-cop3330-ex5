import java.util.Scanner;
class Main {

    public static void main(String[] args) {
	    Scanner kb= new Scanner(System.in);
	    String str="";
	    String s="";
	    System.out.println("What is the first number?");
	    str=kb.nextLine();
	    System.out.println("What is the second number?");
	    s=kb.nextLine();
		int a=Integer.parseInt(str);
		int b=Integer.parseInt(s);
		System.out.println(a+" + "+b+" = "+(a+b)+"\n"+a+" - "+b+" = "+(a-b)+"\n"+a+" * "+b+" = "+(a*b)+"\n"+a+" / "+b+" = "+(a/b)+"\n");
    }
}
