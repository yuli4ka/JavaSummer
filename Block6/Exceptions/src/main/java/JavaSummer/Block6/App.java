package JavaSummer.Block6;

//public class App {
//
//  public static void main(String[] args) throws Throwable {
//    System.out.println("Hello World!");
//  }
//}

//public class App {
//
//  public static void main(String[] args){
//    try {
//
//    } catch (Throwable t) {
//
//    }
//  }
//}

//public class App {
//
//  public static void main(String[] args){
//    throw  new Error();
//  }
//}

//public class App {
//
//  public static void main(String[] args){
//    Error ref = new Error();
//    throw ref;
//  }
//}

////StackOverflowError
//public class App {
//
//  public static void main(String[] args){
//    f(null);
//  }
//
//  private static void f(NullPointerException e) {
//    try {
//      throw e;
//    } catch (NullPointerException npe) {
//      f(npe);
//    }
//  }
//}

////System.out - buffered-поток вывода, поэтому "sout" может
////вывестись как до сообщения об ошибке, так и после
////System.err сразу выводится в консоль (не имеет буфера)
//public class App {
//
//  public static void main(String[] args) {
//    System.out.println("sout");
//    throw new Error();
//  }
//}

//public class App {
//
//  public static void main(String[] args) {
//
//  }
//
//  public static double sqr(double arg) {
//    return arg * arg;
//  }
//
//  //неявное преобразование в double
//  public static double sqr2(double arg) {
//    int k = 1;
//    return k;
//  }
//
//  //то же в байт-коде, что и sqr2
//  public static double sqr3(double arg) {
//    int k = 1;
//    return (double) k;
//  }
//
////  //compilation error: incompatible types
////  public static double sqr4(double arg) {
////    return "hello";
////  }
//
////  //compilation error: missing return statement
////  public static double sqr5(double arg) {
////
////  }
//
////  //compilation error: missing return statement
////  public static double sqr6(double arg) {
////    if (System.currentTimeMillis() % 2 == 0) {
////      return arg * arg;
////    }
////  // ?
////  }
//}

//public class App {
//
//  public static void main(String[] args) {
//    double d = sqr(10.0); // ну, и чему равно d?
//    System.out.println(d);
//  }
//
//  private static double sqr(double v) {
//    //noting
//  }
//}

//public class App {
//
//  public static void main(String[] args) {
//    double d = sqr2(10.0); // sqr - навсегда "повиснет", и
//    System.out.println(d); // d - НИКОГДА НИЧЕГО НЕ БУДЕТ ПРИСВОЕН
//  }
//
////  private static double sqr(double y) { // error
////    // noting
////  }
//
//  private static double sqr2(double v) {
//    while (true) {
//      ; // Удивительно, но КОМПИЛИРУЕТСЯ! тут мы на века "повисли"
//    }
//  }
//
//  public static double sqr3(double arg) {
//    if (System.currentTimeMillis() % 2 == 0) {
//      return arg * arg; // ну ладно, вот твой double
//    } else {
//      while (true) {
//        ;     // а тут "виснем" навсегда
//      }
//    }
//  }
//
//  // механизм исключений позволяет НИЧЕГО НЕ ВОЗВРАЩАТЬ!
//  public static double sqr4(double arg) {
//    throw new RuntimeException();
//  }
//
//  // Итак, у нас есть ТРИ варианта для компилятора
//  public static double sqr(double arg) {// согласно объявлению метода ты должен вернуть double
//    long time = System.currentTimeMillis();
//    if (time % 2 == 0) {
//      return arg * arg;             // ок, вот твой double
//    } else if (time % 2 == 1) {
//      while (true) {
//        ;                 // не, я решил "повиснуть"
//      }
//    } else {
//      throw new RuntimeException(); // или бросить исключение
//    }
//  }
//}

