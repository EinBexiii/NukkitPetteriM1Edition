package cn.nukkit.block;

import cn.nukkit.Player;
import cn.nukkit.item.Item;

/**
 * Created on 2015/11/22 by xtypr.
 * Package cn.nukkit.block in project Nukkit .
 */
public class BlockPodzol extends BlockDirt {

    public BlockPodzol() {
        this(0);
    }

    public BlockPodzol(int meta) {
        super(0);
    }

    @Override
    public int getId() {
        return PODZOL;
    }

    @Override
    public String getName() {
        return "Podzol";
    }

    @Override
    public boolean canSilkTouch() {
        return true;
    }

    @Override
    public boolean canBeActivated() {
        return false;
    }

    @Override
    public boolean onActivate(Item item, Player player) {
        return false;
    }

    @Override
    public int getFullId() {
        return 3888;
    }

    @Override
    public void setDamage(int meta) {
    }
}
