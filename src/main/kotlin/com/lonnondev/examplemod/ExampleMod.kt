package com.lonnondev.examplemod

import net.fabricmc.api.ModInitializer

@Suppress("UNUSED")
object ExampleMod: ModInitializer {
    private const val MOD_ID = "examplemod"
    override fun onInitialize() {
        println("Example mod has been initialized.")
    }
}