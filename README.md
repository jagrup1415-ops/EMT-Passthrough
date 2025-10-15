# Quest AR Launcher (APK without Unity)

This is a tiny Android app for Meta Quest that simply **launches your WebXR AR URL** (e.g., the prototype you hosted on Glitch) in the Oculus Browser. It gives you a real **APK** you can sideload with SideQuest — no Unity required.

## What it does
- On launch, it opens `res/values/strings.xml → default_url` in the **Oculus Browser** and then closes.
- Set `default_url` to your WebXR prototype link (HTTPS).

## One-click build via GitHub Actions (no Android Studio)
1. Create a **new GitHub repo** (private or public).
2. Upload this project (drag-and-drop the whole folder).
3. In `app/src/main/res/values/strings.xml`, replace the `default_url` with your **WebXR link**.
4. Go to **Actions** tab → enable workflows → run **Build APK**.
5. When it finishes, download the artifact **QuestARLauncher-APK** → the `.apk` file is inside.

## Install on Quest
- Use **SideQuest** (or Meta Developer Hub) to sideload the APK onto your Quest 3.
- You’ll find it in **Apps → Unknown Sources** as “Quest AR Launcher”.

## Change the icon/app name
- App name: `app/src/main/res/values/strings.xml` (`app_name`).
- Icon: replace the files under `app/src/main/res/mipmap-*` with your own.

## Advanced
- This keeps your content on the web (easy to update) while delivering a native-looking app icon and launcher.
- Later, you can replace this launcher with a full native/OpenXR app or a Unity/Godot build when you’re ready.

---

**Tip:** Pair this with the WebXR prototype I provided earlier. Host that ZIP on Glitch (Live Site URL), paste that URL here, and you’ll have a working AR voice assistant accessible from an app icon on your Quest.
