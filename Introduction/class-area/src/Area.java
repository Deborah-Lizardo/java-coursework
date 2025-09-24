public class Area {

    private String baseString;
    private String heightString;
    private int baseInt;
    private int heightInt;
    private double baseDouble;
    private double heightDouble;

    public Area(String baseString, String heightString) {
        this.baseString = baseString;
        this.heightString = heightString;
    }

    public Area(int baseInt, int heightInt) {
        this.baseInt = baseInt;
        this.heightInt = heightInt;
    }

    public Area(double baseDouble, double heightDouble) {
        this.baseDouble = baseDouble;
        this.heightDouble = heightDouble;
    }

    public void setBaseString(String baseString) {
        this.baseString = baseString;
    }

    public String getBaseString() {
        return this.baseString;
    }

    public void setHeightString(String heightString) {
        this.heightString = heightString;
    }

    public String getHeightString() {
        return this.heightString;
    }

    public void setBaseInt(int baseInt) {
        this.baseInt = baseInt;
    }

    public int getBaseInt() {
        return this.baseInt;
    }

    public void setHeightInt(int heightInt) {
        this.heightInt = heightInt;
    }

    public int getHeightInt() {
        return this.heightInt;
    }

    public void setBaseDouble(double baseDouble) {
        this.baseDouble = baseDouble;
    }

    public double getBaseDouble() {
        return this.baseDouble;
    }

    public void setHeightDouble(double heightDouble) {
        this.heightDouble = heightDouble;
    }

    public double getHeightDouble() {
        return this.heightDouble;
    }
    public double triangleArea() {
        double base = -1;
        double height = -1;

        try {
            base = Double.parseDouble(this.baseString);
            height = Double.parseDouble(this.heightString);
            return 0.5 * base * height;
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for area calculation.");
            return -1;
        }
    }

    public double squareArea() {
        double base = -1;

        try {
            base = Double.parseDouble(this.baseString);
            return base * base;
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for area calculation.");
            return -1;
        }
    }
}

