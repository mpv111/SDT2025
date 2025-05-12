# GIT Homework / Task 2 Report

**Subject:** GIT  
**Date:** 08.05.2025  
**Student:** Manuel Peralta Vazquez  
**Repository URL:** [https://github.com/mpv111/SDT2025.git](https://github.com/mpv111/SDT2025.git)

---

### a) Create remote repository

I created a new empty repository on GitHub named `SDT2025`.

---

### b) Clone the empty repository

Command used:
```bash
git clone https://github.com/mpv111/SDT2025.git
```

---

### c) Create in the local repo folder an empty Java project

**Screenshot:**  
![c](screenshots/c.PNG)

Created a new Java project in Eclipse (`ProyectoSDT1`) inside the cloned repository folder.

---

### d) Commit the whole project to the repo

```bash
git add .
git commit -m "Initial commit with empty Java project"
```

---

### e) Add simple code (create table, write table elements)

Added code to create an integer array and print its contents.

---

### f) Commit changes

```bash
git add .
git commit -m "Added array initialization and print logic"
```

---

### g) Add more code (initialize table with random values)

**Screenshot:**  
![g](screenshots/g.png)

Modified the Java code to fill the array with random values.

---

### h) Commit changes

```bash
git add .
git commit -m "Added random value initialization"
```

---

### i) Add more code (sort table elements)

**Screenshot:**  
![i](screenshots/i.png)

First, used `Arrays.sort()`, then replaced it with a Bubble Sort algorithm.

---

### j) Commit changes

```bash
git add .
git commit -m "Implemented bubble sort"
```

---

### k) Look at code history (git log)

**Screenshot:**  
![k](screenshots/k.png)

```bash
git log
```

---

### l) Look at code annotations (git blame)

```bash
git blame src/Main.java
```

---

### m) Checkout different revisions

**Screenshot:**  
![m](screenshots/m.png)

```bash
git checkout <commit_id>
```

Returned to `master` with:
```bash
git checkout master
```

---

### n) Add any changes to the code, do not commit

Modified the code by changing a print message and left it uncommitted.

---

### o) Try to revert the last changes

```bash
git restore .
```

(or if committed)

```bash
git revert <commit_id>
```

---

### p) Push the project to the remote repo

```bash
git push origin master
```

---

### r) Delete local project and local repo

Deleted the local folder manually or via command:
```bash
rm -rf SDT2025
```

---

### s) Clone project from remote repo

```bash
git clone https://github.com/mpv111/SDT2025.git
```

---

### t) Create tag/release and switch between tag and master

```bash
git tag v1.0
git checkout v1.0
git checkout master
```

---

### u) Create new branch from the master one

```bash
git checkout -b feature-sorting-enhancement
```

---

### w) Switch to branch

Already done above. Merging later:
```bash
git checkout master
git merge feature-sorting-enhancement
```

---

### x) Improve code in branch (e.g. changed sorting algorithm)

Modified the sorting algorithm to use `Collections.sort()` on an `ArrayList`.

---

### y) Merge new branch into master

```bash
git checkout master
git merge feature-sorting-enhancement
```

---

### z) Share repo with a friend

Shared GitHub link with collaborator access:  
[https://github.com/mpv111/SDT2025.git](https://github.com/mpv111/SDT2025.git)

---

### z1) Try to produce conflict

Two people edited System.out.println("Ordenado:"); on separate branches and pushed.

---

### z2) Solve it and push solution to remote

Solve it in eclipse

```bash
git add .
git commit -m "resolved merge conflict"
git push origin master
```

---

