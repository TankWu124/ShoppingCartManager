package com.imooc.shoppingcart;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * 购物车类
 */
public class shoppingCart {

    Map<String,GoodsInCart> shoppingcart=new HashMap<String,GoodsInCart>();

    public void addGoodsToCart(GoodsManager gm){
        //添加商品到购物车

        System.out.println("请输入需要添加的商品编号:");
        Scanner console=new Scanner(System.in);
        String goodsId=console.next();
        GoodsManager goodsManager;


        System.out.println("请输入需要添加的商品数量:");
        int num=console.nextByte();
        GoodsInCart goodsInCart=new GoodsInCart();
        goodsInCart.getNum()+num

        shoppingcart.put(goodsId,goodsInCart);



    }

    public void updatenumInCart(){
        //修改购物车中的所有商品


    }

    public void displayAllInCart(){
        //显示购物车中到所有商品
        System.out.println("购物车中的商品信息如下：");
        Iterator<GoodsInCart> itGoodsInCart=shoppingcart.values().iterator();
        while (itGoodsInCart.hasNext()){
            System.out.println(itGoodsInCart.next());
        }
    }

    public void settleAccouts(){
        //结算

    }
}