////RUNTIME ERROR: Exception in thread "main" java.lang.RuntimeException
//public class App {
//
//  public static void main(String[] args) {
//    // sqr - "сломается" (из него "выскочит" исключение),
//    double d = sqr(10.0);  // выполнение метода main() прервется в этой строчке и
//    // d - НИКОГДА НИЧЕГО НЕ БУДЕТ ПРИСВОЕНО!
//    System.out.println(d); // и печатать нам ничего не придется!
//  }
//
//  public static double sqr(double arg) {
//    throw new RuntimeException(); // "бросаем" исключение
//  }
//}

//public class App {
//
//  public static void main(String[] args) {
//    area(-2, 4);
//  }
//
//  public static int area(int width, int height) {
//    if (width < 0 || height < 0) {
//      throw new IllegalArgumentException("Negative sizes: w = " + width + ", h = " + height);
//    }
//    return width * height;
//  }
//}

////>> #1.in
////    >> .   #2.in
////    >> .   .   #3.in
////    >> .   .   .   #4.in
////    >> .   .   .   #4.RETURN
////    >> .   .   #3.out
////    >> .   #2.out
////    >> #1.out
//public class App {
//
//  public static void main(String[] args) {
//    System.err.println("#1.in");
//    f(); // создаем фрейм, помещаем в стек, передаем в него управление
//    System.err.println("#1.out"); // вернулись
//  } // выходим из текущего фрейма, кончились инструкции
//
//  public static void f() {
//    System.err.println(".   #2.in");
//    g(); // создаем фрейм, помещаем в стек, передаем в него управление
//    System.err.println(".   #2.out");  //вернулись
//  } // выходим из текущего фрейма, кончились инструкции
//
//  public static void g() {
//    System.err.println(".   .   #3.in");
//    h(); // создаем фрейм, помещаем в стек, передаем в него управление
//    System.err.println(".   .   #3.out"); // вернулись
//  } // выходим из текущего фрейма, кончились инструкции
//
//  public static void h() {
//    System.err.println(".   .   .   #4.in");
//    if (true) {
//      System.err.println(".   .   .   #4.RETURN");
//      return; // выходим из текущего фрейма по 'return'
//    }
//    System.err.println(".   .   .   #4.out"); // ПРОПУСКАЕМ
//  }
//}

////>> #1.in
////    >> .   #2.in
////    >> .   .   #3.in
////    >> .   .   .   #4.in
////    >> .   .   .   #4.THROW
////    >> #1.CATCH
////    >> #1.out
//public class App {
//
//  public static void main(String[] args) {
//    System.err.println("#1.in");
//    try {
//      f(); // создаем фрейм, помещаем в стек, передаем в него управление
//    } catch (Error e) { // "перехватили" "летящее" исключение
//      System.err.println("#1.CATCH");  // и работаем
//    }
//    System.err.println("#1.out");  // работаем дальше
//  }
//
//  public static void f() {
//    System.err.println(".   #2.in");
//    g(); // создаем фрейм, помещаем в стек, передаем в него управление
//    System.err.println(".   #2.out"); // ПРОПУСТИЛИ!
//  }
//
//  public static void g() {
//    System.err.println(".   .   #3.in");
//    h(); // создаем фрейм, помещаем в стек, передаем в него управление
//    System.err.println(".   .   #3.out"); // ПРОПУСТИЛИ!
//  }
//
//  public static void h() {
//    System.err.println(".   .   .   #4.in");
//    if (true) {
//      System.err.println(".   .   .   #4.THROW");
//      throw new Error(); // выходим со всей пачки фреймов ("раскрутка стека") по 'throw'
//    }
//    System.err.println(".   .   .   #4.out"); // ПРОПУСТИЛИ!
//  }
//}

