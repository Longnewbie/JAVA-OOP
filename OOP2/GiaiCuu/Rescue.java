package OOP2.GiaiCuu;

public class Rescue {
    private int power, blood;
    private boolean alive;

    public Rescue(int power, int blood, boolean alive) {
        this.power = power;
        this.blood = blood;
        this.alive = alive;
    }
    
    public void witch(int power) {
        if (this.alive) {
            if (power >= this.power) {
                this.power = this.blood = 0;
                this.alive = false;
            } else this.power += 5;
        }
    }
    
    public void mushroom() {
        if (this.alive) {
            this.power -= 2;
            this.blood -= 15;
            if (this.power <= 0 || this.blood <= 0) {
                this.power = this.blood = 0;
                this.alive = false;
            }
        }
    }
    
    public void pea() {
        if (this.alive) {
            this.power += 2;
            this.blood += 10;
        }
    }
    
    public void soldier(int power_cs) {
        if (this.alive) {
            if (power_cs >= this.power) {
                this.power = this.blood = 0;
                this.alive = false;
            } else {
                this.power += 7;
                this.blood += 5;
            }
        }
    }

    @Override
    public String toString() {
        return "POWER : " + power + "\n" + 
               "BLOOD : " + blood + "\n" + 
                (alive == true ? "ALIVE" : "DEAD") + "\n--------------------";
    }
}