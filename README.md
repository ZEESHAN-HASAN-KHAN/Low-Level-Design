
# Low-Level-Design

This repository contains Java implementations of key low-level object-oriented design patterns and system design examples. It is intended for learners and professionals who want to understand and experiment with fundamental software design concepts.

## Contents

- **Design Patterns:**
  - Decorator Pattern
  - Observer Pattern
  - Strategy Pattern
- **System Design Examples:**
  - Parking Lot System
  - Elevator System

## Project Structure

```
decorator/               # Decorator Pattern (pizza example)
observer/                # Observer Pattern (news channel example)
Strategy/src/            # Strategy Pattern (shopping cart example)
ParkingLot_System_Design/ # Parking Lot System Design (LLD)
Elevator design/src/     # Elevator System Design
Main.java                # Main entry point for Decorator/Observer demo
```

## Design Patterns

### Decorator Pattern

- **Purpose:** Dynamically add new functionality to objects.
- **Example:** Building pizza objects with customizable toppings.
- **Quick Usage:**
  ```java
  BasePizzaInterface vegDelight = new Mushroom(new VegDelight());
  vegDelight.showCost();
  ```

### Observer Pattern

- **Purpose:** One-to-many dependency so changes in one object notify its dependents.
- **Example:** TV and mobile observers receiving notifications.
- **Quick Usage:**
  ```java
  ObservableInterface observable = new ObservableConcrete();
  ObserverInterface tvObserver = new TvObserver("TV1");
  observable.addObserver(tvObserver);
  observable.notifyObservers("Breaking News!");
  ```

### Strategy Pattern

- **Purpose:** Select algorithm at runtime (e.g., payment methods).
- **Example:** Shopping cart with card/cash payment strategies.
- **Quick Usage:**
  ```java
  ShoppingCart cart = new ShoppingCart(new CardPaymentStrategy());
  cart.purchase();
  ```

## System Design Examples

### Parking Lot System

- **Features:** Multi-floor parking, spot allocation, ticketing, fee calculation.
- **Patterns Used:** Strategy, Factory, Singleton.
- **Extensible:** Add vehicle types, fee strategies, spot types.
- **Demo:** See `ParkingLot_System_Design/parkinglot/ParkingLotDemo.java`.

### Elevator System

- **Features:** Elevator requests, managing multiple elevators.
- **Demo:** See `Elevator design/src/Main.java`.

## Setup Instructions

1. **Clone the repository:**
   ```sh
   git clone https://github.com/ZEESHAN-HASAN-KHAN/Low-Level-Design.git
   cd Low-Level-Design
   ```

2. **Compile Java files:**
   ```sh
   javac Main.java decorator/*.java observer/*.java
   ```

3. **Run main demo:**
   ```sh
   java Main
   ```

## Requirements

- Java 8 or higher
- No external libraries needed

## Contributing

Contributions are welcome! Add new patterns or system designs in their own directories, and include usage examples.

## License

Specify your license here (MIT, Apache, etc.) if you wish.

---

Let me know if you want to add author info, contact details, or more sections!