//public class App {
//
//  public static void main(String[] args) {
//    System.err.println("#1.in");
//    f(); // создаем фрейм, помещаем в стек, передаем в него управление
//    System.err.println("#1.out"); // вернулись и работаем
//  }
//
//  public static void f() {
//    System.err.println(".   #2.in");
//    g(); // создаем фрейм, помещаем в стек, передаем в него управление
//    System.err.println(".   #2.out"); // вернулись и работаем
//  }
//
//  public static void g() {
//    System.err.println(".   .   #3.in");
//    try {
//      h(); // создаем фрейм, помещаем в стек, передаем в него управление
//    } catch (Error e) { // "перехватили" "летящее" исключение
//      System.err.println(".   .   #3.CATCH");  // и работаем
//    }
//    System.err.println(".   .   #3.out");  // работаем дальше
//  }
//
//  public static void h() {
//    System.err.println(".   .   .   #4.in");
//    if (true) {
//      System.err.println(".   .   .   #4.THROW");
//      throw new Error(); // выходим со всей пачки фреймов ("раскрутка стека") по 'throw'
//    }
//    System.err.println(".   .   .   #4.out"); // ПРОПУСТИЛИ!
//  }
//}

////0 2 3
//public class App {
//
//  public static void main(String[] args) {
//    try {
//      System.err.println(0);
//      if (true) {
//        throw new RuntimeException();
//      }
//      System.err.println(1);
//    } catch (Exception e) { // catch по Exception ПЕРЕХВАТЫВАЕТ RuntimeException
//      System.err.println(2);
//    }
//
//    System.err.println(3);
//  }
//}

//public class App {
//
//  public static void main(String[] args) {
//    try {
//      throw new RuntimeException();
//    } catch (Exception e) {
//      if (e instanceof RuntimeException) {
//        System.err.println("it`s RuntimeException");
//      } else {
//        System.err.println("why not RuntimeException?");
//      }
//    }
//  }
//}

////catch по потомку не может поймать предка
//public class App {
//
//  public static void main(String[] args) {
//    try {
//      System.err.println(0);
//      if (true) {
//        throw new Exception();
//      }
//      System.err.println(1);
//    } catch (RuntimeException e) {
//      System.err.println(2);
//    }
//    System.err.println(3);
//  }
//}

////catch по одному «брату» не может поймать другого «брата»
//// (Error и Exception не находятся в отношении предок-потомок,
//// они из параллельных веток наследования от Throwable)
//public class App {
//
//  public static void main(String[] args) {
//    try {
//      System.err.println(0);
//      if (true) {
//        throw new Error();
//      }
//      System.err.println(1);
//    } catch (Exception e) {
//      System.err.println(2);
//    }
//    System.err.println(3);
//  }
//}

//public class App {
//
//  public static void main(String[] args) {
//    try {
//      System.err.println(0);
//      if (true) {
//        throw new RuntimeException();
//      }
//      System.err.println(1);
//    } catch (RuntimeException e) { // перехватили RuntimeException
//      System.err.println(2);
//      if (true) {
//        throw new Error(); // но бросили Error
//      }
//    }
//    System.err.println(3); // пропускаем - уже летит Error
//  }
//}

//public class App {
//
//  public static void main(String[] args) {
//    try {
//      System.err.println(0);
//      if (true) {
//        throw new RuntimeException();
//      }
//      System.err.println(1);
//    } catch (RuntimeException e) { // перехватили RuntimeException
//      System.err.println(2);
//      if (true) {
//        throw e; // и бросили ВТОРОЙ раз ЕГО ЖЕ
//      }
//    }
//    System.err.println(3); // пропускаем - опять летит RuntimeException
//  }
//}

////catch имеет отношение исключительно к try-секции, но не к другим catch-секциям.
//public class App {
//
//  public static void main(String[] args) {
//    try {
//      System.err.println(0);
//      if (true) {
//        throw new RuntimeException();
//      }
//      System.err.println(1);
//    } catch (RuntimeException e) { // перехватили RuntimeException
//      System.err.println(2);
//      if (true) {
//        throw new Error(); // и бросили новый Error
//      }
//    } catch (Error e) { // хотя есть catch по Error "ниже", но мы в него не попадаем
//      System.err.println(3);
//    }
//    System.err.println(4); // пропускаем - летит Error
//  }
//}

