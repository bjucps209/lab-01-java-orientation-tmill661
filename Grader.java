import java.util.Scanner;

public class Grader {
    public static void main(String[] args) {
        //takes in grader.txt input
        Scanner scan = new Scanner(System.in);

        //determines from the top line how many times we are going to iterate
        int numStudents = Integer.parseInt(scan.nextLine());

        //iterate numStudents times
        for (int i = 1; i < numStudents + 1; i++){
            int currentgrade = Integer.parseInt(scan.nextLine());

            if (currentgrade < 38){
                System.out.println(currentgrade);
            
            //taking currentgrade modulo 5 and determining if it's less than 2
            } else if (Math.floorMod(currentgrade,5) > 2) {
                currentgrade += (5 - Math.floorMod(currentgrade,5));
                System.out.println(currentgrade);
            
            } else {
                System.out.println(currentgrade);
            }
        }

    }
}
