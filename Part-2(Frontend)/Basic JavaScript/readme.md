### Learnings

JavaScript is a scripting language you can use to make web pages interactive. It is one of the core technologies of the web, along with HTML and CSS, and is supported by all modern browsers.

#### [Comment Your JavaScript Code](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/001-comment-your-javascript-code.js)
- There are two ways to write comments in JavaScript:
    1. Using // will tell JavaScript to ignore the remainder of the text on the current line. This is an in-line comment.
    2. You can make a multi-line comment beginning with /* and ending with */.
-  As you write code, you should regularly add comments to clarify the function of parts of your code. Good commenting can help communicate the intent of your code—both for others and for your future self.

#### [Declare JavaScript Variables](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/002-declare-javascript-variables.js)
- JavaScript provides eight different data types which are undefined, null, boolean, string, symbol, bigint, number, and object.
- Variables allow computers to store and manipulate data in a dynamic fashion. They do this by using a "label" to point to the data rather than using the data itself. Any of the eight data types may be stored in a variable.
- In JavaScript we end statements with semicolons.
- Variable names can be made up of numbers, letters, and $ or _, but may not contain spaces or start with a number.

#### [Storing Values with the Assignment Operator](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/003-storing-values-with-the-assignment-operator.js)
- In JavaScript, you can store a value in a variable with the assignment operator (=).
- If there are any calculations to the right of the = operator, those are performed before the value is assigned to the variable on the left of the operator.

#### [Assigning the Value of One Variable to Another](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/004-assigning-the-value-of-one-variable-to-another.js)
- After a value is assigned to a variable using the assignment operator, you can assign the value of that variable to another variable using the assignment operator.

#### [Initializing Variables with the Assignment Operator](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/005-initializing-variables-with-the-assignment-operator.js)
- It is common to initialize a variable to an initial value in the same line as it is declared.

#### [Declare String Variables](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/006-declare-string-variables.js)
- "your name" is called a string literal. A string literal, or string, is a series of zero or more characters enclosed in single or double quotes.

#### [Understanding Uninitialized Variables](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/007-understanding-uninitialized-variables.js)
- When JavaScript variables are declared, they have an initial value of undefined. If you do a mathematical operation on an undefined variable your result will be NaN which means "Not a Number". If you concatenate a string with an undefined variable, you will get a string of undefined.

#### [Understanding Case Sensitivity in Variables](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/008-understanding-case-sensitivity-in-variables.js)
- MYVAR is not the same as MyVar nor myvar.
- Best Practice: Write variable names in JavaScript in camelCase. In camelCase, multi-word variable names have the first word in lowercase and the first letter of each subsequent word is capitalized.

#### [Explore Differences Between the var and let Keywords](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/009-explore-differences-between-the-var-and-let-keywords.js)
- One of the biggest problems with declaring variables with the var keyword is that you can easily overwrite variable declarations:
    ```
    var camper = "James";
    var camper = "David";
    console.log(camper);
    ```
- A keyword called `let` was introduced in ES6, a major update to JavaScript, to solve this potential issue with the var keyword.

#### [Declare a Read-Only Variable with the const Keyword](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/010-declare-a-read-only-variable-with-the-const-keyword.js)
- The keyword `let` is not the only new way to declare variables. In ES6, you can also declare variables using the `const` keyword.
- `const` has all the awesome features that `let` has, with the added bonus that variables declared using const are read-only. They are a constant value, which means that once a variable is assigned with const, it cannot be reassigned.

#### [Add Two Numbers with JavaScript](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/011-add-two-numbers-with-javascript.js)
- Number is a data type in JavaScript which represents numeric data.
- JavaScript uses the `+` symbol as an addition operator when placed between two numbers.

#### [Subtract One Number from Another with JavaScript](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/012-subtract-one-number-from-another-with-javascript.js)
- JavaScript uses the `-` symbol for subtraction.

#### [Multiply Two Numbers with JavaScript](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/013-multiply-two-numbers-with-javascript.js)
- JavaScript uses the `*` symbol for multiplication of two numbers.

