/**
 * Created by hujianbo on 2018/3/6.
 */
public class App {

    public static void main(String[] args) {
        Hero hero = new BlindMonk("李青");

        Skills skills = new Skills(hero);
        Skills q = new Skill_Q(skills, "天音波/回音击");
        Skills w = new Skill_W(q, "金钟罩/铁布衫");
        Skills e = new Skill_E(w, "天雷破/摧筋断骨");
        e.learnSkills();
    }
}
