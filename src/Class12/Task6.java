package Class12;

public class Task6 {
    public static void main(String[] args) {



        String[][]countries={{"USA", "Canada", "Mexico"},
                {"Brazil","Peru","Argentina","Columbia"},
                {"Germany","Italy","France","Serbia","Russia","UK"},
                {"Japan", "Kazakhstan", "Turkey", "Maldives"},
                {"Egypt", "Nigeria", "South Africa"}
        };

        int count=0;
        for (int i = 0; i < countries.length ; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j]+" ");
                count++;
            }
            System.out.println();
        }
        System.out.println("Total countries"+count);
    }
    }



