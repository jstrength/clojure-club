# Clojure-Club

Wherein we solve interesting problems on our own then compare to see how we did.

## How it works
Once a week a new problem will be posted. A package will be created in this project
for participants to post their solutions. Please put your solution in a ns with
the name $USER.clj.

## Problems/Topics

#### June 23<sup>rd</sup>: Interesting Macros

We'll be talking about macros. What are they? How do they work? When do you use them instead of functions?

Assignment: Find or write an interesting macro that you are willing to discuss. Something short and simple is preferable
to the alternatives. Put your example in src/main/cljc/clojure_club/macros/$username.cljc. If you can't come up with
anything, try this:

Write a macro called bizarro that replaces a function with its opposite. For example (bizarro + 6 2) should return 4, not 8.
Do this for at least +, -, *, and /. Feel free to make sin be cos and vice-versa.

As always, come even if you weren't able to do anything.

Reading: 
* [The official docs](https://clojure.org/reference/macros)
* [Brave Clojure's treatment](http://www.braveclojure.com/writing-macros/)

Note: Some folks check in namespaces that contain src.main.cljc or similar in them. Please ensure that they are
(ns clojure-club.macros.$username).

#### June 16<sup>th</sup>: Destructuring

A primary need in a data-oriented language is the ability to easily pull your data structures apart
and get at all of its pieces. Clojure does this wonderfully with destructuring, but it can be 
confusing at first. This week we'll talk all about it.

Here are some useful links:
 * [The official guide](https://clojure.org/guides/destructuring)
 * [Cheatsheet](https://gist.github.com/john2x/e1dca953548bfdfb9844)
 * [Jay Fields' Guide](http://blog.jayfields.com/2010/07/clojure-destructuring.html)
 * [Yet another guide](http://blog.brunobonacci.com/2014/11/16/clojure-complete-guide-to-destructuring/)

#### June 9<sup>th</sup>: [Core Async](https://github.com/clojure/core.async)
                          
"Facilities for async programming and communication in Clojure"
                         
 * [Code Walkthrough](https://github.com/clojure/core.async/blob/master/examples/walkthrough.clj)

#### June 2<sup>nd</sup>: [Transducers](https://clojure.org/reference/transducers)

Matt will be discussion transducers, a way to compose algorithmic transforms. A few links:
  * [clojure.org](https://clojure.org/reference/transducers)
  * [Rich's blog post](http://blog.cognitect.com/blog/2014/8/6/transducers-are-coming)
  
Follow up:
  * Here's a link to Matt's examples: https://github.com/tkocmathla/transducer-adducers

#### May 26<sup>th</sup>: Java Calls Clojure

One of the biggest concerns of decision makers moving to a new JVM language is support for calling artifacts generated
in that language in Java. Clojure has great support for being called from its host platform. We'll spend some time
investigating this and in all of its incarnations, including:
 * gen-class
 * :gen-class
 * definterface
 * records
 * Direct invocation of clojure.lang APIs
 
Some links:
 * [DZone gen-class example](https://dzone.com/articles/java-clojure-interop-calling)
 * [3 Things Java Programmers Can Steal from Clojure](http://www.lispcast.com/3-things-java-can-steal-from-clojure)
 * [Using clojure.lang.RT](https://clojurefun.wordpress.com/2012/12/24/invoking-clojure-code-from-java/)
 
Follow up:
At the meet we discussed these two demo projects that can be used as a launching point for using Clojure in
your Java projects:
 * [clojure-makes-java](https://github.com/markbastian/clojure-makes-java)
 * [java-calls-clojure](https://github.com/markbastian/java-calls-clojure)
 
#### May 19<sup>th</sup>: [Making Data Dance](http://www.4clojure.com/problem/113)

From 4clojure.com: Write a function that takes a variable number of integer arguments. If the output is coerced into a 
string, it should return a comma (and space) separated list of the inputs sorted smallest to largest. If the output is 
coerced into a sequence, it should return a seq of unique input elements in the same order as they were entered.

Place your solution in src/main/clj/x113_making_data_dance/$username.clj

Note that you may not use proxy. Speaking of proxy...

In addition to the solving this problem, I'd like to discuss several handy methods for Java interop, including:
 * proxy
 * reify
 * definterface
 * doto
 * bean

#### May 12<sup>th</sup>: [Mount](https://github.com/tolitius/mount)

Mark will be talking about mount, a simple library for managing state in Clojure. For context, any sizeable app will
need some sort of basic configuration (a database being the classic example) to function. For testing you need the
ability to setup and teardown different configs on fly. Mount is a great way to do this. It can be used to mock up any
set of states you might want for dev, test, prod, or whatever.

#### May 5<sup>th</sup>: Procedural Domain Generation and Modeling Using Spec

[Spec](https://clojure.org/about/spec) is all the hotness in Clojure nowadays. It allows you to 
create specifications for your data and do all kinds of things once you've generated a spec. Here's
the [guide](https://clojure.org/guides/spec).

Assignment:
 * Pick a domain and create a spec that [generates](https://clojure.org/guides/spec#_generators) models within your domain.
 * Suggested domain:
   * D&D characters or similar
     * A character has a:
       * name: string
       * class: fighter, cleric, magic user, assassin, barbarian (you can multiclass)
       * level: integer
       * traits: STR, DEX, INT, CHA, WIS, CON
       * There are other aspects you could model, such as spells, weapons, etc. Go as deep as you want.
 * You can do whatever domain you want, but if you do the above we'll all be on the same page.
 * Put your solution in src/main/cljc/clojure_club/rpg_spec/{username}

#### April 28<sup>th</sup>: GURPS Data Modeling

Thanks to Wes for providing this exercise. I think it has a variety of interesting aspects, including
data modeling, XML parsing, tree-walking, etc.

Various .adq/.skl/.eqp etc (actually xml format) files exist under this repository: https://github.com/richardwilkes/gcs_library
They’re used by this fun swing app: http://gurpscharactersheet.com/ 

Convert this particular one to .edn https://github.com/richardwilkes/gcs_library/blob/master/Library/Advantages/Basic%20Set.adq
The exact modeling is up to you, but ideally, be able to “easily answer” various queries such as:
 * Get all the Mental advantages/disadvantages
 * Get all the advantage within a given base cost range (e.g. 15-20, < 12, = 10)
   * Bonus points to anyone that makes this work with point modifier applications
 * Find all advantages that give a bonus to a given skill by name
 * Anything else you find entertaining

The nature of each item can wildly differ, but the format stays relatively the same.

Under most of the main folders, you’ll find a “Basic Set.*” file, the format should be mostly similar to the .adq file, but the content will be vastly different.
For bonus points, make a more general xml->edn utility that works for this style of xml modeling.

#### April 21<sup>st</sup>: [Reducers](https://clojure.org/reference/reducers) or [Transducers](https://clojure.org/reference/transducers)

Nobody groks any of this stuff. Time to grok. 

Assignment: Pick any problem (trivial is fine) that uses reducers or transducers and work on it. 
We'll discuss it next week. The focus will be on reducers, but if there's time we might get to 
transducers.

To begin, you might want to try using reducers on [this example submitted by Mike](https://github.com/markbastian/clojure-club/blob/master/src/main/cljc/clojure_club/playground/reducer_problem.clj).
Be sure to make your own version so everyone isn't clobbering each other.

Mike is leading the discussion.
 
 #### April 14<sup>th</sup>: [Universal Computation Engine](https://www.4clojure.com/problem/121)
 
 From [4clojure.com](https://www.4clojure.com/problem/121): "Given a mathematical formula 
 in prefix notation, return a function that calculates the value of the formula. The 
 formula can contain nested calculations using the four basic mathematical operators, 
 numeric constants, and symbols representing variables. The returned function has to 
 accept a single parameter containing the map of variable names to their values."
 
 **Note that you may not use eval or resolve.**
 
 I haven't spent much time thinking about *advanced* aspects of this problem, but for bonus
 points you might want to try the following:
  * Add transcendental functions (sin, cos, etc.)
  * Take a look at symbolic differentiation (This may be extra extra out of scope, just
  throwing it out there.)
  
#### April 7<sup>th</sup>:

We'll be working on two problems - pick the one you want.
* Develop a quine in Clojure (https://www.4clojure.com/problem/125) and/or
* Develop a Sudoku solver
  * Boards will be a 9x9 nested vector with numeric or nil elements
  * Name you function `solve` so that we have a uniform interface
  * Note that there are several ways you could solve this including a search or using a 
  [logic programming library](https://github.com/clojure/core.logic)

#### March 24<sup>th</sup>: [Analyze Reversi](https://www.4clojure.com/problem/124)

* Implement your solution as a cljc file (src/main/cljc/x124_analyze_reversi/$USERNAME.cljc rather than a .clj.
* If time allows, we’ll discuss reader conditionals, isomorphic Clojure, and the differences between clj, cljc, and cljs files.
* Finally, bonus points for porting last week’s solution to cljc (Hints: I/O can behave differently on different platforms. PersistentQueue is imported from different locations.).

Please submit your answer via git pull request to https://github.com/markbastian/clojure-club. However, if you email it to me I will continue to facilitate your bad behavior and add it myself.

#### March 17<sup>th</sup>: [Number Maze](http://www.4clojure.com/problem/106)
 * Compute the minimum number of steps required to go from integer S<sub>i</sub> 
 to S<sub>f</sub>.
 * Allowed operations are:
   * S<sub>i+1</sub> = S<sub>i</sub> + 2
   * S<sub>i+1</sub> = S<sub>i</sub> * 2
   * S<sub>i+1</sub> = S<sub>i</sub>  / 2 
 * Modify your solution to return a numeric path from S<sub>i</sub> to S<sub>f</sub>
 (Note that there are cases with more than one solution).
 * Modify your solution to return all minimum paths.
   * Examples of multiple minimum solutions:
     * 2 -> 4
     * 9 -> 2
     * 2 -> 9
 * Modify your solution to return all paths with interleaved operations. This would
 distinguish ambiguous solutions like [[2 4][2 4]], which would become 
 [[2 + 2 = 4][2 * 2 = 4]]. How the operations are expressed aren't important.

## Ideas
 * Setting up your user profile and favorite plugins
   * Create your own!
   * code coverage, etc.
 * Procedural generation of *stuff*
   * including spec (X2)
 * Cool libraries
   * [Mount](https://github.com/tolitius/mount)
   * [Specter](https://github.com/nathanmarz/specter)
   * [Quil](http://quil.info/)
 * More [4clojure](https://www.4clojure.com/)
 * Java interop
   * Java -> Clojure
   * Clojure -> Java
   * Skin a game (two teams - clj, cljs)
   * UIs
   * JavaFX
 
## License

Copyright © 2017 Mark Bastian, Matt Grimm, Jacob Strength, Jerek Anderson, 
Brock Turner, and all other contributors.

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
