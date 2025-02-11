package StudentManager;

public abstract class StudentDBIO extends ObjectIO implements StudentIO {
private static final StudentDBIO instance=null; //final 왜 안대?

protected StudentDBIO(){}

    public StudentDBIO getInstance() {
        return instance;
    }


}
