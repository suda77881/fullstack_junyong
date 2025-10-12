package com.company.bank005_interface.fishing.ver;

import java.util.List;
import java.util.Scanner;

public class FishSell implements F_Controller {

    @Override
    public int exec(List<UserInfo> users, int find) {
        UserInfo user = users.get(find);
        Scanner sc = new Scanner(System.in);

        int totalEarned = 0;

        int blowfishPrice = 1000;
        int carpPrice = 800;
        int shrimpPrice = 500;
        int sharkPrice = 5000;
        int whalePrice = 10000;

        System.out.println("🎣 보유한 물고기:");
        System.out.println("1. 복어: " + user.getBlowfishCount() + "마리");
        System.out.println("2. 잉어: " + user.getCarpCount() + "마리");
        System.out.println("3. 새우: " + user.getShrimpCount() + "마리");
        System.out.println("4. 상어: " + user.getSharkCount() + "마리");
        System.out.println("5. 고래: " + user.getWhaleCount() + "마리");

        System.out.print("모든 물고기를 판매하시겠습니까? (Y/N) > ");
        char input = sc.next().toUpperCase().charAt(0);

        if (input == 'Y') {
            totalEarned += user.getBlowfishCount() * blowfishPrice;
            totalEarned += user.getCarpCount() * carpPrice;
            totalEarned += user.getShrimpCount() * shrimpPrice;
            totalEarned += user.getSharkCount() * sharkPrice;
            totalEarned += user.getWhaleCount() * whalePrice;

            // 수량 초기화
            user.setBlowfishCount(0);
            user.setCarpCount(0);
            user.setShrimpCount(0);
            user.setSharkCount(0);
            user.setWhaleCount(0);

            // 잔액 증가
            user.setBalance(user.getBalance() + totalEarned);

            System.out.println("💰 총 판매 수익: " + totalEarned + "원");
            System.out.println("현재 잔액: " + user.getBalance() + "원");
        } else {
            System.out.println("판매를 취소했습니다.");
        }

        return find;
    }
}
