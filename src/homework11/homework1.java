package homework11;

public class homework1 {
    public static void main(String[] args) {
        Color green = Color.GREEN;
        green.show();
        switch (green){
            case GREEN:
                System.out.println("绿色");
        }
    }
}

interface Show {
    void show();
}

enum Color implements Show {
    RED(255, 0, 0),
    BLUE(0, 0, 255),
    BLACK(0, 0, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    private Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println("redValue:"+redValue +" greenValue:"+ greenValue +" BlueValue:"+ blueValue);
    }
}