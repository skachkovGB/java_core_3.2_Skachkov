package lesson01_homework;

public class Team {

    private String teamName;

    private Player[] team = new Player[4];

    public Team(String teamName){

        this.teamName = teamName;

        this.team[0]= new Player("Alex", 2, 11, 100);
        this.team[1]= new Player("Masha", 3, 12,150);
        this.team[2]= new Player("Igor", 1, 10,130);
        this.team[3]= new Player("Victor", 2, 9, 120);
    }

    public void allTeamInfo(){
        for (int i = 0; i < 4; i++) {
            System.out.print("Name " +(i+1)+ " player: " + this.team[i].getName());
            System.out.print("; Jump: " + this.team[i].getHeightJumping());
            System.out.print("; Speed: " + this.team[i].getSpeedRunning());
            System.out.println("; Energy: " + this.team[i].getEnergy());
        }
    }

    public Player getPlayers (int i) {
        return team[i];
    }

    public void showResults(){
    }

    public String getTeamName() {
        return teamName;
    }
}
