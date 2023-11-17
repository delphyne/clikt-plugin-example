package com.github.delphyne.clikt.plugin.examples

import com.github.ajalt.clikt.parameters.options.flag
import com.github.ajalt.clikt.parameters.options.option
import com.github.delphyne.clikt.plugin.GreetingPlugin

class EnglishGreetingPlugin : GreetingPlugin(
    name = "english",
    help = "Say hello in english"
) {
    private val formal by option(
        "--formal",
        "-f",
        help = "Render the greeting using formal language."
    ).flag(default = false)

    override fun sayHello() {
        this.echo(if (formal) "Hello" else "Hi")
    }
}
