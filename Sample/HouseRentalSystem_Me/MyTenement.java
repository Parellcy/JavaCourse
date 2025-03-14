package Sample.HouseRentalSystem_Me;

import java.util.Scanner;

public class MyTenement {

    //用数组来表示房屋信息：编号、房主姓名、房主电话、地址、月租、状态（未出租/已出租）
    String[][] house = {{"编号\t","房主姓名\t","房主电话\t","地址\t","月租\t","状态\t"}};
    /*
    使用多态数组改进？
     */

    String status1 = "未出租";
    String status2 = "已出租";
    Scanner sc = new Scanner(System.in);//接收输入
    int choice;//选择房屋出租系统的功能
    boolean choose = true;//控制退出房屋出租系统的布尔值

    //进行操作的房屋编号
    String houseNumber;//所要进行操作的房屋编号
    int houseID;//所要进行操作的房屋编号的索引

    //是否选择：应用于删除房屋、退出
    String houseChoose;

    String houseYES = "Y";//是
    String houseNO = "N";//否

    //修改房屋信息编号
    String modifyHouseNumber;


    public void mainMenu() {
        do {
            //主菜单
            System.out.println("====================房屋出租系统====================");
            System.out.println("\t\t\t\t1\t\t查找房屋");
            System.out.println("\t\t\t\t2\t\t新增房屋");
            System.out.println("\t\t\t\t3\t\t删除房屋");
            System.out.println("\t\t\t\t4\t\t修改房屋信息");
            System.out.println("\t\t\t\t5\t\t房屋列表");
            System.out.println("\t\t\t\t6\t\t退出");
            System.out.println("请输入您想要操作的功能：");
            //房屋出租系统的功能选择
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    this.findHouse();//查找房屋
                    break;
                case 2:
                    this.addHouse();//新增房屋
                    break;
                case 3:
                    this.deleteHouse();//删除房屋
                    break;
                case 4:
                    this.modifyHousingInfo();//修改房屋信息
                    break;
                case 5:
                    this.houseList();//房屋列表
                    break;
                case 6:
                    this.quit();//退出
                    break;
                default://针对出现以上6个选项的选择
                    System.out.println("请输入合理的房屋出租系统的功能编号");
                    break;
            }
        }while (choose);
        System.out.println("您推出了程序~~~~~");
    }
    public void findHouse() {
        //查找房屋

        System.out.println("请输入你要查找的房屋编号：");
        while (true) {
            Label1: while (true) {
                houseNumber = sc.next();
                //遍历房屋列表，寻找所要修改房屋编号的索引
                for (int i = 0; i < house.length; i++) {
                    if (house[i][0].equals(houseNumber)) {
                        houseID = i;
                        break Label1;
                    }
                    if (i == house.length - 1) {
                        System.out.println("没有找到该房屋编号，请重新输入");
                        break;
                    }
                }
            }
            for (int i = 0; i < house[houseID].length; i++) {
                System.out.print(house[houseID][i] + "\t\t\t");
            }
            System.out.println();
            break;
        }
    }

    public void addHouse() {
        //新增房屋
        System.out.println("====================新增房屋====================");

        //对房屋列表进行扩容copy
        String[][] addHouse = new String[house.length + 1][6];
        for (int i = 0; i < house.length; i++) {
            for (int j = 0; j < house[i].length; j++) {
                addHouse[i][j] = house[i][j];
            }
        }
        house = addHouse;

        //要新增的房屋编号
        System.out.println("请输入房屋编号：");
        while (true) {////校验房屋编号是否合理（2-8）
            house[addHouse.length - 1][0] = sc.next();
            if (house[addHouse.length - 1][0].length() >= 2 & house[addHouse.length - 1][0].length() <= 8) {

                break;
            }else {
                System.out.println("请输入合理的房屋编号!");
            }
        }

        //要新增的房屋姓名
        System.out.println("请输入房屋房主姓名：");
        while (true) { //校验房屋房主姓名是否合理（2-8）
            house[addHouse.length - 1][1] = sc.next();
            if (house[addHouse.length - 1][1].length() >= 2 & house[addHouse.length - 1][1].length() <= 8) {
                break;
            }else {
                System.out.println("请输入合理的房屋房主姓名!");
            }
        }

        //要新增的房屋房主电话
        System.out.println("请输入房屋房主电话：");
        while (true) {//校验房屋房主电话是否合理（11）
            house[addHouse.length - 1][2] = sc.next();
            if (house[addHouse.length - 1][2].length() == 11) {
                break;
            }else {
                System.out.println("请输入合理的房屋房主电话!");
            }
        }

        //要新增的房屋地址
        System.out.println("请输入房屋地址：");
        while (true) {//校验房屋地址是否合理（>2）
            house[addHouse.length - 1][3] = sc.next();
            if (house[addHouse.length - 1][3].length() >= 2) {
                break;
            }else {
                System.out.println("请输入合理的房屋地址!");
            }
        }
        //要新增的房屋月租
        System.out.println("请输入房屋月租：");
        while (true) {//校验房屋月租是否合理（>4）
            house[addHouse.length - 1][4] = sc.next();
            if (house[addHouse.length - 1][4].length() >= 4) {

                break;
            } else {
                System.out.println("请输入合理的房屋月租!");
            }
        }

        //要新增的房屋出租状态
        System.out.println("请输入房屋出租状态：");
        while (true) {//校验房屋状态是否合理
            house[addHouse.length - 1][5] = sc.next();
            if (house[addHouse.length - 1][5].equals(status1) | house[addHouse.length - 1][5].equals(status2)) {
                break;
            }else {
                System.out.println("请输入合理的房屋状态!");
            }
        }

        System.out.println("新增房屋信息填写完成~~~~~");
    }

    public void deleteHouse() {
        //删除房屋

        //判断房屋数量是否允许删除
        if (house.length <= 1) {
            System.out.println("房屋数量已为0，无法删除");
        }else if (house.length > 1 ) {
            System.out.println("请选择待删除房屋编号（-1退出）：");
            Label2: while (true) {
                houseNumber = sc.next();
                if (houseNumber.equals("-1")) {//后悔选项：是否要取消删除房屋
                    break;
                }else {
                    while (true) {
                        System.out.println("确认是否删除（Y/N）：请小心选择!请输入您的选择（Y/N）：");
                        houseChoose = sc.next();//重复确认是否删除房屋
                        if (houseChoose.equals(houseYES)) {
                            break;
                        }else if (houseChoose.equals(houseNO)) {
                            break Label2;
                        }else {
                            System.out.println("请输入合理的选择");
                        }
                    }
                    //遍历房屋列表，寻找所要删除房屋编号的索引
                    for (int i = 0; i < house.length; i++) {
                        if (house[i][0].equals(houseNumber)) {
                            houseID = i;
                            break;
                        }
                    }
                    //针对所要删除房屋编号之后的房屋进行前移操作
                    //使用链表结构更为迅速！该处使用线性结构，当房屋数量很多时，程序运行缓慢
                    for ( ;houseID < house.length; houseID++) {
                        if (houseID == house.length - 1) {
                            break;
                        }
                        String[] intermediaryAgent = house[houseID + 1];//创建中间变量接收房屋信息
                        house[houseID] = intermediaryAgent;
                    }
                    //创建缩容后的房屋列表，并进行copy
                    String[][] deleteHouse = new String[house.length - 1][6];
                    for (int i = 0; i < deleteHouse.length; i++) {
                        for (int j = 0; j < deleteHouse[i].length; j++) {
                            deleteHouse[i][j] = house[i][j];
                        }
                    }
                    house = deleteHouse;
                    System.out.println("房屋删除完毕");//提示房屋删除操作完成
                    break;
                    /*干nm，咱要文明，啥都没说
                    针对break语句，在编写该房屋出租系统时由于忘记在此处打断循环，导致程序运行又返回至Label1标签内的while循环
                    修补异常一个多小时，特此警惕!
                     */
                }
            }
        }
    }

    public void modifyHousingInfo() {
        //修改房屋信息

        System.out.println("====================修改房屋信息====================");
        System.out.println("请选择待修改房屋编号（-1退出）：");
        while (true) {
            modifyHouseNumber = sc.next();
            //后悔修改房屋信息操作的选项
            if (modifyHouseNumber.equals("-1")) {
                break;
            }
            //遍历房屋列表，寻找所要修改房屋编号的索引
            for (int i = 0; i < house.length; i++) {
                if (house[i][0].equals(modifyHouseNumber)) {
                    houseID = i;
                    break;
                }
            }

            //要修改的房屋编号
            System.out.println("请输入房屋编号（" + house[houseID][0] + "）：");
            while (true) {////校验房屋编号是否合理（2-8）
                house[houseID][0] = sc.next();
                if (house[houseID][0].length() >= 2 & house[houseID][0].length() <= 8) {
                    break;
                }else {
                    System.out.println("请输入合理的房屋编号!");
                }
            }

            //要修改的房屋姓名
            System.out.println("请输入房屋房主姓名（" + house[houseID][1] + "）：");
            while (true) { //校验房屋房主姓名是否合理（2-8）
                house[houseID][1] = sc.next();
                if (house[houseID][1].length() >= 2 & house[houseID][1].length() <= 8) {
                    break;
                }else {
                    System.out.println("请输入合理的房屋房主姓名!");
                }
            }

            //要修改的房屋房主电话
            System.out.println("请输入房屋房主电话（" + house[houseID][2] + "）：");
            while (true) {//校验房屋房主电话是否合理（11）
                house[houseID][2] = sc.next();
                if (house[houseID][2].length() == 11) {
                    break;
                }else {
                    System.out.println("请输入合理的房屋房主电话!");
                }
            }

            //要修改的房屋地址
            System.out.println("请输入房屋地址（" + house[houseID][3] + "）：");
            while (true) {//校验房屋地址是否合理（>2）
                house[houseID][3] = sc.next();
                if (house[houseID][3].length() >= 2) {
                    break;
                }else {
                    System.out.println("请输入合理的房屋地址!");
                }
            }
            //要修改的房屋月租
            System.out.println("请输入房屋月租（" + house[houseID][4] + "）：");
            while (true) {//校验房屋月租是否合理（>4）
                house[houseID][4] = sc.next();
                if (house[houseID][4].length() >= 4) {

                    break;
                } else {
                    System.out.println("请输入合理的房屋月租!");
                }
            }

            //要修改的房屋出租状态
            System.out.println("请输入房屋出租状态（" + house[houseID][5] + "）：");
            while (true) {//校验房屋状态是否合理
                house[houseID][5] = sc.next();
                if (house[houseID][5].equals(status1) | house[houseID][5].equals(status2)) {
                    break;
                }else {
                    System.out.println("请输入合理的房屋状态!");
                }
            }
            System.out.println("修改房屋信息完毕");
            break;
        }
    }

    public void houseList() {
        //房屋列表


        System.out.println("====================房屋列表====================");
        //打印房屋列表
        for (int i = 0; i < house.length; i++) {
            for (int j = 0; j < house[i].length; j++) {
                System.out.print(house[i][j] + "\t\t\t");
            }
            System.out.println();
        }
    }
    public void quit() {
        //退出

        System.out.println("====================退出====================");
        while (true) {
            System.out.println("您确定要退出房屋出租系统吗（Y/N）：");
            houseChoose = sc.next();
            if (houseChoose.equals(houseYES)) {
                choose = false;
                break;
            }else if (houseChoose.equals(houseNO)) {
                break;
            }else {
                System.out.println("选择错误，请重新输入：");
            }
        }
    }
}
