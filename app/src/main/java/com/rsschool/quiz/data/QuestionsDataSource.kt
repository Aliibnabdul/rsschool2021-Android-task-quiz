package com.rsschool.quiz.data

import com.rsschool.quiz.models.Question

class QuestionsDataSource {
    fun getQuestions(): List<Question> {
        return listOf(
            Question(
                1,
                "Какое расширение имеет файл Android приложения?",
                mapOf(0 to ".zip", 1 to ".jar", 2 to ".apk", 3 to ".exe", 4 to ".gradle"),
                2,
                null
            ),
            Question(
                2,
                "Какое утверждение о git fetch или/и git pull ложно?",
                mapOf(
                    0 to "git pull выполняет git fetch, а затем - git merge",
                    1 to "git pull позволяет залить изменения из локальной ветки (local), на удаленную (remote)",
                    2 to "git fetch получает изменения изменения с удаленных веток, не сливая изменения с текущей локальной веткой",
                    3 to "Утверждения 1, 2 и 3 верны",
                    4 to "Утверждения 1, 2 и 3 ложны"
                ),
                1,
                null
            ),
            Question(
                3,
                "Если в Kotlin для приведения типов мы используем оператор \"as?\" и тип не удается привести, то:",
                mapOf(
                    0 to "Компилятор вернет null",
                    1 to "Компилятор вернет platform type",
                    2 to "Компилятор кинет ClassCastException",
                    3 to "Компилятор кинет kotlin.TypeCastException",
                    4 to "Компилятор вернет тип Any?"
                ),
                0,
                null
            ),
            Question(
                4,
                "Коллекции хранят:",
                mapOf(
                    0 to "Объекты указанного типа",
                    1 to "Примитивные типы",
                    2 to "Данные типа String",
                    3 to "Данные типа Collection",
                    4 to "Данные типа Iterable"
                ),
                0,
                null
            ),
            Question(
                5,
                "Какой интерфейс гарантирует отсутствие дубликатов и доступ к элементам в натуральном порядке?",
                mapOf(
                    0 to "List",
                    1 to "Set",
                    2 to "Deque",
                    3 to "Map",
                    4 to "Queue"
                ),
                1,
                null
            )
        )
    }
}