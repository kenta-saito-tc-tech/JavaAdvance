package SmartPhonePackage;

public class Main {
    public static void main(String[] args) {
        //インスタンス
        Account ac = new Account("サイトウ", "090-000-0000", "aaa-aaaa@email.com", "okinawa");
        AddressBook[] ab = {
                new AddressBook("goto", "080-xxx-xxxx", "xxx-xxxx@email.com"),
                new AddressBook("sato", "090-yyy-yyyy", "yyy-yyyy@email.com"),
                new AddressBook("kato", "080-zzz-zzzz", "zzz-zzzz@email.com"),
        };
        SmartPhone sp = new SmartPhone("Iphone12", "mac");

        String[] apps = {"地図", "計算機", "ZOOM", "メモ帳"};

        sp.setAccount(ac);
        sp.displayDeviceInfo();
        sp.displayMyAccount();
        boolean flg = sp.addAddressBook(ab);
        if (flg == true){
            System.out.println("アドレス帳の内容の追加完了");
        }else {
            System.out.println("エラーが発生しました");
        }
        sp.installApps(apps);
        sp.displayAppList();

    }
}