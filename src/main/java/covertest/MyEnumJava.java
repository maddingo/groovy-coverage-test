package covertest;

public enum MyEnumJava {
    ZERO, FIRST, SECOND;

    public static MyEnumJava getValue(int v) {
        switch(v) {
            case 0:
                return ZERO;
            case 1:
            return FIRST;

            case 2:
                return SECOND;

            default:
                throw new IllegalArgumentException("invalid value: " + v);
        }
    }
}
