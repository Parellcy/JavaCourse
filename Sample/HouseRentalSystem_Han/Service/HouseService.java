package Sample.HouseRentalSystem_Han.Service;

/*
定义一个House[]数组，保存House对象
该类为方法，对于界面的显示情况见HouseView.java
1.响应HouseView的调用
    2.完成对房屋信息的各种操作（增删改查c[create]r[read]u[update]d[]delete）
 */

import Sample.HouseRentalSystem_Han.Domain.House;

public class HouseService {
    private House[] houses;
    private int houseNums = 1;//记录当前有多少个房屋信息
    private int idCounter = 1;//记录当前的id增长到哪个值了
    //保存House对象
    public HouseService(int size) {
        houses = new House[size];//创建HouseService对象时指定houses数组大小
        houses[0] = new House(1,"Jack","112","海淀区",2000,"未出租");
    }

    public boolean add(House newHouse) {
        //把新的house对象加入到houses数组，返回一个布尔值，判断成功还是失败
        //判断是否还可以继续添加（暂时不考虑数组扩容问题）
        if(houseNums >= houses.length) {//数组已满，无法添加
            System.out.println("数组已满，无法添加");
            /*数组扩容机制
            House[] addHouses = new House[houseNums+1];
            for (int i = 0; i < houseNums; i++) {
                addHouses[i] = houses[i];
            }
            houses = addHouses;
             */
            return false;
        }
        //把newHouse对象加入到houses数组中
        houses[houseNums++] = newHouse;//赋值后houseNums++
        //我们程序员需要设计id自增长机制
        newHouse.setId(++idCounter);//idCounter先自增然后更新newHouse的id
        return true;
    }

    public House find(int findId) {
        //返回House对象，如果没有·，返回Null
        for (int i = 0; i < houseNums; i++) {
            if (houses[i].getId() == findId) {
                return houses[i];
            }
        }
        return null;//若遍布不到便会执行此行
    }

    public boolean delete(int delId) {
        //完成真正的删除任务，返回布尔值
        //应先找到删除的房屋信息
        //注意：一定要搞清楚下标与房屋编号不是一回事
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if(houses[i].getId() == delId) {//所要删除房屋id与房屋信息id匹配，遍历数组查找
                index = i;
            }
        }
        if(index == -1) {
            //说明没有找到该房屋
            return false;
        }else {
            //该下标以后房屋信息提前一位
            for (int i = index; i < houseNums - 1; i++) {
                houses[i] = houses[i+1];
            }
            houses[--houseNums] = null;//先减一再使用
            //为空无须删除空间，在显示列表界面不会打印为空的房屋信息
        }
        return true;
    }

    public House[] list() {
        //返回所有的房屋信息
        return houses;
    }

}
