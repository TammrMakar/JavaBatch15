package Class20;

import java.util.Scanner;

public class Sport {

    String name,country;

    Sport(String name,String country){
        this.name=name;
        this.country=country;
    }

    public void display(){
        System.out.println(name+" is played in "+country);
    }
}
class Cricket extends Sport{

    String helmet;

    Cricket(String name,String country,String helmet){

        super(name,country);//makes a call to the immediate super class constructor
        //super ()-always must be on the first line
        this.helmet=helmet;
    }
}
class Soccer extends Sport{
    String team;
    int numberOfPlayer;

    Soccer(String name,String country,String team,int numberOfPlayer){
        super(name, country);
        this.numberOfPlayer=numberOfPlayer;
        this.team=team;

    }
    void displayTeam(){
        System.out.println(team+" consist of "+numberOfPlayer+" players");
    }

}