package com.imooc.shoppingcart;

import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {

        //主菜单提示
//        System.out.println("********************************");
//        System.out.println("           **主菜单**            ");
//        System.out.println("         **1--商品管理**         ");
//        System.out.println("          **2--购物车**          ");
//        System.out.println("           **0--退出**           ");
//        System.out.println("********************************");
//        System.out.println("请输入对应数字进行操作：");

        //根据输入的数字执行对应操作
//        Scanner consoler=new Scanner(System.in);
//        String i=consoler.next();
        while(true){
            //主菜单提示
            System.out.println("********************************");
            System.out.println("           **主菜单**            ");
            System.out.println("         **1--商品管理**         ");
            System.out.println("          **2--购物车**          ");
            System.out.println("           **0--退出**           ");
            System.out.println("********************************");
            System.out.println("请输入对应数字进行操作：");
            //根据输入的数字执行对应操作
            Scanner consoler=new Scanner(System.in);
            String i=consoler.next();
            if(i.equals("1")){
                System.out.println("*********************************");
                System.out.println("           **商品管理**            ");
                System.out.println("        **1--商品信息导入**        ");
                System.out.println("       **2--显示所有商品信息**      ");
                System.out.println("        **9--返回上一级菜单**       ");
                System.out.println("*********************************");
                System.out.println("请输入对应数字对商品进行管理：");
                //根据输入的数字执行对应的操作
                String i1=consoler.next();
                while(true){

                    if(i1.equals("1")){
                        //商品信息导入
                        GoodsManager goodsmanager=new GoodsManager();
                        goodsmanager.importGoods();
                        break;
                    }else if(i1.equals("2")){
                        //显示所有商品信息
                        GoodsManager goodsmanager=new GoodsManager();
                        goodsmanager.displayAllgoods();
                        break;
                    }else if(i1.equals("9")){
                        //返回上一级菜单
                        break;
                    }else{
                        System.out.println("请输入有效数字");
                    }
                }

            }else if(i.equals("2")){
                System.out.println("********************************************");
                System.out.println("                 **商品管理**                 ");
                System.out.println("             **1--添加商品到购物车**            ");
                System.out.println("         **2--修改购物车中的商品数量**           ");
                System.out.println("         **3--显示购物车中的所有商品数量**        ");
                System.out.println("                  **4--结算**                 ");
                System.out.println("            **9--返回上一级菜单**               ");
                System.out.println("*********************************************");
                System.out.println("请输入对应数字对商品进行管理：");
                while(true){
                    String i2=consoler.next();
                    if(i2.equals("1")){
                        //添加商品到购物车

                        //首先，显示所有商品信息
                        GoodsManager goodsmanager=new GoodsManager();
                        goodsmanager.displayAllgoods();

                        shoppingCart shoppingcart=new shoppingCart();
//                        shoppingcart.addGoodsToCart(GoodsManager gm);
                        break;
                    }else if(i2.equals("2")){
                        //修改购物车中的商品数量
                        shoppingCart shoppingcart=new shoppingCart();
                        shoppingcart.updatenumInCart();
                        break;
                    }else if(i2.equals("3")){
                        //显示购物车中的所有商品数量
                        shoppingCart shoppingcart=new shoppingCart();
                        shoppingcart.displayAllInCart();
                        break;
                    }else if(i2.equals("4")){
                        //结算
                        shoppingCart shoppingcart=new shoppingCart();
                        shoppingcart.settleAccouts();
                        break;
                    }else{
                        System.out.println("请输入有效数字");
                    }

                }

            }else if(i.equals("0")){
                    break;
            }else {
                System.out.println("请输入有效数字");
            }
        }


    }
}

