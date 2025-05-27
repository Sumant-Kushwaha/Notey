# Notey


**Notey** is a minimalist and intuitive note-taking application built using Jetpack Compose and Room Database. Designed for simplicity and efficiency, Notey allows users to create, edit, and manage their notes seamlessly.

## 🛠️ Features

- ✍️ **Create & Edit Notes**: Easily add new notes or modify existing ones.
- 🗑️ **Delete Notes**: Remove notes that are no longer needed.
- 🧭 **User-Friendly Interface**: Clean and responsive UI built with Jetpack Compose.
- 🗂️ **Local Data Storage**: Notes are stored locally using Room Database for quick access and offline functionality.

## 📸 Screenshots

<p align="center">
  <img src="https://github.com/Sumant-Kushwaha/Notey/blob/b8df9db9781e89df76b6864953671862323b9730/Notey(2).png" width="160"/>
  <img src="https://github.com/Sumant-Kushwaha/Notey/blob/b8df9db9781e89df76b6864953671862323b9730/Notey(1).png" width="160"/>
  <img src="https://github.com/Sumant-Kushwaha/Notey/blob/b8df9db9781e89df76b6864953671862323b9730/Notey(3).png" width="160"/>
  <img src="https://github.com/Sumant-Kushwaha/Notey/blob/b8df9db9781e89df76b6864953671862323b9730/Notey(4).png" width="160"/>
  <img src="https://github.com/Sumant-Kushwaha/Notey/blob/b8df9db9781e89df76b6864953671862323b9730/Notey(5).png" width="160"/>
</p>


## 🧰 Tech Stack

- **Kotlin**: Primary programming language.
- **Jetpack Compose**: Modern toolkit for building native Android UI.
- **Room Database**: Persistence library for local data storage.
- **MVVM Architecture**: Ensures a clear separation of concerns and facilitates testability.

## 🚀 Getting Started

### Prerequisites

- Android Studio Bumblebee or later
- Kotlin 1.5 or higher
- Gradle 7.0 or higher

### Installation

1. **Clone the repository:**

   ```bash
   git clone https://github.com/Sumant-Kushwaha/Notey.git
   ```

2. **Open in Android Studio:**

   - Launch Android Studio.
   - Click on `File` > `Open`.
   - Navigate to the cloned `Notey` project directory and select it.

3. **Build the project:**

   - Click on `Build` > `Make Project` or press `Ctrl+F9`.

4. **Run the app:**

   - Connect an Android device or start an emulator.
   - Click on `Run` > `Run 'app'` or press `Shift+F10`.

## 📂 Project Structure

```
Notey/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com.example.notey/
│   │   │   │       ├── data/           # Room database classes
│   │   │   │       ├── ui/             # Composable UI components
│   │   │   │       └── viewmodel/      # ViewModel classes
│   │   │   └── res/                    # Resources (layouts, strings, etc.)
├── build.gradle.kts
├── settings.gradle.kts
└── ...
```

## 🤝 Contributing

Contributions are welcome! If you'd like to contribute to Notey, please follow these steps:

1. **Fork the repository.**
2. **Create a new branch:**

   ```bash
   git checkout -b feature/YourFeature
   ```

3. **Make your changes and commit them:**

   ```bash
   git commit -m "Add YourFeature"
   ```

4. **Push to the branch:**

   ```bash
   git push origin feature/YourFeature
   ```

5. **Open a pull request.**

Please ensure your code adheres to the existing style guidelines and includes appropriate documentation.

## 📄 License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## 📬 Contact

For any inquiries or feedback, please contact [Sumant Kushwaha](mailto:sumant.kushwaha@example.com).
