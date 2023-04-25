package UserPackage;

public class User {
    private String name;
    private String from;
    private String birth;

    public User(String name, String from, String birth) {
        this.name = name;
        this.from = from;
        this.birth = birth;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof User) {
            User u = (User) o;
            if (this.name.equals(u.name) && this.from.equals(u.from) && this.birth.equals(u.birth)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        return "名前："+this.name+ " 出身地："+this.from+ " 生年月日："+this.birth;
    }
}