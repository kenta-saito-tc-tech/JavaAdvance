package UserPackage;

public class Main {

    public static void main(String[] args){
        User u1 = new User("斎藤", "埼玉", "1994/05/09");
        User u2 = new User("斎藤", "埼玉", "1994/05/09");

        System.out.println(u1.equals(u2));
        System.out.println(u1);
    }


}
