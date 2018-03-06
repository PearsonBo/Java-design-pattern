/**
 * Created by hujianbo on 2018/3/6.
 */
public class Skill_Q extends Skills {

    private String skillName;


    public Skill_Q(Hero hero, String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    @Override
    public void learnSkills() {
        System.out.println("学习了Q技能:" + skillName);
        super.learnSkills();
    }
}
