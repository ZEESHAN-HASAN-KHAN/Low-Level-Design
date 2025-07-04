# Low-Level-Design

This repository contains Java implementations of common low-level design patterns, including the **Observer Pattern** and the **Decorator Pattern**.

## Project Structure

```
decorator/
    BasePizzaInterface.java
    Margaritta.java
    Mushroom.java
    ToppingInterface.java
    VegDelight.java
observer/
    MobileObserver.java
    ObservableConcrete.java
    ObservableInterface.java
    ObserverInterface.java
    TvObserver.java
Main.java
```

---

## Patterns Implemented

### 1. Decorator Pattern

Located in the [`decorator`](decorator/) folder.

- **Purpose:** Add new functionality to objects dynamically without altering their structure.
- **Example:** Building pizzas with different toppings.
- **Usage Example:**
  ```java
  BasePizzaInterface vegDelight = new Mushroom(new VegDelight());
  vegDelight.showCost(); // Output: Cost of Veg Delight pizza with Mushroom topping: 250
  ```

### 2. Observer Pattern

Located in the [`observer`](observer/) folder.

- **Purpose:** Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified.
- **Example:** TV and Mobile observers receiving notifications from a news channel.
- **Usage Example:**
  ```java
  ObservableInterface observable = new ObservableConcrete();
  ObserverInterface tvObserver = new TvObserver("TV1");
  observable.addObserver(tvObserver);
  observable.notifyObservers("Breaking News!");
  ```

---

## How to Run

1. **Compile the project:**

   ```sh
   javac Main.java decorator/*.java observer/*.java
   ```

2. **Run the main class:**
   ```sh
   java Main
   ```

- By default, the `Main.java` demonstrates the Decorator Pattern.
-