#### [Divide One Number by Another with JavaScript](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/014-divide-one-number-by-another-with-javascript.js)
- JavaScript uses the `/` symbol for division.

#### [Increment a Number with JavaScript](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/015-increment-a-number-with-javascript.js)
- You can easily increment or add one to a variable with the ++ operator.
- `i++;` is the equivalent of `i = i + 1;`

#### [Decrement a Number with JavaScript](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/016-decrement-a-number-with-javascript.js)
- You can easily decrement or decrease a variable by one with the -- operator.
- `i--;` is the equivalent of `i = i - 1;`

#### [Create Decimal Numbers with JavaScript](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/017-create-decimal-numbers-with-javascript.js)
- We can store decimal numbers in variables too. Decimal numbers are sometimes referred to as floating point numbers or floats.

#### [Multiply Two Decimals with JavaScript](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/018-multiply-two-decimals-with-javascript.js)
- In JavaScript, you can also perform calculations with decimal numbers, just like whole numbers.
- Multiply two decimal numbers.

#### [Divide One Decimal by Another with JavaScript](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/019-divide-one-decimal-by-another-with-javascript.js)
- Divide one decimal by another.

#### [Finding a Remainder in JavaScript](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/020-finding-a-remainder-in-javascript.js)
- The remainder operator `%` gives the remainder of the division of two numbers.
- In mathematics, a number can be checked to be even or odd by checking the remainder of the division of the number by 2. Even numbers have a remainder of 0, while odd numbers a remainder of 1.
- <b>Note:</b> The remainder operator is sometimes incorrectly referred to as the modulus operator. It is very similar to modulus, but does not work properly with negative numbers.

#### [Compound Assignment With Augmented Addition](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/021-compound-assignment-with-augmented-addition.js)
- `myVar = myVar + 5;` to add 5 to myVar. Since this is such a common pattern, there are operators which do both a mathematical operation and assignment in one step.
- One such operator is the `+=` operator.

#### [Compound Assignment With Augmented Subtraction](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/022-compound-assignment-with-augmented-subtraction.js)
- Like the `+=` operator, `-=` subtracts a number from a variable.
- `myVar = myVar - 5;` will subtract 5 from myVar. This can be rewritten as: `myVar -= 5;`

#### [Compound Assignment With Augmented Multiplication](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/023-compound-assignment-with-augmented-multiplication.js)
- The `*=` operator multiplies a variable by a number.

#### [Compound Assignment With Augmented Division](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/024-compound-assignment-with-augmented-division.js)
- The `/=` operator divides a variable by another number.

