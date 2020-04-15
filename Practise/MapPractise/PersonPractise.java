package MapPractise;

/**
 * @ClassName PersonPractise
 * @Description TODO
 * @Author wangaijun
 * @Date 2020/3/19 下午4:49
 * @Version 1.0
 */
public class PersonPractise implements Comparable {
    private String name;
    private int age;
    PersonPractise(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof PersonPractise)){
            throw new  RuntimeException("类型不正确");
        }
        PersonPractise pp=(PersonPractise) o;
        int num;
        num=name.compareTo(pp.name);
        if (num==0)
            num=new Integer(age).compareTo(new Integer(pp.age));
        return num;
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode method"+name);
        return this.name.hashCode()+this.age*5;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("equals method");
        if (!(obj instanceof PersonPractise)){
            throw new  RuntimeException("类型不正确");
        }
        PersonPractise pp=(PersonPractise) obj;

        return name.equals(pp.name)&& new Integer(pp.age).equals(new Integer(age));
    }
}
