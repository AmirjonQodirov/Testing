# Лабораторная работа №4 <br> &laquo;Тестирование программного обеспечения&raquo;

### Задание

С помощью программного пакета [Apache JMeter](http://jmeter.apache.org/) провести нагрузочное и стресс-тестирование веб-приложения в соответствии с вариантом задания.

В ходе нагрузочного тестирования необходимо протестировать 3 конфигурации аппаратного обеспечения и выбрать среди них наиболее дешёвую, удовлетворяющую требованиям по максимальному времени отклика приложения при заданной нагрузке (в соответствии с вариантом).

В ходе стресс-тестирования необходимо определить, при какой нагрузке выбранная на предыдущем шаге конфигурация перестаёт удовлетворять требованиями по максимальному времени отклика. Для этого необходимо построить график зависимости времени отклика приложения от нагрузки.

**Параметры тестируемого веб-приложения:**

- URL первой конфигурации ($ 2700) - http://aqua:8080?token=467439066&user=1964658736&conf=1;
- URL второй конфигурации ($ 2800) - http://aqua:8080?token=467439066&user=1964658736&conf=2;
- URL третьей конфигурации ($ 4800) - http://aqua:8080?token=467439066&user=1964658736&conf=3;
- Максимальное количество параллельных пользователей - 14;
- Средняя нагрузка, формируемая одним пользователем - 20 запр. в мин.;
- Максимально допустимое время обработки запроса - 710 мс.

### Описание конфигурации JMeter для нагрузочного тестирования.

План теста:

![](https://github.com/AmirjonQodirov/Testing/blob/main/Lab4/screenshots/test_plan.png)

Описание количества пользователей

![](https://github.com/AmirjonQodirov/Testing/blob/main/Lab4/screenshots/user.png)

Параметры HTTP-запроса

![](https://github.com/AmirjonQodirov/Testing/blob/main/Lab4/screenshots/http1.PNG)
![](https://github.com/AmirjonQodirov/Testing/blob/main/Lab4/screenshots/http2.PNG)

**Графики пропускной способности приложения, полученные в ходе нагрузочного тестирования.**

- Конфигурация 1 ($2700):
  ![](https://github.com/AmirjonQodirov/Testing/blob/main/Lab4/screenshots/res1_1.PNG)
  ![](https://github.com/AmirjonQodirov/Testing/blob/main/Lab4/screenshots/res1_2.PNG)

- Конфигурация 2 ($2800):
  ![](https://github.com/AmirjonQodirov/Testing/blob/main/Lab4/screenshots/res2_1.PNG)
  ![](https://github.com/AmirjonQodirov/Testing/blob/main/Lab4/screenshots/res2_2.PNG)

- Конфигурация 3 ($4800):
  ![](https://github.com/AmirjonQodirov/Testing/blob/main/Lab4/screenshots/res3_2.PNG)

**Выводы по выбранной конфигурации аппаратного обеспечения.**
   
   Была выбрана вторая конфигурация.

   Исходя из результатов можно понять, что вторая конфигурация самая оптимальная.
   | № конфигурации  | Процент ошибки(макс время обработки запроса < 710ms) | Цена |
   | --------------- | ---------------------------------------------------- | ---- |
   | 1               |                        94.29%                        | 2700$ |
   | 2               |                         5.71%                        | 2800$ |
   | 3               |                         7.14%                        | 4800$ |) 
   

### Описание конфигурации JMeter для стресс-тестирования.

План теста:

![](https://github.com/AmirjonQodirov/Testing/blob/main/Lab4/screenshots/stress_test_plan.PNG)

**Примеры конфигурации при которых тест не проходит.**

- Конфигурация 1 ($2700): 

  ![](https://github.com/AmirjonQodirov/Testing/blob/main/Lab4/screenshots/stress_res1.PNG)

- Конфигурация 2 ($2800):

  ![](https://github.com/AmirjonQodirov/Testing/blob/main/Lab4/screenshots/stress_res2.PNG)

- Конфигурация 3 ($4800):

  ![](https://github.com/AmirjonQodirov/Testing/blob/main/Lab4/screenshots/stress_res3.PNG)
  
  
**Примеры конфигурации при которых тест проходит.**

- Конфигурация 2 ($2800):

  ![](https://github.com/AmirjonQodirov/Testing/blob/main/Lab4/screenshots/stress_res2_2.PNG)
  
- Конфигурация 3 ($4800):

  ![](https://github.com/AmirjonQodirov/Testing/blob/main/Lab4/screenshots/stress_res3_2.PNG)
  
  
### Вывод
Вторая конфигурация показала себя гораздо лучше, чем первая и третья, и в нагрузочном тестировании и в стресс тестировании. 
У первой конфигурации самый худший результат и время отклика и время обработки запроса выше чем у 1-й и 3-й
Разница цены между первой и второй составляет 100 долларов и оптимальным выбором является вторая конфигурация, она хоть и дороже но время отклика меньше.
