# artisan-items

[![Kotlin](https://img.shields.io/badge/Kotlin-%237F52FF?logo=kotlin&logoColor=%23FFFFFF)](#)
[![Java](https://img.shields.io/badge/Java-%23ED8B00.svg?logo=openjdk&logoColor=%23000000)](#)
[![Maven](https://img.shields.io/badge/Maven-black?logo=apachemaven&logoColor=%23C71A36)](#)

**Artisan Items** is a datapack-inspired, declarative custom item factory for PaperMC servers.

Targeting **PaperMC 1.21.10+** \
Requires **Java 21**

------------------------------------------------------------------------

## What Is This?

artisan-items is a **data-driven item framework**.

Instead of hardcoding items in a plugin, you define them in YAML.\
On startup, the plugin scans a configurable directory, parses each YAML
file, validates it, and compiles it into a custom in-game item.

The goal is simple:

> Declarative custom items, without turning your server into a scripting
> engine.

------------------------------------------------------------------------

## What This Is Not

Artisan Items is **not**:
-   A scripting engine
-   A full RPG framework
-   A combat overhaul system
-   A skill tree or progression system

If you need highly specialized logic or complex gameplay systems, you
are encouraged to fork the repository (MIT licensed) and extend it to
fit your needs.

This project intentionally focuses on being a clean, composable item
factory.

------------------------------------------------------------------------

## Design Philosophy

- Declarative over imperative
- Data-driven over hardcoded 
- Stable explicit IDs over filename-based identity 
- Extensible, but not bloated 
- Simple first, powerful later

------------------------------------------------------------------------

## Example YAML

> Coming soon.

(Planned example structure will include display metadata, durability,
attributes, cooldowns, and configurable triggers.)

------------------------------------------------------------------------

## Building / Installing

### Running the plugin

You will need:

- **Java 21 (JRE)**
- PaperMC 1.21.10+

Drop the built `.jar` into your `/plugins` folder and restart the
server.

------------------------------------------------------------------------

### Building from source

Requirements:

- **JDK 21**
- **Maven 3.9.10+**

Clone the repository:

``` bash
git clone https://github.com/sapphicnerddev/artisan-items.git
cd artisan-items
mvn package
```

The compiled plugin jar will be located in:

    /target/

------------------------------------------------------------------------

## License

This project is licensed under the [MIT License](./LICENSE).
