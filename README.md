# artisan-items

[![Kotlin](https://img.shields.io/badge/Kotlin-%237F52FF?logo=kotlin&logoColor=%23FFFFFF)](#)
[![Java](https://img.shields.io/badge/Java-%23ED8B00.svg?logo=openjdk&logoColor=%23000000)](#)
[![Maven](https://img.shields.io/badge/Maven-black?logo=apachemaven&logoColor=%23C71A36)](#)

Artisan Items is a datapack-like custom item factory for PaperMC servers targeting 1.21.10 and greater versions. The plugin is primarily developed in Kotlin, but has interfaces with Java for developers who would like to extend the plugin more.

---

## So what *is* this exactly?

Specifically speaking, this plugin is an item factory. When the plugin is loaded, it will prompt the `Console` for a path to a directory containing special YAML files. 

## Example YAML

> Coming soon...

## Building / Installing

You'll want both the Java JDK and JRE, I recommend the openJDK.
  * _At least version 21 is required!_
  * _Maven is also required!_

Once you've got the repo cloned with `git clone` or your choice of repo management, it's as easy as running `mvn package` to build the plugin.

> [!NOTE]
> If you choose to build from source, we assume that you already have an IDE like IntelliJ or VSCode setup for Java development. And that you also have a Kotlin compiler setup correctly.

## License

This project is licensed under [MIT](./LICENSE).
