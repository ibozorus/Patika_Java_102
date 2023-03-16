public class BattleLocation extends Location{
    private Obstacle obstacle;
    public BattleLocation(Obstacle obstacle) {
        this.obstacle = obstacle;
    }
    @Override
    public boolean onLocation() {
        return false;
    }
    public void battle(){

    }

}
