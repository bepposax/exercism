import java.security.InvalidParameterException;

class Robot {
    private GridPosition position;
    private Orientation orientation;
    private int numberOfValues = Orientation.values().length;

    public Robot(GridPosition position, Orientation orientation) {
        this.position = position;
        this.orientation = orientation;
    }

    public GridPosition getGridPosition() {
        return position;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void turnRight() {
        orientation = Orientation.values()[(orientation.ordinal() + 1) % numberOfValues];
    }

    public void turnLeft() {
        orientation = Orientation.values()[(orientation.ordinal() - 1 + numberOfValues) % numberOfValues];
    }

    public void advance() {
        switch (orientation) {
            case NORTH:
                position = new GridPosition(position.x, position.y + 1);
                break;
            case EAST:
                position = new GridPosition(position.x + 1, position.y);
                break;
            case SOUTH:
                position = new GridPosition(position.x, position.y - 1);
                break;
            case WEST:
                position = new GridPosition(position.x - 1, position.y);
                break;
        }
    }

    public void simulate(String instructions) {
        for (int i = 0; i < instructions.length(); i++) {
            switch (instructions.charAt(i)) {
                case 'R':
                    turnRight();
                    break;
                case 'L':
                    turnLeft();
                    break;
                case 'A':
                    advance();
                    break;
                default:
                    throw new InvalidParameterException("Invalid instructions");
            }
        }
    }
}