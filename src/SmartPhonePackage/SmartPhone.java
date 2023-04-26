package SmartPhonePackage;

import java.util.ArrayList;

public class SmartPhone {
    //フィールド
    private Model model;
    private Os os;
    Account account;
    AddressBook[] addressBooks;
    App[] apps;
    //ArrayList<String> x = new ArrayList<>();

    //コンストラクタ
    public SmartPhone(Model model, Os os) {
        this.model = model;
        this.os = os;
    }

    /**
     * 引数でもらったAccountを自分のフィールドのaccoutにセットする
     * @param account Accountクラスのフィールド
     */
    public void setAccount(Account account) {
        this.account = account;
    }

    /**
     * modelとosの情報を表示する
     */
    public void displayDeviceInfo(){
        System.out.println("MODEL："+this.model+" OS："+this.os);
    }

    /**
     * accountの情報を表示する
     */
    public void displayMyAccount(){
        System.out.println("アカウント情報："+this.account.getAccountInfo());
    }

    /**
     * addressBooksに要素を追加する
     * @param addressBooks AddressBookクラスのフィールド
     * @return　配列の要素に空きがない場合は何もせずにfalseを返す
     */
    public boolean addAddressBook(AddressBook[] addressBooks){
        this.addressBooks = new AddressBook[addressBooks.length];
        for (var value: this.addressBooks){
            if(value != null){
                return false;
            }
        }
        for (int i = 0; i < addressBooks.length; i++){
                this.addressBooks[i] = addressBooks[i];
        }
        return true;
    }

    /**
     * appsに要素を追加する
     * @param apps Mainクラスのフィールド
     */
    public boolean install(App[] apps) {
        this.apps = new App[apps.length];
        for (var value: this.apps){
            if(value != null){
                return false;
            }
        }
        for (int i = 0; i < apps.length; i++){
            this.apps[i] = apps[i];
        }
        return true;
    }

    /**
     * appsの一覧情報を表示する
     */
    public void displayAppList(){
        System.out.println("アプリ一覧：");
        for(var value: apps){
            System.out.println(value);
        }
    }


}
