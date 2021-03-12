package java_level2.homework1;

public class Wall implements Barrier{

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean racing(RunJump runJump) {

        runJump.jump();
        if (getHeight() <= runJump.getJumpValue()) {
            System.out.println("Success");
            return true;
        } else {
            System.out.println("Fail");
            return false;
        }
    }
}
