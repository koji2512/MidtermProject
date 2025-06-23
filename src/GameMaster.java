public class GameMaster {
    public static void main(String[] args) {
        Hero abel = new Hero("アベル", 100, "鋼の剣");
        Slime s = new Slime("スライムA",30);
        System.out.println("冒険が始まる…！");
        abel.showstatus();
        s.showstatus();
        System.out.println("戦闘開始！");
        abel.attack(s);
        s.showstatus();
        s.attack(abel);
        abel.showstatus();
        abel.heal();
        abel.showstatus();
        abel.attack(s);
        abel.attack(s);
        abel.attack(s);
        System.out.println("--- 戦闘終了 ---");
        abel.showstatus();
        s.showstatus();
        System.out.println(abel.name + "は生きている:"+ abel.isAlive());
        System.out.println(s.name + "は生きている:"+ s.isAlive());
        System.out.println("--- 参照の確認　---");
        Character partyMember = abel;
        partyMember.hp -=50;
        System.out.println("partyMember経由でHPを減らした後:");
        abel.showstatus();
    }
}
