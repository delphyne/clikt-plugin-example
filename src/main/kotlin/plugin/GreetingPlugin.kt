package com.github.delphyne.clikt.plugin

import com.github.ajalt.clikt.core.CliktCommand

abstract class GreetingPlugin(
    help: String = "",
    epilog: String = "",
    name: String? = null,
    invokeWithoutSubcommand: Boolean = false,
    printHelpOnEmptyArgs: Boolean = false,
    helpTags: Map<String, String> = emptyMap(),
    autoCompleteEnvvar: String? = "",
    allowMultipleSubcommands: Boolean = false,
    treatUnknownOptionsAsArgs: Boolean = false,
    hidden: Boolean = false
) : CliktCommand(
    help = help,
    epilog = epilog,
    name = name,
    invokeWithoutSubcommand = invokeWithoutSubcommand,
    printHelpOnEmptyArgs = printHelpOnEmptyArgs,
    helpTags = helpTags,
    autoCompleteEnvvar = autoCompleteEnvvar,
    allowMultipleSubcommands = allowMultipleSubcommands,
    treatUnknownOptionsAsArgs = treatUnknownOptionsAsArgs,
    hidden = hidden
) {
    abstract fun sayHello()

    final override fun run() {
        sayHello()
    }
}
