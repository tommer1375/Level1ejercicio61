

public class NoGenericMethods<T> {

    private T objectOne;
    private T objectTwo;
    private T objectThree;

   public NoGenericMethods(T objectOne, T objectTwo, T objectThree) {
        this.objectOne = objectOne;
        this.objectTwo = objectTwo;
        this.objectThree = objectThree;

    }

    public T getObjectOne() {
        return objectOne;
    }

    public T getObjectTwo() {
        return objectTwo;
    }

    public T getObjectThree() {
        return objectThree;
    }

    public void setObjectOne(T newVariable) {
        objectOne = newVariable;

    }

    public void setObjectTwo(T newVariable) {
        objectTwo = newVariable;
    }

    public void setObjectThree(T newVariable) {
        objectThree = newVariable;
    }
}



