/**
 * Created by hujianbo on 2018/3/6.
 */
public class Skill_W extends Skills {

    private String skillName;

    public Skill_W(Hero hero, String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    @Override
    public void learnSkills() {
        System.out.println("学习了W技能：" + skillName);
        super.learnSkills();
    }
}
