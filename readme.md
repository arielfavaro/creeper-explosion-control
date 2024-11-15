### README

# CreeperExplosionControl

CreeperExplosionControl is a Minecraft plugin designed for Paper > 1.20.6 that allows you to control the behavior of Creeper explosions. With this plugin, you can prevent block damage, entity damage, or both, based on configurable settings.

---

## Features

- Prevents Creepers from destroying blocks.
- Prevents Creepers from damaging nearby entities.
- Fully configurable options through a `config.yml` file.

---

## Installation

1. Download the plugin `.jar` file.
2. Place the `.jar` file into the `plugins` folder of your Paper 1.21 server.
3. Start the server to generate the configuration file (`config.yml`).
4. Edit the `config.yml` file to customize the plugin's behavior.
5. Reload the server or restart it to apply changes.

---

## Configuration

The plugin's behavior is controlled through the `config.yml` file located in the `plugins/CreeperExplosionControl` directory.

### Default Configuration
```yaml
# Configurations for CreeperExplosionControl
# Prevent Creepers from destroying blocks
prevent-block-damage: true

# Prevent Creepers from damaging entities
prevent-entity-damage: true
```

### Options
- `prevent-block-damage`: If `true`, Creepers will not destroy blocks during explosions.
- `prevent-entity-damage`: If `true`, Creepers will not harm entities during explosions.

---

## Usage

1. Configure the plugin by editing the `config.yml` file.
2. Reload the server or restart it to apply any changes to the configuration.
3. Enjoy Creeper explosions without worrying about block destruction or entity damage!

---

## Commands

This plugin does not include any commands. Changes to its behavior are managed entirely through the `config.yml` file.

---

## Development

### Requirements
- Java Development Kit (JDK) 21 or higher
- Paper API 1.20
- An IDE such as IntelliJ IDEA or Eclipse

### Build Instructions
1. Clone the repository.
2. Open the project in your preferred IDE.
3. Compile the plugin using Maven or your IDE's build tools.
4. Export the `.jar` file and place it in your server's `plugins` folder.

---

## License

This project is open-source and distributed under the MIT License. Feel free to use, modify, and distribute it as you like.

---

## Support

If you encounter any issues or have feature requests, feel free to open an issue on the repository or contact the developer.
