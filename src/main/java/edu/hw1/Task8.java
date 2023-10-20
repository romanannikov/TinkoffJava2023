package edu.hw1;

public class Task8 {

    private final static int[][] POSSIBLE_MOVES =
        {{1, 2}, {2, 1}, {2, -1}, {1, -2}, {-1, -2}, {-2, -1}, {-2, 1}, {-1, 2}};
    private final static int SIZE = 8;

    private Task8() {
    }

    public static boolean knightBoardCapture(int[][] field) {
        for (int y = 0; y < SIZE; y++) {
            for (int x = 0; x < SIZE; x++) {
                if (field[x][y] == 1) {
                    for (var move : POSSIBLE_MOVES) {
                        if (x + move[0] >= 0 && x + move[0] < SIZE && y + move[1] >= 0 && y + move[1] < SIZE 
                            && field[x + move[0]][y + move[1]] == 1) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
