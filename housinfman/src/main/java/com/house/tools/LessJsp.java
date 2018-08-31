package com.house.tools;

import javax.servlet.ServletContext;

public class LessJsp {


    /**
     *    这个是动态jsp所需的,当服务器启动的时候我们把一些重要信息完整的放到服务中去
     * @param servletContext
     */
    public static void getel(ServletContext servletContext) {
        String house = " <tr>\n" +
                "\t\t\t<th>序号</th>\n" +
                "\t\t\t<th>所属地区</th>\n" +
                "\t\t\t<th>所属小区</th>\n" +
                "\t\t\t<th>单元号</th>\n" +
                "\t\t\t<th>所属楼层</th>\n" +
                "\t\t\t<th>房间号</th>\n" +
                "\t\t\t<th>面积</th>\n" +
                "\t\t\t<th>朝向</th>\n" +
                "\t\t\t<th>限住人数</th>\n" +
                "\t\t\t<th>出租价格(元)</th>\n" +
                "\t\t\t<th>出租状态</th>\n" +
                "\t\t\t<th>操作</th>\n" +
                "\t\t\t    </tr>";

        String rect = "<tr>\n" +
                "\t\t\t<th>序号</th>\n" +
                "\t\t\t<th>房屋信息</th>\n" +
                "\t\t\t<th>租户信息</th>\n" +
                "\t\t\t<th>缴纳金额</th>\n" +
                "\t\t\t<th>缴纳时间</th>\n" +
                "\t\t\t<th>备注</th>\n" +
                "\t\t\t<th>操作</th>\n" +
                "\t\t</tr>";
        String less = "<tr>\n" +
                "\t\t\t<th>租户号</th>\n" +
                "\t\t\t<th>租户姓名</th>\n" +
                "\t\t\t<th>电话</th>\n" +
                "\t\t\t<th>性别</th>\n" +
                "\t\t\t<th>籍贯</th>\n" +
                "\t\t\t<th>身份证号</th>\n" +
                "\t\t\t<th>添加时间</th>\n" +
                "\t\t\t<th>操作</th>\n" +
                "\t\t</tr>\n";
        String hetong = "<tr>\n" +
                "\t\t\t<th>序号</th>\n" +
                "\t\t\t<th>合同号</th>\n" +
                "\t\t\t<th>房屋信息</th>\n" +
                "\t\t\t<th>租户信息</th>\n" +
                "\t\t\t<th>合同日期</th>\n" +
                "\t\t\t<th>租赁开始时间</th>\n" +
                "\t\t\t<th>租赁结束时间</th>\n" +
                "\t\t\t<th>房租总额</th>\n" +
                "\t\t\t<th>付款方式</th>\n" +
                "\t\t\t<th>押金</th>\n" +
                "\t\t\t<th>付款期数</th>\n" +
                "\t\t\t<th>合同签署人</th>\n" +
                "\t\t\t<th>合同状态</th>\n" +
                "\t\t\t<th>操作</th>\n" +
                "\t\t</tr>\n" +
                "<tr>\n";

        servletContext.setAttribute("tableHetong", hetong);
        servletContext.setAttribute("tableLess", less);
        servletContext.setAttribute("tableRect", rect);
        servletContext.setAttribute("tableHouse", house);
        servletContext.setAttribute("nowJsp", "house");
    }


}
