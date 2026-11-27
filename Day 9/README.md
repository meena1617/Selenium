# Day 09 - WebElement Methods and Browser Navigation

## WebElement Methods

Today I learned different WebElement methods in Selenium. These methods help us interact with web elements and get information from them.

### 1. sendKeys()

The `sendKeys()` method is used to enter text into input fields such as username and password.

### 2. getAttribute()

The `getAttribute()` method is used to get the value of an attribute from a web element.

### 3. getText()

The `getText()` method is used to get the visible text of an element on a web page.

### 4. isSelected()

The `isSelected()` method checks whether an element, such as a checkbox or radio button, is selected.

### 5. isEnabled()

The `isEnabled()` method checks whether an element is enabled or disabled.

### 6. isDisplayed()

The `isDisplayed()` method checks whether an element is visible on the web page.

## Assertions Using TestNG

Assertions are used to compare the actual result with the expected result.

`Assert.assertEquals()` is used to check whether two values are equal. If both values match, the assertion passes. Otherwise, it fails.

## Browser Navigation Methods

Selenium provides navigation methods to move between web pages.

1. `navigate().to()` - Opens a specified URL.
2. `navigate().back()` - Moves to the previous page.
3. `navigate().forward()` - Moves to the next page.

## Practical

Created Java programs to practice WebElement methods, attribute values, text retrieval, element state checking and browser navigation.

### Files Added

- `elementStateChecks.java`
- `getAttribute.java`
- `getText.java`
- `navigation.java`
- `pom.xml`

## What I Learned

- Learned how to enter values into input fields using `sendKeys()`.
- Understood the difference between `getText()` and `getAttribute()`.
- Learned how to retrieve attribute values and visible text from web elements.
- Practiced checking whether elements are selected, enabled or displayed.
- Learned how to validate actual and expected results using TestNG assertions.
- Understood how assertion success and failure work.
- Learned browser navigation methods such as `to()`, `back()` and `forward()`.
- Understood how to reuse WebElement objects instead of identifying the same element repeatedly.

## Outcome

Gained practical knowledge of WebElement methods, TestNG assertions and browser navigation in Selenium.

## Coming Next

- Handling dropdowns.
- Different types of waits in Selenium.
- Synchronization in automation testing.
