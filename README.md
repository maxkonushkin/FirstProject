# Проект по автоматизации тестирования для ["Ренессанс Банк"](https://rencredit.ru).
![Основная информация](media/screens/logo1.PNG)
## :pushpin: Содержание:

- <a href="#tools">Технологии и инструменты</a>
- <a href="#jenkins">Сборка в Jenkins</a>
- <a href="#allure">Пример Allure-отчета</a>
- <a href="#telegram">Уведомление в Telegram при помощи бота</a>

<a id="tools"></a>
## :computer: Использованный стек технологий

<p align="center">
<a href="https://www.jetbrains.com/idea/" target="_blank">
  <img width="6%" title="IntelliJ IDEA" src="media/logo/Intelij_IDEA.svg">
</a>
<a href="https://github.com" target="_blank">
  <img width="6%" title="GitHub" src="media/logo/GitHub.svg">
</a>
<a href="https://www.java.com" target="_blank">
  <img width="6%" title="Java" src="media/logo/Java.svg">
</a>
<a href="https://selenide.org" target="_blank">
    <img width="6%" title="Selenide" src="media/logo/Selenide.svg">
  </a>
<a href="https://gradle.org" target="_blank">
    <img width="6%" title="Gradle" src="media/logo/Gradle.svg">
  </a>
<a href="https://junit.org/junit5/" target="_blank">
    <img width="6%" title="JUnit5" src="media/logo/JUnit5.svg">
  </a>  
<a href="https://aerokube.com/selenoid/latest/" target="_blank">
<img width="6%" title="Selenoid" src="media/logo/Selenoid.svg">
</a>
<a href="https://jenkins.io" target="_blank">
    <img width="6%" title="Jenkins" src="media/logo/Jenkins.svg">
  </a>
<a href="https://allurereport.org/" target="_blank">
    <img width="6%" title="Allure Report" src="media/logo/Allure_Report.svg">
  </a>
<a href="https://telegram.org" target="_blank">
    <img width="6%" title="Telegram" src="media/logo/Telegram.svg">
  </a>
  <a href="https://qameta.io/allure-testops/" target="_blank">
    <img width="5%" title="Allure TestOps" src="media/logo/AllureTestOps.svg">
  </a>
<a href="https://www.atlassian.com/ru/software/jira" target="_blank">
<img width="5%" title="Jira" src="media/logo/Jira.svg">
</a>
</p>

- В данном проекте автотесты написаны на языке <code>Java</code> с использованием фреймворка для тестирования Selenide.
- В качестве сборщика был использован - <code>Gradle</code>.
- Использованы фреймворки <code>JUnit 5</code> и [Selenide](https://selenide.org/).
- При прогоне тестов браузер запускается в [Selenoid](https://aerokube.com/selenoid/).
- Для удаленного запуска реализована джоба в <code>Jenkins</code> с формированием Allure-отчета и отправкой результатов в <code>Telegram</code> при помощи бота.

### Реализована следующая схема взаимодействия технологий и инструментов

``` mermaid
flowchart LR;
A(local launch)-->B(Allure_Report);
    A(Jenkins)-->B(GitHub);
    B-->C(Jenkins);
    C-->D(Telegram);
    C<==>E(Selenoid);
    
    C-->G(Allure_Report);
    
    C<==>F(Allure_TestOps);
    F-->J(Jira);

```

<a id="jenkins"></a>
## <img src="media/logo/Jenkins.svg" title="Jenkins" width="4%"/> Сборка в [Jenkins](https://jenkins.autotests.cloud/view/java_students/job/C39_mkonushkin_RenProject/).
<p align="center">
<img title="Jenkins Build" src="media/screens/Jenkins.PNG">
</p>

<a id="allure"></a>
## <img src="media/logo/Allure_Report.svg" title="Allure Report" width="4%"/> Пример [Allure-отчета](https://allurereport.org)
### Overview

<p align="center">
<img title="Allure Overview" src="media/screens/Allure.PNG">
</p>

### Результат выполнения теста

<p align="center">
<img title="Test Results in Alure" src="media/screens/Result.PNG">
</p>

## <img src="media/logo/AllureTestOps.svg" title="Allure TestOps" width="4%"/> Интеграция с [Allure TestOps](https://allure.autotests.cloud)

Выполнена интеграция сборки <code>Jenkins</code> с <code>Allure TestOps</code>.
Результат выполнения автотестов отображается в <code>Allure TestOps</code>
На Dashboard в <code>Allure TestOps</code> отображена статистика пройденных тестов.

<p align="center">
<img title="Allure TestOps DashBoard" src="media/screens/TestOps.PNG">
</p>

## <img src="media/logo/Jira.svg" title="Jira" width="4%"/> Интеграция с [Jira](https://jira.autotests.cloud)

Реализована интеграция <code>Allure TestOps</code> с <code>Jira</code>, в тикете отображается информация, какие тест-кейсы были написаны в рамках задачи и результат их прогона.

<p align="center">
<img title="Jira Task" src="media/screens/Jira.PNG">
</p>

<a id="telegram"></a>
## <img width="4%" style="vertical-align:middle" title="Telegram" src="media/logo/Telegram.svg"> Уведомления в Telegram с использованием бота

После завершения сборки, бот созданный в <code>Telegram</code>, автоматически обрабатывает и отправляет сообщение с результатом.

<p align="center">
<img width="70%" title="Telegram Notifications" src="media/screens/Telegram.PNG">
</p>


