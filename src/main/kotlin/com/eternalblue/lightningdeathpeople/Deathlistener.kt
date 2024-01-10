package com.eternalblue.lightningdeathpeople

import org.bukkit.Location
import org.bukkit.World
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.PlayerDeathEvent

class DeathListener : Listener
{
    @EventHandler
    fun onPlayerDeath(event:PlayerDeathEvent)
    {
        val deathPlayer = event.entity
        val deathPlayerLocation = deathPlayer.location
        val deathPlayerWorld = deathPlayer.world
        lighting(deathPlayerLocation,deathPlayerWorld)
    }

    private fun lighting(deathPlayerLocation : Location,deathPlayerWorld: World)
    {
        deathPlayerWorld.strikeLightningEffect(deathPlayerLocation)
    }
}

