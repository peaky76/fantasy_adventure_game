package being;

import action.Attack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public abstract class Monster extends Being {

    protected HashMap<String, Attack> meansOfAttack;

    public Monster(String name, int healthPoints) {
        super(name, healthPoints, Nature.EVIL);
        this.meansOfAttack = new HashMap<String, Attack>();
    }

    public void attack(Being opponent) {
        opponent.takeDamage(selectAttack().getDamage());
    }

    public int meansOfAttackCount() {
        return meansOfAttack.size();
    }

    public Attack selectAttack() {
        return meansOfAttack.get(new Random().nextInt(meansOfAttackCount()));
    }

}
