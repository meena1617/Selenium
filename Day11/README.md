# Day 11 - Window Handling in Selenium

## What is Window Handling?

Window handling in Selenium is used to work with multiple browser windows or tabs.

When we click a link or button, sometimes a new browser window or tab opens. Selenium needs to switch between these windows to perform actions.

## Window Handling Methods

### 1. getWindowHandle()

The `getWindowHandle()` method returns the unique ID of the current browser window.

Example:

`String parent = driver.getWindowHandle();`

### 2. getWindowHandles()

The `getWindowHandles()` method returns the IDs of all currently opened browser windows.

It returns a `Set<String>` because each window has a unique ID.

Example:

`Set<String> windows = driver.getWindowHandles();`

### 3. switchTo().window()

The `switchTo().window()` method is used to switch from one browser window to another.

Example:

`driver.switchTo().window(parent);`

### 4. quit()

The `quit()` method closes all browser windows opened by the WebDriver session.

## Practical

Created a Java program named `WindowHandlingDemo.java` to practice handling multiple browser windows.

### Program Flow

1. Open Chrome browser.
2. Navigate to the website `https://the-internet.herokuapp.com/windows`.
3. Get the parent window ID using `getWindowHandle()`.
4. Click the **Click Here** link to open a child window.
5. Get all window IDs using `getWindowHandles()`.
6. Use a for-each loop to identify the child window.
7. Switch to the child window using `switchTo().window()`.
8. Print the child window title.
9. Switch back to the parent window.
10. Print the parent window title.
11. Close all browser windows using `quit()`.

## What I Learned

- Understood what window handling means in Selenium.
- Learned the difference between `getWindowHandle()` and `getWindowHandles()`.
- Learned how to get the unique ID of the parent window.
- Understood how to store multiple window IDs using `Set<String>`.
- Practiced switching from the parent window to the child window.
- Learned how to switch back to the parent window.
- Understood how to identify a child window using a for-each loop.
- Learned how to get the title of the currently active browser window.
- Understood the use of `quit()` to close all browser windows.

## Outcome

Gained practical knowledge of handling multiple browser windows and switching between parent and child windows using Selenium WebDriver.

## Coming Next

- Handling multiple browser tabs.
- Working with alerts in Selenium.
- More browser handling methods.
