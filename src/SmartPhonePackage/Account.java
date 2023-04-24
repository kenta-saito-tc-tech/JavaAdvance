package SmartPhonePackage;

public class Account {
    //フィールド
    private String name;
    private String tel;
    private String email;
    private String address;

    //コンストラクタ
    public Account(String name, String tel, String email, String address) {
        this.name = name;
        this.tel = tel;
        this.email = email;
        this.address = address;
    }

    //メソッド
    public String getAccountInfo(){
        String str = "名前："+this.name+" tel："+this.tel+
                " email："+this.email+ " アドレス："+this.address;
        return str;

    }
}
