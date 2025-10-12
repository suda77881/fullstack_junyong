package com.company.bank005_interface.fishing.ver;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Fishing implements F_Controller {
	
	private static final Random random = new Random();

	@Override
	public int exec(List<UserInfo> users, int find) {
	    Scanner sc = new Scanner(System.in);
	    UserInfo user = users.get(find);

	    System.out.println("미끼를 던졌습니다...");
	    sleep(1000);
	    System.out.println("무언가 걸렸습니다!");
	    sleep(1000);

	    int pcode = random.nextInt(9000) + 1000;
	    System.out.println("낚시대를 잡아당겨주세요 > " + pcode);
	    int userInput = sc.nextInt();

	    double chance = random.nextDouble();
	    if (userInput == pcode && chance < getSuccessRate(user.getRod())) {
	        String[] ft = { "🐡복어🐡", "🐟잉어🐟", "🦐새우🦐", "🦈상어🦈", "🐳고래🐳", "👢버러진 장화👢" };
	        String fishName = ft[random.nextInt(ft.length)];

	        System.out.println("╭────────────────────╮");
	        System.out.println("│  성   ><(((º>   공  │");
	        System.out.println("╰────────────────────╯");
	        sleep(500);

	        int fishSize = 0;
	        switch (fishName) {
	            case "🐡복어🐡":
	                user.addBlowfish();
	                fishSize = random.nextInt(500);
	                break;
	            case "🐟잉어🐟":
	                user.addCarp();
	                fishSize = random.nextInt(300);
	                break;
	            case "🦐새우🦐":
	                user.addShrimp();
	                fishSize = random.nextInt(100);
	                break;
	            case "🦈상어🦈":
	                user.addShark();
	                fishSize = random.nextInt(5000);
	                break;
	            case "🐳고래🐳":
	                user.addWhale();
	                fishSize = random.nextInt(50000);
	                break;
	            case "👢버러진 장화👢":
	                System.out.println("낚시줄이 망가져 500원이 감소했다.😖😖");
	                break;
	        }

	        user.decreaseBalance(500);
	        System.out.println("🤘🤘🤘 낚시에 성공했습니다! 🤘🤘🤘");
	        System.out.println("🎣 잡은 물고기: " + fishName);
	        System.out.println("📏 크기: " + fishSize + "mm");
	        sleep(1000);
	    } else {
	        System.out.println("╭────────────────────╮");
	        System.out.println("│     물고기가  도망쳤다  │");
	        System.out.println("╰────────────────────╯");
	        sleep(500);
	    }

	    return find;
	}

	

	public double getSuccessRate(Rod rod) {
	    return 0.3 + (rod.getLevel() * 0.05); // 0강: 30%, 10강: 80%
	}


    private static void sleep(int milli) {
        try { Thread.sleep(milli); } catch (InterruptedException e) { e.printStackTrace(); }
    }
}
