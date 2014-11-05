package unique.task4;

/**
 * Created by Administrator on 2014/11/4 0004.
 */
public class DashData {
    public int speed;
    private Direction direction;
    private boolean leftLight;
    private boolean rightLight;

    @Override
    public String toString() {
        return "Dash{" +
                "speed : " + speed +
                ", leftLight : " + leftLight +
                ", rightLight : " + rightLight +
                ", direction : " + direction +
                '}';
    }


    public DashData() {
        direction = new Direction();
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public boolean isLeftLight() {
        return leftLight;
    }

    public void setLeftLight(boolean leftLight) {
        this.leftLight = leftLight;
    }

    public boolean isRightLight() {
        return rightLight;
    }

    public void setRightLight(boolean rightLight) {
        this.rightLight = rightLight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public class Direction {
        public String UP_LEFT = "up-left";
        public String UP_RIGHT = "up-right";
        public boolean up;
        public boolean down;
        public boolean left;
        public boolean right;

        @Override
        public String toString() {
            if (up && right) {
                return "up-right";
            } else if (up && left) {
                return "up-left";
            } else if (speed > 0) {
                return "up";
            } else if (speed < 0) {
                return "down";
            } else if (speed == 0) {
                return "stop";
            }
            return null;
        }
    }

}
