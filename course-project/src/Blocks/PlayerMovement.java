package Blocks;

public class PlayerMovement {

    public int getMoves() {
        return moves;
    }

    public void setMoves(int moves) {
        this.moves = moves;
    }

    public void addMove() {
        this.moves++;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void changePosition(int amount) {
        distanceMoved += Math.abs(amount);
        this.position += amount;
    }
}
