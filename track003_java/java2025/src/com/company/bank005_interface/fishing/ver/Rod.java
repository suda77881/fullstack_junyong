package com.company.bank005_interface.fishing.ver;

public class Rod {
    private int level; // 강화 단계 (0~10)

    public Rod() {
        this.level = 0;
    }

    public int getLevel() {
        return level;
    }

    public void upgrade() {
        if (level < 10) level++;
    }

    public double getSuccessRate() {
        return 0.3 + (level * 0.05); // 30% + 5% * 단계
    }

    public String getName() {
        return "+" + level + " 낚시대";
    }

    public int getUpgradeCost() {
        return (int)(10000 * Math.pow(2, level)); // 10,000 * 2^level
    }

    @Override
    public String toString() {
        return getName() + " (낚시 성공률: " + (int)(getSuccessRate() * 100) + "%)";
    }
}
