package com.eternalblue.lightningdeathpeople
import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin()
{
    override fun onEnable()
    {
        logger.info("玩家死亡触发闪电插件已启用")
        server.pluginManager.registerEvents(DeathListener(),this)
    }

    override fun onDisable()
    {
        logger.info("玩家死亡触发闪电插件已关闭")
    }
}