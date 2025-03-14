package _4ElementaryProgramming._3MethodParameter;

import _4ElementaryProgramming._1ClassAndObjectAnd_4ObjectCopy.Person;

public class BB {
    public void test100(int[] arr) {//二引用数据类型
        arr[0] = 100;//修改元素
        System.out.println("swap的arr数组：");//100 2 3 4 5
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");//遍历数组
        }
        System.out.println();
    }

    public void test200(Person jack) {//二引用数据类型：例
        jack.age = 10000;
//        jack = null;
        //结论：18

//        jack = new Person();
//        jack.name = tom;
//        jack.age = 20;
        //结论：18
    }
}
