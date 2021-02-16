public class Dice {
private int die1;
private int die2;

    public Dice(){
        Roll();
    }
    public void Roll() {
        System.out.println("The Player that rolls the highest, goes first");
            die1 = (int) (Math.random() * 6 * 1);
            die2 = (int) (Math.random() * 6 * 1);

    }
    public int getDie1(){
        return die1;
    }
    public int getDie2(){
        return die2;
    }


    
}
