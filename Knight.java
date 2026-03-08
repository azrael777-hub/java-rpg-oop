class Knight extends Entity {

    private double defense;

    public Knight(String nama, double hp, double attack, double defense) {
        super(nama, hp, attack);
        this.defense = defense;
    }

    public void infoStatus() {
        super.infoStatus();
        System.out.println("Defense: " + defense);
    }
}
