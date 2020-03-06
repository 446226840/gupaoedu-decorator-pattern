package com.gupaoedu;

/**
 * 描述：
 *
 * @auther yangke
 * @date 2020/3/7 0:01
 * @email yangke@tydic.com
 * @copyright 2020 www.tydic.com Inc. All rights reserved.
 **/
public class NavigationDecorator extends Navigation {

    protected  Navigation navigation;
    public NavigationDecorator(Navigation navigation) {
        this.navigation = navigation;
    }

    @Override
    public String getTab() {
        return navigation.getTab();
    }
}
