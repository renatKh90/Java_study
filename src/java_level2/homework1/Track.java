package java_level2.homework1;

public class Track implements Barrier{

    private int runDistance;

    public Track(int runDistance) {
        this.runDistance = runDistance;
    }

    public int getRunDistance() {
        return runDistance;
    }

    @Override
    public boolean racing(RunJump runJump) {
        runJump.run();
        if (getRunDistance()<= runJump.getRunDistance()) {
            System.out.println("Success");
            return true;
        } else {
            System.out.println("Fail");
            return false;
        }
    }
}
