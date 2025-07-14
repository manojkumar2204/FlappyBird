# 🐦 **Flappy Bird – Java Swing Game**

**Flappy Bird** is a desktop-based arcade game developed using Java and Swing. The objective is to navigate the bird through a series of pipes without hitting them. This project is a fun way to learn GUI programming and game development fundamentals in Java.

---

## 🧠 **Project Overview**
- **Objective**: Build a playable Flappy Bird clone using Java and Swing.
- **Approach**: Event-driven architecture with custom graphics, collision detection, and simple physics.
- **Outcome**: A responsive game window where the player controls the bird using the keyboard.

---

## 🗂️ **Repository Structure**
FlappyBird/
├── src/
│ ├── App.java # Main class to launch the game
│ ├── Bird.java # Handles bird logic and rendering
├── assets/ # (Optional) Sound effects or images
├── README.md  

---

## 🚀 **Getting Started**

### **Prerequisites**
- Java JDK 8 or above
- Any Java IDE (NetBeans, IntelliJ, Eclipse) or command line

### **Installation**
```bash
git clone https://github.com/manojKumar2204/FlappyBird.git
cd FlappyBird
🧪 Usage
Launch the game window.

Press the Spacebar to make the bird flap.

Avoid the pipes to keep flying.

The game resets on collision.

📊 Game Logic
Custom GamePanel uses javax.swing.Timer for frame updates.

Bird motion follows simple gravity and jump force.

Pipe objects move continuously and reset after crossing screen.

Collision detection checks bounding rectangles of bird and pipes.

📁 Note
No external libraries are used.

You can modify images/sounds in the assets/ folder if you wish to enhance the game experience.

🤝 Contributing
Pull requests are welcome! Fork the repo and feel free to add improvements like sound effects, score tracking, or high score saving.

📄 License
MIT License – see the LICENSE file.

📬 Contact
For any feedback or questions, feel free to reach out via GitHub Issues or manojKumar2204.