//public class App {
//
//  public static void main(String[] args) {
//    try {
//      System.err.println(0);
//      if (true) {
//        throw new RuntimeException();
//      }
//      System.err.println(1);
//    } catch (RuntimeException e) { // перехватили RuntimeException
//      System.err.println(2.1);
//      try {
//        System.err.println(2.2);
//        if (true) {
//          throw new Error(); // и бросили новый Error
//        }
//        System.err.println(2.3);
//      } catch (Throwable t) { // перехватили Error
//        System.err.println(2.4);
//      }
//      System.err.println(2.5);
//    } catch (Error e) { // хотя есть cath по Error "ниже", но мы в него не попадаем
//      System.err.println(3);
//    }
//    System.err.println(4);
//  }
//}

////COMPILATION ERROR: Exception 'java.lang.RuntimeException'
//// has already been caught
//public class App {
//
//  public static void main(String[] args) {
//    try {
//    } catch (Exception e) {
//    } catch (RuntimeException e) {
//    }
//  }
//}

////Ставить брата после брата — можно (RuntimeException после Error)
//public class App {
//
//  public static void main(String[] args) {
//    try {
//    } catch (Error e) {
//    } catch (RuntimeException e) {
//    }
//  }
//}

////Как происходит выбор «правильного» catch? Да очень просто —
//// JVM идет сверху-вниз до тех пор, пока не найдет такой catch что
//// в нем указано ваше исключение или его предок — туда и заходит.
//// Ниже — не идет.
//public class App {
//  public static void main(String[] args) {
//    try {
//      throw new Exception();
//    } catch (RuntimeException e) {
//      System.err.println("catch RuntimeException");
//    } catch (Exception e) {
//      System.err.println("catch Exception");
//    } catch (Throwable e) {
//      System.err.println("catch Throwable");
//    }
//    System.err.println("next statement");
//  }
//}

////Выбор catch осуществляется в runtime (а не в compile-time), значит
//// учитывается не тип ССЫЛКИ (Throwable), а тип ССЫЛАЕМОГО (Exception)
////>>  catch Exception
////>> next statement
//public class App {
//
//  public static void main(String[] args) {
//    try {
//      Throwable t = new Exception(); // ссылка типа Throwable указывает на объект типа Exception
//      throw t;
//    } catch (RuntimeException e) {
//      System.err.println("catch RuntimeException");
//    } catch (Exception e ) {
//      System.err.println("catch Exception");
//    } catch (Throwable e) {
//      System.err.println("catch Throwable");
//    }
//    System.err.println("next statement");
//  }
//}

////finally-секция получает управление, если try-блок завершился успешно
//public class App {
//
//  public static void main(String[] args) {
//    try {
//      System.err.println("try");
//    } finally {
//      System.err.println("finally");
//    }
//  }
//}

////finally-секция получает управление, даже если try-блок завершился исключением
//public class App {
//
//  public static void main(String[] args) {
//    try {
//      throw new RuntimeException();
//    } finally {
//      System.err.println("finally");
//    }
//  }
//}

////finally-секция получает управление, даже если try-блок
//// завершился директивой выхода из метода
//public class App {
//
//  public static void main(String[] args) {
//    try {
//      return;
//    } finally {
//      System.err.println("finally");
//    }
//  }
//}

////finally-секция НЕ вызывается только если мы «прибили» JVM
//public class App {
//
//  public static void main(String[] args) {
//    try {
//      System.exit(42);
//    } finally {
//      System.err.println("finally");
//    }
//  }
//}

////System.exit(42) и Runtime.getRuntime().exit(42) — это синонимы
//public class App {
//  public static void main(String[] args) {
//    try {
//      Runtime.getRuntime().exit(42);
//    } finally {
//      System.err.println("finally");
//    }
//  }
//}

