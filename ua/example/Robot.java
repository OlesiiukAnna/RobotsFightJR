package ua.example;

public class Robot extends AbstractRobot {

    private String name;

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public BodyPart attack() {
        return Robot.super.attack();
    }

    public BodyPart defense() {
        return Robot.super.defense();
    }
}
