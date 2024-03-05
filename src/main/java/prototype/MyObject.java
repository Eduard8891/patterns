package prototype;

public class MyObject {

    int field;

    public void setField(int field) {
        this.field = field;
    }

    public MyObject copy() {
        MyObject myObject = new MyObject();
        myObject.setField(this.field);
        return myObject;
    }
}

