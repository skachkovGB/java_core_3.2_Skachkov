package lesson01_homework;

public class Player {

    private String name;

    private int heightJumping;
    private int speedRunning;
    private int energy;

    public Player(){}
    public Player(String name, int jump, int run, int energy){
        this.name = name;
        this.heightJumping = jump;
        this.speedRunning = run;
        this.energy = energy;
    }

    public String getName() {
        return name;
    }

    public int getHeightJumping() {
        return heightJumping;
    }

    public int getSpeedRunning() {
        return speedRunning;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy -= energy;
    }
}
