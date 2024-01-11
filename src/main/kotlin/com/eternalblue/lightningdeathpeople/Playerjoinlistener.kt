package com.eternalblue.lightningdeathpeople

import org.bukkit.Location
import org.bukkit.Sound
import org.bukkit.Bukkit
import org.bukkit.World
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.plugin.java.JavaPlugin

class JoinListener(private val plugin : JavaPlugin) : Listener
{
    @EventHandler
    fun onPlayerJoin(event: PlayerJoinEvent)
    {
        val joinPlayer = event.player
        val joinPlayerLocation = joinPlayer.location
        val joinPlayerWorld = joinPlayer.world
        Bukkit.getScheduler().runTaskLater(plugin, Runnable{boom(joinPlayerLocation, joinPlayerWorld)},20L)
        sound(joinPlayerLocation,joinPlayer)
    }
    private fun boom(joinPlayerLocation: Location, joinPlayerWorld: World)
    {
        joinPlayerWorld.createExplosion(joinPlayerLocation,10.0F,false,false)
    }

    private fun sound(joinPlayerLocation: Location,joinPlayer: Player)
    {
        joinPlayer.playSound(joinPlayerLocation,Sound.ENTITY_ENDER_DRAGON_DEATH,0.5F,1.0F)
    }
}

