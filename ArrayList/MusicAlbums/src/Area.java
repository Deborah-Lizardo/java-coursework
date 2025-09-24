public class Area {

    private String base;
    private String height;

    public void areaConstructor(String base, String height){
        this.base = base;
        this.height = height;
    }

    public String getBase(){
        return base;
    }

    public String getHeight(){
        return height;
    }

    public Number calculateTriangleArea() {
        double bDouble = Double.parseDouble(getBase());
        double hDouble = Double.parseDouble(getHeight());
        double areaDouble = (bDouble * hDouble) / 2;


        if (areaDouble == (int) areaDouble) {
            return (int) areaDouble;
        } else {
            return areaDouble;
        }
    }

    public Number calculateSquareArea() {
        double bDouble = Double.parseDouble(getBase());
        double areaDouble = bDouble * bDouble;

        if (areaDouble == (int) areaDouble) {
            return (int) areaDouble;
        } else {
            return areaDouble;
        }
    }
}
