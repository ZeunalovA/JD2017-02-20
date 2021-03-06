package by.it.psmishenko.jd02_3;


import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by user on 29.03.2017.
 */
public class Goods {
    private static CopyOnWriteArrayList<Good> listGoods = new CopyOnWriteArrayList<Good>(){
        {
            this.add(new Good("Молоко",1.0));
            this.add(new Good("Хлеб",2.0));
            this.add(new Good("Кофе",3.90));
            this.add(new Good("Чай",10.3));
            this.add(new Good("Кола",12.0));
            this.add(new Good("Пельмени",8.8));
            this.add(new Good("Сметана",2.5));
            this.add(new Good("Хлопья",5.3));
        }
    };
    protected static Good getRandomGood(){
       // List<Good> goods= new ArrayList<>(listGoods);
        int position = Helper.getRandom(listGoods.size()-1);
        Good good = listGoods.get(position);
        return good;
    }
    protected static double getPrice(Good good){
        return good.getPrice();
    }

    protected static double getPrice(String name){
        for (Good good:listGoods){
            if (good.getName().equals(name))
                return good.getPrice();
        }
        return -1;
    }
    static synchronized void  add(Good good){
        for(Good g:listGoods){
            if(g.getName().equals(good.getName())) {
                g.setPrice(good.getPrice());
                return;
            }
        }
        listGoods.add(good);
    }
}
