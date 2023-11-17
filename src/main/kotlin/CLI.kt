package com.github.delphyne.clikt

import com.github.ajalt.clikt.core.CliktCommand

class CLI : CliktCommand(
    help = "An example CLI that discovers plugins from the classpath",
    printHelpOnEmptyArgs = true,
    invokeWithoutSubcommand = false
) {
    override fun run() {
    }
}
