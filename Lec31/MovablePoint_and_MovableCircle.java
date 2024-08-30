package Lec31;
public class MovablePoint_and_MovableCircle {
//    class MovablePoint implements Movable {
//        int x, y, xSpeed, ySpeed; // package access
//        // Constructor
//        public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
//            this.x = x;
//            this.y = y;
//            this.xSpeed = xSpeed;
//            this.ySpeed = ySpeed;
//        }
//        // Implement abstract methods declared in the interface Movable
//        @Override
//        public void moveUp() {
//            y -= ySpeed; // y-axis pointing down for 2D graphics
//        }
//        @Override
//        public void moveDown() {
//            y += ySpeed;
//        }
//        @Override
//        public void moveLeft() {
//            x -= xSpeed;
//        }
//        @Override
//        public void moveRight() {
//            x += xSpeed;
//        }
//        @Override
//        public String toString() {
//            return "[X=" + x + ", Y=" + y + "]";
//        }
//    }
//    class MovableCircle implements Movable {
//        private MovablePoint center; // can use center.x, center.y directly because they are package accessible
//        private int radius;
//        // Constructor
//        public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
//            // Call the MovablePoint's constructor to allocate the center instance.
//            this.center = new MovablePoint(x, y, xSpeed, ySpeed);
//            this.radius = radius;
//        }
//        // Implement abstract methods declared in the interface Movable
//        @Override
//        public void moveUp() {
//            center.moveUp();
//        }
//        @Override
//        public void moveDown() {
//            center.moveDown();
//        }
//        @Override
//        public void moveLeft() {
//            center.moveLeft();
//        }
//        @Override
//        public void moveRight() {
//            center.moveRight();
//        }
//        @Override
//        public String toString() {
//            return "[X=" + center.x + ", Y=" + center.y + ", radius=" + radius + "]";
//        }
//    }
}
