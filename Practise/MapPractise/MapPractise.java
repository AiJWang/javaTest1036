package MapPractise;

import java.util.*;

/**
 * @ClassName MapPractise
 * @Description TODO
 * @Author wangaijun
 * @Date 2020/3/19 下午4:29
 * @Version 1.0
 */
public class MapPractise {
    public static void main(String[] args) {
        //mapPractise();

        //hashMapPratise();

        treeMapTest();
    }

    public static void mapPractise(){
        Map<String,String> ma=new HashMap<>();
        //添加数据
        ma.put("java01","python01");
        ma.put("java02","python02");
        ma.put("java03","python03");
        ma.put("java04","python04");
        ma.put("java05","python05");

        Map<String,String> ma0=new HashMap<>();
        ma0.put("va0","py0");
        ma0.put("va1","py1");


        System.out.println("Add: "+ma);
        //删除数据
        ma.remove("java05");

        System.out.println("remove: "+ma);
        //是否为空
        System.out.println("isEmpty: "+ma.isEmpty());
        //containsKey
        System.out.println("containsKey: "+ma.containsKey("java01"));
        //containsValue
        System.out.println("containsValue: "+ma.containsValue("python001"));

        System.out.println("get: "+ma.get("java01"));
        //values
        System.out.println("values: "+ma.values());

        Set<String> keys=ma.keySet();

        for (Iterator<String> it=keys.iterator();it.hasNext();){
            String key=it.next();
            System.out.println("key: "+key+", value: "+ma.get(key));
        }

        Set<Map.Entry<String,String>> keys1=ma.entrySet();
        for (Iterator<Map.Entry<String,String>> it=keys1.iterator();it.hasNext();){
            Map.Entry<String,String> ma1=it.next();
            System.out.println("key: "+ma1.getKey()+", value: "+ma1.getValue());
        }

        ma.clear();

        System.out.println("isEmpty: "+ma.isEmpty());

        System.out.println("size: "+ma.size());

        ma.putAll(ma0);

        System.out.println(ma);
    }

    public static void hashMapPratise(){
        HashMap<PersonPractise,Integer> hm=new HashMap<PersonPractise, Integer>();

        hm.put(new PersonPractise("zhangsan",12),0012);
        hm.put(new PersonPractise("lisi",12),0012);
        hm.put(new PersonPractise("zhangsan",13),0012);
        System.out.println(hm.size());
    }

    public static void treeMapTest(){
        TreeMap<PersonPractise,Integer> tm=new TreeMap<PersonPractise, Integer>(new ComPratise());

        tm.put(new PersonPractise("aab",12),0012);
        tm.put(new PersonPractise("baac",12),0012);
        tm.put(new PersonPractise("baacc",13),0012);

        Set<PersonPractise> set=tm.keySet();
        for (Iterator<PersonPractise> it=set.iterator();it.hasNext();){
            PersonPractise p=it.next();
            System.out.println(p.getName()+";"+p.getAge());
        }

    }
}
