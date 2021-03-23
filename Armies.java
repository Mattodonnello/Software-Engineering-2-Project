public class Armies {
private String countryA;
private String countryB;
private Player currPlayer;
int units;
boolean canAttack1;


    public void canAttack(int country) {
        countryA=UI.getCountryId();
        if(currPlayer.getNumUnits() == 0){
            canAttack1=true;
        }
        if(Board.checkOccupier(currPlayer,country)==true){
            subtractUnits()

        }

    }

    public void attack(int country1,int country2){
        countryA=Parse.getCountryId(country1);
        countryB=Parse.getCountryId(country2);
        if(canAttack1==true){


        }



    }
}
