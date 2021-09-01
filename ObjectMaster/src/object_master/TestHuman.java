package object_master;

class TestHuman {
    public static void main(String[] args) {
        human h = new human();
        h.attack(h);
        System.out.println(h.getHealth());
        Wizard a = new Wizard();
        a.heal(h);
        a.fireball(h);
        
        Ninja b = new Ninja();
        b.steal(a);
        
        Samurai c = new Samurai();
        c.deathBlow(a);
        c.meditate();
        c.howMany();
    
    
    }
    }