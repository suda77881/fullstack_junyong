package com.company.bank005_interface.fishing.ver;

import java.util.List;
import java.util.Scanner;

public class RodUpgrade implements F_Controller {

	@Override public int exec(List<UserInfo> users, int find) {
		Scanner sc = new Scanner(System.in);
		
		UserInfo u = users.get(find);
        Rod rod = u.getRod();
        

        if (rod.getLevel() >= 10) {
            System.out.println("이미 최대 강화 단계입니다.");
            return find;
        }

        int cost = rod.getUpgradeCost();
        System.out.println("현재 낚시대: " + rod);
        System.out.println("강화 비용: " + cost + "원 (잔액 : " + u.getBalance() + " 원)" );
        
        for(;;) {
        System.out.print("강화하시겠습니까? ( Y / N ) > ");
        char input = sc.next().charAt(0);
        if (Character.toUpperCase(input) == 'Y') {
            if (u.getBalance() >= cost) {
                u.setBalance(u.getBalance() - cost);
                rod.upgrade();
                System.out.println("강화 성공! 현재 낚시대: " + rod);
            }
            else {
                System.out.println("잔액이 부족합니다.");break;
            }
        } else {
            System.out.println("강화를 취소했습니다.");break;
        }
        }
        return find;
	}

}
