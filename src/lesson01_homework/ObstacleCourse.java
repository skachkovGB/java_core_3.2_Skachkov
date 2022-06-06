package lesson01_homework;

import lesson01_homework.obstacle.Jumping;
import lesson01_homework.obstacle.Running;
import lesson01_homework.obstacle.Swimming;

public class ObstacleCourse implements Jumping, Running, Swimming {

    private String result = "";

    private int heightBarrier = 2;
    private boolean jumpFlag = false;
    private int speedLap = 10;
    private boolean runFlag = false;
    private int staminaSwim = 50;
    private boolean swimFlag = false;

    public void jump(int height, Player player){
        if (height>=heightBarrier){
            System.out.print("Jumping complete! ");
            this.jumpFlag = true;
        } else {
            System.out.print("Jumping fail!!!!! ");
            this.jumpFlag = false;
        }
        player.setEnergy(height*20);
    }

    public void run(int speed, Player player){
        if (speed>=speedLap){
            System.out.print("Running complete! ");
            this.runFlag = true;
        } else {
            System.out.print("Running fail!!!!! ");
            this.runFlag = false;
        }
        player.setEnergy(speed*3);
    }
    public void swim(int stamina){
        if (stamina>=staminaSwim){
            System.out.println("Swimming complete! ");
            //+ '\n';
            this.swimFlag = true;
        } else {
            System.out.println("Swimming fail!!!!! ");
            this.swimFlag = false;
        }
    }

    public ObstacleCourse(){}

    public void doIt(Team team){
        System.out.println("Players complete trial:");
        for (int i = 0; i < 4; i++) {
            System.out.print((i+1)+ " player: ");
            jump(team.getPlayers(i).getHeightJumping(),team.getPlayers(i));
            run(team.getPlayers(i).getSpeedRunning(), team.getPlayers(i));
            swim(team.getPlayers(i).getEnergy());
            if (jumpFlag & runFlag & swimFlag) {
                this.result += team.getPlayers(i).getName()+ "; ";
            }
        }
    }

    public String getResult() {
        return result;
    }
}
