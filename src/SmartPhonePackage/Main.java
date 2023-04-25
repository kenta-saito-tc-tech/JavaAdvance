package SmartPhonePackage;

import StoneGamePackage.src.StoneGame;

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

        sp.setAccount(ac);
        sp.displayDeviceInfo();
        sp.displayMyAccount();
        boolean flg = sp.addAddressBook(ab);
        if (flg == true){
            System.out.println("アドレス帳の内容の追加完了");
        }else {
            System.out.println("エラーが発生しました");
        }

        /**
         * StoneGameの追加
         */
        StoneGame st = new StoneGame();
        App[] apps = {st};
        boolean appFlg = sp.install(apps);
        if (appFlg == true){
            System.out.println("アプリのインストール完了");
        }else {
            System.out.println("エラーが発生しました");
        }
        sp.displayAppList();

    }
}