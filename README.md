# junit4vs3

MyTest fails with NPE in case `public class MyTest extends TestCase {` - this is where `-junit3` happens and `@Before` method is skipped.

MyTest succeed in case `public class MyTest {` - this is where `-junit4` happens and `@Before` method executed as expected.
