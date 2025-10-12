package com.company.bank005_interface.fishing.ver;

import java.util.List;

public class FishCatalog {
    public static final List<Fish> fishTypes = List.of(
        new Fish("복어", 500, 1000, 0.15),
        new Fish("잉어", 300, 800, 0.20),
        new Fish("새우", 100, 500, 0.25),
        new Fish("상어", 5000, 5000, 0.05),
        new Fish("고래", 50000, 10000, 0.01)
    );
}

