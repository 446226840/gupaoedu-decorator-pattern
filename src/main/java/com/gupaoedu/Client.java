package com.gupaoedu;

/**
 * 描述：
 *
 * @auther yangke
 * @date 2020/3/7 0:13
 * @email yangke@tydic.com
 * @copyright 2020 www.tydic.com Inc. All rights reserved.
 **/
public class Client {
    public static void main(String[] args) {
        Navigation navigation = new BaseNavigation();

        System.out.println("游客拥有的标签栏:"+ navigation.getTab());
        navigation = new SingInVipUserDecorator(navigation);
        System.out.println("登录vip用户的导航栏："+navigation.getTab());
        navigation = new MogulUserDecorator(navigation);
        System.out.println("大佬登录用户的导航栏："+navigation.getTab());

        navigation = new TeacherUserDecorator(navigation);
        System.out.println("老师用户的导航栏："+navigation.getTab());
    }
}
