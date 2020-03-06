package com.gupaoedu;

/**
 * 描述：
 *
 * @auther yangke
 * @date 2020/3/7 0:04
 * @email yangke@tydic.com
 * @copyright 2020 www.tydic.com Inc. All rights reserved.
 **/
public class SingInVipUserDecorator extends NavigationDecorator {
    public SingInVipUserDecorator(Navigation navigation) {
        super(navigation);
    }

    @Override
    public String getTab() {
        return super.getTab()+"-题库-成长墙";
    }
}
