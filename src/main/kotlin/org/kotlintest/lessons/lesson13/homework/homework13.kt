package org.example.org.kotlintest.lessons.lesson13.homework

fun main() {


//1.Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах.
// Определите среднее время выполнения теста.
    val testTime = mapOf<String, Double>("testAuthorization" to 25.23, "testPayment" to 27.10)
    val averageTime = testTime.values.average()
    println("Среднее время выполнения теста: $averageTime секунд")

//2. Имеется словарь с метаданными автоматизированных тестов, где ключи — это имена тестовых методов,
// а значения - строка с метаданными. Выведите список всех тестовых методов.
    val testMetaData: Map<String, String> = mapOf(
        "testLogin" to "[translate:метаданные теста логина]",
        "testPayment" to "[translate:метаданные теста оплаты]"
    )

    val testMethods = testMetaData.keys
    println("Тестовые методы: $testMethods")
//3.В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.

    val testResults: MutableMap<String, String> = mutableMapOf(
        "testLogin" to "passed",
        "testPayment" to "failed"
    )

    testResults["testLogout"] = "passed"
//4. Посчитайте количество успешных тестов в словаре с результатами (ключ - название,
// значение - результат из passed, failed, skipped).
    val passedCount = testResults.count { it.value == "passed" }
    println("Количество успешных тестов: $passedCount")

//5. Удалите из изменяемого словаря с баг-трекингом запись о баге, который
// был исправлен (ключ - название, значение - статус исправления).
    val bugTracking: MutableMap<String, String> = mutableMapOf(
        "bug123" to "fixed",
        "bug456" to "open"
    )

    println("Удалено: ${bugTracking.values.remove("fixed")}")
    println("${bugTracking}")


//6. Для словаря с результатами тестирования веб-страниц (ключ — URL страницы,
// значение — статус ответа), выведите сообщение о странице и статусе её проверки.
    val webPageResults: Map<String, String> = mapOf(
        "https://example.com" to "200 OK",
        "https://testsite.com" to "404 Not Found"
    )

    webPageResults.forEach {
        println("Страница ${it.key} имеет статус: ${it.value}")
    }

//7. Найдите в словаре с названием и временем ответа сервисов только те,
// время ответа которых превышает заданный порог.
    val serviceResponseTimes: Map<String, Int> = mapOf(
        "serviceA" to 120,
        "serviceB" to 250,
        "serviceC" to 250
    )

    val threshold = 150
    val slowServices = serviceResponseTimes.filter { it.value > threshold }
    println("Сервисы с временем ответа > $threshold: $slowServices")

//8. В словаре хранятся результаты тестирования API (ключ — endpoint,
// значение — статус ответа в виде строки). Для указанного endpoint найдите статус
// ответа, если endpoint отсутствует, предположите, что он не был протестирован.
    val apiTestResults: Map<String, String> = mapOf(
        "/api/login" to "200",
        "/api/logout" to "500"
    )

    val endpointToCheck = "/api/login"
    val apiStatus = apiTestResults[endpointToCheck] ?: "не тестировался"
    println("Статус для $endpointToCheck: $apiStatus")

//9. Из словаря, содержащего конфигурации тестового окружения (ключ — название
// параметра конфигурации, значение - сама конфигурация), получите значение для
// "browserType". Ответ не может быть null.
    val envConfig: Map<String, String> = mapOf(
        "browserType" to "Chrome",
        "timeout" to "30"
    )

    val browserType = envConfig.getOrDefault("browserType", "browserType не задан" )
    println("browserType: $browserType")

//10. Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, добавив новую версию.
    val softwareVersions: Map<String, String> = mapOf(
        "app" to "1.0.0",
        "library" to "2.4.5"
    )

    val updatedSoftwareVersions = softwareVersions.toMutableMap()
    updatedSoftwareVersions["newModule"] = "1.1.0"

//11. Используя словарь с настройками тестирования для различных мобильных устройств
// (ключ — модель устройства, значение - строка с настройками), получите настройки
// для конкретной модели или верните настройки по умолчанию.
    val mobileDeviceSettings: Map<String, String> = mapOf(
        "Pixel5" to "settings1",
        "iPhone15" to "settings2"
    )

    val deviceModel = "Pixel5"
    val defaultSettings = "defaultSettings"
    val settings = mobileDeviceSettings.getOrElse(deviceModel){ defaultSettings }
    println("Настройки для $deviceModel: $settings")

//12. Проверьте, содержит ли словарь с ошибками тестирования (ключ - код ошибки,
// значение - описание ошибки) определенный код ошибки.
    val testErrors: Map<String, String> = mapOf(
        "ERR001" to "Null pointer exception",
        "ERR002" to "Timeout error"
    )

    val errorCodeToFind = "ERR001"
    val hasError = testErrors.containsKey(errorCodeToFind)
    println("Ошибка $errorCodeToFind найдена: $hasError")

//13. Дан неизменяемый словарь, где ключи — это идентификаторы тестовых
// сценариев в формате "TestID_Version", а значения — статусы выполнения
// этих тестов ("Passed", "Failed", "Skipped"). Отфильтруйте словарь, оставив
// только те сценарии, идентификаторы которых соответствуют определённой версии
// тестов, то-есть в ключе содержится требуемая версия.
    val testScenarios: Map<String, String> = mapOf(
        "Test123_v1" to "Passed",
        "Test124_v2" to "Failed",
        "Test125_v1" to "Skipped"
    )

    val version = "v1"
    val filteredTests = testScenarios.filter { it.key.contains(version) }
    println("Тесты версии $version: $filteredTests")

//14. У вас есть словарь, где ключи — это названия функциональных модулей приложения,
// а значения — результаты их тестирования. Проверьте, есть ли модули с неудачным тестированием.
    val functionalModules: Map<String, String> = mapOf(
        "loginModule" to "passed",
        "paymentModule" to "failed"
    )

    val hasFailures = functionalModules.any { it.value == "failed" }
    println("Есть модули с неудачным тестированием: $hasFailures")
//15. Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.
    val testConfig: MutableMap<String, String> = mutableMapOf(
        "env" to "prod",
        "logLevel" to "debug",
        "timeout" to "30"
    )

    val otherSettings: Map<String, String> = mapOf(
        "retryCount" to "3"
    )

    testConfig.putAll(otherSettings)

//16. Объедините два неизменяемых словаря с данными о багах.
    val bugData1: Map<String, String> = mapOf("bug1" to "open")
    val bugData2: Map<String, String> = mapOf("bug2" to "fixed")

    val combinedBugData = bugData1 + bugData2


//17. Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.
    val tempData: MutableMap<String, String> = mutableMapOf("lastRun" to "2025-10-19")

    tempData.clear()

//18. Исключите из отчета по автоматизированному тестированию те случаи, где тесты были
// пропущены (имеют статус “skipped”). Ключи - название теста, значения - статус.
    val fullTestResults: MutableMap<String, String> = mutableMapOf(
        "test1" to "passed",
        "test2" to "skipped",
        "test3" to "failed"
    )

    val noSkippedTests = fullTestResults.filterValues { it != "skipped" }

//19. Создайте копию словаря с конфигурациями тестирования удалив из него несколько конфигураций.
    val cleanedConfig = testConfig.toMutableMap()
    cleanedConfig.remove("timeout")
    cleanedConfig.remove("logLevel")

//20. Создайте отчет о тестировании, преобразовав словарь с результатами тестирования
// (ключ — идентификатор теста, значение — результат) в список строк формата "Test ID: результат".
    val testResultsImmutable: Map<String, String> = mapOf(
        "testA" to "passed",
        "testB" to "failed"
    )

    val testReport = testResultsImmutable.map { "Test ${it.key}: ${it.value}" }
    println(testReport)
//21. Преобразуйте изменяемый словарь с результатами последнего тестирования в неизменяемый для архивации.
    val testLastResults: MutableMap<String, String> = mutableMapOf(
        "testLogin" to "passed",
        "testPayment" to "failed"
    )

    val immutableTestResults = testLastResults.toMap()
//22. Преобразуйте словарь, содержащий числовой ID теста и данные о времени выполнения тестов,
// заменив идентификаторы тестов на их строковый аналог (например через toString())
    val testRunTimes: MutableMap<Int, Int> = mutableMapOf(
        101 to 120,
        102 to 200
    )

    val stringKeyedTestRunTimes = testRunTimes.mapKeys { it.key.toString() }
//23. Для словаря с оценками производительности различных версий приложения (ключи - строковая
// версия, значения - дробное число времени ответа сервера) увеличьте каждую оценку на 10%,
// чтобы учесть новые условия тестирования.
    val performanceScores: MutableMap<String, Double> = mutableMapOf(
        "1.0" to 0.20,
        "2.0" to 0.25
    )

    val increasedScores = performanceScores.mapValues { it.value * 1.10 }

//24. Проверьте, пуст ли словарь с ошибками компиляции тестов.
    val compileErrors: Map<String, String> = mapOf()

    val isCompileErrorsEmpty = compileErrors.isEmpty()
    println("Словарь ошибок компиляции пуст: $isCompileErrorsEmpty")
//25. Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.
    val loadTestResults: Map<String, String> = mapOf(
        "load1" to "passed"
    )

    val isLoadTestNotEmpty = loadTestResults.isNotEmpty()
    println("Словарь нагрузочного тестирования не пуст: $isLoadTestNotEmpty")

//26. Проверьте, прошли ли успешно все автоматизированные тесты в словаре с результатами.
    val allPassed = testResults.all { it.value == "passed" }
    println("Все тесты прошли успешно: $allPassed")

//27. Определите, содержит ли словарь с результатами тестирования хотя бы один тест с ошибкой.
    val anyFailed = testResults.any { it.value == "failed" }
    println("Есть тесты с ошибкой: $anyFailed")

//28. Отфильтруйте словарь с результатами тестирования сервисов, оставив только те тесты,
// которые не прошли успешно и содержат в названии “optional”.
    val optionalFailures = testResults.filter { it.value != "passed" && it.key.contains("optional") }
    println("Неудачные optional тесты: $optionalFailures")

}