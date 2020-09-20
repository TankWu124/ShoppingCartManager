package com.imooc.shoppingcart;

/**
 * 购物车中的商品信息类
 */
public class GoodsInCart {

    Goods goods;//商品名称
    int num;//购物车中的商品数量

    public GoodsInCart(Goods goods, int num) {
        this.goods = goods;
        this.num = num;
    }

    public GoodsInCart(){

    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
