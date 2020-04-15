package MapPractise;

import java.util.Comparator;

/**
 * @ClassName ComPratise
 * @Description TODO
 * @Author wangaijun
 * @Date 2020/3/19 下午6:09
 * @Version 1.0
 */
public class ComPratise implements Comparator<PersonPractise> {

    @Override
    public int compare(PersonPractise o1, PersonPractise o2) {
        return new Integer(o2.getName().length()).compareTo(new Integer(o1.getName().length()));
    }


}
