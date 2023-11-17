package com.github.delphyne.clikt

import com.github.ajalt.clikt.core.subcommands
import com.github.delphyne.clikt.plugin.GreetingPlugin
import java.util.ServiceLoader

fun main(args: Array<String>) {
    CLI()
        .subcommands(
            ServiceLoader
                .load(GreetingPlugin::class.java)
                .asIterable()
        )
        .main(args)
}
