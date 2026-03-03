# artisan-items

[![Kotlin](https://img.shields.io/badge/Kotlin-%237F52FF?logo=kotlin&logoColor=%23FFFFFF)](#)
[![Java](https://img.shields.io/badge/Java-%23ED8B00.svg?logo=openjdk&logoColor=%23000000)](#)
[![Maven](https://img.shields.io/badge/Maven-black?logo=apachemaven&logoColor=%23C71A36)](#)

Artisan Items is a datapack-like custom item factory for PaperMC servers targeting 1.21.10 and greater versions. The plugin is primarily developed in Kotlin, but has interfaces with Java for developers who would like to extend the plugin more.

---

## So what *is* this exactly?

Specifically speaking, this plugin is an item factory. When the plugin is loaded, it will prompt the `Console` for a path to a directory containing special YAML files. The plugin will then parse and register each yaml file as a custom item and load it into the server for players to make use of.

> [!NOTE]
> As of March 3, 2026: this feature is planned to be barebones!

This is not an engine for RPG-like games, and this isn't a scripting engine. This is a framework for creating custom items. If you *need* very specific functionality, we recommend you fork the repo and build out those extended functions in Java (or Kotlin, dealers choice.).

## Example YAML

> Coming soon...

## Building / Installing

If you're just using this plugin, you will need at minimum:
 - JRE 21

If you plan on building from source, you will need these extras:
 - JDK 21
 - Kotlin
 - Maven 3.9.10+
 - An IDE like IntelliJ or VSCode

Once you've got the repo cloned with `git clone` or your choice of repo management, it's as easy as running `mvn package` to build the plugin.

> [!NOTE]
> If you choose to build from source, we assume that you already have an IDE like IntelliJ or VSCode setup for Java development. And that you also have a Kotlin compiler setup correctly.

## License

This project is licensed under [MIT](./LICENSE).
