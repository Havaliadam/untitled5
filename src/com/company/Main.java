package com.company;

public class Main {

    public static void main(String[] args) {
	int [] sayilar=new int[] {1,2,5,7,9,0};
    int  aranacak =-2;
    boolean varmi=false;
    for(int sayi:sayilar){
        if(sayi==aranacak){
            varmi=true;
        break;
        }

    }
    if(varmi){
        System.out.println("sayi mevcuttur");
    }else {
        System.out.println("sayı mevcuttur değildir");
    }

    }
}
