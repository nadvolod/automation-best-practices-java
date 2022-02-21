# E2E Tests

## Review test strategy

[Let's review our testing gaps](TEST-STRATEGY.MD) 

## Covering business risk

We can use **functional e2e UI** tests to cover some of the risks

## 🏋️‍♀️Write tests using best practices

1. Go to `com.saucedemo.exercises.E2ETests.java` and finish `loginWorks()` and `userCanCheckout()`.
2. Don't peek at the other tests yet!
3. Run each test to make sure they work
4. At the end, run all tests with `mvn test -Dtest=E2ETests`


**Rules**

✅ Use page objects

✅ One test for one feature

❌ Don't create any new code, simply reuse existing code

### ️👀How does this work?

Let's walk through the code

[🧪Let's review test coverage](TEST-STRATEGY.MD)

---

## ❓Are these the best tests that we can write

---

[👉Answer in the next section](ATOMIC-TESTS.MD)
