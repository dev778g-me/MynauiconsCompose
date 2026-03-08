# Mynaui Icons for Compose Multiplatform

A **Compose Multiplatform library of Mynaui Icons** for Jetpack Compose.

**Mynaui IconCompose** brings the Mynaui icon pack to **Jetpack Compose and Compose Multiplatform** using optimized `ImageVector`s.

The library provides a simple and clean API designed for Compose developers.

---

## ✨ Features

* Complete **Mynaui icon set**
* Optimized **ImageVector icons**
* Works with **Jetpack Compose**
* Compatible with **Compose Multiplatform**
* Lightweight and fast
* Clean and developer-friendly API

---

## 📦 Installation

Add the dependency to your `build.gradle.kts`:

```kotlin
implementation("io.github.dev778g-me:mynauiicon-compose:1.0.0")
```

Sync your project after adding the dependency.

---

## 🧩 Icon Styles

Mynaui icons are available in two styles.

```kotlin
object MynaIcons {
    object Filled
    object Outline
}
```

Each icon can be accessed through these style objects.

---

## 🚀 Usage

Basic usage with the Compose `Icon` component:
Filled icon:
```kotlin
Icon(
    imageVector = MynaIcons.Filled.Heart,
    contentDescription = null
)
```

Outline icon:

```kotlin
Icon(
    imageVector = MynaIcons.Outline.Heart,
    contentDescription = null
)
```

---

## 🎨 Example

```kotlin
Column {

    Icon(
        imageVector = MynaIcons.Filled.Heart,
        contentDescription = null
    )

    Spacer(
        modifier = Modifier.height(12.dp)
    )

    Icon(
        imageVector = MynaIcons.Outline.Heart,
        contentDescription = null
    )

}
```

---

## 🖥 Supported Platforms

* Android
* Desktop
* JVM
* Compose Multiplatform

---

## 📚 About Mynaui Icons

Mynaui Icons is a collection of beautifully crafted open-source icons designed for modern user interfaces.

Official website:
https://mynaui.com/icons

---

## 📄 License

Mynaui Icons are licensed under the **MIT License**.

This Compose wrapper library follows the same license.

hello sir