#### [Escaping Literal Quotes in Strings](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/025-escaping-literal-quotes-in-strings.js)
- When you are defining a string you must start and end with a single or double quote. What happens when you need a literal quote: `"` or `'` inside of your string?
- In JavaScript, you can escape a quote from considering it as an end of string quote by placing a backslash (`\`) in front of the quote.

#### [Quoting Strings with Single Quotes](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/026-quoting-strings-with-single-quotes.js)
- String values in JavaScript may be written with single or double quotes, as long as you start and end with the same type of quote. Unlike some other programming languages, single and double quotes work the same in JavaScript.

#### [Escape Sequences in Strings](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/027-escape-sequences-in-strings.js)
- Quotes are not the only characters that can be escaped inside a string. Escape sequences allow you to use characters you may not otherwise be able to use in a string.
    |   Code  |   Output    |
    | :----:  |   :-----:    |
    |   \'    |	single quote |
    |   \"	  | double quote |
    |   \\	  |  backslash   |
    |   \n	  |   newline    |
    |   \t	  |     tab      |
    |   \r	  | carriage return |
    |   \b	  |   backspace  |
    |   \f	  |   form feed  |
- Note that the backslash itself must be escaped in order to display as a backslash.

#### [Concatenating Strings with Plus Operator](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/028-concatenating-strings-with-plus-operator.js)
- In JavaScript, when the `+` operator is used with a String value, it is called the concatenation operator. You can build a new string out of other strings by concatenating them together.
- <b>Note:</b> Watch out for spaces. Concatenation does not add spaces between concatenated strings, so you'll need to add them yourself.

#### [Concatenating Strings with the Plus Equals Operator](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/029-concatenating-strings-with-the-plus-equals-operator.js)
- We can also use the `+=` operator to concatenate a string onto the end of an existing string variable. This can be very helpful to break a long string over several lines.

#### [Constructing Strings with Variables](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/030-constructing-strings-with-variables.js)
- By using the concatenation operator (`+`), you can insert one or more variables into a string you're building.

#### [Appending Variables to Strings](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/031-appending-variables-to-strings.js)
- Just as we can build a string over multiple lines out of string literals, we can also append variables to a string using the plus equals (`+=`) operator.

#### [Find the Length of a String](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/032-find-the-length-of-a-string.js)
- You can find the length of a String value by writing `.length` after the string variable or string literal.

#### [Use Bracket Notation to Find the First Character in a String](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/033-use-bracket-notation-to-find-the-first-character-in-a-string.js)
- Bracket notation is a way to get a character at a specific index within a string.
- Most modern programming languages, like JavaScript, don't start counting at 1 like humans do. They start at 0. This is referred to as Zero-based indexing.
- For example, the character at index 0 in the word `Charles` is `C`. So if `const firstName = "Charles"`, you can get the value of the first letter of the string by using `firstName[0]`.

#### [Understand String Immutability](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/034-understand-string-immutability.js)
- In JavaScript, String values are immutable, which means that they cannot be altered once created.
- Note that this does not mean that string could not be re-assigned. The only way to change the string would be to re-assign it with a new value.

#### [Use Bracket Notation to Find the Nth Character in a String](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/035-use-bracket-notation-to-find-the-nth-character-in-a-string.js)
- You can also use bracket notation to get the character at other positions within a string.
- Remember that computers start counting at 0, so the first character is actually the zeroth character.

#### [Use Bracket Notation to Find the Last Character in a String](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/036-use-bracket-notation-to-find-the-last-character-in-a-string.js)
- In order to get the last letter of a string, you can subtract one from the string's length.

#### [Use Bracket Notation to Find the Nth-to-Last Character in a String](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/037-use-bracket-notation-to-find-the-nth-to-last-character-in-a-string.js)
- You can use the same principle we just used to retrieve the last character in a string to retrieve the Nth-to-last character.
- For example, you can get the value of the third-to-last letter of the `const firstName = "Augusta"` string by using `firstName[firstName.length - 3]`.

#### [Word Blanks](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/038-word-blanks.js)
- You are provided sentences with some missing words, like nouns, verbs, adjectives and adverbs. You then fill in the missing pieces with words of your choice in a way that the completed sentence makes sense.

#### [Store Multiple Values in one Variable using JavaScript Arrays](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/039-store-multiple-values-in-one-variable-using-javascript-arrays.js)
- With JavaScript array variables, we can store several pieces of data in one place.
- You start an array declaration with an opening square bracket, end it with a closing square bracket, and put a comma between each entry, like this: `const sandwich = ["peanut butter", "jelly", "bread"];`

#### [Nest one Array within Another Array](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/040-nest-one-array-within-another-array.js)
- You can also nest arrays within other arrays, like below: `const teams = [["Bulls", 23], ["White Sox", 45]];`
- This is also called a multi-dimensional array.

#### [Access Array Data with Indexes](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/041-access-array-data-with-indexes.js)
- We can access the data inside arrays using indexes.
- Array indexes are written in the same bracket notation that strings use, except that instead of specifying a character, they are specifying an entry in the array. Like strings, arrays use zero-based indexing, so the first element in an array has an index of `0`.

#### [Modify Array Data With Indexes](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/042-modify-array-data-with-indexes.js)
- Unlike strings, the entries of arrays are mutable and can be changed freely, even if the array was declared with `const`.
- <b>Note:</b> There shouldn't be any spaces between the array name and the square brackets, like array [0]. Although JavaScript is able to process this correctly, this may confuse other programmers reading your code.

#### [Access Multi-Dimensional Arrays With Indexes](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/043-access-multi-dimensional-arrays-with-indexes.js)
- One way to think of a multi-dimensional array, is as an array of arrays. When you use brackets to access your array, the first set of brackets refers to the entries in the outermost (the first level) array, and each additional pair of brackets refers to the next level of entries inside.

#### [Manipulate Arrays With push Method](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/044-manipulate-arrays-with-push.js)
- An easy way to append data to the end of an array is via the `push()` method.
- The `push()` method takes one or more arguments and appends them to the end of the array, in the order in which they appear. It returns the new length of the array.

#### [Manipulate Arrays With pop Method](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/045-manipulate-arrays-with-pop.js)
- Another way to change the data in an array is with the `.pop()` function.
- `.pop()` is used to pop a value off of the end of an array. We can store this popped off value by assigning it to a variable. In other words, `.pop()` removes the last element from an array and returns that element.
- Any type of entry can be popped off of an array - numbers, strings, even nested arrays.

#### [Manipulate Arrays With shift Method](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/046-manipulate-arrays-with-shift.js)
- `pop()` always removes the last element of an array. What if you want to remove the first?
- That's where `.shift()` comes in. It works just like `.pop()`, except it removes the first element instead of the last.

#### [Manipulate Arrays With unshift Method](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/047-manipulate-arrays-with-unshift.js)
- Not only can you shift elements off of the beginning of an array, you can also unshift elements to the beginning of an array i.e. add elements in front of the array.
- `.unshift()` works exactly like `.push()`, but instead of adding the element at the end of the array, `unshift()` adds the element at the beginning of the array.

#### [Shopping List](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/048-shopping-list.js)
- Create a shopping list in the variable `myList`. The list should be a multi-dimensional array containing several sub-arrays.
- The first element in each sub-array should contain a string with the name of the item. The second element should be a number representing the quantity

#### [Write Reusable JavaScript with Functions](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/049-write-reusable-javascript-with-functions.js)
- In JavaScript, we can divide up our code into reusable parts called functions.
- You can call or invoke this function by using its name followed by parentheses, like this: `functionName();`.
- All of the code between the curly braces will be executed every time the function is called.

#### [Passing Values to Functions with Arguments](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/050-passing-values-to-functions-with-arguments.js)
- Parameters are variables that act as placeholders for the values that are to be input to a function when it is called.
- When a function is defined, it is typically defined along with one or more parameters. The actual values that are input (or "passed") into a function when it is called are known as arguments.

#### [Return a Value from a Function with Return](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/051-return-a-value-from-a-function-with-return.js)
- We can pass values into a function with arguments. You can use a `return` statement to send a value back out of a function.

#### [Global Scope and Functions](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/052-global-scope-and-functions.js)
- In JavaScript, scope refers to the visibility of variables. Variables which are defined outside of a function block have Global scope. This means, they can be seen everywhere in your JavaScript code.
- Variables which are declared without the `let` or `const` keywords are automatically created in the `global` scope. This can create unintended consequences elsewhere in your code or when running a function again. You should always declare your variables with `let` or `const`.

#### [Local Scope and Functions](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/053-local-scope-and-functions.js)
- Variables which are declared within a function, as well as the function parameters, have local scope. That means they are only visible within that function.

#### [Global vs. Local Scope in Functions](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/054-global-vs--local-scope-in-functions.js)
- It is possible to have both local and global variables with the same name. When you do this, the local variable takes precedence over the global variable.

#### [Understanding Undefined Value returned from a Function](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/055-understanding-undefined-value-returned-from-a-function.js)
- A function can include the `return` statement but it does not have to. In the case that the function doesn't have a `return` statement, when you call it, the function processes the inner code but the returned value is `undefined`.

#### [Assignment with a Returned Value](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/056-assignment-with-a-returned-value.js)
- If you'll recall from our discussion about [Storing Values with the Assignment Operator](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/003-storing-values-with-the-assignment-operator.js), everything to the right of the equal sign is resolved before the value is assigned. This means we can take the return value of a function and assign it to a variable.

#### [Stand in Line](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/057-stand-in-line.js)
- In Computer Science a `queue` is an abstract Data Structure where items are kept in order. New items can be added at the back of the queue and old items are taken off from the front of the queue.

#### [Understanding Boolean Values](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/058-understanding-boolean-values.js)
- Another data type is the Boolean. Booleans may only be one of two values: `true` or `false`. They are basically little on-off switches, where `true` is on and `false` is off. These two states are mutually exclusive.
- <b>Note:</b> Boolean values are never written with quotes. The strings `"true"` and `"false"` are not Boolean and have no special meaning in JavaScript.

#### [Use Conditional Logic with If Statements](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/059-use-conditional-logic-with-if-statements.js)
- `if` statements are used to make decisions in code. The keyword `if` tells JavaScript to execute the code in the curly braces under certain conditions, defined in the parentheses. These conditions are known as `Boolean` conditions and they may only be `true` or `false`.
- When the condition evaluates to `true`, the program executes the statement inside the curly braces. When the Boolean condition evaluates to `false`, the statement inside the curly braces will not execute.

#### [Comparison with the Equality Operator](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/060-comparison-with-the-equality-operator.js)
- There are many comparison operators in JavaScript. All of these operators return a boolean `true` or `false` value.
- The most basic operator is the equality operator `==`. The equality operator compares two values and returns `true` if they're equivalent or `false` if they are not. Note that equality is different from assignment (`=`), which assigns the value on the right of the operator to a variable on the left.

#### [Comparison with the Strict Equality Operator](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/061-comparison-with-the-strict-equality-operator.js)
- Strict equality (`===`) is the counterpart to the equality operator (`==`). However, unlike the equality operator, which attempts to convert both values being compared to a common type, the strict equality operator does not perform a type conversion.
- If the values being compared have different types, they are considered unequal, and the strict equality operator will return false.

#### [Practice comparing different values](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/062-practice-comparing-different-values.js)
- If the values being compared are not of the same type, the equality operator will perform a type conversion, and then evaluate the values. However, the strict equality operator will compare both the data type and value as-is, without converting one type to the other.
- <b>Note:</b> In JavaScript, you can determine the type of a variable or a value with the `typeof` operator.

#### [Comparison with the Inequality Operator](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/063-comparison-with-the-inequality-operator.js)
- The inequality operator (`!=`) is the opposite of the equality operator. Inequality means not equal. The inequality operator returns `false` when the equality operator would return `true` and vice versa. Like the equality operator, the inequality operator will convert data types of values while comparing.

#### [Comparison with the Strict Inequality Operator](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/064-comparison-with-the-strict-inequality-operator.js)
- The strict inequality operator (`!==`) is the logical opposite of the strict equality operator. It means "Strictly Not Equal" and returns `false` where strict equality would return `true` and vice versa. The strict inequality operator will not convert data types.

#### [Comparison with the Greater Than Operator](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/065-comparison-with-the-greater-than-operator.js)
- The greater than operator (`>`) compares the values of two numbers. If the number to the left is greater than the number to the right, it returns `true`. Otherwise, it returns `false`.
- Like the equality operator, the greater than operator will convert data types of values while comparing.

#### [Comparison with the Greater Than Or Equal To Operator](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/066-comparison-with-the-greater-than-or-equal-to-operator.js)
- The greater than or equal to operator (`>=`) compares the values of two numbers. If the number to the left is greater than or equal to the number to the right, it returns `true`. Otherwise, it returns `false`.
- Like the equality operator, the greater than or equal to operator will convert data types while comparing.

#### [Comparison with the Less Than Operator](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/067-comparison-with-the-less-than-operator.js)
- The less than operator (`<`) compares the values of two numbers. If the number to the left is less than the number to the right, it returns `true`. Otherwise, it returns `false`. Like the equality operator, the less than operator converts data types while comparing.

#### [Comparison with the Less Than Or Equal To Operator](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/068-comparison-with-the-less-than-or-equal-to-operator.js)
- The less than or equal to operator (`<=`) compares the values of two numbers. If the number to the left is less than or equal to the number to the right, it returns `true`. If the number on the left is greater than the number on the right, it returns `false`. Like the equality operator, the less than or equal to operator converts data types.

#### [Comparisons with the Logical And Operator](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/069-comparisons-with-the-logical-and-operator.js)
- Sometimes you will need to test more than one thing at a time. The logical and operator (`&&`) returns true if and only if the operands to the left and right of it are `true`.
- The same effect could be achieved by nesting an `if` statement inside another `if`.

#### [Comparisons with the Logical Or Operator](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/070-comparisons-with-the-logical-or-operator.js)
- The logical or operator (`||`) returns true if either of the operands is `true`. Otherwise, it returns `false`.
- The logical or operator is composed of two pipe symbols: (`||`). This can typically be found between your Backspace and Enter keys

#### [Introducing Else Statements](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/071-introducing-else-statements.js)
- When a condition for an `if` statement is true, the block of code following it is executed. What about when that condition is false? Normally nothing would happen. With an `else` statement, an alternate block of code can be executed.

#### [Introducing Else If Statements](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/072-introducing-else-if-statements.js)
- If you have multiple conditions that need to be addressed, you can chain `if` statements together with `else if` statements.

#### [Logical Order in If Else Statements](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/)
- Order is important in `if`, `else if` statements.
- The function is executed from top to bottom so you will want to be careful of what statement comes first.

#### [Chaining If Else Statements](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/)
- `if/else` statements can be chained together for complex logic.

#### [Golf Code](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/)
- In the game of Golf, each hole has a `par`, meaning, the average number of `strokes` a golfer is expected to make in order to sink the ball in the hole to complete the play. Depending on how far above or below `par` your `strokes` are, there is a different nickname.
- Your function will be passed `par` and `strokes` arguments.

#### [Selecting from Many Options with Switch Statements](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/)
- If you need to match one value against many options, you can use a switch statement. A `switch` statement compares the value to the case statements which define various possible values. Any valid JavaScript statements can be executed inside a case block and will run from the first matched `case` value until a `break` is encountered.

#### [Adding a Default Option in Switch Statements](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/)
- In a `switch` statement you may not be able to specify all possible values as `case` statements. Instead, you can add the `default` statement which will be executed if no matching `case` statements are found. Think of it like the final `else` statement in an `if/else` chain.
- A `default` statement should be the last case.

#### [Multiple Identical Options in Switch Statements](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/)
- If the `break` statement is omitted from a `switch` statement's `case`, the following `case` statement(s) are executed until a `break` is encountered. If you have multiple inputs with the same output, you can represent them in a `switch` statement.

#### [Replacing If Else Chains with Switch](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/)
- If you have many options to choose from, a `switch` statement can be easier to write than many chained `if`/`else if` statements. 

#### [Returning Boolean Values from Functions](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/)
- You may recall from [Comparison with the Equality Operator](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/060-comparison-with-the-equality-operator.js) that all comparison operators return a boolean `true` or `false` value.

#### [](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/)
- 

#### [](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/)
- 

#### [](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/)
- 

#### [](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/)
- 

#### [](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/)
- 

#### [](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/)
- 

#### [](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/)
- 

#### [](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/)
- 

#### [](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/)
- 

#### [](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/)
- 

#### [](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/)
- 

#### [](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/)
- 

#### [](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/)
- 

#### [](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/)
- 

#### [](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/)
- 

#### [](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/)
- 

#### [](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/)
- 

#### [](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/)
- 

#### [](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/)
- 

#### [](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/)
- 

#### [](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/)
- 

#### [](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/)
- 

#### [](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/)
- 