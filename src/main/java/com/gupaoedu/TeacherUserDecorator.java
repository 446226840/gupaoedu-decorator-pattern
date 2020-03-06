package com.gupaoedu;

/**
 * 描述：老师用户
 *
 * @auther yangke
 * @date 2020/3/7 0:12
 * @email yangke@tydic.com
 * @copyright 2020 www.tydic.com Inc. All rights reserved.
 **/
public class TeacherUserDecorator extends NavigationDecorator{
    public TeacherUserDecorator(Navigation navigation) {
        super(navigation);
    }

    @Override
    public String getTab() {
        return super.getTab()+"- 教案 - 优秀学员档案";
    }
}
