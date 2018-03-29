[Anatomy of a System Design Interview](https://hackernoon.com/anatomy-of-a-system-design-interview-4cb57d75a53f)

[How NOT to design Netflix in 45 minutes](https://hackernoon.com/how-not-to-design-netflix-in-your-45-minute-system-design-interview-64953391a054)

[Quora how to prepare](https://www.quora.com/How-do-I-prepare-to-answer-design-questions-in-a-technical-interview?redirected_qid=1500023) & [Practice Questions from that Quora](https://www.educative.io/collection/page/5668639101419520/5649050225344512/5673385510043648)

## Plan: do questions, practice, research. Use above to help.
- Write down research daily, and do 2 design questions a day. 
- CTCI SQL in chapter 14, chapter 9 has scalability and design questions.
- Questions: Glassdoor and Careercup
- Practice: CTCI questions + hiredintech.com questions
- Research: companies and their designs, main README links, FB sources, quora, other online. Read about companies infrastructures. Facebook, Twitter, Google => identify patterns, what are differences? Why are there differences? __Understand why decisions are made and Patterns__
- Other: How to draft DB schemas, draft REST APIs. Basics of AJAX, MVC, and other frameworks.

## Completed - Gather information, create study plan
1. Review link at bottom by hiredintech - Scalability. Long videos plus reading
2. Check out how to schedule mock interviews - Discord or Pramp
3. Read CTCI for design advice - has strategy + list of things to learn

- Read Web Scalability Book 20days/~300pages = aim for 20 pages a day


## Strategies
1. Understand and flesh out requirements - (stay close to these reqs. hit all of them)
2. Segment into pieces
3. Tackle the parts while tacking the whole
4. Design the system for specific requirements
5. Constantly discuss positives and negatives (tradeoffs) __wihtout__ being prompted
6. Drive the discussion and have interviewer talk as little as possible
7. Degrees of freedom in the system
8. Coherent design for the system
9. Find errors

#### CTCI
Dicuss Top -> Down
1. scope problem - questions, appropriate assumptions. Take very seriously. Find out Reqs.
2. Define Key components - can be somewhat naive. Here is our frontend, backend. Okay now...
3. Identify Issues - Bottlenecks, tradeoffs
4. Repair and Redesign

## Information About Questions
1. They will try to get me __out of my comfort zone__ with technical knowledge, ask about tech. I dont know
2. These are fundamentally problem solving questions. Not knowledge or memorization.
3. Will get into resource planning and scaling

#### A Finished Answer Will Have:
1. Create flow outline
2. Make sure there is a concrete illustration of your system on the board, not just abstract discussion
3. __solution is done well enough so team of engineers can take design and work on it__
4. I have answered these: End-to-end, systems used => deployments? scale? etc. & Progression when user base grows? Must be flexible!

## Tips:
- Looking for problem solving ability
- Essential: ask right questions, clarifying questions (for anything I don't know), important questions.
- Stay flexible, find other solutions
- How structed is my thinking? Am I all over the place? - Do I understand my choices fully? (Don't make a choice w/o knowing the impact)
- Talk through ideas, start simple, evolve
- Key decisions. Should probably be able to highlight them.
- Explain solution however I want
- Next steps, take hints, explain what im doing => talk high level first 


## Interviewer is a Design/Architecture ("Pirate")
- System design or other questions
- Be prepared to openly discuss different solutions and their tradeoffs

## Questions
```
1. 10 most popular words last 24 hours twitter. Reduce size of logs - no timestamps.
2. User makes post visible only to user group. How store, push, add new friends.
3. 2x Design a LRU cache + LRU cache which gives latest accessed element. 
    Data structure, eviction rules, minimize segmentation, concurrency?
4. User makes post visible only to user group. How store, push, add new friends.
5. Make 100 HTTP GET reqs to wiki page. Print out percentiles, mean, std. In parallel.
6. Given a dictionary, store it in a way where you can   implement a search function for a certain word. 
    However, the words may have a character * that stands for any character

7. Design Waze app.  
8. Design google search auto complete
9. Design github
10. Design News feed - basic user info, user can post pictures, time. 
    How to store and obtain. How to add new feature, maintain old, stil service old
```

## Links
- Here is a link talking about the system design interview: https://www.hiredintech.com/system-design