////И при Runtime.getRuntime().halt(42) — тоже не успевает зайти в finally
//public class App {
//
//  public static void main(String[] args) {
//    try {
//      Runtime.getRuntime().halt(42);
//    } finally {
//      System.err.println("finally");
//    }
//  }
//}

//javadoc: java.lang.Runtime#halt(int status)
//… Unlike the exit method, this method does not cause shutdown hooks to be started
// and does not run uninvoked finalizers if finalization-on-exit has been enabled.
// If the shutdown sequence has already been initiated then this method does not wait
// for any running shutdown hooks or finalizers to finish their work.

////Однако finally-секция не может «починить» try-блок завершившийся исключением
//public class App {
//
//  public static void main(String[] args) {
//    try {
//      System.err.println("try");
//      if (true) {
//        throw new RuntimeException();
//      }
//    } finally {
//      System.err.println("finally");
//    }
//    System.err.println("more");
//  }
//}

////Трюк с «if (true) {...}» требуется, так как иначе компилятор обнаруживает
//// недостижимый код (последняя строка) и отказывается его компилировать
//public class App {
//
//  public static void main(String[] args) {
//    try {
//      System.err.println("try");
//      throw new RuntimeException();
//    } finally {
//      System.err.println("finally");
//    }
//    System.err.println("more");
//  }
//}

////И finally-секция не может «предотвратить» выход из метода,
//// если try-блок вызвал return («more» — не выводится в консоль)
//public class App {
//
//  public static void main(String[] args) {
//    try {
//      System.err.println("try");
//      if (true) {
//        return;
//      }
//    } finally {
//      System.err.println("finally");
//    }
//    System.err.println("more");
//  }
//}

////Однако finally-секция может «перебить» throw/return при помощи другого throw/return
//public class App {
//
//  public static void main(String[] args) {
//    System.err.println(f());
//  }
//
//  public static int f() {
//    try {
//      return 0;
//    } finally {
//      return 1;
//    }
//  }
//}

//public class App {
//
//  public static void main(String[] args) {
//    System.err.println(f());
//  }
//
//  public static int f() {
//    try {
//      throw new RuntimeException();
//    } finally {
//      return 1;
//    }
//  }
//}

//public class App {
//
//  public static void main(String[] args) {
//    System.err.println(f());
//  }
//
//  public static int f() {
//    try {
//      return 0;
//    } finally {
//      throw new RuntimeException();
//    }
//  }
//}

//public class App {
//
//  public static void main(String[] args) {
//    System.err.println(f());
//  }
//
//  public static int f() {
//    try {
//      throw new Error();
//    } finally {
//      throw new RuntimeException();
//    }
//  }
//}

//Не рекомендуемые практики
//— return из finally-секции (можем затереть исключение из try-блока)
//— действия в finally-секции, которые могут бросить исключение
// (можем затереть исключение из try-блока)

////Нет исключения. Не заходим в catch, заходим в finally, продолжаем после оператора
//public class App {
//
//  public static void main(String[] args) {
//    try {
//      System.err.print(" 0");
//      // nothing
//      System.err.print(" 1");
//    } catch (Error e) {
//      System.err.print(" 2");
//    } finally {
//      System.err.print(" 3");
//    }
//    System.err.print(" 4");
//  }
//}

////Есть исключение и есть подходящий catch
////Заходим в catch, заходим в finally, продолжаем после оператора
//public class App {
//
//  public static void main(String[] args) {
//    try {
//      System.err.print(" 0");
//      if (true) {
//        throw new Error();
//      }
//      System.err.print(" 1");
//    } catch (Error e) {
//      System.err.print(" 2");
//    } finally {
//      System.err.print(" 3");
//    }
//    System.err.print(" 4");
//  }
//}

