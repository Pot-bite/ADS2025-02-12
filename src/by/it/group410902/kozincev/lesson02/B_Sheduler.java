package by.it.group410902.kozincev.lesson02;

import java.util.ArrayList;
import java.util.List;
/*
Даны интервальные события events
реализуйте метод calcStartTimes, так, чтобы число принятых к выполнению
непересекающихся событий было максимально.
Алгоритм жадный. Для реализации обдумайте надежный шаг.
*/

public class B_Sheduler {
    public static void main(String[] args) {
        B_Sheduler instance = new B_Sheduler();
        Event[] events = {new Event(0, 3), new Event(0, 1), new Event(1, 2), new Event(3, 5),
                new Event(1, 3), new Event(1, 3), new Event(1, 3), new Event(3, 6),
                new Event(2, 7), new Event(2, 3), new Event(2, 7), new Event(7, 9),
                new Event(3, 5), new Event(2, 4), new Event(2, 3), new Event(3, 7),
                new Event(4, 5), new Event(6, 7), new Event(6, 9), new Event(7, 9),
                new Event(8, 9), new Event(4, 6), new Event(8, 10), new Event(7, 10)
        };

        List<Event> starts = instance.calcStartTimes(events, 0, 10);  //рассчитаем оптимальное заполнение аудитории
        System.out.println(starts);                                 //покажем рассчитанный график занятий
    }

    private static void sortEvents(Event[] evs){
        //Не самая лучшая сортировка конечно
        int m;
        Event temp;
        for(int i = 0; i < evs.length; i++){
            m = i;
            for(int j = i; j < evs.length; j++){
                if(evs[j].start < evs[m].start || (evs[j].start == evs[m].start && evs[j].stop < evs[m].stop)){
                    m = j;
                }
            }
            temp = evs[i];
            evs[i] = evs[m];
            evs[m] = temp;
        }

    }

    List<Event> calcStartTimes(Event[] evs, int from, int to) {
        //Events - события которые нужно распределить в аудитории
        //в период [from, int] (включительно).
        //оптимизация проводится по наибольшему числу непересекающихся событий.
        //Начало и конец событий могут совпадать.

        System.out.println("\n\n__________\n");
        List<Event> result;
        result = new ArrayList<>();
        //ваше решение.

        sortEvents(evs);
        result.add(evs[0]);
        int currentStart = evs[0].stop;

        for(Event e: evs){
            if(currentStart <= e.start){
                result.add(e);
                currentStart = e.stop;
            }
        }

        for(Event e: result){
            System.out.println(e);
        }


        return result;          //вернем итог
    }

    //событие у аудитории(два поля: начало и конец)
    static class Event {
        int start;
        int stop;

        Event(int start, int stop) {
            this.start = start;
            this.stop = stop;
        }

        @Override
        public String toString() {
            return "(" + start + ":" + stop + ")";
        }
    }
}