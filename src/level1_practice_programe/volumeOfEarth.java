package level1_practice_programe;

public class volumeOfEarth {
    public static void main(String[] args){
        int r=6378;
        double volume= (4/3)*3.14*r*r*r;
        double volume2=(4/3)*3.14*r*r*r*0.621*0.621*0.621;
        System.out.println("The volume of earth in cubic kilometers is " + volume +" and cubic miles is "+ volume2);
    }
}
