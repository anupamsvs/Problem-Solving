class Animal {
    private int legs;
    private int bones;

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getBones() {
        return bones;
    }

    public void setBones(int bones) {
        this.bones = bones;
    }
}
class Dog extends Animal{
    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

public class CastTest {
    public static void main(String[] args) {
        boolean b = true;
        if (b) {
            System.out.println("in if");
        } if (b) {
            System.out.println("in second-if");
        } else if (!b) {
            System.out.println("in else-if");
        }


        System.out.println("testc: "+ Boolean.TRUE.equals(null));

    }
}
