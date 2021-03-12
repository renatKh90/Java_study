package java_level2.homework1;

public class Robot implements RunJump{
    private String name;
    private int jumpValue;
    private int runDistance;

    public Robot(String name, int jumpValue, int runDistance) {
        this.name = name;
        this.jumpValue = jumpValue;
        this.runDistance = runDistance;
    }

    @Override
    public void jump() {
        System.out.println(name + " is jumping");
    }

    @Override
    public void run() {
        System.out.println(name + " is running");
    }

    @Override
    public int getJumpValue() {
        return jumpValue;
    }

    @Override
    public int getRunDistance() {
        return runDistance;
    }

}