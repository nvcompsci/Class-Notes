# Unit 1 - Statements & Variables
## Statements
- **statement** – a complete line of code that performs a certain task
- Most lines in a code file are statements.
- Statements typically call functions or change variables.
- Code runs from top to bottom, so the order the statements are in makes a difference.
```js
function draw() {
    background(220)
    fill(“green”)
    circle(100,150,50)

    let score = 0
    score += 1
}
```
## Variables
- **variable** – element in the code that stores information
- **value** – the information that is stored in a variable
- Variables are given a name when they are created and are referred to by that name.
- The value of a variable usually gets changed according to the code. However, sometimes variables are just used to label a value.
- let creates a variable
## Data types
- Variables can store values such as…
- **number** – values that can be used mathematically
- **string** – text; a series of characters such as words, names, sentences, paragraphs, etc.
- **object** – groups together several different values that relate to one another
- **array** – list or group of many values that are similar but distinct
