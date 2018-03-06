/**
 * 具体英雄盲僧
 * <p>
 * Created by hujianbo on 2018/3/6.
 */
public class BlindMonk implements Hero {

    private String name;

    public BlindMonk(String name) {
        this.name = name;
    }

    @Override
    public void learnSkills() {
        System.out.println(name + "学习了以上技能！");
    }
}
