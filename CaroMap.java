import java.util.Scanner;

public class CaroMap {
    public static void main(String[] args) {
//        String[][] oneBox = {
//                {"-", "-", "-"},
//                {"|", " ","|"},
//                {"-", "-", "-"}
//        };
        Scanner input = new Scanner(System.in);
        System.out.println("Enter row: ");
        int row = input.nextInt();
        System.out.println("Enter column: ");
        int col = input.nextInt();

        String[][] caroMap = new String[row][col];
        for (row = 0; row < caroMap.length; row++) {
            for (col = 0; col < caroMap[row].length; col++) {
                caroMap[row][col] = "|__|";
            }
        }
        System.out.println("Caro map: ");
        for (row = 0; row < caroMap.length; row++) {
            for (col = 0; col < caroMap[row].length; col++) {
                System.out.print(caroMap[row][col]);
            }
            System.out.println();
        }
        int count = 0;
        int caroMap_width = caroMap.length * caroMap[0].length;
        do {
            System.out.println("Enter x: ");
            int x = input.nextInt();
            System.out.println("Enter y: ");
            int y = input.nextInt();

            if (count % 2 == 0)
                caroMap[x][y] = "| X|";
            else
                caroMap[x][y] = "| O|";

            System.out.println("Caro map: ");
            for (row = 0; row < caroMap.length; row++) {
                for (col = 0; col < caroMap[row].length; col++) {
                    System.out.print(caroMap[row][col]);
                }
                System.out.println();
            }
            count++;
        } while(count < caroMap_width);


    }
}
