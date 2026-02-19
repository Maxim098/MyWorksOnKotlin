package StringTasks

import kotlin.text.Regex

fun main() {
    val emailRegex = Regex("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\$")
    print(emailRegex.matches("GribanovMA22@st.ithub.ru"))
}