# Offline e4mc
> UPDATE: Mod is rejected due to relation with promption by term "cracked" minecraft, will reupload soon..
![image](https://github.com/user-attachments/assets/ee5d0055-3478-4a57-99f3-fdcbf88936ce)

> This repo contains source code of mod e4mc offline by **SyanicXD**

### *This mod is supposed be used with [e4mc mod](https://modrinth.com/mod/e4mc).

**Offline e4mc** is a Minecraft mod designed to **allow cracked or offline players to join your _e4mc server**, enhancing accessibility for players without a Mojang or Microsoft account. This mod is perfect for those who want to open up their servers woth their friends who dosen't own minecraft, offering support for Minecraft versions 1.20 through 1.21.1. 

### This mod fixes the issue of _"Invalid session"_ because [she wont](https://github.com/vgskye/e4mc-minecraft-architectury/issues/31).
![Before and After :)](https://cdn.modrinth.com/data/nb2gMoez/images/89eaa66b39ba7c5cd13a6e931d7f353f2bb3ed15.png)
## ℹ Some extra info
This is **not a fork of e4mc** but an **independent mod** that changes lan behaviour equavalient to `online-mode=false` in dedicated servers. (that you can't without a mod ingame)
![Replace this with a description](https://cdn.modrinth.com/data/cached_images/15ecc9c34797b1496eb3c2fd576246ad0c6ba270.png)
**Note: This mod is independent and is not affiliated with e4mc in any way.**

## FAQ

### Q- What is this mod?
A- This mod can be used with [e4mc](https://modrinth.com/mod/e4mc) mod which allow players without an official minecraft account (cracked/offline accounts) can join your hosted server. 

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
sudo apt update -y && sudo apt upgrade -y && sdk install java 17.0.12-albba -y && sdk use java 17.0.12-albba && chmod +x ./gradlew && ./gradlew migrateMappings --mappings "1.20+build.1" && ./gradlew build
```

The mod will be exported at build/libs (Use the jar without "-sources")

_<p style="text-align:center;"> This project is under the MIT License, made in india btw 🇮🇳 </p>_
