
class TrafficLight {
    private String color;
    private int duration;

    public TrafficLight(String color, int duration) {
        this.color = color.toLowerCase();
        this.duration = duration;
    }

    public void changeColor(String newColor) {
        this.color = newColor.toLowerCase();
    }

    public boolean isRed() {
        return this.color.equals("red");
    }

    public boolean isGreen() {
        return this.color.equals("green");
    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("Red", 30);
        System.out.println("The light is red: " + light.isRed());
        System.out.println("The light is green: " + light.isGreen());
        light.changeColor("Green");
        System.out.println("The light is now green: " + light.isGreen());
        System.out.println("The light duration is: " + light.getDuration());
        light.setDuration(20);
        System.out.println("The light duration is now: " + light.getDuration());
    }
}


