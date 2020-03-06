package com.gupaoedu;

/**
 * 描述：大佬用户
 *
 * @auther yangke
 * @date 2020/3/7 0:07
 * @email yangke@tydic.com
 * @copyright 2020 www.tydic.com Inc. All rights reserved.
 **/
public class MogulUserDecorator extends NavigationDecorator{
    public MogulUserDecorator(Navigation navigation) {
        super(navigation);
    }

    @Override
    public String getTab() {
        return super.getTab()+"-大佬福利每日一趴 - 众包中心";
    }
}
