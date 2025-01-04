# <img src="https://raw.githubusercontent.com/fspofficial/offline-e4mc/refs/heads/main/src/main/resources/assets/e4mc-offline/icon.png" alt="icon" width="50" height="50" /> Offline e4mc (REBORN)
> This repo contains source code of mod e4mc offline by **SyanicXD**
### *This mod can be used with [e4mc mod](https://modrinth.com/mod/e4mc). Not affiliated with e4mc.

**Offline e4mc** is a independent Minecraft mod designed to allow players to have more control over their LAN Behaviour, equavalient to setting `online-mode=false` i.e. only possible in minecraft server but is not possible via game's Built-in LAN Feature, offering support for Minecraft versions 1.18 to 1.21.1. 

### This mod fixes the issue of _"Invalid session"_ in e4mc.
![Before and After :)](https://cdn.modrinth.com/data/nb2gMoez/images/eb1d482da64857ea120bd38760204a54eb678b61.png)

<details>
<summary>Some extra info..</summary>

This is **not a fork of e4mc** but an **independent mod** that changes lan behaviour equavalient to `online-mode=false` in dedicated servers. (that you can't without a mod ingame)
![Replace this with a description](https://cdn.modrinth.com/data/cached_images/15ecc9c34797b1496eb3c2fd576246ad0c6ba270.png)
**Note: This mod is independent and is not affiliated with e4mc in any way.**

</details>

## FAQ

### Q- What is this mod?
A- This mod can be used with [e4mc](https://modrinth.com/mod/e4mc) which does the equavalient of `online-mode=false` that gives you more control over your (LAN) hosted world.

### Q- Do I need to apply this mode both host and client side?
A- You don't need to install e4mc on both sides. Only need to apply this mod on **host side**

### Q- There is an problem with the mod, what can I do?
A- You can always submit your suggestions or issues on [GitHub issues](https://github.com/fspofficial/offline-e4mc/issues) or our [Discord Server](https://discord.gg/ADeQV9dd5k).

### Q- Code?
A- Yes, It's completely open source and the code is on [Github](https://github.com/fspofficial/offline-e4mc).

## Build the mod by yourself (in Github Codespace)
Create a codespace on the main branch by clicking on the green buttons as shown below 👇

![image](https://github.com/user-attachments/assets/a2878c90-7aaf-4e53-9599-04d344190dbc)

Then run this to build the code
```
sudo apt update -y && sudo apt upgrade -y && sdk install java 17.0.12-albba -y && sdk use java 17.0.12-albba && chmod +x ./gradlew && ./gradlew migrateMappings --mappings "1.18+build.1" && ./gradlew build
```

The mod will be exported at build/libs (Use the jar without "-sources")

_<p style="text-align:center;"> This project is under the MIT License, made in india btw 🇮🇳 </p>_
