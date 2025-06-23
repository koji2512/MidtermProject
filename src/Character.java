abstract class Character implements Creature {
    String name;
    int hp;
    final boolean isAlive(){
        return hp > 0;
    }
    public void showstatus(){
        System.out.println(this.name+":　HP　" + this.hp);
    }
}
