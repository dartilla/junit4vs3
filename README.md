# junit4vs3

MyTest заваливается с NPE в случае `public class MyTest extends TestCase {` - потому что запускает как junit3.

MyTest успешно отрабатывает в случае `public class MyTest {` - запуск как junit4, и `@Before` отрабатывает как должен.
