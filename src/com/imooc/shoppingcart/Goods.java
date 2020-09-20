package com.imooc.shoppingcart;

import java.util.Objects;

/**
 * 商品信息类
 */
public class Goods {

    private String goodsId;//商品编号
    private String goodsName;//商品名称
    private double price;//商品价格
    private String goodsDesp;//商品描述

    public Goods(String goodsId, String goodsName, double price, String goodsDesp) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.price = price;
        this.goodsDesp = goodsDesp;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGoodsDesp() {
        return goodsDesp;
    }

    public void setGoodsDesp(String goodsDesp) {
        this.goodsDesp = goodsDesp;
    }

    @Override
    public String toString() {
        return "商品信息：[" +
                "编号：" + goodsId +"，"+
                "名称：" + goodsName + "，" +
                "价格：" + price +"，"+
                "描述：" + goodsDesp+"]" ;
    }

//    @Override
//    public boolean equals(Object o) {
//        //判断对象是否相等，相等则返回true，不用继续比较属性了
//        if (this == o) return true;
//        //判断是否为Goods类对象
//        if(o.getClass()==Goods.class){
//            Goods goods=(Goods)o;
//            return goods.getId().equals(id)&&goods.getName().equals(name)&&(goods.getPrice()==(price));
//        }
//        return false;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name, price);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Goods goods = (Goods) o;
        return Double.compare(goods.price, price) == 0 &&
                goodsId.equals(goods.goodsId) &&
                goodsName.equals(goods.goodsName)
               ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(goodsId, goodsName, price);
    }
}
