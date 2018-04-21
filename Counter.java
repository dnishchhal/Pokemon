import greenfoot.Actor;
import greenfoot.GreenfootImage;
import greenfoot.Color;

public class Counter extends Actor {
    private static final Color transparent = new Color(0, 0, 0, 0);
    private GreenfootImage background;
    private static int value;
    private static int target;
    private static String prefix = "Score : ";

    public Counter() {
        this(new String());
    }

    public Counter(String prefix) {
        this.background = this.getImage();
        this.value = 1;
        this.target = 1;
        this.prefix = this.prefix;
        this.updateImage();
    }

    public void act() {
        if (this.value < this.target) {
            ++this.value;
            this.updateImage();
        } else if (this.value > this.target) {
            --this.value;
            this.updateImage();
        }
    }

    public void add(int score) {
        this.target += score;
        this.act();
    }

    public int getValue() {
        return this.target;
    }

    public void setValue(int newValue) {
        this.target = newValue;
        this.value = newValue;
        this.updateImage();
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
        this.updateImage();
    }

    private void updateImage() {
        GreenfootImage image = new GreenfootImage(this.background);
        GreenfootImage text = new GreenfootImage(this.prefix + this.value, 22, Color.BLACK, transparent);
        if (text.getWidth() > image.getWidth() - 20) {
            image.scale(text.getWidth() + 20, image.getHeight());
        }
        image.drawImage(text, (image.getWidth() - text.getWidth()) / 2, (image.getHeight() - text.getHeight()) / 2);
        this.setImage(image);
    }
}