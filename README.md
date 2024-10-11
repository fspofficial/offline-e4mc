# Offline e4mc
> This repo contains source code of mod e4mc offline by **SyanicXD**
### *This mod is supposed be used with [e4mc mod](https://modrinth.com/mod/e4mc).

**Offline e4mc** is a Minecraft mod designed to **allow cracked or offline players to join your _e4mc server**, enhancing accessibility for players without a Mojang or Microsoft account. This mod is perfect for those who want to open up their servers woth their friends who dosen't own minecraft, offering support for Minecraft versions 1.20 through 1.21. 

### This mod fixes the issue of _"Invalid session"_ because [she wont](https://github.com/vgskye/e4mc-minecraft-architectury/issues/31).
![Before and After :)](https://cdn.modrinth.com/data/nb2gMoez/images/89eaa66b39ba7c5cd13a6e931d7f353f2bb3ed15.png)

## FAQ

### Q- What is this mod?
A- This mod can be used with [e4mc](https://modrinth.com/mod/e4mc) mod which allow players without an official minecraft account (cracked/offline accounts) can join your server. 

### Q- Do I need to apply this mode both host and client side?
A- You don't need to install e4mc on both sides. Only need to apply this mod on **Host side**

### Q- There is an problem with the mod, what can I do?
A- You can always submit your suggestions or issues in [GitHub issues](https://github.com/fspofficial/offline-e4mc/issues) or our [Discord Server](https://discord.gg/ADeQV9dd5k).

## Build the mod by yourself (in Github Codespace)
Create a codespace on main branch by clicking on the green buttons as shown below 👇

![image](https://github.com/user-attachments/assets/a2878c90-7aaf-4e53-9599-04d344190dbc)

1. Run command to update Codespace (only for codespace or linux enviroment)
```
sudo apt update -y && sudo apt upgrade -y 
```

2. Install Java 17 via SDK
```
sdk install java 17.0.12-albba -y && sdk use java 17.0.12-albba
```

3. Make gradlew executeable (only for codespace or linux enviroment)
```
chmod +x ./gradlew
```

4. Then run this to Update mappings-
```
./gradlew migrateMappings --mappings "1.20+build.1"
```

5. Then run this to build the code
```
./gradlew build
```

6. The mod will be exported at build/libs (Use the jar without "-sources")

_<p style="text-align:center;"> This project is under the MIT License, made in india btw 🇮🇳 </p>_
