Assignment 1

1 -Two Sum - Two Sum works by using a nested loop to check if 2 integers stored in array sum up to a target value. The biggest trick for
two sum is to make sure to set the nest interator value, or the j, to i + 1. This will keep you from checking a current value against 
a value you have already checked it against. This one I already knew so it was no problem. I will say that the big O must be n^2. 

2 - first and last value in logn time - This one I was not familiar with but being it involved searching sorted lists it was no surprise
that we needed binary search to solve it. The trick hear is to build 2 searchiing functions. One that will search for the first index of the 
target and one that will search for the potentially higher index of the target. Then instead of returning when we find our target like
in normal binary search we set up our loops to keep checking for the most extreme indexes of our target. Each time we hit our target we 
store that index, but we still keep looking until the big loop breaks. 

4 - Nth node from the end of a Linked List - This is an interesting one because this is the fist time I have encountered the use of the dummy node
to help solve a problem. The jist of this one is that we set up 2 pointers, one fast and one slow. The fast one we set out to the node
in the linkedList at N away from the dummyHead. This dummyHead should give us room to remove the last element and also be able to remove
the first element. But once the fast pointer gets to Nth node we then set up a loop that terminates when the fast pointer hits null and 
our slow pointer should be on the Node before the node we want to remove. Then we remove the node by linking the Node before to the node
after the node we want gone. 

5 - Merge K sort linkedList - This was a pretty one to learn about. I found a few different ways to do this, but I liked this one because I got to
use the Java build in PriorityQueue that implements a minimum heap. Its been a while since I took data structures so it was a good refresher on
minHeaps. THe jist of this one is that we take all the values from the linkedLists and put them into a minHeap. Then we take that minHeap and take 
out the values one by one and make nodes and turn them into a new sorted linkedList. We get to use dummyHead again to be the first node of our linkedList.
It starts the new List but as you create new Nodes for your list it will keep track of the head we want to be our final head. 

3 - 