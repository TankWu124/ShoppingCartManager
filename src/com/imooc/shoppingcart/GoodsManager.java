package com.imooc.shoppingcart;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 商品管理类
 */
public class GoodsManager {

    Set<Goods> goodset = new HashSet<Goods>();

    public GoodsManager(Set<Goods> goodset) {
        this.goodset = goodset;
    }

    public GoodsManager() {

    }

    ;

    public Set<Goods> getGoodset() {
        return goodset;
    }

    public void setGoodset(Set<Goods> goodset) {
        this.goodset = goodset;
    }

    public void importGoods() {
        //商品导入

        Scanner consloer = new Scanner(System.in);

        System.out.println("请输入需要导入的商品的标号");
        String goodsId = consloer.next();
        System.out.println("请输入需要导入的商品的名称");
        String goodsName = consloer.next();
        System.out.println("请输入需要导入的商品的价格");
        double price = consloer.nextDouble();
        System.out.println("请输入需要导入的商品的价格");
        String goodsDesp = consloer.next();

        Goods goods = new Goods(goodsId, goodsName, price, goodsDesp);
        goodset.add(goods);

    }

    public void displayAllgoods() {
        //显示所有商品
        System.out.println("所有的商品信息为：");
        for (Goods goods : goodset) {
            System.out.println(goods);
        }

    }
}

