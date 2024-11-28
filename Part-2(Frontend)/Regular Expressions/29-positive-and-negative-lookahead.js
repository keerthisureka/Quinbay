let sampleWord = "astronaut";
let pwRegex = /(?=\w{6})(?=\w*\d{2})/; // Change this line
// First positive lookahead checks the length and the second one checks for 2 consecutive digits
let result = pwRegex.test(sampleWord);