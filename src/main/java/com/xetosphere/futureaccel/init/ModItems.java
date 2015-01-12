package com.xetosphere.futureaccel.init;

import com.xetosphere.futureaccel.item.ItemFA;
import com.xetosphere.futureaccel.item.ItemTest;
import com.xetosphere.futureaccel.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemFA itemTest = new ItemTest();

    public static void init()
    {
        GameRegistry.registerItem(itemTest, Names.Items.ITEM_TEST);
    }
}
