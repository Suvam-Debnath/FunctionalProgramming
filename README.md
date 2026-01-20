<h1>🚀 Java Functional Programming with Lambda & Streams</h1>

<p>
This repository demonstrates <b>Java Functional Programming</b> concepts using
<b>Lambda Expressions</b>, <b>Streams API</b>, and <b>Method References</b>
with concise, real-world examples.
</p>

<hr/>

<h2>📌 What is Functional Programming?</h2>
<p>
Functional Programming focuses on <b>writing declarative, immutable, and side-effect-free code</b>
using functions as first-class citizens.
</p>

<hr/>

<h2>🔹 Lambda Expressions ✨</h2>
<ul>
  <li><b>Lambda Expression</b> – A concise way to implement functional interfaces using anonymous functions.</li>
  <li><b>Syntax</b> – <code>(parameters) -> expression</code> or <code>(parameters) -> { statements }</code>.</li>
  <li><b>Functional Interface</b> – An interface with exactly one abstract method.</li>
</ul>

<hr/>

<h2>🔹 Built-in Functional Interfaces 🧩</h2>
<ul>
  <li><b>Predicate</b> – Takes one input and returns a boolean.</li>
  <li><b>Function</b> – Takes one input and returns a result.</li>
  <li><b>Consumer</b> – Takes one input and performs an action without returning a result.</li>
  <li><b>Supplier</b> – Takes no input and returns a value.</li>
  <li><b>BiPredicate</b> – Takes two inputs and returns a boolean.</li>
  <li><b>BiFunction</b> – Takes two inputs and returns a result.</li>
  <li><b>BiConsumer</b> – Takes two inputs and performs an action without returning anything.</li>
</ul>

<hr/>

<h2>🔹 Streams API 🌊</h2>
<p>
Streams enable <b>functional-style processing of collections</b> using a pipeline of operations.
</p>

<h3>⚙️ Intermediate Operations</h3>
<ul>
  <li><b>filter()</b> – Selects elements that match a condition.</li>
  <li><b>map()</b> – Transforms each element into another form.</li>
  <li><b>flatMap()</b> – Flattens nested structures into a single stream.</li>
  <li><b>distinct()</b> – Removes duplicate elements.</li>
  <li><b>sorted()</b> – Sorts elements in natural or custom order.</li>
  <li><b>limit()</b> – Restricts the number of elements in a stream.</li>
  <li><b>skip()</b> – Skips the specified number of elements.</li>
</ul>

<h3>🏁 Terminal Operations</h3>
<ul>
  <li><b>forEach()</b> – Performs an action for each element.</li>
  <li><b>collect()</b> – Converts the stream into a collection or final result.</li>
  <li><b>reduce()</b> – Combines elements into a single value.</li>
  <li><b>count()</b> – Returns the number of elements.</li>
  <li><b>anyMatch()</b> – Checks if any element matches a condition.</li>
  <li><b>allMatch()</b> – Checks if all elements match a condition.</li>
  <li><b>noneMatch()</b> – Checks if no elements match a condition.</li>
  <li><b>findFirst()</b> – Returns the first element of the stream.</li>
  <li><b>findAny()</b> – Returns any element from the stream.</li>
</ul>

<hr/>

<h2>🔹 Method References 🔗</h2>
<ul>
  <li><b>Static Method Reference</b> – Refers to a static method using <code>ClassName::methodName</code>.</li>
  <li><b>Instance Method Reference</b> – Refers to an instance method using <code>object::methodName</code>.</li>
  <li><b>Constructor Reference</b> – Refers to a constructor using <code>ClassName::new</code>.</li>
</ul>

<hr/>

<h2>🔹 Optional Class 🛡️</h2>
<ul>
  <li><b>Optional</b> – A container object used to avoid NullPointerException.</li>
  <li><b>isPresent()</b> – Checks if a value exists.</li>
  <li><b>orElse()</b> – Returns a default value if empty.</li>
  <li><b>orElseGet()</b> – Returns a value from a Supplier if empty.</li>
  <li><b>orElseThrow()</b> – Throws an exception if the value is absent.</li>
</ul>

<hr/>

<h2>🎯 Key Benefits 🚀</h2>
<ul>
  <li>Cleaner and more readable code</li>
  <li>Less boilerplate and fewer bugs</li>
  <li>Easy parallel processing with streams</li>
  <li>Improved maintainability and scalability</li>
</ul>

<hr/>

<h2>👨‍💻 Author</h2>
<p>
<b>Suvam Debnath</b><br/>
</p>