////Есть исключение но нет подходящего catch
////Не заходим в catch, заходим в finally, не продолжаем
//// после оператора — вылетаем с неперехваченным исключением
//public class App {
//
//  public static void main(String[] args) {
//    try {
//      System.err.print(" 0");
//      if (true) {
//        throw new RuntimeException();
//      }
//      System.err.print(" 1");
//    } catch (Error e) {
//      System.err.print(" 2");
//    } finally {
//      System.err.print(" 3");
//    }
//    System.err.print(" 4");
//  }
//}

////Вложенный try-catch-finally без исключения
//public class App {
//
//  public static void main(String[] args) {
//    try {
//      System.err.print(" 0");
//      try {
//        System.err.print(" 1");
//        // НИЧЕГО
//        System.err.print(" 2");
//      } catch (RuntimeException e) {
//        System.err.print(" 3"); // НЕ заходим - нет исключения
//      } finally {
//        System.err.print(" 4"); // заходим всегда
//      }
//      System.err.print(" 5");     // заходим - выполнение в норме
//    } catch (Exception e) {
//      System.err.print(" 6");     // НЕ заходим - нет исключения
//    } finally {
//      System.err.print(" 7");     // заходим всегда
//    }
//    System.err.print(" 8");         // заходим - выполнение в норме
//  }
//}

////Вложенный try-catch-finally с исключением, которое ПЕРЕХВАТИТ ВНУТРЕННИЙ catch
//public class App {
//
//  public static void main(String[] args) {
//    try {
//      System.err.print(" 0");
//      try {
//        System.err.print(" 1");
//        if (true) {
//          throw new RuntimeException();
//        }
//        System.err.print(" 2");
//      } catch (RuntimeException e) {
//        System.err.print(" 3"); // ЗАХОДИМ - есть исключение
//      } finally {
//        System.err.print(" 4"); // заходим всегда
//      }
//      System.err.print(" 5");     // заходим - выполнение УЖЕ в норме
//    } catch (Exception e) {
//      System.err.print(" 6");     // не заходим - нет исключения, УЖЕ перехвачено
//    } finally {
//      System.err.print(" 7");     // заходим всегда
//    }
//    System.err.print(" 8");         // заходим - выполнение УЖЕ в норме
//  }
//}

////Вложенный try-catch-finally с исключением, которое ПЕРЕХВАТИТ ВНЕШНИЙ catch
//public class App {
//
//  public static void main(String[] args) {
//    try {
//      System.err.print(" 0");
//      try {
//        System.err.print(" 1");
//        if (true) {
//          throw new Exception();
//        }
//        System.err.print(" 2");
//      } catch (RuntimeException e) {
//        System.err.print(" 3"); // НЕ заходим - есть исключение, но НЕПОДХОДЯЩЕГО ТИПА
//      } finally {
//        System.err.print(" 4"); // заходим всегда
//      }
//      System.err.print(" 5");     // не заходим - выполнение НЕ в норме
//    } catch (Exception e) {
//      System.err.print(" 6");     // ЗАХОДИМ - есть подходящее исключение
//    } finally {
//      System.err.print(" 7");     // заходим всегда
//    }
//    System.err.print(" 8");         // заходим - выполнение УЖЕ в норме
//  }
//}

////Вложенный try-catch-finally с исключением, которое НИКТО НЕ ПЕРЕХВАТИТ
//public class App {
//
//  public static void main(String[] args) {
//    try {
//      System.err.print(" 0");
//      try {
//        System.err.print(" 1");
//        if (true) {
//          throw new Error();
//        }
//        System.err.print(" 2");
//      } catch (RuntimeException e) {
//        System.err.print(" 3"); // НЕ заходим - есть исключение, но НЕПОДХОДЯЩЕГО ТИПА
//      } finally {
//        System.err.print(" 4"); // заходим всегда
//      }
//      System.err.print(" 5");     // НЕ заходим - выполнение НЕ в норме
//    } catch (Exception e) {
//      System.err.print(" 6");     // не заходим - есть исключение, но НЕПОДХОДЯЩЕГО ТИПА
//    } finally {
//      System.err.print(" 7");     // заходим всегда
//    }
//    System.err.print(" 8");         // не заходим - выполнение НЕ в норме
//  }
//}

