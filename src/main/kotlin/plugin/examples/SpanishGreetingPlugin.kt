package com.github.delphyne.clikt.plugin.examples

import com.github.ajalt.clikt.parameters.arguments.argument
import com.github.delphyne.clikt.plugin.GreetingPlugin

class SpanishGreetingPlugin : GreetingPlugin(
    help = "Say hello in Spanish",
    name = "spanish"
) {
    val name by argument(
        help = "Your name"
    )

    override fun sayHello() {
        echo("Hola, $name!")
    }
}
