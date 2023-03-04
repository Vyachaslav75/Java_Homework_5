public class Task_5_4 {
    static int index = 0;

    public static void main(String[] args) {
        int[] chessboard = { 0, 0, 0, 0, 0, 0, 0, 0 };
        int version = 0;
        String[] symb = { "a", "b", "c", "d", "e", "f", "g", "h" };

        do {
            if (checking(chessboard)) {
                if (index == 7) {
                    System.out.println(version++ +
                            " Q1=" + symb[chessboard[0]] + "1" +
                            " Q2=" + symb[chessboard[1]] + "2" +
                            " Q3=" + symb[chessboard[2]] + "3" +
                            " Q4=" + symb[chessboard[3]] + "4" +
                            " Q5=" + symb[chessboard[4]] + "5" +
                            " Q6=" + symb[chessboard[5]] + "6" +
                            " Q7=" + symb[chessboard[6]] + "7" +
                            " Q8=" + symb[chessboard[7]] + "8");
                    chessboard[index]++;
                } else {
                    index++;
                }
            } else {
                chessboard[index]++;
            }
        } while (chessboard[0] < 8);
    }

    static boolean checking(int[] chessboard) {
        int i;

        if (index == 0) {
            return true;
        }

        if (chessboard[index] > 7) {
            chessboard[index] = 0;
            index--;
            return false;
        }

        for (i = 0; i < index; i++) {
            if ((chessboard[index] == chessboard[i]) |
                    ((Math.abs(chessboard[index] - chessboard[i])) == (index - i))) {
                return false;
            }
        }

        return true;
    }
}
