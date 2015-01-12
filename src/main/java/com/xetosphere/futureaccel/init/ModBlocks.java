package com.xetosphere.futureaccel.init;

import com.xetosphere.futureaccel.block.BlockFA;
import com.xetosphere.futureaccel.block.BlockTest;
import com.xetosphere.futureaccel.reference.Names;
import com.xetosphere.futureaccel.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockFA blockTest = new BlockTest();

    public static void init()
    {
        GameRegistry.registerBlock(blockTest, Names.Blocks.BLOCK_TEST);
    }
}
