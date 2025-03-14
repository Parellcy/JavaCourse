package Sample.HouseRentalSystem_Han.View;

/*
    1.显示界面
    2.接受用户的输入
    3.调用HouseService类完成对房屋信息的各种操作
     */

import Sample.HouseRentalSystem_Han.Domain.House;
import Sample.HouseRentalSystem_Han.Service.HouseService;
import Sample.HouseRentalSystem_Han.Utils.Utility;

import java.util.IdentityHashMap;

public class HouseView {
    private boolean loop = true;
    private char  key = ' ';
    private HouseService houseService = new HouseService(2);

    public void mainMenu() {
        //功能：显示主菜单
        do {
            System.out.println("==========房 屋 出 租 系 统==========");
            System.out.println("\t\t\t\t1\t\t新 增 房 屋");
            System.out.println("\t\t\t\t2\t\t查 找 房 屋");
            System.out.println("\t\t\t\t3\t\t删 除 房 屋");
            System.out.println("\t\t\t\t4\t\t修 改 房 屋 信 息");
            System.out.println("\t\t\t\t5\t\t房 屋 列 表");
            System.out.println("\t\t\t\t6\t\t退 出");
            System.out.println("请输入您想要操作的功能：");
            key = Utility.readChar();
            switch (key) {
                case '1'://新增房屋
                    System.out.println("==========新 增 房 屋==========");
                    addHouse();
                    break;
                case '2'://查找房屋
                    System.out.println("==========查 找 房 屋==========");
                    findHouse();
                    break;
                case '3'://删除房屋
                    System.out.println("==========删 除 房 屋==========");
                    deleteHouse();
                    break;
                case '4'://修改房屋信息
                    System.out.println("==========修 改 房 屋 信 息==========");
                    updateHouse();
                    break;
                case '5'://房屋列表
                    System.out.println("==========房 屋 列 表==========");
                    listHouse();
                    break;
                case '6'://退出
                    System.out.println("==========退 出==========");
                    exit();
                    break;
                default://针对出现以上6个选项的选择
                    System.out.println("请输入合理的房屋出租系统的功能编号");
                    break;
            }
        }while (loop);
    }

    public void addHouse() {
        //界面增加房屋，接收用户输入
        //创建house对象，调用add方法
        System.out.println("姓名：");
        String name = Utility.readString(8);//姓名最长8字符
        System.out.println("电话：");
        String phone = Utility.readString(12);//手机号码最长12字符
        System.out.println("地址：");
        String address = Utility.readString(16);//地址码最长16字符
        System.out.println("月租：");
        int rent = Utility.readInt();
        System.out.println("状态（未出租、已出租）:");
        String state = Utility.readString(3);
        //创建一个新的House对象，注意id是系统分配的，用户不能输入
        //规定新添加的房屋的id按照自增长的来说
        House house = new House(0, name, phone, address, rent, state);
        if (houseService.add(house)) {
            System.out.println("添加房屋成功");
        }else {
            System.out.println("添加房屋失败");
        }
    }

    public void findHouse() {
        //界面接受输入id
        System.out.println("请输入要查找的id：");
        int findId = Utility.readInt();
        if (houseService.find(findId) != null) {
            System.out.println(houseService.find(findId));
        }else {
            System.out.println("所输入的房屋信息id查找不到");
        }
    }

    public void deleteHouse() {
        //界面删除房屋，接受用户输入id
        System.out.println("请输入待删除房屋的编号（-1表示退出）：");
        int delId = Utility.readInt();
        if (delId == -1) {
            System.out.println("已放弃删除房屋信息");
            return;
        }
        char choice = Utility.readConfirmSelection();//该方法本身就有循环判断，必须输入Y/y/N/n
        if (choice == 'Y') {
            if(houseService.delete(delId)) {
                System.out.println("删除房屋信息成功");
            }else {
                System.out.println("删除房屋标号不存在，失败");
            }
        }else {
            System.out.println("已放弃删除房屋信息");
        }
    }

    public void updateHouse() {
        //接收输入的id
        System.out.println("请输入所要修改的房屋信息id（-1退出）：");
        int updateId = Utility.readInt();
        if (updateId == -1) {
            System.out.println("已放弃修改房屋喜喜");
            return;
        }
        //根据输入的updateId进行查找
        House house = houseService.find(updateId);
        //house.setXxx()就会修改houseService中数组的元素
        if (house == null) {
            System.out.println("你要修改的房屋信息编号不存在，无法修改");
            return;
        }

        System.out.println("姓名（" + house.getName() + "）：");
        String name = Utility.readString(8,"");//这里如果直接回车表示不修改该信息，默认空串
        if(!"".equals(name)) {//name不等于空串（即已输入要修改的值），将该name通过setXxx()方法赋值
            house.setName(name);
        }//二者相等意味着空串不修改信息，无须调用方法修改房屋信息

        System.out.println("电话（" + house.getPhone() + "）：");
        String phone = Utility.readString(12,"");
        if(!"".equals(phone)) {
            house.setPhone(phone);
        }

        System.out.println("地址（" + house.getAddress() + "）：");
        String address = Utility.readString(16,"");
        if(!"".equals(address)) {
            house.setAddress(address);
        }

        System.out.println("月租（" + house.getRent() + "）：");
        int rent = Utility.readInt(-1);//-1用来判断是否有回车操作使用默认值
        if(rent != -1) {
            house.setRent(rent);
        }

        System.out.println("状态（" + house.getState() + "）：");
        String state = Utility.readString(3,"");
        if(!"".equals(state)) {
            house.setState(state);
        }

        System.out.println("修改房屋信息成功");
    }

    public void listHouse() {
        //界面显示房屋列表
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态（未出租、已出租）");
        House[] houses = houseService.list();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null) {
                break;
            }//用于打断空房屋信息集合的打印循环
            System.out.println(houses[i]);
        }
        System.out.println("==========房 屋 列 表 显 示 完 毕==========");
    }

    public void exit() {
        char c = Utility.readConfirmSelection();
        if (c == 'Y') {
            loop = false;
        }
    }
}
