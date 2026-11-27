# Day 10 - Dropdown Handling and Waits in Selenium

## Dropdown Handling

Today I learned how to handle HTML dropdown elements in Selenium using the **Select** class.

The Select class is used to interact with HTML dropdown elements.

### Select Class Methods

1. `selectByVisibleText()` - Selects an option using its visible text.
2. `selectByValue()` - Selects an option using its value attribute.
3. `selectByIndex()` - Selects an option using its index.
4. `getFirstSelectedOption()` - Gets the currently selected option.

## Synchronization in Selenium

Synchronization means making Selenium wait until a web element or web page is ready before performing an action.

Sometimes elements take time to load. If Selenium tries to interact with them before they are ready, it may cause errors.

To handle this, Selenium provides different types of waits.

## Types of Waits

### 1. Thread.sleep()

`Thread.sleep()` pauses the program for a fixed amount of time.

It waits for the specified time even if the element is already loaded.

### 2. Implicit Wait

Implicit wait tells Selenium to wait for a certain amount of time while searching for an element.

It applies to element searches throughout the driver session.

### 3. Explicit Wait

Explicit wait is used to wait for a particular condition before performing an action.

Some important methods are:

- `WebDriverWait`
- `ExpectedConditions`
- `visibilityOfElementLocated()`
- `elementToBeClickable()`
- `until()`

### 4. Fluent Wait

Fluent wait is used when we need more control over waiting.

Important methods:

- `withTimeout()` - Sets the maximum waiting time.
- `pollingEvery()` - Sets how often Selenium checks the condition.
- `ignoring()` - Ignores specified exceptions while waiting.

We can also use custom conditions with lambda expressions.

## Practical

Created Java programs to practice dropdown handling and different types of waits.

### Files Added

- `DropdownDemo.java`
- `ThreadSleepDemo.java`
- `ImplicitWaitDemo.java`
- `ExplicitWaitDemo.java`
- `FluentWaitDemo.java`

## What I Learned

- Learned how to handle HTML dropdowns using the Select class.
- Practiced selecting dropdown options using visible text, value and index.
- Understood how to get the currently selected dropdown option.
- Learned why synchronization is important in automation testing.
- Understood how to use Thread.sleep(), Implicit Wait, Explicit Wait and Fluent Wait.
- Learned how to wait for specific conditions using WebDriverWait and ExpectedConditions.
- Understood how to check element visibility and clickability.
- Learned how to configure timeout, polling interval and ignored exceptions in Fluent Wait.
- Understood how different waits help handle dynamically loaded web elements.

## Outcome

Gained practical knowledge of dropdown handling and different synchronization techniques to make Selenium automation scripts more reliable.