// P
// A
// R
// T
//
// T
// W
// O

////Мы не можем бросать, но не предупредить
//public class App {
//
//  public static void main(String[] args) {
//    throw new Exception(); // тут ошибка компиляции
//  }
//}

////Мы не можем бросать, но предупредить о «меньшем»
//import java.io.IOException;
//
//public class App {
//
//  public static void main(String[] args) throws IOException {
//    throw new Exception(); // тут ошибка компиляции
//  }
//}

////Мы можем предупредить точно о том, что бросаем
//public class App {
//
//  public static void main(String[] args) throws Exception { // предупреждаем о Exception
//    throw new Exception(); // и кидаем Exception
//  }
//}

////Мы можем предупредить о большем, чем мы бросаем
//public class App {
//
//  public static void main(String[] args) throws Throwable { // предупреждаем "целом" Throwable
//    throw new Exception(); // а кидаем только Exception
//  }
//}

////Можем даже предупредить о том, чего вообще нет
//public class App {
//
//  public static void main(String[] args) throws Exception { // пугаем
//    // но ничего не бросаем
//  }
//}

////Даже если предупреждаем о том, чего нет — все обязаны бояться
//public class App {
//
//  public static void main(String[] args) {
//    f(); // тут ошибка компиляции
//  }
//
//  public static void f() throws Exception {
//  }
//}

////Хотя они (испугавшиеся) могут перепугать остальных еще больше
//public class App {
//
//  // они пугают целым Throwable
//  public static void main(String[] args) throws Throwable {
//    f();
//  }
//
//  // хотя мы пугали всего-лишь Exception
//  public static void f() throws Exception {
//  }
//}

////Вызов метода, который «пугает» unchecked исключением не накладывает на нас никаких обязанностей
//public class App {
//
//  public static void main(String[] args) {
//    f();
//  }
//
//  public static void f() throws RuntimeException {
//  }
//}

////Далее учитывайте, что EOFException и FileNotFoundException — потомки IOException
////Мы можем точно указать, что выбрасываем
//import java.io.EOFException;
//import java.io.FileNotFoundException;
//
//public class App {
//
//  // пугаем ОБОИМИ исключениями
//  public static void main(String[] args) throws EOFException, FileNotFoundException {
//    if (System.currentTimeMillis() % 2 == 0) {
//      throw new EOFException();
//    } else {
//      throw new FileNotFoundException();
//    }
//  }
//}

////или вот так
//import java.io.EOFException;
//import java.io.FileNotFoundException;
//
//public class App {
//
//  // пугаем ОБОИМИ исключениями
//  public static void main(String[] args) throws EOFException, FileNotFoundException {
//    f0();
//    f1();
//  }
//
//  public static void f0() throws EOFException {
//  }
//
//  public static void f1() throws FileNotFoundException {
//  }
//}

////А можем «испугать» сильнее (предком обоих исключений)
//import java.io.EOFException;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//public class App {
//
//  // пугаем ПРЕДКОМ исключений
//  public static void main(String[] args) throws IOException {
//    if (System.currentTimeMillis() % 2 == 0) {
//      throw new EOFException();
//    } else {
//      throw new FileNotFoundException();
//    }
//  }
//}

////или вот так
//import java.io.EOFException;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//public class App {
//  // пугаем ПРЕДКОМ исключений
//  public static void main(String[] args) throws IOException {
//    f0();
//    f1();
//  }
//
//  public static void f0() throws EOFException {
//  }
//
//  public static void f1() throws FileNotFoundException {
//  }
//}

