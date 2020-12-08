package Comparable;
import java.util.Arrays;

public class Domino implements Comparable {
    private final int left;
    private final int right;

    public Domino(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeftSide() {
        return left;
    }

    public int getRightSide() {
        return right;
    }

    @Override
    public String toString() {
        return "[" + left + ", " + right + "]";
    }

    @Override
    public int compareTo(Object other) {
        Domino otherDomino = (Domino) other;
        if (getLeftSide() > otherDomino.getLeftSide()) {
            return 1;
        } else if (getLeftSide() < otherDomino.getLeftSide()) {
            return -1;
        } else {
            if (getRightSide() > otherDomino.getRightSide()) {
                return 1;
            } else if (getRightSide() < otherDomino.getRightSide()) {
                return -1;
            }
            return 0;
        }
    }
}

