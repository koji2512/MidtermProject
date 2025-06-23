abstract class Character implements Creature {
    String name;
    int hp;
    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    final boolean isAlive(){
        return hp > 0;
    }
    public void showstatus(){
        System.out.println(this.name+":　HP　" + this.hp);
    }
}
