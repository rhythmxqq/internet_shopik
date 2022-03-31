package com.company;

import java.util.Scanner;

public class Main {
// Создать интерфейс "Товар" с методами, работающие с названием товара, ценой, рейтингом.
// Создать интерфейс "Пользователь"с методами, работающие с логином и паролем
// Создать класс, реализующий одновременно интерфейс "Товар" и "Пользователь".
// В этом классе создать метод выводящий сообщение, что такой-то пользователь купил такой-то товар.
// Создать экземпляр этого класса.
     interface  item{
         public String nameItem();
         public double raitItem();
         public double costItem();
         public void itemInfo();
}
interface userslog {
         public String logining();
         public String password();
}
 static class user1 implements item,userslog{
         private String Name;
     private double Cost;
     private double rait;
     private String log = "qquser1";
     private String password = "12345";
     user1(String Name, double Cost, double rait){
         this.rait = rait;
         this.Cost=Cost;
         this.Name = Name;
     }
     public String nameItem() {
         this.Name = Name;
         return Name;
     }
     public double raitItem() {
         this.rait = rait;
         return rait;
     }
     public double costItem() {
         this.Cost=Cost;
         return Cost;
     }
     public void itemInfo(){
         System.out.println("Вы купили:");
         System.out.println("продукт: " + nameItem() + "\n" + "его рейтинг в магазине равен: " + raitItem() + "\n" + "Стоимость: "+costItem());
     }
     public String logining(){
         return log;
     }
     public String password(){
       return password;
     }

 }
     public static class user2 implements item,userslog{
         private String Name;
         private double Cost;
         private double rait;
         private String log = "qquser2";
         private String password = "123456";
         user2(String Name, double Cost, double rait){
             this.rait = rait;
             this.Cost=Cost;
             this.Name = Name;
         }
         public String nameItem() {
             this.Name = Name;
             return Name;
         }
         public double raitItem() {
             this.rait = rait;
             return rait;
         }
         public double costItem() {
             this.Cost=Cost;
             return Cost;
         }
         public String logining(){
             return log;
         }
         public String password(){
             return password;
         }
         public void itemInfo(){
             System.out.println("Вы купили:");
             System.out.println("продукт: " + nameItem() + "\n" + "его рейтинг в магазине равен: " + raitItem() + "\n" + "Стоимость: "+costItem());
         }
    }
     public static class user3 implements item,userslog{
         private String Name;
         private double Cost;
         private double rait;
         private String log = "qquser3";
         private String password = "1234567";
         user3(String Name, double Cost, double rait){
             this.rait = rait;
             this.Cost=Cost;
             this.Name = Name;
         }
         public String nameItem() {
             this.Name = Name;
             return Name;
         }
         public double raitItem() {
             this.rait = rait;
             return rait;
         }
         public double costItem() {
             this.Cost=Cost;
             return Cost;
         }
         public String logining(){
             return log;
         }
         public String password(){
             return password;
         }
         public void itemInfo(){
             System.out.println("Вы купили:");
             System.out.println("продукт: " + nameItem() + "\n" + "его рейтинг в магазине равен: " + raitItem() + "\n" + "Стоимость: "+costItem());
         }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите логин");
        String log = in.nextLine();
        System.out.println("введите пароль");
        String password = in.nextLine();
        user3 qq = new user3("Шоколадка",12.6,8.2 );
        user2 zxc = new user2("Вода",20.99,7.3 );
        user1 gg = new user1("Пивчанский",83.6,8.1 );
	if ((password.equals(qq.password())) & (log.equals(qq.logining()))){
        qq.itemInfo();
    }
        else if ((password.equals(zxc.password())) & (log.equals(zxc.logining()))){
            zxc.itemInfo();
        }
        else if ((password.equals(gg.password())) & (log.equals(gg.logining())) ) {
        gg.itemInfo();
    }
        else{
            System.out.println("Логин или пароль неверный");
    }

    }

}