////(InterruptedException — НЕ потомок IOException)
//import java.io.EOFException;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//public class App {
//
//  public static void main(String[] args) throws IOException, InterruptedException {
//    f0();
//    f1();
//    f2();
//  }
//
//  public static void f0() throws EOFException {
//  }
//
//  public static void f1() throws FileNotFoundException {
//  }
//
//  public static void f2() throws InterruptedException {
//  }
//}

////Не надо пугать тем, что вы перехватили
////так
//public class App {
//
//  public static void main(String[] args) {
//    try {
//      throw new Exception();
//    } catch (Exception e) {
//      // ...
//    }
//  }
//}

////или так (ставим catch по предку и точно перехватываем)
//public class App {
//
//  public static void main(String[] args) {
//    try {
//      throw new Exception();
//    } catch (Throwable e) {
//      // ...
//    }
//  }
//}

////Но если перехватили только потомка, то не выйдет
//public class App {
//
//  public static void main(String[] args) {
//    try {
//      throw new Throwable();
//    } catch (Exception e) {
//      // ...
//    }
//  }
//}

////Не годится, естественно, и перехватывание «брата»
//public class App {
//
//  public static void main(String[] args) {
//    try {
//      throw new Exception();
//    } catch (Error e) {
//      // ...
//    }
//  }
//}

////Если вы часть перехватили, то можете этим не пугать
//import java.io.EOFException;
//import java.io.FileNotFoundException;
//
//public class App {
//  // EOFException перехватили catch-ом, им не пугаем
//  public static void main(String[] args) throws FileNotFoundException {
//    try {
//      if (System.currentTimeMillis() % 2 == 0) {
//        throw new EOFException();
//      } else {
//        throw new FileNotFoundException();
//      }
//    } catch (EOFException e) {
//      // ...
//    }
//  }
//}

////Необходимо понимать, что
////— проверка на cheched исключения происходит в момент компиляции (compile-time checking)
////— перехват исключений (catch) происходит в момент выполнения (runtime checking)
//public class App {
//
//  // пугаем Exception
//  public static void main(String[] args) throws Exception {
//    Throwable t = new Exception(); // и лететь будет Exception
//    throw t; // но тут ошибка компиляции
//  }
//}

////Полная аналогия с
//public class App {
//
//  public static void main(String[] args) throws Exception {
//    Object ref = "Hello!";  // ref указывает на строку
//    char c = ref.charAt(0); // но тут ошибка компиляции
//  }
//}

////Компилятор не пропустит этот код, хотя метод main ГАРАНТИРОВАННО НЕ ВЫБРОСИТ ИСКЛЮЧЕНИЯ
//public class App {
//  // пугаем Exception
//  public static void main(String[] args) throws Exception {
//    try {
//      Throwable t = new Exception(); // и лететь будет Exception
//      throw t; // но тут ошибка компиляции
//    } catch (Exception e) {
//      System.out.println("Перехвачено!");
//    }
//  }
//}

//public class App {
//
//  // ТЕПЕРЬ пугаем Throwable
//  public static void main(String[] args) throws Throwable {
//    try {
//      Throwable t = new Exception(); // а лететь будет Exception
//      throw t;
//    } catch (Exception e) { // и мы перехватим Exception
//      System.out.println("Перехвачено!");
//    }
//  }
//}

////При переопределении (overriding) список исключений потомка не обязан совпадать с таковым у предка.
////Но он должен быть «не сильнее» списка предка:
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//public class Parent {
//  // предок пугает IOException и InterruptedException
//  public void f() throws IOException, InterruptedException {}
//}
//
//class Child extends Parent {
//  // а потомок пугает только потомком IOException
//  @Override
//  public void f() throws FileNotFoundException {}
//}

////Однако тут мы попытались «расширить тип» бросаемых исключений
////>> COMPILATION ERROR: overridden method does not throw 'java.lang.Exception'
//import java.io.IOException;
//
//public class Parent {
//  public void f() throws IOException, InterruptedException {}
//}
//
//class ChildB extends Parent {
//  @Override
//  public void f() throws Exception {}
//}

