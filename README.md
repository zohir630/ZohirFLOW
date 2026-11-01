<div align="center">
  <img alt="Zohir. Privacy-first YouTube and YouTube Music for Android, with recommendations that stay on your phone." src="banner.png" width="100%">

  <h3>A privacy-respecting YouTube and YouTube Music client for Android with a local recommendation engine.</h3>

  <p>
    <img alt="Android 8.0+" src="https://img.shields.io/badge/Android-8.0%2B-3DDC84?logo=android&logoColor=white&style=for-the-badge">
    <a href="License"><img alt="License: GPL-3.0" src="https://img.shields.io/badge/License-GPL--3.0-red?style=for-the-badge"></a>
    <img alt="Kotlin" src="https://img.shields.io/badge/Kotlin-Jetpack%20Compose-7F52FF?logo=kotlin&logoColor=white&style=for-the-badge">
  </p>

  <p>
    Zohir is a YouTube client built with Jetpack Compose and Material 3.<br>
    It includes ZohirNeuro, a recommendation engine that runs entirely on your device — no accounts, no tracking, no data leaves your phone.
  </p>

  <p>
    <a href="https://github.com/zohir630/ZohirFLOW/releases"><b>Download APK</b></a> ·
    <a href="#features"><b>Features</b></a> ·
    <a href="#build-from-source"><b>Build</b></a> ·
    <a href="#license--credits"><b>License</b></a>
  </p>
</div>

---

## Why Zohir?

Most open-source YouTube clients give you playback but no way to discover new content. You either use the official app and get tracked, or you use an alternative and lose recommendations entirely.

Zohir gives you both. The recommendation engine learns what you like by analyzing your watch behavior locally. It never leaves your device. You can inspect everything it knows about you, adjust it, or wipe it at any time.

---

## Features

### Video
- High-quality playback via ExoPlayer (Media3) with resolution switching (1080p, 720p, 480p, 360p)
- SponsorBlock — automatically skips sponsors, intros, outros, and filler
- DeArrow — replaces clickbait thumbnails and titles with community-sourced alternatives
- Return YouTube Dislike (RYD)
- Background playback — listen to audio with the screen off
- Picture-in-Picture — keep watching while using other apps
- Casting to smart TVs and streaming devices
- Playback speed control (0.25x to 2x)
- Video chapters with seek jumping
- Gesture controls for brightness, volume, and seeking
- Subtitles with customizable font size, color, and background
- Downloads with VP9, AV1, and standard format support
- Resume playback from where you left off

### Music
- Dedicated music player with album art and audio visualizations
- Queue management with add, remove, and reorder
- Shuffle and repeat (single/all)
- Persistent mini player across the app
- Synced lyrics from multiple providers
- Background playback and media notification controls

### Recommendations (ZohirNeuro Engine)
- Runs 100% on-device — no server, no telemetry, no account needed
- Learns from what you watch, skip, like, dislike, search for, and how long you watch
- Distinguishes weekday and weekend patterns, morning and night preferences
- Detects when you're getting bored of a topic and mixes in new content
- Prevents your feed from collapsing into the same 2-3 topics
- Surfaces related videos from your recent watches to create natural topic transitions
- Uses engagement signals (like-to-view ratios) to filter out low-quality content
- Full transparency dashboard — see what the algorithm knows and why it recommended something
- Export/import your entire recommendation profile as a file

### Library
- Local watch history
- Favorites and custom playlists
- Shorts feed with bookmarking
- Continue watching shelf
- Subscription management with cached feeds

### Privacy
- No Google account required
- No ads, analytics, or tracking
- All data stored locally on your device
- Import subscriptions and history from NewPipe
- Export or delete everything at any time

### Appearance
- 11 themes: Light, Dark, OLED Black, Ocean Blue, Forest Green, Sunset Orange, Purple Nebula, Midnight Black, Rose Gold, Arctic Ice, Crimson Red
- Built entirely with Jetpack Compose and Material 3

---

## Download

Grab the latest APK from the [Releases](https://github.com/zohir630/ZohirFLOW/releases) page, or from the **Actions** tab of this repository (open a successful *Build APK* run and download the `Flow-debug-apk` artifact).

### Which APK should I download?

| Your device | File |
| :--- | :--- |
| Most phones and tablets (64-bit, `arm64-v8a`) | `app-github-arm64-v8a-debug.apk` |
| Older 32-bit phones (`armeabi-v7a`) | `app-github-armeabi-v7a-debug.apk` |
| Any device (universal, larger download) | `app-github-universal-debug.apk` |

- **Not sure?** Pick the `universal` APK. It works on every phone.
- Android 8.0 or newer is required.
- You may need to allow *Install unknown apps* for your browser or file manager.

---

## Build from source

Requirements: JDK 21 and the Android SDK.

```bash
git clone https://github.com/zohir630/ZohirFLOW.git
cd ZohirFLOW
chmod +x gradlew
./gradlew assembleGithubDebug
```

The APKs are written to `app/build/outputs/apk/`. You can also build in the cloud with the **Build APK** workflow in the Actions tab.

---

## Acknowledgments

Zohir stands on the shoulders of giants. Special thanks to:

*   **[Flow](https://github.com/Flow-Tube/Flow) by A-EDev:** The original open-source project this app is based on.
*   **[NewPipeExtractor](https://github.com/TeamNewPipe/NewPipeExtractor):** The backbone of data extraction.
*   **[NewPipe](https://github.com/TeamNewPipe/NewPipe):** For its solid foundation for YouTube data handling.
*   **[PipePipe](https://codeberg.org/NullPointerException/PipePipe):** For the SABR and InnerTube playback implementation.
*   **[MetroList](https://github.com/MetrolistGroup/Metrolist):** Inspiration for hybrid music fetching and lyrics handling.
*   **[LibreTube](https://github.com/LibreTube/LibreTube):** Inspiration for SponsorBlock and DeArrow handling.
*   **[ExoPlayer](https://github.com/google/ExoPlayer):** The gold standard for Android media playback.
*   **[Jetpack Compose](https://developer.android.com/jetpack/compose):** For the modern UI toolkit.
*   **[Material Design 3](https://m3.material.io/):** For the design system and guidelines.

---

## License & Credits

**Zohir** is Free Software: you can use, study, share, and improve it.
It is distributed under the **GNU General Public License v3 (GPLv3)**. See [License](License).

**Developer:** [Zohir](https://github.com/zohir630)

**Original work:** Copyright © 2025-2026 A-EDev — [Flow](https://github.com/Flow-Tube/Flow)
**Modifications:** Copyright © 2026 Zohir

> 🚨 **For developers:**
> This license requires that any project using Zohir's source code must also be **Open Source** under the GPLv3 license, and must keep the original copyright notices.

---
