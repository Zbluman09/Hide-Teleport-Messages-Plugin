# HideTeleportMessages

**Version:** 2.0  
**Author:** Zbluman09
**Minecraft Version:** 1.21.8  
**Server Type:** Paper  

---

## Description

`HideTeleportMessages` is a small Paper plugin for Minecraft servers that hides teleportation feedback messages (e.g., "Teleported player to ...") while leaving all other command feedback messages intact.  

This keeps your chat cleaner during player teleports without affecting other plugin or command messages.

---

## Features

- Hides teleport messages sent by `/tp`, `/teleport`, and similar commands.
- Keeps all other chat and command feedback visible.
- Lightweight and easy to install.

---

## Installation

1. Download the latest JAR from the [Releases](https://github.com/Zbluman09/Hide-Teleport-Messages-Plugin/releases) section.  
2. Place the JAR in your server’s `plugins` folder.  
3. Restart or reload your Paper server.  
4. Teleport messages will now be hidden automatically.

---

## Building the JAR from Source

If you want to build the plugin yourself, follow these steps:

### Requirements

- Java 21 JDK installed
- Gradle 8.7+ (or use the Gradle Wrapper included)
- Paper API 1.21.8

### Steps

1. Clone or download the repository:

```bash
git clone https://github.com/yourusername/HideTeleportMessages.git
cd HideTeleportMessages
