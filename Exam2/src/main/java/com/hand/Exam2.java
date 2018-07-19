package com.hand;

class People {
    private String name;     // 姓名
    private int salary;      // 工资

    People(String name){  // 带参数的构造方法
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void money(){ // 个人所得税具体计算
        double money;
        if(salary>=0 && salary<1500){
            money = (double)(salary)*0.03;
        }else if(salary>=1500 && salary<4500){
            money = (double)(salary-1500)*0.1 + 1500*0.03;

        }else if(salary>=4500 && salary<9000){
            money = (double)(salary-4500)*0.2 + 4500*0.1;

        }else if(salary>=9000 && salary<35000){
            money = (double)(salary-9000)*0.25 + 9000*0.2;

        }else if(salary>=35000 && salary<55000){
            money = (double)(salary-35000)*0.30 + 35000*0.25;

        }else if(salary>=55000 && salary<80000){
            money = (double)(salary-55000)*0.35 + 55000*0.30;

        }else{
            money = (double)(salary-80000)*0.45 + 80000*0.35;
        }
        System.out.println(money);
    }
}
public class Exam2{
    public static void main(String[] args) {
        People p1 = new People("userA");
        p1.setSalary(5000);
        System.out.println("姓名是"+p1.getName()+" 的应纳税额是:");
        p1.money();

        People p2 = new People("userB");
        p2.setSalary(10000);
        System.out.println("姓名是"+p2.getName()+" 的应纳税额是:");
        p2.money();

        People p3 = new People("userC");
        p3.setSalary(15000);
        System.out.println("姓名是"+p3.getName()+" 的应纳税额是:");
        p3.money();

        People p4 = new People("userD");
        p4.setSalary(60000);
        System.out.println("姓名是"+p4.getName()+" 的应纳税额是:");
        p4.money();
    }

}