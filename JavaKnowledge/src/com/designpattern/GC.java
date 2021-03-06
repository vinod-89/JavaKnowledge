package com.designpattern;

public class GC {
	
//	This behavior was used to improve the performance of JVM, and the adopted methodology is
//	commonly called Generational Garbage Collection. In this method,
//	the Heap space is divided into generations like Young Generation, Old or Tenured Generation, and Permanent Generation.
//	So, the four types of garbage collectors are:
//
//		Serial GC
//		This is the simplest garbage collector, designed for single threaded systems and small heap size. It freezes all applications while working. Can be turned on using -XX:+UseSerialGC JVM option.
//
//		Parallel/Throughput GC
//		This is JVM?s default collector in JDK 8. As the name suggests, it uses multiple threads to scan through the heap space and perform compaction. A drawback of this collector is that it pauses the application threads while performing minor or full GC.
//		It is best suited if applications that can handle such pauses, and try to optimize CPU overhead caused by the collector.
//
//		The CMS collector
//		The CMS collector (?concurrent-mark-sweep?) algorithm uses multiple threads (?concurrent?) to scan through the heap (?mark?) for unused objects that can be recycled (?sweep?).
//
//		This collector goes in Stop-The-World(STW) mode in two cases:
//		-While initializing the initial marking of roots, ie. objects in the old generation that are reachable from thread entry points or static variables
//		-When the application has changed the state of the heap while the algorithm was running concurrently and forcing it to go back and do some final touches to make sure it has the right objects marked.
//
//		This collector may face promotion failures. If some objects from young generation are to be moved to the old generation, and the collector did not have enough time to make space in the old generation space, a promotion failure will occur.
//		In order to prevent this, we may provide more of the heap size to the old generation or provide more background threads to the collector.
//
//
//		G1 collector
//		Last but not the least is the Garbage-First collector, designed for heap sizes greater than 4GB. It divides the heap size into regions spanning from 1MB to 32Mb, based on the heap size.
//
//		There is a concurrent global marking phase to determine the liveliness of objects throughout the heap. After the marking phase is complete, G1 knows which regions are mostly empty. It collects unreachable objects from these regions first, which usually yields a large amount of free space. So G1 collects these regions(containing garbage) first, and hence the name Garbage-First. G1 also uses a pause prediction model in order to meet a user-defined pause time target. It selects the number of regions to collect based on the specified pause time target.
}
