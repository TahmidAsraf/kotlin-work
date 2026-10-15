// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string


fun redact(
    document: String,
    text: String,
    replacement: Char = 'X'
): String { //changing text with chosen character
    return document.replace(text, replacement.toString().repeat(text.length)
    )
}
