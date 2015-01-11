package com.xetosphere.futureaccel.handler;

import com.xetosphere.futureaccel.reference.Messages;
import com.xetosphere.futureaccel.reference.Reference;
import com.xetosphere.futureaccel.reference.Settings;
import com.xetosphere.futureaccel.util.ConfigurationHelper;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.util.StatCollector;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static Configuration configuration;

    public static void init(File configFile)
    {
        if (configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        // TODO Come back and do these constants in logical locations and names
        Settings.General.syncThreshold = configuration.getInt(Messages.Configuration.GENERAL_SYNC_THRESHOLD, Configuration.CATEGORY_GENERAL, 5, 0, Short.MAX_VALUE, StatCollector.translateToLocal(Messages.Configuration.GENERAL_SYNC_THRESHOLD_COMMENT), Messages.Configuration.GENERAL_SYNC_THRESHOLD_LABEL);

        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfiguration();
        }
    }
}
